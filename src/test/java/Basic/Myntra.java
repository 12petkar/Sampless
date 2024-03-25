package Basic;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Myntra {

	@Test


	public void Myntras() throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		
		 WebElement searchtf = driver.findElement(By.name("searchVal"));
		 
		 searchtf.sendKeys("Watches");
			Thread.sleep(2000);
			searchtf.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
		  
			JavascriptExecutor js =(JavascriptExecutor) driver;
			
			
			for(;;) { //infinite loop
			
				try {
					driver.findElement(By.cssSelector("img[alt='Product image of LORENZ MK-3010K Analogue Wrist Watch']")).click();// click on img
				
				    break;
				   
				
				 
				}catch(NoSuchElementException e) {
				
				js.executeScript("window.scrollBy(0, 900)");
			
				
				
				
				}
				}
				
				
	}
	}

package Basic;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ajio {



	@Test


	public void Ajios() throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		
		 WebElement searchtf = driver.findElement(By.name("searchVal"));
		 
		 searchtf.sendKeys("Watches");
			Thread.sleep(2000);
			searchtf.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//img[@alt='Product image of LORENZ MK-4027R Analogue Watch with Leather Strap']")).click();
			
			Set<String> ids = driver.getWindowHandles();
			
			for(String a : ids) {
				
				
				String CUrl = driver.switchTo().window(a).getCurrentUrl();
				
				System.out.println(CUrl);
				
				
				String ChildUrl = "https://www.ajio.com/lorenz-mk-4027r-analogue-watch-with-leather-strap/p/466010056_brown";
				
				if(CUrl.contains(ChildUrl)) {
					
					
				}
			}

			
			TakesScreenshot ts= (TakesScreenshot) driver;
			Thread.sleep(2000);
			File tempfile = ts.getScreenshotAs(OutputType.FILE);

			File destinationFile = new File("./Ajio/Wtaches.png");
			
			FileUtils.copyFile(tempfile, destinationFile);
			
	
			
		Thread.sleep(2000);
			
		for(String b : ids) {
			
			String Purl = driver.switchTo().window(b).getCurrentUrl();
			
			System.out.println(Purl);

			String ParentUrl = "https://www.ajio.com/s/watches-3991-60341?query=:relevance&classifier=intent";
		if(Purl.contains(ParentUrl)) {
		}
					
					
				
	}}

}

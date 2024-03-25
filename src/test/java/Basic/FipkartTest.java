package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FipkartTest {

	@Test
	//public static void main(String[] args) throws InterruptedException {
		public void Fipkart() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		WebElement serachtf = driver.findElement(By.name("q"));
		
		serachtf.sendKeys("Samsung");
		Thread.sleep(2000);
		serachtf.sendKeys(Keys.ENTER);
	}
}

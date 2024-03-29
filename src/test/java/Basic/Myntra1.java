package Basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Myntra1 {

@Test

public void Myntra() throws InterruptedException {
	

   WebDriver driver = new ChromeDriver(); //create object ChromeDriver class

	driver.manage().window().maximize(); //maxmize the screen 


driver.get("https://www.myntra.com/"); //To Lauch application

driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("Watches"); //search on watches

driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click(); //click on serachtf

Thread.sleep(2000);
driver.findElement(By.xpath("(//label[@class='common-customRadio gender-label'])[1]")).click(); //click on men

driver.findElement(By.xpath("//label[text()='Sonata']")).click(); //click on brand

Thread.sleep(2000);

//driver.findElement(By.xpath("(//img[@class='img-responsive'])[3]")).click();

driver.findElement(By.cssSelector("img[alt='Sonata Men Champagne  His & Her  Analogue Watch Gift Set  NK70078083YM02']")).click();
	
Set<String> ids = driver.getWindowHandles();

for(String a : ids) {
	
	String curl = driver.switchTo().window(a).getCurrentUrl();
	
	System.out.println(curl);
	
	String ChildUrl = "https://www.myntra.com/watch-gift-set/sonata/sonata-pair-men-silver-analogue-watch-gift-set---nl71178137ym01/5570876/buy";

 if(curl.contains(ChildUrl)) {
   break;	 
 
 }

}

driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[text()='GO TO BAG']")).click();



}
}
	
	




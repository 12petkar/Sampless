package Basic;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AmazonTest{


@Test


public void Amazons() throws InterruptedException, IOException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	 WebElement searchtf = driver.findElement(By.id("twotabsearchtextbox"));
	 
	 searchtf.sendKeys("Watches");
	 Thread.sleep(2000);
	 searchtf.sendKeys(Keys.ENTER);
	 
	 WebElement img = driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/61UHxTNk-7L._AC_UL320_.jpg']"));
	 
	 Actions a = new Actions(driver);
	 a.moveToElement(img);
	 a.click(img);
	 Thread.sleep(2000);
	 a.perform();
	 
    Set<String> ids = driver.getWindowHandles();
    System.out.println(ids);
    
    for(String b : ids) {
    	
    	
    	String ChildTitle = driver.switchTo().window(b).getTitle();
    	
    	System.out.println(ChildTitle);
    	
    String ChildTITLE = "Buy NIBOSI Men's Watch Analog Quartz Black Dial Wrist Watch for Men Business Waterproof Military Stainless Steel Gold Dress Watch Auto Date at Amazon.in";
    	
    if(ChildTitle.contains(ChildTITLE)) {
    	
    	break;
    }
    	
    }
	 
	 
	 
	WebElement Watchesimg = driver.findElement(By.xpath("(//input[@class='a-button-input'])[4]")); 
	 Actions c = new Actions(driver);
	 
	c.moveToElement(Watchesimg);
	Thread.sleep(2000);
	c.perform();
	 
	 
	 
	 TakesScreenshot ts = (TakesScreenshot) driver;
	 
	 Thread.sleep(2000);
	 
	 File tempfile = ts.getScreenshotAs(OutputType.FILE);
	 Thread.sleep(2000);
 File Filedestination = new File("./Amazon/Watches.png");
	 
	 FileUtils.copyFile(tempfile,  Filedestination);
	 
	
	 WebElement imgsss = driver.findElement(By.xpath("(//input[@class='a-button-input'])[5]"));
	c.moveToElement(imgsss);
	Thread.sleep(2000);
	c.perform();
	 TakesScreenshot tss = (TakesScreenshot) driver;
	 
	 Thread.sleep(2000);
	 
	 File tempfiles = ts.getScreenshotAs(OutputType.FILE);
	 Thread.sleep(2000);
File Filedestinations = new File("./Amazon/Watchess.png");
	 
	 FileUtils.copyFile(tempfiles,  Filedestinations);
	
	
WebElement imgs = driver.findElement(By.xpath("(//input[@class='a-button-input'])[6]"));

c.moveToElement(imgs);
Thread.sleep(2000);
c.perform();


TakesScreenshot tssn = (TakesScreenshot) driver;

Thread.sleep(2000);

File tempfilesn = ts.getScreenshotAs(OutputType.FILE);
Thread.sleep(2000);
File Filedestinationsn = new File("./Amazon/imgs.png");

FileUtils.copyFile(tempfilesn,  Filedestinationsn);
}

}

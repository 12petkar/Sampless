package Basic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



import CommonUtils.PropertyFileUtil;
import CommonUtils.WebDriverUtil;

public class OraganizationsTest {


	PropertyFileUtil putil = new  PropertyFileUtil();
	
	 WebDriverUtil wutil = new  WebDriverUtil();

	 @Test
	 
	 public void OraganizationTest() throws IOException, InterruptedException {
	 
 WebDriver driver = new ChromeDriver();
   
   wutil.maximize(driver); //To Maxmize the window
   wutil.implicitwait(driver);//To apply wait

   
   //To Read the data property File
  String URL = putil.getDataPropertyFile("Url");
  
 String USERNAME = putil.getDataPropertyFile("Username");
  String PASSWORD = putil.getDataPropertyFile("Password");  
	 
	 driver.get(URL); //To Launch the application
	 
	 //To Login Application
	driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	Thread.sleep(2000);
	driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	Thread.sleep(2000);
	 

	
	 
	
	
	
	
	driver.findElement(By.id("submitButton")).click();
    Thread.sleep(2000);



	 }
}

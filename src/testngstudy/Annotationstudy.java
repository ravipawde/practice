package testngstudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Annotationstudy {
	 WebDriver driver;
	 WebElement login;
	 WebElement password;


	  @BeforeClass()
	  public void beforeClass() throws InterruptedException {
		  
		  Reporter.log("lounch the browser",true);
		  System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
		      driver=new ChromeDriver();
		     Thread.sleep(3000);
	  }
	 
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  
	  Reporter.log("login to application",true);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		 login=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		login.sendKeys("9130896100");
		Thread.sleep(2000);
	    password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("9130896100");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(2000);
  }

  @Test
  public void checkuseridpassword() {
	  
	  
	  Reporter.log("username is validated",true);
	  
  }
  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[text()='My Account']"))).perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//div[text()='Logout']"))).click().build().perform();
	  Reporter.log("logout",true);
  }


  

  @AfterClass
  public void afterClass() {
	  driver.close();
	  Reporter.log("close browser",true);
  }

}

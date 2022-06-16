package testngstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testmethod {
 WebDriver driver;
  @Test
  public void a() throws InterruptedException {
	  
	  Reporter.log("lounch the browser",true);
	  System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     Thread.sleep(3000);
  }

  @Test
  public void b(WebDriver driver) throws InterruptedException {
	 
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			WebElement login=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			login.sendKeys("9130896100");
			Thread.sleep(2000);
			WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
			password.sendKeys("9130896100");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
			Thread.sleep(2000);
	  
  }
  @Test
  public void c() throws InterruptedException {
	  Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[text()='My Account']"))).perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//div[text()='Logout']"))).click().build().perform();
	  Reporter.log("logout",true);
	  
	  
  }
  @Test
  public void d() {
	  
	  driver.close();
	  Reporter.log("close browser",true);
  }
}

package testngstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testclass {
  @Test
  public void mymethod1() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
			  WebDriver driver= new ChromeDriver();
			  driver.get("https://vctcpune.com/");
			  driver.manage().window().maximize();
	  
  }
  
  @Test
  public void display1()
  {
	  System.out.println("hii good morning");  ///this is print only in eclipes 
  }
  @Test
  public void display2()
  {
	  Reporter.log("hii good morning2");  //this print only in report not eclipes
  }
  @Test
  public void display3()
  {
	 
	  Reporter.log("hii good morning3",true);  //this print both eclipes as well as report 
  }
  
  
  
  
  
  
  
  
}

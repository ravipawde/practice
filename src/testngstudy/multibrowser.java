package testngstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class multibrowser {
	
	//in testng we execute multiple main method but in java we can not execute multiple main method nut we can 
	//overloading the main method by changing its parameter or orgument
	
	//here w e lounch differnt browser in same class by using test method
  @Test
  public void m1() {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");

	  
	  
  }
  @Test
  public void m2() {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com/");

	  
	  
  }
  @Test
  public void m3() {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://youtube.com/");

	  
	  
  }
  @Test
  public void m4() {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://amazon.com/");

	  
	  
  }
}

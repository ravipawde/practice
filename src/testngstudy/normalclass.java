package testngstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class normalclass {
	
	

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");

	}


}

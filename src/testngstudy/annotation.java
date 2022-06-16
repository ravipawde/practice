package testngstudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class annotation {
  @Test
  
  public void testcase() {
	  
	  Reporter.log("   validate id and password",true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  Reporter.log("loged in",true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("log out",true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("lounch browser",true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("close browser",true);
  }

}

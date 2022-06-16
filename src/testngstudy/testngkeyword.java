package testngstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testngkeyword {
  @Test(invocationCount=5)
  public void tc1() {
	  
	  Reporter.log("tc1 is running",true);
  }
  @Test(priority=-2)
  public void tc2() {
	  
	  Reporter.log("tc2 is running",true);
  }
  
  @Test(priority=-5,invocationCount=2,timeOut=1000)
  public void tc3() throws InterruptedException {
	  Thread.sleep(2000);
	  Reporter.log("tc3 is running",true);
  }
  @Test(enabled=false)   /// false means testcase is not running
  public void tc4() {
	  
	  Reporter.log("tc4 is running",true);
  }
  @Test(priority=-5,dependsOnMethods="tc1")   //in this condition priority of this method is more than tc1
                                              //but this tc5 is depend on tc1 hence after execution of tc1
                                            //tc5 should be executed
  public void tc5() {
	  
	  Reporter.log("tc5 is running",true);
  }
}

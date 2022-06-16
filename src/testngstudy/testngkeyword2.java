package testngstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testngkeyword2 {
  @Test(priority=-5)
  public void a() {
	  
	  Reporter.log("m1 method call",true);
	  
  }
  @Test(dependsOnMethods="c")
  public void b() {
	  
	  Reporter.log("m2 method call",true);
	  
  }
  @Test
  public void c() {
	  
	  Reporter.log("m3 method call",true);
	  
  }
}

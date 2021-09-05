package TestNGDevOps;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("Devshre Review 1");
  
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Devshre Review 2");
  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Devshre Review 3");
  
  }

}

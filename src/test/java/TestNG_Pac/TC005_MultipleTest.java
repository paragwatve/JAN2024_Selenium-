package TestNG_Pac;

import org.testng.annotations.Test;

public class TC005_MultipleTest {
  @Test(priority=2)
  public void test1() {
	  System.out.println("this is test1");
  }
  @Test(groups= {"sanity"},priority=3)
  public void test2()
  {
	  System.out.println("this is test2");
  }
  @Test (groups={"sanity"},priority=4)
  public void test3()
  {
	  System.out.println("this is test3");
  }
  @Test(priority=1)
  public void test4()
  {
	  System.out.println("this is test4");
  }
}

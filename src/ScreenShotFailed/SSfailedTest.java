package ScreenShotFailed;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class SSfailedTest extends TestBase {
	
	@BeforeMethod
	public void setup() {
		initialization();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	@Test
	public void Test1() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void Test2() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void Test3() {
		Assert.assertEquals(false, true);
	}

}

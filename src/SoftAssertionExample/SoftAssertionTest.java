package SoftAssertionExample;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionTest {
	
	@Test
	public void Test1() {
		SoftAssert s = new SoftAssert();
		System.out.println("before assertion");
		s.assertEquals(false, true, "soft assertion is failed");
		System.out.println("after assertion");
		s.assertAll();
		
	}
	
	@Test
	public void Test2() {
		SoftAssert so = new SoftAssert();
		System.out.println("before assertion");
		so.assertEquals(false, true, "second test soft assertion failed");
		System.out.println("after assertion");
		so.assertAll();
		
	}

}

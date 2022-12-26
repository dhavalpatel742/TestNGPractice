package com.testng.practice;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class InvocationCountTest {
	
	@Test(invocationCount = 5,priority=1)
	public void sum() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("sum is : "+c);
	}
	
	@Test(invocationTimeOut = 2000,priority=2)
	public void timeout() {
		int i = 1;
		while(i==1) {
			System.out.println(i);
		}
	}
	
	@Test(invocationTimeOut = 2000,expectedExceptions = ThreadTimeoutException.class,priority=3)
	public void exception() {
		int i = 1;
		while(i==1) {
			System.out.println(i);
		}
	}


}

package com.testng.practice;

import org.testng.annotations.Test;

public class DependencyTest {
	
	@Test
	public void login() {
		System.out.println("Login Test");
		int i = 9/0;
	}
	
	@Test(dependsOnMethods = "login")
	public void homepage() {
		System.out.println("home Test");
	}
	
	@Test(dependsOnMethods = "login")
	public void searchpage() {
		System.out.println("search Test");
	}
	
	@Test(dependsOnMethods = "searchpage")
	public void regpage() {
		System.out.println("registration Test");
	}

}

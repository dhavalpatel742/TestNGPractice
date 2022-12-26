package com.testng.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
//	@BeforeSuite--Setup system property for chrome
//	@BeforeTest--Launch the browser
//	@BeforeClass--Login to app
	
//	@BeforeMethod--enter the url
//	@Test--check the logo
//	@AfterMethod--logout from app
	
//	@BeforeMethod--enter the url
//	@Test--search content
//	@AfterMethod--logout from app
	
//	@BeforeMethod--enter the url
//	@Test--check the title
//	@AfterMethod--logout from app
	
//	@AfterClass--delete all cookies
//	@AfterTest--close the browser
	
	
	//Pre-conditions annotations - start with @Before
	@BeforeSuite
	public void setup() {
		System.out.println("@BeforeSuite--Setup system property for chrome");
	}
	
	@BeforeTest
	public void launchbrowser() {
		System.out.println("@BeforeTest--Launch the browser");
	}
	
	@BeforeClass
	public void login() {
		System.out.println("@BeforeClass--Login to app");
	}
	
	@BeforeMethod
	public void enterurl() {
		System.out.println("@BeforeMethod--enter the url");
	}
	
	
	//Test annotations
	@Test
	public void titletest() {
		System.out.println("@Test--check the title");
	}
	
	@Test
	public void searchtest() {
		System.out.println("@Test--search content");
	}
	
	@Test
	public void logotest() {
		System.out.println("@Test--check the logo");
	}
	
	//post-conditions annotations - start with @After
	@AfterMethod
	public void logout() {
		System.out.println("@AfterMethod--logout from app");
	}
	
	@AfterClass
	public void deletecookies() {
		System.out.println("@AfterClass--delete all cookies");
	}
	
	@AfterTest
	public void closebrowser() {
		System.out.println("@AfterTest--close the browser");
	}
	
	
}

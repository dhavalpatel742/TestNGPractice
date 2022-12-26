package com.testng.practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		driver.get("https://www.google.com/");
	}
	
	@Test(priority=1,groups="title")
	public void googletitle() {
		
		System.out.println(driver.getTitle());
	}
	
	@Test(priority=2,groups="logo")
	public void logotest() {
		Boolean b =driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
	}
	
	@Test(priority=3,groups="email")
	public void mailLinkTest() {
		Boolean c =driver.findElement(By.xpath("//a[contains(text(),'xyz')]")).isDisplayed();
	}
	
	@Test(priority=4,groups="test")
	public void test1() {
		System.out.println("Test1");
	}
	
	@Test(priority=5,groups="test")
	public void test2() {
		System.out.println("Test2");
	}
	
	@Test(priority=6,groups="test")
	public void test3() {
		System.out.println("Test3");
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	

}

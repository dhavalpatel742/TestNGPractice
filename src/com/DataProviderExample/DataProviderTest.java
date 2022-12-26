package com.DataProviderExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.util.ExcelDataProvider;

public class DataProviderTest {
	
WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		driver.get("https://www.facebook.com/signup");
	}
	
	@DataProvider
	public Iterator<Object[]> DataSignUp() {
		ArrayList<Object[]> testData = ExcelDataProvider.getData();
		return testData.iterator();
	}
	
	@Test(dataProvider = "DataSignUp")
	public void SignUp(String fn, String ln, String email, String password) throws InterruptedException {
		driver.findElement(By.name("firstname")).sendKeys(fn);
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys(ln);
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email__")).sendKeys(email);
		Thread.sleep(1000);
		driver.findElement(By.name("reg_passwd__")).sendKeys(password);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	

}

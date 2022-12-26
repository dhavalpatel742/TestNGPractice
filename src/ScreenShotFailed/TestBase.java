package ScreenShotFailed;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestBase {
	
	public static WebDriver driver;
	
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	public void failed(String testMethodName)  {
		File ss = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		try {
		FileUtils.copyFile(ss, new File("C:\\Selenium_Workspace\\TestNGPractice\\ScreenShot\\"+testMethodName+".jpg"));
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}

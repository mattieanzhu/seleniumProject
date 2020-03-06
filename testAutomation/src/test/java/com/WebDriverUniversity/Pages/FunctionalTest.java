package com.WebDriverUniversity.Pages;

import java.util.concurrent.TimeUnit;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalTest {
	protected static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/nimattie/Desktop/Anzhu_Maven_Project/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@After
	public void cleanUp() {
		driver.manage().deleteAllCookies();
	}
	
	@AfterClass
	public static void tearDown() {
		driver.close();
	}
}

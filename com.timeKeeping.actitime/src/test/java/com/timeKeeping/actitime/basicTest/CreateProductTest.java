package com.timeKeeping.actitime.basicTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CreateProductTest {
	
	@Test
	public void demo1() {
		System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
		new FirefoxDriver();
		System.out.println("Demo1");
		
	}

}

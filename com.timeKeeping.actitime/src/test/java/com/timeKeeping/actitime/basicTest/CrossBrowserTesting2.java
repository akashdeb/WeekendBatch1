package com.timeKeeping.actitime.basicTest;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting2 {
	@Parameters("browser")
	@Test
	public void demo2(String browser) {
		if(browser.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		new FirefoxDriver();
		}
		System.out.println("Class2");
	}

}

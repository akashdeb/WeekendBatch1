package com.timeKeeping.actitime.basicTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting1 {
	@Parameters("browser")
	@Test
	public void demo(String browser) {
		if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		new ChromeDriver();
		}
		System.out.println("Class1");
	}
	


}

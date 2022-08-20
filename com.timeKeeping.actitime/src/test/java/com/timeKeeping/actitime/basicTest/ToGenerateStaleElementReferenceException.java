package com.timeKeeping.actitime.basicTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToGenerateStaleElementReferenceException {

	@Test
	public void demo() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Selenium");
		driver.navigate().refresh();
		element.clear();
		element.sendKeys("Java");
		
	}
}

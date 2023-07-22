package com.timeKeeping.actitime.customer;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.timeKeeping.actitime.genericUtility.ExcelUtility;
import com.timeKeeping.actitime.genericUtility.JavaUtility;
import com.timeKeeping.actitime.pomRepository.CreateNewCustomerPage;
import com.timeKeeping.actitime.pomRepository.HomePage;
import com.timeKeeping.actitime.pomRepository.LoginPage;
import com.timeKeeping.actitime.pomRepository.TaskPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCustomerTest {
	
	@Test
	public void createCustomerTest() throws IOException {
		
		JavaUtility jUtils = new JavaUtility();
		String url = jUtils.fetchDataFromPropertyFile("url");
		String username = jUtils.fetchDataFromPropertyFile("username");
		String password = jUtils.fetchDataFromPropertyFile("password");
		
		ExcelUtility eUtils=new ExcelUtility();
		String customerName =eUtils.fetchDataFromExcel("Sheet2", 1, 0)+jUtils.generateRandomNo(1000);
		String description = eUtils.fetchDataFromExcel("Sheet2", 1, 1);
		String expectedCustomeName = customerName;
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		LoginPage login=new LoginPage(driver);
		login.loginAction(username, password);
		
		HomePage home = new HomePage(driver);
		home.clickOnTask();
		
		TaskPage task=new TaskPage(driver);
		task.clickOnAddNewButton();
		task.clickOnNewCustomer();
		
		CreateNewCustomerPage createNewCust = new CreateNewCustomerPage(driver);
		createNewCust.createCustomer(customerName, description);
		
		String actualCustomerName = task.verifyCustomerName();
		Assert.assertEquals(actualCustomerName, expectedCustomeName);
		System.out.println("Pass : Customer Name is verified");
		System.out.println("Pass : Customer Name is verified");

		
		home.logoutAction();
		
		driver.quit();
		
	}

}

package com.timeKeeping.actitime.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	WebDriver driver;
	public TaskPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	 this.driver = driver;
	}
	
	@FindBy (xpath = "//div[text() = 'Add New']")
	private WebElement addNewButton;
	
	@FindBy (xpath = "//div[text() = '+ New Customer']")
	private WebElement newCustomerButton;
	
	@FindBy(xpath = "//div[contains(@title, 'TestYantra')]")
	private WebElement customerName;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCustomerName() {
		return customerName;
	}

	public WebElement getAddNewButton() {
		return addNewButton;
	}

	public WebElement getNewCustomerButton() {
		return newCustomerButton;
	}
	
	public void clickOnAddNewButton() {
		addNewButton.click();
	}

	public void clickOnNewCustomer() {
		newCustomerButton.click();
	}
	
	public String verifyCustomerName() {
		return customerName.getText();
	}
	
}

package com.timeKeeping.actitime.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCustomerPage {

	WebDriver driver;
	public CreateNewCustomerPage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
		 this.driver = driver;
	}

	@FindBy (xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement enterNewCustomerTxtField;
	
	@FindBy (xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement descriptionTextField;
	
	@FindBy (xpath = "//div[text()='- Select Customer -']")
	private WebElement selectCustomerDropdown;
	
	@FindBy (xpath = "//div[@class=\"itemRow cpItemRow selected\"]")
	private WebElement optionToSelect;
	
	@FindBy (xpath = "//div[text()='Create Customer']")
	private WebElement createCustomerButton;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEnterNewCustomerTxtField() {
		return enterNewCustomerTxtField;
	}

	public WebElement getDescriptionTextField() {
		return descriptionTextField;
	}

	public WebElement getSelectCustomerDropdown() {
		return selectCustomerDropdown;
	}

	public WebElement getOptionToSelect() {
		return optionToSelect;
	}

	public WebElement getCreateCustomerButton() {
		return createCustomerButton;
	}
	
	public void createCustomer(String customerName, String description) {
		enterNewCustomerTxtField.sendKeys(customerName);
		descriptionTextField.sendKeys(description);
		selectCustomerDropdown.click();
		Actions action=new Actions(driver);
		action.moveByOffset(150, 320).click().perform();
		createCustomerButton.click();
		
	}
	
	

}

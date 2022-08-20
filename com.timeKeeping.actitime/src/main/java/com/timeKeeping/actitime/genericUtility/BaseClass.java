package com.timeKeeping.actitime.genericUtility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	@BeforeSuite
	public void bsConfig() {
		
		System.out.println("======Database Connection is esteblished=========");
		
	}
	@BeforeClass
	public void bcConfig() {
		
		System.out.println("===========Browser is Launched==========");
		System.out.println("===========Navigate to the ULR==========");
		
	}
	@BeforeMethod
	public void bmConfig() {
		
		System.out.println("===========Logged in to the application==========");
		
	}
	@AfterMethod
	public void amConfig() {
		
		System.out.println("===========Logged out from the application==========");

	}
	@AfterClass
	public void acConfig() {
		
		System.out.println("==============Close the browser=============");
		
	}
	@AfterSuite
	public void asConfig() {
		
		System.out.println("==========Close Database===========");
		
	}

}

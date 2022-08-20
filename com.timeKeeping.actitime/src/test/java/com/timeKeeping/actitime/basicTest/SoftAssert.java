package com.timeKeeping.actitime.basicTest;

import org.testng.annotations.Test;

public class SoftAssert {
	
	@Test
	public void demo() {
		 boolean expectedText = true; 
		 boolean actualText = false;
		 
		org.testng.asserts.SoftAssert soft = new org.testng.asserts.SoftAssert();
		soft.assertEquals(actualText, expectedText);
		System.out.println("Pass1");
		soft.assertAll();
		System.out.println("Pass2");
	}

}

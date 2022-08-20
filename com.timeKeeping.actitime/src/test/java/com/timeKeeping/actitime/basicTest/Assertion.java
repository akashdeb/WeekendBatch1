package com.timeKeeping.actitime.basicTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {

	@Test
	public void demo() {
		 boolean expectedText = true; 
		 boolean actualText = true;
		 Assert.assertEquals(actualText, expectedText);
		 System.out.println("Pass");
		
	}
}

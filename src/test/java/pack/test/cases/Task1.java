package pack.test.cases;


import org.testng.annotations.Test;

import StepsBase.StepBase;

public class Task1 extends StepBase
{
	
	@Test
	public void AspireOrder() throws Exception
	{
		
		TestCaseName("TC_AspireApp Order Verification","Inverntry & Manufacturing Verification","Sanity");
		
		keyword("Login to the AspireApp", "keyword","login"); 
		
		keyword("Add An Item In The Inventry", "keyword","AddItemInInventry"); 
		
		keyword("Search and Add the Item Then validate the data in manufacturing", "keyword","ValidateItemInManufacturing"); 
		
		keyword("Logout to the AspireApp", "keyword","logout"); 
		
	}
	

}

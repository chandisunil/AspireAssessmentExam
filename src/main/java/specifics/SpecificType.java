package specifics;


import java.util.Date;

import org.openqa.selenium.By;

import Generics.Generics;
import StepsBase.StepBase;
import junit.framework.Assert;




public class SpecificType extends StepBase
{
	static String itemname=null;
	public String DateSet()
	{
		long mills = System.currentTimeMillis();
		Date date = new Date(mills);
		
		return new excel.utils.StringClsUtil().Convert_Customized_Format(date);
	}
	
	public void login() throws Exception
	{
		Step("Entering The UserName","input","UserName","user@aspireapp.com");
		
		Step("Entering The Password","input","Password","@sp1r3app");
		
		Step("clicking On Login","click","Login");
	}
	
	public void logout() throws Exception
	{
		Step("clicking On User Icon","click","usericon");
		
		Step("clicking On Logout","click","logout");
	}
	
	
	public void createItemInInventry() throws Exception
	{
		
		Step("Clicking On The Inventry","click","inventry");
		
		Step("Clicking On The Products","click","products");
		
		Step("Clicking On The Products->Products","click","productsub");
		
		Step("Waiting for Loding is invisible","waitForInvisibility","Loding");
		
		Step("Clicking On Invertry Create Icon","click","create");
		
		itemname="burger"+DateSet();
		
		Step("Inputting The Product Name","input","productName",itemname);
		
		Step("Clicking On Update the quantity","click","updateQuantity");
		
		Step("Waiting for Loding is invisible","waitForInvisibility","Loding");
		
		Step("Verify The Current Stock Is Empty msg or not","verify","stockEmptyMsg");
		
		Step("Clicking On The Create Button In Update Quantity Page","JSclick","create");
		
		Step("Clearing Counted Quantity","clear","inventryQuantity");
		
		Step("Input Counted Quantity","input","inventryQuantity","10");
		
		Step("Saveing the entry","click","save");
		
		Step("Clicking on the home menu icon ","click","homeMenu");
		
		
		
		
		
		
		
	}
	
	public void addItemInManufacturing() throws Exception
	{
		Step("Clicking on the manufactureitem","click","Manufacturing");
		
		Step("Clicking on create","click","create");
		
		Step("Inputing the productid","input","productid",itemname );
		
		Step("clicking on new","click","new");
		
		Step("clicking on save","click","save");
		
		Thread.sleep(2000);
		
		Step("clicking on confrim","JSclick","confirm");
		
		Thread.sleep(2000);
		
		
		Step("clicking on markasdone","JSclick","markasdone");
		
		Step("clicking on ok","click","ok");
		
		Step("clicking on apply","click","apply");
		
		String productiddata =Generics.driver.findElement(By.xpath("//a[@name='product_id']/span")).getText();
		
		org.testng.Assert.assertEquals(productiddata, itemname);
	}
	
}



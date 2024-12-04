package com.actitime.Testscript;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

import com.actitime.Generic.BaseClass;
import com.actitime.Pom.HomePage;
import com.actitime.Pom.TaskListPage;
@Listeners(com.actitime.Generic.ListenerImplementation.class)

public class CustomerModule extends BaseClass {
	public HomePage h;
	TaskListPage t;
	@Test
	public void testA()
	{
		Reporter.log("This is test a");
	}
	
	/*public void createCustomer() throws InterruptedException, IOException
	{
		String customername = f.getExcelData("createCustomer",1,2);
		String customerdesc = f.getExcelData("createCustomer",1,3);
	
		h = new HomePage(driver);
		h.setTaskList();
		 t = new TaskListPage(driver);
		 Thread.sleep(1000);		
		t.getAddNewBtn().click();
		Thread.sleep(1000);
		t.getAddNewCust().click();;
		Thread.sleep(1000);
		t.getAddCustName().sendKeys(customername);
		Thread.sleep(1000);
		t.getAddCustDesc().sendKeys(customerdesc);
		Thread.sleep(1000);
		t.getCompSelect().click();
		Thread.sleep(1000);
		t.getCompSelected().click();
		Thread.sleep(1000);
		t.getCreateCustBtn().click();
		Thread.sleep(1000);
		//String text = driver.findElement(By.xpath("//a[text() ='All Customers']/../../div[@class='title ellipsis']")).getText();
		  		
	}
	
	@Test
	public void deleteCustomer() throws InterruptedException
	{
		h = new HomePage(driver);
		h.setTaskList();
		 t = new TaskListPage(driver);
		Thread.sleep(1000);
		t.getSearchTbx().sendKeys("Samsung");
		Thread.sleep(1000);
		t.getSettingsBtn().click();
		Thread.sleep(1000);
		t.getActionBtn().click();
		Thread.sleep(1000);
		t.getDelBtn().click();
		Thread.sleep(1000);
		t.getDelperBtn();
		  
		
	}*/
}

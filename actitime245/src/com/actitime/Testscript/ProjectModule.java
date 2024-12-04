package com.actitime.Testscript;


import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.Generic.BaseClass;
import com.actitime.Pom.HomePage;
import com.actitime.Pom.TaskListPage;


@Listeners(com.actitime.Generic.ListenerImplementation.class)
public class ProjectModule extends BaseClass{
	
	HomePage h;
	TaskListPage t;

	@Test
	public void testB()
	{
		Reporter.log("This is test b");
	}
	/*public void createProject() throws InterruptedException, IOException
	{
		h= new HomePage(driver);
		t = new TaskListPage(driver);
		h.setTaskList();
		t.getAddNewBtn().click();
		t.getAddProjBtn().click();;
		Thread.sleep(2000);
		String pn = f.getExcelData("createProject",2,1);
		String pd = f.getExcelData("createProject",2, 2);
		t.getProjName().sendKeys(pn);
		t.getProjSearchBtn().click();
		t.getProjDescTbx().sendKeys(pd);
		t.getCreateProjBtn().click();
	}
	
	@Test
	
	public void deleteProject() throws IOException, Exception
	
		{
		h = new HomePage(driver);
		t = new TaskListPage(driver);
		h.setTaskList();
		t.getSearchTbx().sendKeys(f.getExcelData("createProject",1, 1));
		Thread.sleep(2000);
		t.getSettingsBtn().click();
		t.getActionBtn().click();
		t.getDelBtn().click();
		t.getDelperBtn();
		
		
	}*/
}

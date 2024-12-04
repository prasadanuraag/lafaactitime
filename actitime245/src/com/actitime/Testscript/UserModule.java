package com.actitime.Testscript;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.Generic.BaseClass;
import com.actitime.Pom.HomePage;
import com.actitime.Pom.UsersPage;

public class UserModule extends BaseClass{
	public HomePage h;
	UsersPage u;
	@Test
	public void testc()
	{
		Reporter.log("This is test c");
	}
	/*public void createUser() throws InterruptedException, IOException
	{
	
	 h.setUser();
	 u.getAddUserBtn().click();
	 u.getUserFnTbx().sendKeys(f.getExcelData("createUser",1, 1));
	 u.getUserLnTbx().sendKeys(f.getExcelData("createUser", 1, 2));
	 u.getUserEmTbx().sendKeys(f.getExcelData("createUser", 1, 3));
	 u.getUserUnTbx().sendKeys(f.getExcelData("createUser", 1, 4));
	 u.getUserPwdTbx().sendKeys(f.getExcelData("createUser", 1, 5));
	 u.getUserPwcTbx().sendKeys(f.getExcelData("createUser", 1, 6));
	 u.getCreateUserBtn().click();
		
	}
	@Test
	public void deleteUser()
	{
		h.setUser();
		u.getUserSearchTbx().sendKeys("lana");
		u.getUserNameBtn().click();
		u.getDelUserBtn().click();
		driver.switchTo().alert().accept();
	}*/
}

package com.actitime.Generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.Pom.HomePage;
import com.actitime.Pom.LoginPage;

public class BaseClass {
	
	public  WebDriver driver;
	public FileLib f = new FileLib();
	@BeforeTest
	public void openBrowser() throws IOException
	
	{
		
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	String url = f.getPropertyData("url");
	driver.get(url);
		
		
	}
@AfterTest
	public void closeBrowser() 
  {
		
	driver.quit();
	}


@BeforeMethod
public void login() throws IOException
{
	
	 String un = f.getPropertyData("username");
	 String pw = f.getPropertyData("password");
	 LoginPage l = new LoginPage(driver);
	 l.setLogin(un, pw);
	  
			
}
@AfterMethod
public void logout()
{
	HomePage h = new HomePage(driver);
	h.setLogout();
}
}

	
	

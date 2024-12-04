package com.actitime.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
@FindBy(linkText="TASKS")
private WebElement taskLink;

@FindBy(linkText =  "Logout")
private WebElement lgoutBtn;

@FindBy(xpath="//div[text()='USERS']")
private WebElement userLink;

public HomePage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void setTaskList()
{
	taskLink.click();
}

public void setUser()
{
	userLink.click();
}

public void setLogout()
{
	lgoutBtn.click();
}
}

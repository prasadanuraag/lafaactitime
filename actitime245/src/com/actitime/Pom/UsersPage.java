package com.actitime.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import org.openqa.selenium.WebDriver;

public class UsersPage {
	
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement addUserBtn;
	@FindBy(id="userDataLightBox_firstNameField")
	private WebElement userFnTbx;
	@FindBy(id="userDataLightBox_lastNameField")
	private WebElement userLnTbx;
	@FindBy(id="userDataLightBox_passwordField")
	private WebElement userPwdTbx;
	@FindBy(id="userDataLightBox_emailField")
	private WebElement userEmTbx;
	@FindBy(id="userDataLightBox_usernameField")
	private WebElement userUnTbx;
	@FindBy(id="userDataLightBox_passwordCopyField")
	private WebElement userPwcTbx;
	@FindBy(xpath="//span[text()='Create User']")
	private WebElement createUserBtn;
	
	@FindBy(xpath="//input[@placeholder='Start typing name']")
	private WebElement userSearchTbx;
	@FindBy(xpath="//span[@class='userNameSpan']")
	private WebElement userNameBtn;
	@FindBy(id="userDataLightBox_deleteBtn")
	private WebElement delUserBtn;
	
	public UsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

	public WebElement getUserSearchTbx() {
		return userSearchTbx;
	}

	public WebElement getUserNameBtn() {
		return userNameBtn;
	}

	public WebElement getDelUserBtn() {
		return delUserBtn;
	}

	

	public WebElement getCreateUserBtn() {
		return createUserBtn;
	}
	public WebElement getAddUserBtn() {
		return addUserBtn;
	}

	public WebElement getUserFnTbx() {
		return userFnTbx;
	}

	public WebElement getUserLnTbx() {
		return userLnTbx;
	}

	public WebElement getUserPwdTbx() {
		return userPwdTbx;
	}

	public WebElement getUserEmTbx() {
		return userEmTbx;
	}

	public WebElement getUserUnTbx() {
		return userUnTbx;
	}

	public WebElement getUserPwcTbx() {
		return userPwcTbx;
	}
	
	

}

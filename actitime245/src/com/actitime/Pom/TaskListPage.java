package com.actitime.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;

	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement addNewCust;

	@FindBy(id="customerLightBox_nameField")
	private WebElement addCustName;
	
	@FindBy(id = "customerLightBox_descriptionField")
	private WebElement addCustDesc;
	
	@FindBy(xpath="//button[contains(text(),'-- Select an active customer')]")
	private WebElement compSelect;
	
	@FindBy(xpath="//a[text()='Our Company']")
	private WebElement compSelected;
	
	@FindBy(id ="customerLightBox_commitBtn")
	private WebElement createCustBtn;
	
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]")
	private WebElement searchTbx ;
	
	@FindBy(xpath="//span[@class='highlightToken']/../../div[@class='editButton available']")
	private WebElement settingsBtn;
	
	@FindBy(xpath="//div[@class='edit_customer_sliding_panel sliding_panel']/div/div/div/div/div[@class='action']")
	private WebElement actionBtn;
	
	@FindBy(xpath="//div[@class='projectNamePlaceholder']/..//div[@class='action']")
	private WebElement projActBtn;
	

	
	public WebElement getProjActBtn() {
		return projActBtn;
	}

	@FindBy(xpath="(//div[text()='Delete'])[1]")
	private WebElement delBtn;
	
	@FindBy(xpath="//span[text()='Delete permanently']")
	private WebElement delperBtn;
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement addProjBtn;
	
	@FindBy(id="projectPopup_projectNameField")
	private WebElement projName;
	
	@FindBy(xpath="//button[contains(text(),'-- Please Select Customer to Add Project for')]")
	private WebElement projSearchBtn;
	
	@FindBy(xpath="//a[contains(text(),'Our Company')]")
	private WebElement projSelect;
	
	@FindBy(xpath="projectPopup_projectDescriptionField")
	private WebElement projDescTbx;
	
	@FindBy(xpath="//span[text()='Create Project']")
	private WebElement createProjBtn;
	

	
	
	public WebElement getAddProjBtn() {
		return addProjBtn;
	}

	public WebElement getProjName() {
		return projName;
	}

	public WebElement getProjSearchBtn() {
		return projSearchBtn;
	}

	public WebElement getProjSelect() {
		return projSelect;
	}

	public WebElement getProjDescTbx() {
		return projDescTbx;
	}

	public WebElement getCreateProjBtn() {
		return createProjBtn;
	}

	public WebElement getSearchTbx() {
		return searchTbx;
	}

	public WebElement getSettingsBtn() {
		return settingsBtn;
	}

	public WebElement getActionBtn() {
		return actionBtn;
	}

	public WebElement getDelBtn() {
		return delBtn;
	}

	public WebElement getDelperBtn() {
		return delperBtn;
	}

	public TaskListPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getAddNewCust() {
		return addNewCust;
	}

	public WebElement getAddCustName() {
		return addCustName;
	}

	public WebElement getAddCustDesc() {
		return addCustDesc;
	}

	public WebElement getCompSelect() {
		return compSelect;
	}

	public WebElement getCompSelected() {
		return compSelected;
	}

	public WebElement getCreateCustBtn() {
		return createCustBtn;
	}
	
	
	
	
	

}

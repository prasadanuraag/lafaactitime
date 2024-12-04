package advsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoDataDriven {
	@Test(dataProvider = "getData", dataProviderClass = DemoDataProvider.class)
	public void demoA(String un,String pwd)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.quit();
	}

}


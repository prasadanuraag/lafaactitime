package advsel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoCrossBrowser {
	WebDriver driver;
	@Parameters("browser")
	@Test
	
	public void demo(String browser)
	{
		
		if(browser.equals("chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(browser.equals("edge")) {
			driver= new EdgeDriver();
			
		}
		else if(browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		driver.get("https://www.google.com/");
		driver.quit();
		
	}

}

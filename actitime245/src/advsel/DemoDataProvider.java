package advsel;

import org.testng.annotations.DataProvider;

public class DemoDataProvider {
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = {{"admin","manager"},{"loki","odin"},{"tony","thanos"},{"bruce","arthur"}};
		return data;
	}

}

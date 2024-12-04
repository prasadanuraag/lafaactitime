package advsel;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.Generic.FileLib;
import com.actitime.Pom.LoginPage;

public class Assign1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
		FileLib f = new FileLib();
		//FileOutputStream fos = new FileOutputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://localhost/login.do");
		LoginPage l = new LoginPage(driver);
		
		
		int rowcnt= wb.getSheet("InvalidLogin").getLastRowNum();
		for(int i = 1; i<= rowcnt ; i++)
		{				
			String un = wb.getSheet("InvalidLogin").getRow(i).getCell(1).getStringCellValue();
			String pw = wb.getSheet("InvalidLogin").getRow(i).getCell(2).getStringCellValue();
			
			l.setLogin(un, pw);
								
			String title = driver.getTitle();
			
			if(title.contains("Login"))
			{
				f.setExcelData("InvalidLogin",i,3,"Fail");
				//wb.getSheet("InvalidLogin").getRow(i).getCell(3).setCellValue("Fail");
				System.out.println("fail");
				
			}
			else
			{
				f.setExcelData("InvalidLogin",i,3,"Pass");
				//wb.getSheet("InvalidLogin").getRow(i).getCell(3).setCellValue("Pass");
				System.out.println("pass");
				driver.findElement(By.linkText("Logout")).click();
			}
			
							
		}
		
		
	}

}

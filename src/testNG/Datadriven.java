package testNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void datadriventest() throws IOException
	{
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		FileInputStream fi=new FileInputStream("C:\\Users\\Anoop\\Music\\ST\\datadrventest.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet1");
		int rowcount=sh.getLastRowNum();
		for(int i=1;i<rowcount;i++)
		{
			String userName=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username="+userName);
			String passWord=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("password="+passWord);
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(userName);
			driver.findElement(By.name("pass")).sendKeys(passWord);
			driver.findElement(By.name("login")).click();
		}
	}
	
	

}

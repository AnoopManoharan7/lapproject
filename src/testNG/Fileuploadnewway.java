package testNG;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadnewway {
	
	
	
	ChromeDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void setUp() throws AWTException, InterruptedException, IOException
	{
		
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Anoop\\Music\\Autoitfolder\\t1.exe");
		Thread.sleep(3000);
	
}
}

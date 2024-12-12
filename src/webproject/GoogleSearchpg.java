package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchpg {
	
	ChromeDriver driver;

	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("Https://www.google.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void googlesearchpg()
	{
		driver.findElement(By.name("q")).sendKeys("books",Keys.ENTER);
		//driver.findElement(By.name("btnk")).click();
	}
}

package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	@Test
	public void locators()
	{
		driver.findElement(By.name("email")).sendKeys("abcd");
		driver.findElement(By.id("pass")).sendKeys("abcd123");
		driver.findElement(By.name("login")).click();
	}

}

package webproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerificationpg {
	
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void titleVerification()
	{
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
String exp="Facebook";
		
		if(exp.equals(actualTitle))
		{
			System.out.println("Title are same");
			
		}
		else
		{
			System.out.println("Not same");
		}
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}
}
	


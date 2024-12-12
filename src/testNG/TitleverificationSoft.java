package testNG;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TitleverificationSoft {
	
	
ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void titleVerification()
	{
		String actualTitle=driver.getTitle();
		//System.out.println(actualTitle);
        String exp="Google";
        Assert.assertEquals(exp, actualTitle);                   // Hard Assertions  
		
		//if(exp.equals(actualTitle))
		//{
		//	System.out.println("pass");
			
		//}
		//else
		//{
		//	System.out.println("fail");
		//}
		System.out.println("Hello");                             // Soft Assertions
	}

}

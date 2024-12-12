package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSourcepgm {

	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void pageSource()
	{
	   String source=driver.getPageSource();
	   if(source.contains("Gmail"))
	   {
		   System.out.println("content is present");
	   }
	   else
	   {
		   System.out.println("content is not present");
	   }
	}
	
}

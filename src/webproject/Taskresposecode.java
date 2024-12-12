package webproject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taskresposecode {
	
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	
	@Test
	public void count()
	{
		 List<WebElement> linkDetails=driver.findElements(By.tagName("a"));
		 System.out.println("Total no:of links="+linkDetails.size());
		
		
			for(WebElement element:linkDetails)
			{
				String link=element.getAttribute("href");
				verify(link);
			}
	}

	private void verify(String link) {
		// response code method
		
		try
		{	
			URL u=new URL(link);
		 HttpURLConnection	code=(HttpURLConnection)u.openConnection();
		 int cod=code.getResponseCode();
		 System.out.println(cod);
		
		 
		 if(cod==200)
		 {
			 System.out.println("Response code is 200-----------"+link);
		 }
		 else if(cod==404)
		 {
			 System.out.println("Response code is 404----------"+link);
		 }
		 else
		 {
			 System.out.println("other response code");
		 }
		}
		catch(Exception e)
		{
			
		}
		}
		
	}



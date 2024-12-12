package webproject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Santamonicatask {
	
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://santamonicaedu.in/");
	}
	@Test
	public void brokenlink()
	{
		List<WebElement> link= driver.findElements(By.tagName("a"));
		System.out.println("Total no of links:"+link.size());
		for(WebElement linkdtls:link)
		{
			String dtls=linkdtls.getAttribute("href");
		//	System.out.println("the links"+dtls);
			verifyCodeDtls(dtls);
			
			
		}
	}
	private void verifyCodeDtls(String dtls) {
		
		try {
			URL u=new URL(dtls);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			int codedtl=con.getResponseCode();
			
			if(codedtl==404)
			{
				System.out.println("code :"+codedtl+"......broken links:"+dtls);
			}
			else
			{
				System.out.println("code :"+codedtl+".......other links:"+dtls);
			}
		
		
	}
		catch(Exception e)
		{
			
		}
		
	}
}


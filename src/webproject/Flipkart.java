package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	
	ChromeDriver driver;

	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void title()
	{
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String tl="flipkart";
		
		if(tl.equals(actualtitle))
		{
			System.out.println("Title is same");
		}
		else
		{
			System.out.println("Title is not same");
			
		}
		
		String src=driver.getPageSource();
		if(src.contains("cart"))
		{
			System.out.println("Content is present");
		}
		else
		{
			System.out.println("Content is not present");
		}
		
			driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Samsung F55 5g",Keys.ENTER);
			driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy F55 5G (Apricot Crush, 256 GB)']")).click();
	}
	
}

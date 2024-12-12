package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Santamonica {
	
	ChromeDriver driver;

	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://santamonicaedu.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void title()
	{
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String tie="Santamonica Study Abroad Pvt. Ltd.";
			
		if(tie.equals(actualtitle))
		{
			System.out.println("it is same");
		}
		else
		{
			System.out.println("not same");
		}
		
		
		driver.findElement(By.xpath("//li[@id='menu-item-567']")).click(); //click study abroad
		driver.findElement(By.xpath("//img[@alt='United States']")).click(); //click on america
	}
}

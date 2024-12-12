package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {
	
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void titlechk()
	{
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String til="Ebay";
		
		if(til.equals(actualtitle))
		{
			System.out.println("Title is same");
		}
		else
		{
			System.out.println("Not same");
		}
		
		String source=driver.getPageSource();
		if(source.contains("Shop by category"))
		{
			System.out.println("Content is present");
		}
		else
		{
			System.out.println("Not present");
		}
		
		driver.findElement(By.xpath("//button[@id='gh-shop-a']")).click();  //click shop by category
		driver.findElement(By.xpath("//a[@_sp='m570.l45104']")).click();    // click art link
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/section[2]/section/div/ul/li/section/div/ul/li[2]/span/a")).click();  //click on art drawings
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).click();  //click on search
		driver.findElement(By.xpath("//input[@aria-owns='ui-id-1']")).sendKeys("books",Keys.ENTER); // to search books
		driver.findElement(By.xpath("//a[@_sp='m570.l2633']")).click(); // click cart
		
	}

}

package testNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlipkartNewtabswitch {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void amazon()
	{
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("moblie phones",Keys.ENTER);
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
        String exp="Amazon.in : moblie phones";
		
		if(exp.equals(actualTitle))
		{
			System.out.println("Title are same");
			
		}
		else
		{
			System.out.println("Not same");
		}
		
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[13]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		Set<String> allwindows=driver.getWindowHandles();
		for(String handle:allwindows)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]")).click();
				driver.close();
			}
			driver.switchTo().window(parentwindow);
		}
	}

}

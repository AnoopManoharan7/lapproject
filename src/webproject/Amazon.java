package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in.");
		driver.manage().window().maximize();
	}
	
	@Test
	public void Locatorspage()
	{
		driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_bestsellers']")).click();  //click bestsellers
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("moblie",Keys.ENTER); //click on search and search books
		
		
	}

}

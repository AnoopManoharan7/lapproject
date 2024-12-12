package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragandDrop {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
	}
	
	 @Test
	 public void dragdrop()
	 {
		 Actions act= new Actions(driver);
		 WebElement amount=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		 WebElement amt=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		 WebElement bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		 WebElement bankdes=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		 act.dragAndDrop(amount, amt);
		 act.dragAndDrop(bank, bankdes);
		 act.perform();
		 
	 }

}

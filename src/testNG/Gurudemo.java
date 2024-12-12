package testNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gurudemo {
	
	ChromeDriver driver;

	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void clicks()
	{
		WebElement rightclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act=new Actions(driver);
		act.contextClick(rightclick);
		WebElement editt=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]"));
		act.click(editt);
		act.perform();
		Alert alr=driver.switchTo().alert();
		System.out.println(alr.getText());
		alr.accept();
		WebElement dclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(dclick);
		act.perform();
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		
		
	}
	
	
}

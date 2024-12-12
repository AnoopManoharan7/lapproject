package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {

	ChromeDriver driver;

	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Anoop/Music/ST/alert.html");
	}

	@Test
	public void alertpg()
	{
		driver.findElement(By.xpath("//input[@onclick=\'display_alert()\']")).click();
		
		Alert a=driver.switchTo().alert();
		String s= a.getText();
		System.out.println(s);
		a.accept();
		//a.dismiss();  to cancel alert msg
		
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Amal");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("k");
	}
}



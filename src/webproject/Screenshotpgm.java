package webproject;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotpgm {

	ChromeDriver driver;

	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Anoop/Music/ST/alert.html");
	}
	
	@Test
	public void screenshot() throws IOException
	{
		File c=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(c, new File("C:\\Users\\Anoop\\Downloads\\New folder\\imgscrnshot.png"));
		
		
		WebElement button=driver.findElement(By.xpath("//input[@onclick=\'display_alert()\']"));
		File buttonImage=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(buttonImage,new File("./Screenshot/buttonimage.png"));
		
	}
	
	
}

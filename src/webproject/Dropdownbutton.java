package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownbutton {
	
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void dropdwon()
	{
		WebElement day = driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
		Select daydetails=new Select(day);
		daydetails.selectByValue("06");
		
		WebElement month =driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
		Select monthdetails=new Select(month);
		monthdetails.selectByVisibleText("AUG");
		
		WebElement year =driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]"));
		Select yeardetails=new Select(year);
		yeardetails.selectByVisibleText("1995");
		
	}

}

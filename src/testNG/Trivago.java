package testNG;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Trivago {
	
	
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.trivago.in/en-IN?themeId=280&sem_keyword=trivago&sem_creativeid=598703244840&sem_matchtype=e&sem_network=g&sem_device=c&sem_placement=&sem_target=&sem_adposition=&sem_param1=&sem_param2=&sem_campaignid=12420192376&sem_adgroupid=126823053068&sem_targetid=aud-1678683578339:kwd-5593367084&sem_location=9040212&cipc=br&cip=9119000005&gad_source=1&gclid=CjwKCAiA3Na5BhAZEiwAzrfagNcFrbXVj99c3xDhDM88-xnxLlYHs3wPQUuvbgSR4T2MBn9oMutHkxoCKwUQAvD_BwE");
		driver.manage().window().maximize();
	}
	
	@Test
	public void dates()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[1]/fieldset/button[1]/span/span[2]/span[2]")).click();
		datepickMethod("november 2024","18");
	}

	private void datepickMethod(String expMonth, String expDay) {
		
		while(true) {
			String month=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3")).getText();
			if(month.equalsIgnoreCase(expMonth)) {
				break;
			}
			else {
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]/span")).click();
			}
		}
		
		List<WebElement> date=driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
		for(WebElement d:date) {
			String dateText=d.getText();
			if(dateText.equalsIgnoreCase(expDay)) {
				d.click();
				break;				
			}
		}
	}

}

package testNG;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepic {
	
	
EdgeDriver driver;
	
	@BeforeTest
	public void setup() {
		driver=new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		
		
	}
	
	
	  @Test 
	  public void set() {
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		  datepicker("November 2024","12");
	  
	  
	  }
	 
	
	@Test
	public void datepicker(String expmonth,String date) {
		while(true){
			
		String month=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
		
		if(month.equals(expmonth)) {
			
			break;
		}
		else {
			
			 driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
			
			
	   }
		 }
		
		List<WebElement> date1=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
		
		for(WebElement d:date1 ) {
			
			String datetext=d.getText();
			if(datetext.equals(date)) {
				
				d.click();
				break;
			}
			
		}
	}

}

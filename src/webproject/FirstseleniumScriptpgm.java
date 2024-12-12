package webproject;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstseleniumScriptpgm {

	public static void main(String[] args) {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//driver.quit();
		//driver.close();
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		//expected result =facebook
		
		String exp="Facebook";
		
		if(exp.equals(actualTitle))
		{
			System.out.println("Title are same");
			
		}
		else
		{
			System.out.println("Not same");
		}
		
	}

}

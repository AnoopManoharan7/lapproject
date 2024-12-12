package webproject;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

public class Responsecodepgm {
	
	String link="https://www.facebook.com/";
	
	@Test
	public void responsecodefb()
	{
		try
		{
		URL u=new URL(link);
		HttpURLConnection con =(HttpURLConnection)u.openConnection();
		int code=con.getResponseCode();
		System.out.println(code);
		if(code==200)
		{
			System.out.println("successfull link");
		}
		else
		{
			System.out.println("not successfull link");
		}
		}
		catch(Exception e)
		{
			
		}
	}
			

}

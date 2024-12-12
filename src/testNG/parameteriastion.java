package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameteriastion {

	
	@Parameters("s")
	@Test
	public void paramtr(String s)
	{
		System.out.println("parameter value ="+s);
	}
	
	
}

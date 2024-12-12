package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demopgm {

	@BeforeTest
	public void setUp()
	{
		System.out.println("Browser Loading");
	}
	
	@BeforeMethod
	public void urlloading()
	{
		System.out.println("url details");
	}
	
	@Test(priority=3)
	public void test1()
	{
		System.out.println("test 1");
	}
	
	@Test(priority=2,enabled=false)
	public void test2()
	{
		System.out.println("test 2");
	}
	
	@Test(priority=1)
	public void test3()
	{
		System.out.println("test 3");
	}
	
	@AfterMethod
	public void aftrmthd()
	{
		System.out.println("url loaded success");
	}
	
	@AfterTest
	public void teardown()
	{
		System.out.println("quit browser");
	}
	
}

package utils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AppUtils 
{
	@BeforeSuite
	public static void launchApp()
	{
		System.out.println("Launch gmail app");
	}
	@BeforeTest
	public static void login()
	{
		System.out.println("Gmail login");
	}
	@AfterTest
	public static void logout()
	{
		System.out.println("Gmail logout");
	}
	@AfterSuite
	public static void closeApp()
	{
		System.out.println("Close gmail app");
	}
}

package TestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGClass 
{
	
	@Test(priority=1)
	void openapp()
	{
		System.out.println("open the application");
	}
	@Test(priority=2)
	void login()
	{
		System.out.println("login the application");
	}
	
	@Test(priority=3)
	void logout()
	{
		System.out.println("logout from the application");
	}	
}
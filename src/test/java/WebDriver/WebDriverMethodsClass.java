package WebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodsClass
{

	public static void main(String[] args)

	{
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		//driver.manage().window().maximize();
		//System.out.println(driver.getTitle());
		
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());

		//String dd =driver.getWindowHandle();
		//System.out.println(dd);
		
		driver.findElement(By.linkText("nopCommerce.com")).click();
		Set<String>  ddd=driver.getWindowHandles();
		System.out.println(ddd);
		
		
		
	}

}

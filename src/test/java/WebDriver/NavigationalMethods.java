package WebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalMethods {

	public static void main(String[] args) throws MalformedURLException 
	{
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://demo-opencart.com/index.php?route=account/login&language=en-gb");
		//driver.navigate().to("https://demo-opencart.com/index.php?route=account/login&language=en-gb");
		
		
		//URL url=new URL("https://demo-opencart.com/index.php?route=account/login&language=en-gb");
		//driver.navigate().to(url);

		
		driver.get("https://demo-opencart.com/index.php?route=account/login&language=en-gb");
		driver.navigate().to("https://demo-opencart.com/");
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
		
	}

}

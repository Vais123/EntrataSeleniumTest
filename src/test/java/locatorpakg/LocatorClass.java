package locatorpakg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorClass {

	public static void main(String[] args) 
	{
		
		//launching the brouser
		ChromeDriver driver=new ChromeDriver();
		
		//open the url
	     driver.get("https://demo.nopcommerce.com/");
	     
	     //maximaize the url
	     driver.manage().window().maximize();
	     
	     //BY Nmae
	     driver.findElement(By.name("q")).sendKeys("book");
	     
	     //by ID
	     boolean displayesstatus=driver.findElement(By.id("dialog-notifications-error")).isDisplayed();
	     System.out.println(displayesstatus);
	     
	     
	     //linktest and partiallink test
	     //driver.findElement(By.linkText("Register")).click();
	     driver.findElement(By.partialLinkText("Regr")).click();
	     
	    // by classname
	     
	     List<WebElement> headerLinks = driver.findElement(By.className("ico-wishlist"));
	     System.out.println("total no of hearder links are:"+headerLinks.size());
	     
	     
	     // tag name
	     
	     List<WebElement> links=driver.findElements(By.tagName("a"));
	     
	    System.out.println("total no of links are:"+links.size());
	     
	     

	}

}

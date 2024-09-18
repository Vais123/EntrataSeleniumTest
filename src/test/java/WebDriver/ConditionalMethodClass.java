package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethodClass {

	public static void main(String[] args) 
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		//boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		//System.out.println("status displayed ::" +status);
		
		
		boolean status=driver.findElement(By.xpath("//input[@type='text']")).isEnabled();
		System.out.println("status displayed ::" +status);
		
	WebElement male_status=	driver.findElement(By.xpath("//input[@id='gender-male']"));
	WebElement female_status=	driver.findElement(By.xpath("//input[@id='gender-female']"));
	
	System.out.println(male_status.isSelected());
	System.out.println(female_status.isSelected());
	male_status.click();
			
	System.out.println(male_status.isSelected());
	System.out.println(female_status.isSelected());
	
	boolean Newstatus =driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
			System.out.println("check box is already selected" +Newstatus);
	
	
		

	}

}

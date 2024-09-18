package TestNG;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class EntrataBasicTests {
    
	private WebDriver driver;
	
	@Test
	
	public void verifyApplicationTitle() // This will give us the title after launching browser with entrata.com
	{
		
		ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.entrata.com/");
	
	String myTitle= driver.getTitle();
	
	System.out.println("Title is:"+ myTitle);
	
	String expected_title = "Property Management Software | Entrata";
	
	Assert.assertEquals(myTitle, expected_title); // This is used to verify actual vs expected result using assertion
	
	System.out.println("Test Completed");
	
	driver.close();
	}
	
	
	@Test(priority = 2)
	
	public void navigateToPropertyManagement() 
	{
		
		ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.entrata.com/");
	
	WebElement element = driver.findElement(By.xpath("//body/section[1]/div[14]/div[1]/nav[1]/div[1]/div[1]/div[1]")); //mouse hover action
	
	Actions act = new Actions(driver); // Action class is used to perform mouse hover action perform
	
	act.moveToElement(element).perform(); // This will move mouse pointer to the Products 
	
	driver.close();

	}
	
	@Test(priority = 3)
	
	public void goToPropertyManagementFromProducts() // Method to open Property mngt screen 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.entrata.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement element = driver.findElement(By.xpath("//body/section[1]/div[14]/div[1]/nav[1]/div[1]/div[1]/div[1]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(element).perform(); // mouse hover action
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[14]/div[1]/nav[1]/div[1]/nav[1]/div[1]/div[2]/div[1]/a[1]/h3[1]")).click(); // Click event on Property Management
		
	
		driver.quit();	
		
	}
	
	
	
@Test(priority = 4)
	
	public void goToPropertyManagementResources() // Method for navigation to Resources and then click on guide
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.entrata.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement element = driver.findElement(By.xpath("//body/section[1]/div[14]/div[1]/nav[1]/div[3]/div[1]/div[1]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(element).perform();
		
		
		driver.findElement(By.xpath("//body/section[1]/div[14]/div[1]/nav[1]/div[3]/nav[1]/div[1]/a[2]")).click(); // click on guide event
		
		driver.quit();	
		
	}

 @Test(priority= 5)

public void navigationWindow() // In this method we are going to navigate, refresh, get url and navigation to bak etc
{
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.entrata.com/");
	
    driver.navigate().to("https://www.residentportal.com/");

    driver.navigate().back();
    System.out.println(driver.getCurrentUrl());

    driver.navigate().forward();
    System.out.println(driver.getCurrentUrl());

    driver.navigate().refresh();
}


	@AfterClass()
	
		public void quitBrowser()
		{
		driver.quit();
		
	}
}

	       
	
	
        
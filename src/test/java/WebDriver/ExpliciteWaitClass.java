package WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExpliciteWaitClass {

	public static void main(String[] args) 
	{
	
		ChromeDriver driver=new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demo-opencart.com/index.php?route=account/login&language=en-gb");
		driver.manage().window().maximize();
		
		WebElement username=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-email']")));
        username.sendKeys("vaishnavilande45@gmail.com");
        
    	WebElement pass=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-password']")));
       pass.sendKeys("vaishnavi@123");
        
   	WebElement login=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Login')]")));
    login.click();
	
	}

}

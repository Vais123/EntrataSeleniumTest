package WebDriver;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitMethodClass {

	public static void main(String[] args)
	
	{
		ChromeDriver driver=new ChromeDriver();
		
		  Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30))
			       .pollingEvery(Duration.ofSeconds(5))
			       .ignoring(NoSuchElementException.class);
		  
		  driver.get("https://demo-opencart.com/index.php?route=account/login&language=en-gb");
		  driver.manage().window().maximize();
		  
		  WebElement user = mywait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.xpath("//input[@id='input-email']"));
			     }
			   });
		  user.sendKeys("vaishnavilande45");
		 
	}

}

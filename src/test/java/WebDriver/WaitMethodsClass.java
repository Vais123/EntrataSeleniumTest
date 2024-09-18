package WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitMethodsClass {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo-opencart.com/index.php?route=account/login&language=en-gb");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='E-Mail Address']")).sendKeys("email");
		driver.close();
		
		
		// TODO Auto-generated method stub
		
		

	}

}

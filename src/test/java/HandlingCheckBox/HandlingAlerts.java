package HandlingCheckBox;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            
		
		/*normal alert in selenium with OK button:
		//driver.switchTo().alert().accept();
		Alert text=driver.switchTo().alert();
		System.out.println(text.getText());
		text.accept();
		*/
		
		//confirmation alert with OK and Cancle button:
		
		/*driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		driver.switchTo().alert().dismiss();
		//driver.close();*/
		
		
		//prompt alert with ok and cancle button:--Input box
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		Alert myalert=driver.switchTo().alert();
		myalert.sendKeys("welcome");
		myalert.accept();
		
	}
	

}

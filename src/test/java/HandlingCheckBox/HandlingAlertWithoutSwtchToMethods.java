package HandlingCheckBox;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlertWithoutSwtchToMethods {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		WebDriverWait mydriver=new WebDriverWait(driver,Duration.ofSeconds(5));
		
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		
		Alert myalert=mydriver.until(ExpectedConditions.alertIsPresent());
		System.out.println(myalert.getText());
		myalert.accept();
		
		// TODO Auto-generated method stub

	}

}

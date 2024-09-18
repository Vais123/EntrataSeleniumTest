package WebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificWindow {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//a[contains(text(),'Forums')]")).click();
        
       Set <String> windowIDs=driver.getWindowHandles();
       for(String winid:windowIDs)
    	   
       {
    	   String title=driver.switchTo().window(winid).getTitle();
    	   System.out.println(title);
    	  
    	   if(title.equals("Forums - nopCommerce"))
    	   {
    		   driver.close();
    	   }
    	   
       }
	}

}

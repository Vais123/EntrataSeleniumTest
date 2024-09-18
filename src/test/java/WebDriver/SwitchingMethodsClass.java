package WebDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//import org.openqa.selenium. WebDriver.TargetLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingMethodsClass {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
        driver.findElement(By.xpath("//a[contains(text(),'Forums')]")).click();
        
       Set<String> ID=driver.getWindowHandles();
       //System.out.println(ID);
       
      /* List<String> winID=new ArrayList<String>(ID);
       
       String parentID=winID.get(0);
       String childID=winID.get(1);
       
       driver.switchTo().window(parentID);
       System.out.println(driver.getTitle());
       
       driver.switchTo().window(childID);
       System.out.println(driver.getTitle());*/
       
       
       
       for(String winid:ID)
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

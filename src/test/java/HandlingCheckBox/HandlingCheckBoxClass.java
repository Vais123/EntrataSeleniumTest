package HandlingCheckBox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBoxClass {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//select specific checkbox:
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		//driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		//select all/multiple checkboxes
		
		List<WebElement> checkboxes = (List<WebElement>) driver.findElement(By.xpath("//input[@id='form-check-input' and @type='checkbox']"));
		
		/*for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}

		/*for(WebElement check:checkboxes)
		{
	             ((WebElement) checkboxes).click();
		}*/
		//select last 3 checkboxes
		
		/*total no of checkboxes-how many checkboxes we want to select=starting index
		7-3=4 (starting index)
	for(int i=0;i<checkboxes.size();i++)
	{
		checkboxes.get(i).click();
	}
	
	//select 1st 3 checkboxes
	for(int i=0;i<3;i++)
	{
		checkboxes.get(i).click();
	}*/
	
	
	//unselecte checkbox if they are selected
	for(int i=0;i<3;i++)
	{
		checkboxes.get(i).click();
	}
	
	Thread.sleep(5000);
	
	for(int i=0;i<checkboxes.size();i++)
	{
		if(checkboxes.get(i).isSelected())
		{
			checkboxes.get(i).click();
			
		}
	}
	}

}

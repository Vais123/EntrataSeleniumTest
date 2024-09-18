package firstautomationscript;

import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.chrome.ChromeDriver;

//Test case:
//1)open the chrome brouser.
//2)open the URL: https://flipcart.com/
//3)validate the title should be "flipcart.com".
//4)close the brouser.
	

public class firstautomation
{

	public static void main(String[] args) 
	{
		//1)launch the brouser:
		ChromeDriver driver1=new ChromeDriver();
		//2)open the URL; " https://flipcart.com/"
		
		driver1.get("https://demo.opencart.com/");
		
		String act_title=driver1.getTitle();
		
		if(act_title.equals("Your Store"))
		{
			System.out.println("test passed");
			
		}
		else
		{
			System.out.println("test failed");
		}
	
		
		driver1.quit();
	}

	

}

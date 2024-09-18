



package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrouserMethodClass {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver dd=new ChromeDriver();
		dd.get("https://demo-opencart.com/");
		dd.findElement(By.linkText("Desktops")).click();
		Thread.sleep(40000);
		
		dd.close();
	    //dd.quit();
	

	}

}

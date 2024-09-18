package firstautomationscript;

import org.openqa.selenium.edge.EdgeDriver;

public class Secondautomation {

	public static void main(String[] args)
	
	{
	EdgeDriver driver2=new EdgeDriver();
	driver2.get("https://demo.nopcommerce.com/");
	
	String act1_title=driver2.getTitle();
	
	if(act1_title.equals("nopcommerce demo store"))
	{
		System.out.println("test passed");
	}
	else
	{
		System.out.println("failed");
	}
	
	driver2.close();

	}

}

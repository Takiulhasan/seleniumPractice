package practice;

import org.openqa.selenium.WebDriver;

public class Test {

	public static void main(String[] args) 
	 {
		try
		{
			WebDriver driver = Base.getDriver();
			driver.get("http://google.com");
			
			
		}
	 catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
}

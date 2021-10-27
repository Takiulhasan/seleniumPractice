package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =Base.getDriver();
		
		//Nevigate to http://automationpractice.com/
		
		driver.get("http://automationpractice.com/");
		
		//click signn in button/link
		//find sign in element
		WebElement element=driver.findElement(By.className("login"));
		//click on found element
		
		element.click();
		
		//enter 'test@timeandtraining.net' in email address text
		
		//find email address textbox
		element=driver.findElement(By.id("email"));
		//enter text: test@timeandtraining.net
		element.sendKeys("sakibh022@gmail.com");
		//password
		driver.findElement(By.id("passwd")).sendKeys("sakib12345");
		//login
		driver.findElement(By.id("SubmitLogin")).click();
		
		//logout
		WebElement Signout_button=driver.findElement(By.className("logout"));
		
		WebElement page_header=driver.findElement(By.className("page-heading"));
		
		
		String signout_Button_text=Signout_button.getText();
		String header_text= page_header.getText();
		
		System.out.println(signout_Button_text);
		System.out.println(header_text);
		
		
		
		
		


	}

}

package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPagePage_Objects {

	WebDriver driver;
	By username=By.xpath("//input[@id='username']");
	By password=By.xpath("//input[@id='password']");
	By login=By.xpath("//input[@id='Login']");
	By tryforfree=By.xpath("//a[@id='signup_link']");
	
	public LoginPagePage_Objects(WebDriver driver2) {
		
		this.driver=driver2;
		
	}
	public WebElement enterUsername()
	{
		return driver.findElement(username);
	}
	 public WebElement enterPassword()
	 {
		 return driver.findElement(password);
	 }
	public WebElement clickOnLogin()
	{
		return driver.findElement(login);
	}
	
	public WebElement tryForFree() {
		// TODO Auto-generated method stub
		return driver.findElement(tryforfree);
	}
}

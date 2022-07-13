package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage_Objects {
	
	public WebDriver driver;
	
	By firstname=By.xpath("//input[@name='UserFirstName']");
	By lastname=By.xpath("//input[@name='UserLastName']");
	By jobtitle=By.xpath("//select[@name='UserTitle']");
	
	public SignUpPage_Objects(WebDriver driver2) {
		this.driver=driver2;
		// TODO Auto-generated constructor stub
	}

	public WebElement enterFirstname()
	{
		return driver.findElement(firstname);
	}
	
	public WebElement enterLastname()
	{
		return driver.findElement(lastname);
	}
	
	public WebElement selectJobTitle() 
	{
		return driver.findElement(jobtitle);
	}

}

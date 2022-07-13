package TestCase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.LoginPagePage_Objects;
import Resources.BaseClass;
import Resources.constants;

public class VerifyLoginPage extends BaseClass {
	
	@Test(dataProvider = "testdata")
	public void loginVerification(String username,String password) throws IOException
	{
		LoginPagePage_Objects lp=new LoginPagePage_Objects(driver);
		lp.enterUsername().sendKeys(username);
		lp.enterPassword().sendKeys(password);
		lp.clickOnLogin().click();
		
		String ActualText=driver.findElement(By.xpath("//div[@id='error']")).getText();
		String ExpectedText="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		Assert.assertEquals(ActualText, ExpectedText);
	}

	@DataProvider
	public Object[][] testdata()
	{
		Object[][] data=new Object[2][2];
		data[0][0]=constants.username1;
		data[0][1]=constants.username2;
		data[1][0]=constants.username2;
		data[1][1]=constants.password2;
		return data;
	}
	
}

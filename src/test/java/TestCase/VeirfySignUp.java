package TestCase;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPagePage_Objects;
import PageObjectModel.SignUpPage_Objects;
import Resources.BaseClass;
import Resources.constants;

public class VeirfySignUp extends BaseClass {

	@Test
	public void signUp() throws IOException, InterruptedException {
		
		
		LoginPagePage_Objects lp2=new LoginPagePage_Objects(driver);
		lp2.tryForFree().click();	
		Thread.sleep(2000);
		SignUpPage_Objects sp=new SignUpPage_Objects(driver);
		sp.enterFirstname().sendKeys(constants.firstname);
		sp.enterLastname().sendKeys(constants.lastname);
		
		Select sl=new Select(sp.selectJobTitle());
		sl.selectByIndex(1);
	}
}

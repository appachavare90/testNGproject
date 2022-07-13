package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver driverInitialization() throws IOException {
		
		FileInputStream fls=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		
		prop=new Properties();//to access the properties 
		
		prop.load(fls);
		
		String browsername=prop.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			/*System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\ChromeDriver\\chromedriver.exe");
			 driver=new ChromeDriver();*/
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			//firefox code
		}
		else if(browsername.equalsIgnoreCase("edge"))
		{
			//edge code
		}
		else
		{
			System.out.println("enter valid browser name");
		}
		
		return driver;
	}
	@BeforeMethod
	public void browserLaunch() throws IOException
	{
		driverInitialization();
		driver.get(prop.getProperty("url"));
		
	}
	@AfterMethod
	public void closeBrowser()
	{
		//driver.quit();
	}
}

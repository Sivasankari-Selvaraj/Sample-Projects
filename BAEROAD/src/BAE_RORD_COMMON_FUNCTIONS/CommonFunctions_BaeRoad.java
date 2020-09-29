package BAE_RORD_COMMON_FUNCTIONS;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions_BaeRoad {
	public static Properties properties=null;
	public static WebDriver driver=null;
	
	public Properties loadall() throws IOException
	{
		FileInputStream stream=new FileInputStream("BaeRoadConfig.properties");
		 properties=new Properties();
		properties.load(stream);
		return properties;
	}
	@BeforeMethod
	public void browserlaunch() throws IOException
	{
		loadall();
		
		String Browser=properties.getProperty("browser");
		String URL=properties.getProperty("url");
		String Driverlocation=properties.getProperty("driverlocation");
		
		if(Browser.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver",Driverlocation );
			 driver=new ChromeDriver();
		}
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

	
	}
		@AfterMethod
		public void browserclose()
		{
			
			
			
			
			driver.close();
		}
		

}

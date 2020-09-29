package BAE_ROAD_TESTCASES;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BAE_RORD_COMMON_FUNCTIONS.CommonFunctions_BaeRoad;
import PAGE_OBJECT_MODEL.POM_BaeRoad;

public class RegistrationPage_BaeRoad extends CommonFunctions_BaeRoad {
	
	@Test(priority = 0,enabled = false)
	public static void SuccessfulRegistration() throws InterruptedException
	{
		PageFactory.initElements(driver,POM_BaeRoad.class);
		
		POM_BaeRoad.SignUpPageClick.click();
		POM_BaeRoad.RegUserName.sendKeys("joe");
		POM_BaeRoad.RegEmailAddress.sendKeys("joerio95@gmail.com");
	    POM_BaeRoad.RegPassword.sendKeys("Smrs321#");
	
	    POM_BaeRoad.SignUpCheckboxTermsAndConditions.click();
	 
	   
	    
	    Actions act =  new Actions(driver);
	    act.moveToElement( POM_BaeRoad.SignUpButtonClick).click().perform();
	    Thread.sleep(3000);
	    driver.navigate().back();
//	    WebElement SignupCheckBoxButton= POM_BaeRoad.SignUpCheckboxTermsAndConditions;
//	    boolean SignupTermsAndCondition= SignupCheckBoxButton.isSelected();
//	    System.out.println("The SignUpCheckBox is:" +SignupTermsAndCondition);
	    driver.get("https://login.yahoo.com/?.intl=in");   
	    POM_BaeRoad.YahooMailUserName.clear();
	    POM_BaeRoad.YahooMailUserName.sendKeys("shobanvigneshopm");
	    POM_BaeRoad.YahooMailUserNextButton.click();
//	    Thread.sleep(5000);
//	    POM_BaeRoad.YahooMymailbutton.click();
	   
	    
	    POM_BaeRoad.YahooMailPassword.clear();
	    POM_BaeRoad.YahooMailPassword.sendKeys("Smrs123#");
	    POM_BaeRoad.YahooMailPasswordNextButton.click();
	    Thread.sleep(3000);
	  
	   
	   
	    
		
		
		
	}
	

}

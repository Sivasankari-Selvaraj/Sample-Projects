package BAE_ROAD_TESTCASES;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import BAE_RORD_COMMON_FUNCTIONS.CommonFunctions_BaeRoad;
import PAGE_OBJECT_MODEL.POM_BaeRoad;

public class LoginPage_BaeRoad extends CommonFunctions_BaeRoad {
	
	
	  @Test(priority =1) public void SuccefulLogin() throws InterruptedException 
	  {
	  
	  PageFactory.initElements(driver,POM_BaeRoad.class);
	  
	  POM_BaeRoad.UserName.sendKeys("shobanvikki");
	  POM_BaeRoad.Password.sendKeys("Smrs321#"); 
	  POM_BaeRoad.LoginButton.click();
	  Thread.sleep(2000);
	  
	  
	  }
	  
	  @Test(priority =2) public void InvalidUserNameAndPss() throws
	  InterruptedException 
	  {
	  
	  PageFactory.initElements(driver,POM_BaeRoad.class);
	  
	  POM_BaeRoad.UserName.sendKeys("shoban");
	  POM_BaeRoad.Password.sendKeys("Smrs3"); 
	  POM_BaeRoad.LoginButton.click();
	  Thread.sleep(2000); 
      WebElement InvalidLogin=POM_BaeRoad.InvalidUserNamePasswordValidation; 
      String Status=InvalidLogin.getText(); 
      System.out.println(Status);
	  Assert.assertEquals("User doesn't exist", Status);
	  }
	  
	  @Test(priority =3) public void ValidUserNameInvalidPss() throws
	  InterruptedException 
	  {
	  
	  PageFactory.initElements(driver,POM_BaeRoad.class);
	  
	  POM_BaeRoad.UserName.sendKeys("shobanvikki");
	  POM_BaeRoad.Password.sendKeys("Smr1256");
	  POM_BaeRoad.LoginButton.click();
	  Thread.sleep(2000); WebElement
	  ValidUserInvalidPss=POM_BaeRoad.ValidUserNameInvalidPasswordValidation;
	  String Status=ValidUserInvalidPss.getText(); System.out.println(Status);
	  Assert.assertEquals("Incorrect password", Status);
	  
	  
	  }
	  
	  @Test(priority =4) public void InvalidUserNameValidPss() throws
	  InterruptedException 
	  {
	  
	  PageFactory.initElements(driver,POM_BaeRoad.class);
	  
	  POM_BaeRoad.UserName.sendKeys("shobanvi");
	  POM_BaeRoad.Password.sendKeys("Smrs321#");
	  POM_BaeRoad.LoginButton.click();
	  Thread.sleep(2000); 
	  WebElement  InvalidUserValidPss=POM_BaeRoad.InvalidUserNameValidPasswordValidation;
	  String Status=InvalidUserValidPss.getText(); 
	  System.out.println(Status);
	  Assert.assertEquals("User doesn't exist", Status);
	  
	  
	  }
	  
	  @Test(priority =5) public void ValidUserNameBlankPss() throws
	  InterruptedException
	  {
	  
	  PageFactory.initElements(driver,POM_BaeRoad.class);
	  
	  POM_BaeRoad.UserName.sendKeys("shobanvikki");
	  POM_BaeRoad.Password.sendKeys(""); 
	  POM_BaeRoad.LoginButton.click();
	  Thread.sleep(2000); 
	  WebElement ValidUserBlankPss=POM_BaeRoad.ValidUserNameBlankPassswordValidation; 
	  String Status=ValidUserBlankPss.getText(); 
	  System.out.println(Status);
	  Assert.assertEquals("Password cannot be empty", Status);
	  
	  }
	  
	  @Test(priority =6) public void InvalidUserNameBlankPss() throws
	  InterruptedException 
	  {
	  
	  PageFactory.initElements(driver,POM_BaeRoad.class);
	  
	  POM_BaeRoad.UserName.sendKeys("shobankki");
	  POM_BaeRoad.Password.sendKeys(""); 
	  POM_BaeRoad.LoginButton.click();
	  Thread.sleep(2000); 
	  WebElement InvalidUserBlankPss=POM_BaeRoad.InvalidUserNameBlankPasswordValidation;
	  String Status=InvalidUserBlankPss.getText(); 
	  System.out.println(Status);
	  Assert.assertEquals("Password cannot be empty", Status);
	  
	  
	  
	  }
	  
	  @Test(priority =7) public void BlankUserNameValidpss() throws
	  InterruptedException 
	  {
	  
	  PageFactory.initElements(driver,POM_BaeRoad.class);
	  
	  POM_BaeRoad.UserName.sendKeys(""); 
	  POM_BaeRoad.Password.sendKeys("Smrs321#");
	  POM_BaeRoad.LoginButton.click(); Thread.sleep(2000); 
	  WebElement BlankUserValidPss=POM_BaeRoad.BlankUserNameValidPasswordValidation; 
	  String Status=BlankUserValidPss.getText(); 
	  System.out.println(Status);
	  Assert.assertEquals("Enter Valid E-mail", Status);
	  
	  }
	  
	  @Test(priority =8) public void BlankUserNameInValidPss() throws
	  InterruptedException 
	  {
	  
	  PageFactory.initElements(driver,POM_BaeRoad.class);
	  
	  POM_BaeRoad.UserName.sendKeys("");
	  POM_BaeRoad.Password.sendKeys("Smrs303");
	  POM_BaeRoad.LoginButton.click(); 
	  Thread.sleep(2000); 
	  WebElement BlankUserInvalidPss=POM_BaeRoad.BlankUserNamInvalidPasswordValidation; 
	  String  Status=BlankUserInvalidPss.getText();
	  System.out.println(Status);
	  Assert.assertEquals("Enter Valid E-mail", Status);
	  
	  
	  }
	  
	  @Test(priority =9) public void BlankUserNameBlankPss() throws
	  InterruptedException 
	  {
	  
	  PageFactory.initElements(driver,POM_BaeRoad.class);
	  
	  POM_BaeRoad.UserName.sendKeys(""); 
	  POM_BaeRoad.Password.sendKeys("");
	  POM_BaeRoad.LoginButton.click(); 
	  Thread.sleep(2000); 
	  WebElement BlankUserBlankPss=POM_BaeRoad.BlankUserNameBlankPasswordValidation; 
	  String Status=BlankUserBlankPss.getText(); 
	  System.out.println(Status);
	  Assert.assertEquals("Enter Valid E-mail", Status);
	  
	  
	  }
	  
	  @Test(priority =10) public void VerifyValidChangeForgotPassword() throws
	  InterruptedException 
	  {
	  
	  PageFactory.initElements(driver,POM_BaeRoad.class);
	  POM_BaeRoad.LoginForgotPasswordClick.click();
	  POM_BaeRoad.LoginForgotPasswordEmailTextBox.sendKeys("shobanvignesh94@gmail.com");
	  POM_BaeRoad.LoginForgotPasswordEmailSubmitbutton.click(); 
	  }
	 
	@Test(priority =11)
	public void VerifyinvalidChangeForgotPassword() throws InterruptedException
	{
		
		PageFactory.initElements(driver,POM_BaeRoad.class);
		POM_BaeRoad.LoginForgotPasswordClick.click();
		POM_BaeRoad.LoginForgotPasswordEmailTextBox.sendKeys("shoban@gil.com");
		POM_BaeRoad.LoginForgotPasswordEmailSubmitbutton.click();
		Thread.sleep(3000);
	WebElement InvalidEmailAddress=	POM_BaeRoad.LoginForgotPasswordInvalidEmailVerification;
	String Status=InvalidEmailAddress.getText();
	System.out.println(Status);
	Assert.assertEquals("Something went wrong. Please try again", Status);
	
		}

}

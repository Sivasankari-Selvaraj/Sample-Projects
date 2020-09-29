package BAE_ROAD_TESTCASES;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import BAE_RORD_COMMON_FUNCTIONS.CommonFunctions_BaeRoad;
import PAGE_OBJECT_MODEL.POM_BaeRoad;
import PAGE_OBJECT_MODEL.POM_BaeRoadAccountspage;
import PAGE_OBJECT_MODEL.POM_BaeRoadPurchasePage;

public class PurchasePage_BaeRoad extends CommonFunctions_BaeRoad {
	
	 @Test(priority =1) 
	 public void SuccefulLogin() throws InterruptedException 
	  {
	  
	  PageFactory.initElements(driver,POM_BaeRoad.class);
	  
	  POM_BaeRoad.UserName.sendKeys("shobanvikki");
	  POM_BaeRoad.Password.sendKeys("Smrs321#"); 
	  POM_BaeRoad.LoginButton.click();
	 
	   }
	
	 @Test(priority =2)
	 public void PurcahsePagePostProfileNameTest() throws InterruptedException 
	  {
		 SuccefulLogin();
	  PageFactory.initElements(driver,POM_BaeRoadPurchasePage.class);
	  
	  POM_BaeRoad.HomepagePurchaseOptionClick.click();
	  Thread.sleep(2000);
	  WebElement PostProfileNameValidation= POM_BaeRoadPurchasePage.PurchasePagePostProfileNameValidation;
	  String Name=  PostProfileNameValidation.getText();
	  System.out.println(Name);
	   }
	 
	 @Test(priority =3) 
	 public void PurcahsePagePostProfilePaidPostValidation() throws InterruptedException 
	  {
		 SuccefulLogin();
	  PageFactory.initElements(driver,POM_BaeRoadPurchasePage.class);
	  
	  POM_BaeRoad.HomepagePurchaseOptionClick.click();
	  Thread.sleep(2000);
	  WebElement PostProfileFeedValidation= POM_BaeRoadPurchasePage.PurchasePagePostFeedValidation;
	  String Name=  PostProfileFeedValidation.getText();
	  System.out.println(Name);
	  Assert.assertEquals("Paid", Name);
	   }
	 
	 
	 @Test(priority =4) 
	 public void PurcahsePagePostProfileMoneyValidation() throws InterruptedException 
	  {
		 SuccefulLogin();
	  PageFactory.initElements(driver,POM_BaeRoadPurchasePage.class);
	  
	  POM_BaeRoad.HomepagePurchaseOptionClick.click();
	  Thread.sleep(2000);
	  WebElement PostProfileMoneyValidation= POM_BaeRoadPurchasePage.PurchasePagePostMoneyValidation;
	  String Name=  PostProfileMoneyValidation.getText();
	  System.out.println(Name);
	  
	   }
	 
	 @Test(priority=5)
	 public void PurcahsePagePostProfilePostTextValidation() throws InterruptedException 
	  {
		 SuccefulLogin();
	  PageFactory.initElements(driver,POM_BaeRoadPurchasePage.class);
	  
	  POM_BaeRoad.HomepagePurchaseOptionClick.click();
	  Thread.sleep(2000);
	  WebElement PostTextValidation= POM_BaeRoadPurchasePage.PurchasePagePostTextValidation;
	  String Text=  PostTextValidation.getText();
	  System.out.println(Text);
	 
	   }
	 
	 @Test(priority = 6,enabled = false)
	 public void AccountsPageEarningOptionRecentEarningsValidation() throws InterruptedException
	 {
		 SuccefulLogin();
		 PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		 
		 POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		 POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
		 POM_BaeRoadAccountspage.AccountpageEarningOptionClick.click();
		 Thread.sleep(3000);
         List<WebElement> tableCount = POM_BaeRoadAccountspage.AccountpageEarningOptionRecentEarningtableList;
         System.out.println(tableCount.size());
         int TotalCount = tableCount.size();
         double fullAmount = 0;

			for(int i = 1; i <= TotalCount; i++)
			{
        
				String Amount =POM_BaeRoadAccountspage.AccountpageEarningOptionRecentEarningsColoumnSelect.getText();
                System.out.println(Amount);
                String ConvertAmount = Amount.substring(1);
                double amount = Double.parseDouble(ConvertAmount);
                fullAmount = fullAmount + amount;
            }
			
			System.out.println(fullAmount);
	        String earning = POM_BaeRoadAccountspage.AccountpageEarningOptionRecentEarningsGrossEarning.getText();
	        System.out.println("Expected amount " + earning);
	        String ConvertEarnings = earning.substring(1);
	        double earnings = Double.parseDouble(ConvertEarnings);
//	        Assert.assertEquals(fullAmount, earnings);
	        
	       double NetEarnings= earnings*0.15;
	       double results=earnings-NetEarnings;
	       System.out.println(results);

	  }

	


		 
		 
	 
	 
	 

}

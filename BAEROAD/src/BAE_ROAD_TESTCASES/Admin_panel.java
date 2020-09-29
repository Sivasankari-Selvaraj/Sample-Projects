package BAE_ROAD_TESTCASES;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BAE_RORD_COMMON_FUNCTIONS.CommonFunctions_BaeRoad;
import PAGE_OBJECT_MODEL.POM_BaeRoad;
import PAGE_OBJECT_MODEL.POM_BaeRoadAccountspage;
import PAGE_OBJECT_MODEL.POM_BaeRoadAdminPanel;

public class Admin_panel  extends CommonFunctions_BaeRoad{
	
	
	@Test
	public  void Login() throws InterruptedException
	{
	    PageFactory.initElements(driver,POM_BaeRoadAdminPanel.class);
        POM_BaeRoadAdminPanel.UserName.sendKeys("shobanvikki");
		POM_BaeRoadAdminPanel.Password.sendKeys("Smrs321#");
		POM_BaeRoadAdminPanel.LoginButton.click();
	}
	
	
	@Test
	public  void adminpanel() throws InterruptedException
	{
		Login();
		
        PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
		POM_BaeRoadAccountspage.AccountpageSupportOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSupportOptionSubjectBox.sendKeys("Sample Testing1");
		POM_BaeRoadAccountspage.AccountpageSupportOptionMessageBox.sendKeys("Test1");
		POM_BaeRoadAccountspage.AccountpageSupportOptionSendButton.click();
		Thread.sleep(2000);
		
		PageFactory.initElements(driver,POM_BaeRoadAdminPanel.class);
		
		driver.get("https://stage.baeroad.com/admin");
//		driver.findElement(By.xpath("//div[contains(@class,'subscribe_btn')]")).click();
//		POM_BaeRoadAdminPanel.UserName.sendKeys("shobanvikki");
//		POM_BaeRoadAdminPanel.Password.sendKeys("Smrs321#");
//		POM_BaeRoadAdminPanel.LoginButton.click();
        Thread.sleep(2000);	
        
        POM_BaeRoadAdminPanel.SuuportReq.click();
        Thread.sleep(2000);	
        
      List< WebElement> TableSize= POM_BaeRoadAdminPanel.SupportReqTables;
        System.out.println(TableSize.size());
        int TableCount=TableSize.size();
      for(int i=1;i<=TableCount;i++)
      {
    	  
    	  
    	  
      }
	
		
		
		
		
		
		
		}
	
	
	
	
	

}

package BAE_ROAD_TESTCASES;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import BAE_RORD_COMMON_FUNCTIONS.CommonFunctions_BaeRoad;
import PAGE_OBJECT_MODEL.POM_BaeRoad;
import PAGE_OBJECT_MODEL.POM_BaeRoadAccountspage;
import PAGE_OBJECT_MODEL.POM_BaeRoadMessagePage;


public class AccountsPage_BaeRoad extends CommonFunctions_BaeRoad {
	
	@Test(priority =1)
	public void SuccefulLogin() throws InterruptedException
	{
		
		PageFactory.initElements(driver,POM_BaeRoad.class);
		
		POM_BaeRoad.UserName.sendKeys("shobanvikki");
		POM_BaeRoad.Password.sendKeys("Smrs321#");
		POM_BaeRoad.LoginButton.click();
	}
	
	@Test(priority =2)
	public void AccountsPageSettingsOptionTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
		Thread.sleep(1000);
	}
	
	@Test(priority =3)
	public void AccountsPageLogOutOptionTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageLogOutOption.click();
		Thread.sleep(3000);
	}
	
	@Test(priority =4)
	public void AccountsPageMessgeOptionTipmandatoryCheckBoxTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionClick.click();
		WebElement TipCheck=POM_BaeRoadAccountspage.AccountpageMessageOptionTipCheckBoxClick;
		TipCheck.click();
		Thread.sleep(2000);
		boolean TipStatus=TipCheck.isSelected();
		System.out.println(TipStatus);

	}
	
	@Test(priority =5)
	public void AccountsPageMessgeOptionFreeWritePost() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionAddPostButtonClick.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionWritePostCommentText.sendKeys("Hi All");
		POM_BaeRoadAccountspage.AccountpageMessageOptionWritePostSendButton.click();
		Thread.sleep(3000);
		WebElement TipFreePostValidation=POM_BaeRoadAccountspage.AccountpageMessageOptionTipPostValidation;
		String FreePost=TipFreePostValidation.getText();
		System.out.println(FreePost);
	    Assert.assertEquals("Post Created", FreePost);
	
	}
	
	@Test(priority =6)
	public void AccountsPageMessgeOptionpaidWritePost() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionAddPostButtonClick.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionWritePostCommentText.sendKeys("Hello");
		POM_BaeRoadAccountspage.AccountpageMessageOptionWritePostPayChooseOption.click();
		List<WebElement> UlList=POM_BaeRoadAccountspage.AccountpageMessageOptionWritePostUlListSelect;
		int ListSize=UlList.size();
		System.out.println(ListSize);
		
		for (WebElement webElement : UlList) {
			
			if(webElement.getAttribute("data-value").equals("paid"))
			{
				webElement.click();
			}
			
		}
		Thread.sleep(5000);
    	POM_BaeRoadAccountspage.AccountpageMessageOptionWritePostPayAmount.sendKeys(".5");
		Thread.sleep(2000);
		POM_BaeRoadAccountspage.AccountpageMessageOptionWritePostSendButton.click();
		Thread.sleep(3000);
		WebElement TipPaidPostValidation=POM_BaeRoadAccountspage.AccountpageMessageOptionTipPostValidation;
		String PaidPost=TipPaidPostValidation.getText();
		System.out.println(PaidPost);
	    Assert.assertEquals("Post Created", PaidPost);
		
		
	}
	
	@Test(priority =7)
	public void AccountsPageMessgeOptionFreeUploadPost() throws InterruptedException, AWTException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionAddPostButtonClick.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionFreePhotoVideoOption.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionFreeUploadClick.click();
		String file="C:\\Users\\MEN IN BLUE\\img2.jpg";
		StringSelection selection=new StringSelection(file);
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
	     Robot rebot=new Robot();
		 rebot.keyPress(KeyEvent.VK_CONTROL);
		 Thread.sleep(2000);
	     rebot.keyPress(KeyEvent.VK_V);
	     Thread.sleep(2000);
	     rebot.keyRelease(KeyEvent.VK_V);
	     Thread.sleep(2000);
		 rebot.keyRelease(KeyEvent.VK_CONTROL);
		 Thread.sleep(6000);
		 rebot.keyPress(KeyEvent.VK_ENTER);
		 rebot.keyRelease(KeyEvent.VK_ENTER);
		 Thread.sleep(14000);
		 POM_BaeRoadAccountspage.DokaImageEdit.click();
		 Thread.sleep(18000);
		 POM_BaeRoadAccountspage.AccountpageMessageOptionWritePostSendButton.click();
		 Thread.sleep(3000);
		 WebElement TipFreePostValidation=POM_BaeRoadAccountspage.AccountpageMessageOptionTipPostValidation;
		 String FreePost=TipFreePostValidation.getText();
		 System.out.println(FreePost);
		 Assert.assertEquals("Post Created", FreePost);
		 
	}

	@Test(priority =8)
	public void AccountsPageMessgeOptionpaidUploadPost() throws InterruptedException, AWTException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionAddPostButtonClick.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionFreePhotoVideoOption.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionFreeUploadClick.click();
		String file="C:\\Users\\MEN IN BLUE\\img2.jpg";
		StringSelection selection=new StringSelection(file);
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
	     Robot rebot=new Robot();
		 rebot.keyPress(KeyEvent.VK_CONTROL);
		 Thread.sleep(2000);
	     rebot.keyPress(KeyEvent.VK_V);
	     Thread.sleep(2000);
	     rebot.keyRelease(KeyEvent.VK_V);
	     Thread.sleep(2000);
		 rebot.keyRelease(KeyEvent.VK_CONTROL);
		 Thread.sleep(4000);
		 rebot.keyPress(KeyEvent.VK_ENTER);
		 rebot.keyRelease(KeyEvent.VK_ENTER);
		 Thread.sleep(12000);
		 POM_BaeRoadAccountspage.DokaImageEdit.click();
		 Thread.sleep(15000);
		
		 POM_BaeRoadAccountspage.AccountpageMessageOptionWritePostPayChooseOption.click();
		 List<WebElement> UlList=POM_BaeRoadAccountspage.AccountpageMessageOptionWritePostUlListSelect;
		 int ListSize=UlList.size();
		 System.out.println(ListSize);
			
	    for (WebElement webElement : UlList) {
				
				if(webElement.getAttribute("data-value").equals("paid"))
				{
					webElement.click();
				}
				
			}
			Thread.sleep(5000);
	    	POM_BaeRoadAccountspage.AccountpageMessageOptionWritePostPayAmount.sendKeys(".5");
			Thread.sleep(2000);
			POM_BaeRoadAccountspage.AccountpageMessageOptionWritePostSendButton.click();
			Thread.sleep(3000);
			WebElement TipPaidPostValidation=POM_BaeRoadAccountspage.AccountpageMessageOptionTipPostValidation;
			String PaidPost=TipPaidPostValidation.getText();
			System.out.println(PaidPost);
		    Assert.assertEquals("Post Created", PaidPost);
		 }
	
	@Test(priority =9)
	public void AccountsPageMessgeOptionPostEdit() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionAddPostButtonClick.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionWritePostCommentText.sendKeys("Hi All");
		POM_BaeRoadAccountspage.AccountpageMessageOptionWritePostSendButton.click();
		Thread.sleep(3000);
		POM_BaeRoadAccountspage.AccountpageMessageOptionPostOption.click();
		Thread.sleep(2000);
		POM_BaeRoadAccountspage.AccountpageMessageOptionPostEditOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionEditPostAppendCommentText.sendKeys("Hello ");
		POM_BaeRoadAccountspage.AccountpageMessageOptionWritePostSendButton.click();
		Thread.sleep(3000);
		WebElement EditPostValidation=POM_BaeRoadAccountspage.AccountpageMessageOptionEditPostValidation;
		String EditPost=EditPostValidation.getText();
		System.out.println(EditPost);
	    Assert.assertEquals("Post Modified", EditPost);
	}
	
	@Test(priority =10)
	public void AccountsPageMessgeOptionPostDeletionCancel() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionAddPostButtonClick.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionWritePostCommentText.sendKeys("Hi All");
		POM_BaeRoadAccountspage.AccountpageMessageOptionWritePostSendButton.click();
		Thread.sleep(3000);
		POM_BaeRoadAccountspage.AccountpageMessageOptionPostOption.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionPostDeleteOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionPostDeleteCancelButtonClick.click();
		Thread.sleep(3000);
	}

	@Test(priority =11)
	public void AccountsPageMessgeOptionPostDeletion() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionAddPostButtonClick.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionWritePostCommentText.sendKeys("Hi All");
		POM_BaeRoadAccountspage.AccountpageMessageOptionWritePostSendButton.click();
		Thread.sleep(3000);
		POM_BaeRoadAccountspage.AccountpageMessageOptionPostOption.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionPostDeleteOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionPostDeletebuttonClick.click();
		Thread.sleep(3000);
		WebElement DeletePostValidation=POM_BaeRoadAccountspage.AccountpageMessageOptionDeletePostValidation;
		String DeletePost=DeletePostValidation.getText();
		System.out.println(DeletePost);
	    Assert.assertEquals("Post Deleted Successfully", DeletePost);
	}
	
	@Test(priority =12)
	public void AccountsPageMessgeOptionSetMessage() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionTipCheckBoxClick.click();
		Thread.sleep(2000);
		POM_BaeRoadAccountspage.AccountpageMessageOptionAddPostButtonClick.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionWritePostCommentText.sendKeys("Hi All");
		POM_BaeRoadAccountspage.AccountpageMessageOptionWritePostSendButton.click();
		Thread.sleep(3000);
		POM_BaeRoadAccountspage.AccountpageMessageOptionEnterMessageBody.sendKeys("");
		POM_BaeRoadAccountspage.AccountpageMessageOptionSaveButton.click();
		Thread.sleep(3000);
	    WebElement MessageSettingValidation=POM_BaeRoadAccountspage.AccountpageMessageOptionDeletePostValidation;
		String Status=MessageSettingValidation.getText();
		System.out.println(Status);
	    Assert.assertEquals("Message Settings Saved", Status);
	
	}
	
	@Test(priority =13)
	public void AccountsPageMessgeOptionSetMessageRemoveFlow() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionClick.click();
		Thread.sleep(1000);
		POM_BaeRoadAccountspage.AccountpageMessageOptionTipCheckBoxClick.click();
		Thread.sleep(2000);
		POM_BaeRoadAccountspage.AccountpageMessageOptionPostOption.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionPostDeleteOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageMessageOptionPostDeletebuttonClick.click();
		Thread.sleep(3000);
        POM_BaeRoadAccountspage.AccountpageMessageOptionSaveButton.click();
		Thread.sleep(3000);
	    WebElement MessageSettingValidation=POM_BaeRoadAccountspage.AccountpageMessageOptionDeletePostValidation;
		String Status=MessageSettingValidation.getText();
		System.out.println(Status);
	    Assert.assertEquals("Message Settings Saved", Status);
	
	}
	
	
	@Test(priority =14)
	public void AccountsPageSupportOptionValidSupportTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
		POM_BaeRoadAccountspage.AccountpageSupportOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSupportOptionSubjectBox.sendKeys("Sample Testing");
		POM_BaeRoadAccountspage.AccountpageSupportOptionMessageBox.sendKeys("Test");
		POM_BaeRoadAccountspage.AccountpageSupportOptionSendButton.click();
		Thread.sleep(2000);
		
	    WebElement SupportValidation=POM_BaeRoadAccountspage.AccountpageSupportOptionSupportTestvalidation;
		String SupportText=SupportValidation.getText();
		System.out.println(SupportText);
		Assert.assertEquals("Support request sent", SupportText);
		}
	
	@Test(priority =15)
	public void AccountsPageSupportOptionInvalidBlankMessageBoxSupportTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
		POM_BaeRoadAccountspage.AccountpageSupportOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSupportOptionSubjectBox.sendKeys("Sample Testing");
		POM_BaeRoadAccountspage.AccountpageSupportOptionMessageBox.sendKeys("");
		POM_BaeRoadAccountspage.AccountpageSupportOptionSendButton.click();
		Thread.sleep(1000);
		}
	
	@Test(priority =16)
	public void AccountsPageSupportOptionInvalidBlankSubjectBoxSupportTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
		POM_BaeRoadAccountspage.AccountpageSupportOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSupportOptionSubjectBox.sendKeys("");
		POM_BaeRoadAccountspage.AccountpageSupportOptionMessageBox.sendKeys("Test");
		POM_BaeRoadAccountspage.AccountpageSupportOptionSendButton.click();
		}
	
	@Test(priority =17)
	public void AccountsPageSupportOptionInvalidBlankSupportTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
		POM_BaeRoadAccountspage.AccountpageSupportOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSupportOptionSubjectBox.sendKeys("");
		POM_BaeRoadAccountspage.AccountpageSupportOptionMessageBox.sendKeys("");
		POM_BaeRoadAccountspage.AccountpageSupportOptionSendButton.click();
		}
	
	@Test(priority =18)
	public void AccountsPageSupportOptionSendButtonTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
		POM_BaeRoadAccountspage.AccountpageSupportOptionClick.click();
	    WebElement ButtonEnabled=POM_BaeRoadAccountspage.AccountpageSupportOptionSendButton;
	    boolean SendButtonStatus= ButtonEnabled.isEnabled();
	    System.out.println(SendButtonStatus);
	    Assert.assertEquals(true, SendButtonStatus);
		}
	
	@Test(priority =19)
	public void AccountsPageEarningPageChangeSubscriptionOptionClick() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
		POM_BaeRoadAccountspage.AccountpageEarningOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageEarningOptionChangeSubscriptionTypeBoxClick.click();
		
		}
	
	@Test(priority =20)
	public void AccountsPageEarningPageChangeSubscriptionFreeOptionClick() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
		POM_BaeRoadAccountspage.AccountpageEarningOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageEarningOptionChangeSubscriptionTypeBoxClick.click();
	    List<WebElement> Ulist=	POM_BaeRoadAccountspage.AccountpageEarningOptionChangeSubscriptionTypeBoxUOlit;
	    int UlistSize=Ulist.size();	
	    System.out.println(UlistSize);
	
	for (WebElement webElement : Ulist) {
		if(webElement.getAttribute("data-value").equals("free"))
		{
			webElement.click();
		}
	}
	    Thread.sleep(3000);
	    WebElement FreeSubscriptionvalidtion=POM_BaeRoadAccountspage.AccountpageEarningOptionFreeSubscriptionValidation;
	    String FreeValidationStatus=FreeSubscriptionvalidtion.getText();
	    System.out.println(FreeValidationStatus);
	    Assert.assertEquals("Free", FreeValidationStatus);
	}
	
	@Test(priority =21)
	public void AccountsPageEarningPageChangeSubscriptionPaidOptionClick() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
		POM_BaeRoadAccountspage.AccountpageEarningOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageEarningOptionChangeSubscriptionTypeBoxClick.click();
	    List<WebElement> Ulist=	POM_BaeRoadAccountspage.AccountpageEarningOptionChangeSubscriptionTypeBoxUOlit;
	    int UlistSize=Ulist.size();	
	    System.out.println(UlistSize);
	
	for (WebElement webElement : Ulist) {
		if(webElement.getAttribute("data-value").equals("paid"))
		{
			webElement.click();
		}
	}
	    Thread.sleep(3000);
	    WebElement PaidSubscriptionvalidtion=POM_BaeRoadAccountspage.AccountpageEarningOptionPaidSubscriptionValidation;
	    String PaidValidationStatus=PaidSubscriptionvalidtion.getText();
	    System.out.println(PaidValidationStatus);
	    Assert.assertEquals("Paid", PaidValidationStatus);

	}
	
	@Test(priority =22,enabled = false)
	public void AccountsPageEarningPageChangeSubscriptionAddNewSubscription() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
		POM_BaeRoadAccountspage.AccountpageEarningOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageEarningOptionAddSubscriptionButton.click();
		POM_BaeRoadAccountspage.AccountpageEarningOptionAddSubscriptionSetFrequencyClick.click();
		List<WebElement> UOList=POM_BaeRoadAccountspage.AccountpageEarningOptionAddSubscriptionSetFreqencyUOList;
		int Listsize=UOList.size();
		System.out.println(Listsize);
		
     	for (WebElement webElement : UOList) {
			if(webElement.getAttribute("data-value").equals("1-year"))
			{
				webElement.click();
			}
			
		}
		
		POM_BaeRoadAccountspage.AccountpageEarningOptionAddSubscriptionSetDiscountClick.click();
		POM_BaeRoadAccountspage.AccountpageEarningOptionAddSubscriptionAddButton.click();
		Thread.sleep(3000);
	}
	
	@Test(priority =23)
	public void AccountsPageEarningPageSubscriptionPlanEditOptionTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
		POM_BaeRoadAccountspage.AccountpageEarningOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageEarningOptionAddSubscriptionPlanEditOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageEarningOptionAddSubscriptionUpdated50PercentageSetDisCountClick.click();
		Thread.sleep(1000);
	    POM_BaeRoadAccountspage.AccountpageEarningOptionAddSubscriptionPlanEditOptionUpdateButton.click();
	    Thread.sleep(3000);		
		WebElement EditValidation=POM_BaeRoadAccountspage.AccountpageEarningOptionAddSubscriptionPlanEditOpionValidation;
	    String EditStats=EditValidation.getText();
	    System.out.println(EditStats);
	    Assert.assertEquals("Subscription Added", EditStats);
	    
	    }
	@Test(priority =24)
	public void AccountsPageEarningPageSubscriptionPlanChangeDiscountTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
		POM_BaeRoadAccountspage.AccountpageEarningOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageEarningOptionAddSubscriptionPlanEditOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageEarningOptionAddSubscriptionUpdated60PercentageSetDisCountClick.click();
		Thread.sleep(1000);
	    POM_BaeRoadAccountspage.AccountpageEarningOptionAddSubscriptionPlanEditOptionUpdateButton.click();
	    Thread.sleep(3000);		
		WebElement EditValidation=POM_BaeRoadAccountspage.AccountpageEarningOptionAddSubscriptionPlanEditOpionValidation;
	    String EditStats=EditValidation.getText();
	    System.out.println(EditStats);
	    Assert.assertEquals("Subscription Added", EditStats);
	    
	    }
	    
	@Test(priority =25)
	public void AccountsPageEarningPageSubscriptionPlanMonthValidationTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
		POM_BaeRoadAccountspage.AccountpageEarningOptionClick.click();
        WebElement MonthValidation=POM_BaeRoadAccountspage.AccountpageEarningOptionAddSubscriptionPlanEditOpionMonthValidation;
	    String EditStatus=MonthValidation.getText();
	    System.out.println(EditStatus);
	    Assert.assertEquals("3 Month", EditStatus);
	    
	    }
	@Test(priority =26)
	public void AccountsPageEarningPageSubscriptionPlanAmountTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
		POM_BaeRoadAccountspage.AccountpageEarningOptionClick.click();
        WebElement AmountValidation=POM_BaeRoadAccountspage.AccountpageEarningOptionAddSubscriptionPlanEditOpionAmountValidation;
	    String AmountStatus=AmountValidation.getText();
	    System.out.println(AmountStatus);

	    
	    }
	@Test(priority =27)
	public void AccountsPageEarningPageSubscriptionPlanEditCancelTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
		POM_BaeRoadAccountspage.AccountpageEarningOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageEarningOptionAddSubscriptionPlanEditOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageEarningOptionAddSubscriptionPlanEditOpionCancelClick.click();
		
	    }
	
	@Test(priority =28)
	public void AccountsPageEarningPageSubscriptionPlanEditoptionUpdateButtonTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
		POM_BaeRoadAccountspage.AccountpageEarningOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageEarningOptionAddSubscriptionPlanEditOptionClick.click();
	    WebElement UpdateButtonEnabledStatus=POM_BaeRoadAccountspage.AccountpageEarningOptionAddSubscriptionPlanEditOptionUpdateButton;
	    Thread.sleep(2000);
		boolean Status=UpdateButtonEnabledStatus.isEnabled();
		System.out.println(Status);
		Assert.assertEquals(true, Status);
		
	    }

	@Test(priority =29,enabled = false)
	public void AccountsPageEarningPageAddSubscriptionButtonTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
		POM_BaeRoadAccountspage.AccountpageEarningOptionClick.click();
	    WebElement AddSubscriptionButtonEnabledStatus=POM_BaeRoadAccountspage.AccountpageEarningOptionAddSubscriptionButton;
		boolean Status=AddSubscriptionButtonEnabledStatus.isEnabled();
		System.out.println(Status);
		Assert.assertEquals(true, Status);
		
	    }
	@Test(priority =30,enabled = false)
	public void AccountsPageEarningPageAddSubscriptionAddButtonTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
		POM_BaeRoadAccountspage.AccountpageEarningOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageEarningOptionAddSubscriptionButton.click();
	    WebElement AddSubscriptionAddButtonEnabledStatus=POM_BaeRoadAccountspage.AccountpageEarningOptionAddSubscriptionAddButton;
		boolean Status=AddSubscriptionAddButtonEnabledStatus.isEnabled();
		System.out.println(Status);
//		Assert.assertEquals(true, Status);
		
	    }
	
	@Test(priority =31)
	public void AccountsPageEarningPageearnSummaryCommssionOptionTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
		POM_BaeRoadAccountspage.AccountpageEarningOptionClick.click();
	    WebElement EarningCommision=POM_BaeRoadAccountspage.AccountpageEarningOptionEarningSummaryCommissionsOptionText;
		String CommissionStatus=EarningCommision.getText();
		System.out.println(CommissionStatus);
		Assert.assertEquals("15 %", CommissionStatus);
		}
	
	@Test(priority =32)
	public void AccountsPageEarningPageearnSummaryWithdrawnOptionTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
		POM_BaeRoadAccountspage.AccountpageEarningOptionClick.click();
	    WebElement EarningCommision=POM_BaeRoadAccountspage.AccountpageEarningOptionEarningSummaryWithdrawnOptionText;
		String WithdrawnStatus=EarningCommision.getText();
		System.out.println(WithdrawnStatus);
		Assert.assertEquals("$", WithdrawnStatus);
		}
	
	
	@Test(priority =33)
	public void AccountsPageChangePasswordOptionValidTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionClick.click();
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionOldPassWordBoxClick.sendKeys("Smrs321#");
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionNewPassWordBoxClick.sendKeys("Smrs321#");
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionConfirmPassWordBoxClick.sendKeys("Smrs321#");
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionChangePasswordButton.click();
        Thread.sleep(3000);
        
        WebElement ValidValidation= POM_BaeRoadAccountspage.AccountpageChangePasswordOptionValidPssValidation;
        String Status=ValidValidation.getText();
        System.out.println(Status);
        Assert.assertEquals("Password changed",Status);
     
     
		}

	@Test(priority =34)
	public void AccountsPageChangePasswordOptionValidOldAndNewInvalidConfirmPssTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionClick.click();
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionOldPassWordBoxClick.sendKeys("Smrs321#");
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionNewPassWordBoxClick.sendKeys("Smrs321#");
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionConfirmPassWordBoxClick.sendKeys("Smr456");
        Thread.sleep(1000);
        
        WebElement InvalidValidation= POM_BaeRoadAccountspage.AccountpageChangePasswordOptionValidOldNewPssInvalidConfirmpssValidation;
        String Status=InvalidValidation.getText();
        System.out.println(Status);
        Assert.assertEquals("Passwords don't match",Status);
        
     
		}

	@Test(priority =35)
	public void AccountsPageChangePasswordOptionInvalidOldValidNewConfirmPssTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionClick.click();
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionOldPassWordBoxClick.sendKeys("Sm21#");
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionNewPassWordBoxClick.sendKeys("Smrs321#");
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionConfirmPassWordBoxClick.sendKeys("Smrs321#");
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionChangePasswordButton.click();
        Thread.sleep(3000);
     
        WebElement InvalidValidation=  POM_BaeRoadAccountspage.AccountpageChangePasswordOptionInvalidOldVlaidNewAndConfirmpssValidation;
        String Status=InvalidValidation.getText();
        System.out.println(Status);
        Assert.assertEquals("Incorrect Credentials", Status);
        
		}
	
	@Test(priority =36)
	public void AccountsPageChangePasswordOptionValidOldInvalidNewValidConfirmPssTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionClick.click();
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionOldPassWordBoxClick.sendKeys("Smrs321#");
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionNewPassWordBoxClick.sendKeys("Smr11564#");
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionConfirmPassWordBoxClick.sendKeys("Smrs321#");
        Thread.sleep(1000);
        
        WebElement InvalidValidation= POM_BaeRoadAccountspage.AccountpageChangePasswordOptionValidOldInvalidNewPssValidConfirmpssValidation;
        String Status=InvalidValidation.getText();
        System.out.println(Status);
        Assert.assertEquals("Passwords don't match",Status);
        
		}

	@Test(priority =37)
	public void AccountsPageChangePasswordOptionBlankOldValidNewValidConfirmPssTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionClick.click();
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionOldPassWordBoxClick.sendKeys("");
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionNewPassWordBoxClick.sendKeys("Smrs321#");
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionConfirmPassWordBoxClick.sendKeys("Smrs321#");
        }

	@Test(priority =38)
	public void AccountsPageChangePasswordOptionValidOldBlankNewValidConfirmPssTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionClick.click();
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionOldPassWordBoxClick.sendKeys("Smrs321#");
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionNewPassWordBoxClick.sendKeys("");
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionConfirmPassWordBoxClick.sendKeys("Smrs321#");
       
        WebElement InvalidValidation= POM_BaeRoadAccountspage.AccountpageChangePasswordOptionValidOldBlankNewPssValidConfirmpssValidation;
        String Status=InvalidValidation.getText();
        System.out.println(Status);
        Assert.assertEquals("Passwords don't match",Status);
     }

	@Test(priority =39)
	public void AccountsPageChangePasswordOptionValidOldValidNewBlankConfirmPssTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionClick.click();
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionOldPassWordBoxClick.sendKeys("Smrs321#");
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionNewPassWordBoxClick.sendKeys("Smrs321#");
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionConfirmPassWordBoxClick.sendKeys("");
        Thread.sleep(1000);
      }

	@Test(priority =40)
	public void AccountsPageChangePasswordOptionValidOldBlankNewBlankConfirmPssTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionClick.click();
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionOldPassWordBoxClick.sendKeys("Smrs321#");
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionNewPassWordBoxClick.sendKeys("");
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionConfirmPassWordBoxClick.sendKeys("");
        }

	@Test(priority =41)
	public void AccountsPageChangePasswordOptionInvalidOldBlankNewBlankConfirmPssTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionClick.click();
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionOldPassWordBoxClick.sendKeys("Sm21#");
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionNewPassWordBoxClick.sendKeys("");
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionConfirmPassWordBoxClick.sendKeys("");
        }

	@Test(priority =42)
	public void AccountsPageChangePasswordOptionInvalidChangepssTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionClick.click();
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionOldPassWordBoxClick.sendKeys("Smrs321#");
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionNewPassWordBoxClick.sendKeys("12345");
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionConfirmPassWordBoxClick.sendKeys("12345");
        
        WebElement InvalidLimitValidation= POM_BaeRoadAccountspage.AccountpageChangePasswordOptionValidOldBlankInvalidpssLimitNewAndConfirmpssValidation;
        String Status=InvalidLimitValidation.getText();
        System.out.println(Status);
        Assert.assertEquals("Minimum 8 characters",Status);
       }

	@Test(priority =43)
	public void AccountsPageChangePasswordOptionChangePasswordButtonTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
        POM_BaeRoadAccountspage.AccountpageChangePasswordOptionClick.click();
        WebElement ChangePasswordButton  = POM_BaeRoadAccountspage.AccountpageChangePasswordOptionChangePasswordButton;
       boolean status= ChangePasswordButton.isEnabled();
       System.out.println("WithOut Interacting with fields");
       System.out.println(status);
       Assert.assertEquals(false, status);
     
		}
	
	@Test(priority =44)
	public void AccountsPageProfileOptionTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
        POM_BaeRoadAccountspage.AccountpageProfileOption.click();
     
		}
	
	@Test(priority =45)
	public void AccountsPageProfileOptionPrivacyPublicOptionTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
        POM_BaeRoadAccountspage.AccountpageProfileOption.click();
        POM_BaeRoadAccountspage.AccountpageProfileOptionPrivacyClickTest.click();
        List<WebElement> UoList=  POM_BaeRoadAccountspage.AccountpageProfileOptionPrivacyUOListTest;
        int ListSize= UoList.size();
        System.out.println(ListSize);
        
        for (WebElement webElement : UoList) {
        	
        	if(webElement.getAttribute("data-value").equals("public"))
        	{
        		webElement.click();
        	}
			
		}
        Thread.sleep(2000);
        POM_BaeRoadAccountspage.AccountpageProfileOptionSaveButtonTest.click();
        Thread.sleep(3000);
        WebElement PublicOptionValidtion=POM_BaeRoadAccountspage.AccountpageProfileOptionPrivacyPublicOptionValidationTest;
        String Status= PublicOptionValidtion.getText();
        System.out.println(Status);
       Assert.assertEquals("Profile Settings Saved", Status);
        
		}
	
	@Test(priority =46)
	public void AccountsPageProfileOptionPrivacyPrivateOptionTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
        POM_BaeRoadAccountspage.AccountpageProfileOption.click();
        POM_BaeRoadAccountspage.AccountpageProfileOptionPrivacyClickTest.click();
        List<WebElement> UoList=  POM_BaeRoadAccountspage.AccountpageProfileOptionPrivacyUOListTest;
        int ListSize= UoList.size();
        System.out.println(ListSize);
        
        for (WebElement webElement : UoList) {
        	
        	if(webElement.getAttribute("data-value").equals("private"))
        	{
        		webElement.click();
        	}
        	 
		}
        Thread.sleep(2000);
        POM_BaeRoadAccountspage.AccountpageProfileOptionSaveButtonTest.click();
        Thread.sleep(3000);
        WebElement PrivateOptionValidtion=POM_BaeRoadAccountspage.AccountpageProfileOptionPrivacyPrivateOptionValidationTest;
        String Status= PrivateOptionValidtion.getText();
        System.out.println(Status);
        Assert.assertEquals("Profile Settings Saved", Status);
        
		}
	
	
	
	@Test(priority =47)
	public void AccountsPageProfileOptionBlankFieldsProfileTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		
        POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
        POM_BaeRoadAccountspage.AccountpageProfileOption.click();
        POM_BaeRoadAccountspage.AccountpageProfileOptionWebsiteTest.sendKeys("");
        POM_BaeRoadAccountspage.AccountpageProfileOptionAmazonWishListURLLinkTest.sendKeys("");
        POM_BaeRoadAccountspage.AccountpageProfileOptionLocationBoxTest.sendKeys("");
        POM_BaeRoadAccountspage.AccountpageProfileOptionAboutBoxTest.sendKeys("");
        POM_BaeRoadAccountspage.AccountpageProfileOptionSaveButtonTest.click();
        Thread.sleep(3000);
        
        WebElement PublicOptionValidtion=POM_BaeRoadAccountspage.AccountpageProfileOptionPrivacyPublicOptionValidationTest;
        String Status= PublicOptionValidtion.getText();
        System.out.println(Status);
        Assert.assertEquals("Profile Settings Saved", Status);
        
       
       }
	
	@Test(priority =48)
	public void AccountsPageProfileOptionValidProfileTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		
        POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
        POM_BaeRoadAccountspage.AccountpageProfileOption.click();
        POM_BaeRoadAccountspage.AccountpageProfileOptionPrivacyClickTest.click();
        List<WebElement> UoList=  POM_BaeRoadAccountspage.AccountpageProfileOptionPrivacyUOListTest;
        int ListSize= UoList.size();
        System.out.println(ListSize);
        
        for (WebElement webElement : UoList) {
        	
        	if(webElement.getAttribute("data-value").equals("public"))
        	{
        		webElement.click();
        	}
			
		}
        
        
        POM_BaeRoadAccountspage.AccountpageProfileOptionWebsiteTest.sendKeys("www.testing.com");
        POM_BaeRoadAccountspage.AccountpageProfileOptionAmazonWishListURLLinkTest.sendKeys("http://a.co/gEnTurR6");
        POM_BaeRoadAccountspage.AccountpageProfileOptionLocationBoxTest.sendKeys("Chennai");
        POM_BaeRoadAccountspage.AccountpageProfileOptionAboutBoxTest.sendKeys("Software test eng,Chennai");
        }
	
	@Test(priority =49)
	public void AccountsPageProfileOptionSaveButtonTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		
        POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
        POM_BaeRoadAccountspage.AccountpageProfileOption.click();
        WebElement SaveButton=  POM_BaeRoadAccountspage.AccountpageProfileOptionSaveButtonTest;
        boolean ButtonStatus=SaveButton.isEnabled();
        System.out.println(ButtonStatus);
	    Assert.assertEquals(true, ButtonStatus);
	
	}
	
	
	@Test(priority =50)
	public void AccountsPagepaymentOptionAddValidCardTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		
        POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
        POM_BaeRoadAccountspage.AccountpagePaymentOptionClick.click();
        
        List<WebElement> Fram= driver.findElements(By.tagName("iframe"));
        System.out.println(Fram.size());
        POM_BaeRoadAccountspage.AccountpagePaymentOptionAddNewCreditCardNumber.click();
//        Thread.sleep(4000);
        driver.switchTo().frame(4);
        Thread.sleep(6000);
        POM_BaeRoadAccountspage.AccountpagePaymentOptionEnterCardNumber.sendKeys("4242424242424242");
        Thread.sleep(2000);
        POM_BaeRoadAccountspage.AccountpagePaymentOptionEnterExpiryDate.sendKeys("1221");
        Thread.sleep(2000);
        POM_BaeRoadAccountspage.AccountpagePaymentOptionEnterCVV.sendKeys("123");
        Thread.sleep(2000);
        POM_BaeRoadAccountspage.AccountpagePaymentOptionEnterZipCode.sendKeys("12345");
        Thread.sleep(2000);
     
        driver.switchTo().defaultContent();
        POM_BaeRoadAccountspage.AccountpagePaymentOptionEnterPayButton.click();
        Thread.sleep(7000);
	
	}
	
	
	
	@Test(priority =51)
	public void AccountsPagepaymentOptionAddInvalidCardTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		
        POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
        POM_BaeRoadAccountspage.AccountpagePaymentOptionClick.click();
        
        
        POM_BaeRoadAccountspage.AccountpagePaymentOptionAddNewCreditCardNumber.click();
        List<WebElement> Fram= driver.findElements(By.tagName("iframe"));
        System.out.println(Fram.size());
        
        
//        Thread.sleep(4000);
        driver.switchTo().frame(4);
        Thread.sleep(6000);
        POM_BaeRoadAccountspage.AccountpagePaymentOptionEnterCardNumber.sendKeys("42424242424");
        Thread.sleep(2000);
        POM_BaeRoadAccountspage.AccountpagePaymentOptionEnterExpiryDate.sendKeys("1212");
        Thread.sleep(2000);
        POM_BaeRoadAccountspage.AccountpagePaymentOptionEnterCVV.sendKeys("13");
        Thread.sleep(2000);
        POM_BaeRoadAccountspage.AccountpagePaymentOptionEnterZipCode.sendKeys("145");
        Thread.sleep(2000);
     
        driver.switchTo().defaultContent();
        POM_BaeRoadAccountspage.AccountpagePaymentOptionEnterPayButton.click();
        Thread.sleep(8000);
	
	}
	
	@Test(priority =52)
	public void AccountsPagepaymentOptionAddInvalidCardValidCvvExpDateZipTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		
        POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
        POM_BaeRoadAccountspage.AccountpagePaymentOptionClick.click();
        POM_BaeRoadAccountspage.AccountpagePaymentOptionAddNewCreditCardNumber.click();
        
        List<WebElement> Fram= driver.findElements(By.tagName("iframe"));
        System.out.println(Fram.size());
//        Thread.sleep(4000);
        driver.switchTo().frame(4);
        Thread.sleep(6000);
        POM_BaeRoadAccountspage.AccountpagePaymentOptionEnterCardNumber.sendKeys("4242424424242");
        Thread.sleep(2000);
        POM_BaeRoadAccountspage.AccountpagePaymentOptionEnterExpiryDate.sendKeys("1221");
        Thread.sleep(2000);
        POM_BaeRoadAccountspage.AccountpagePaymentOptionEnterCVV.sendKeys("123");
        Thread.sleep(2000);
        POM_BaeRoadAccountspage.AccountpagePaymentOptionEnterZipCode.sendKeys("12345");
        Thread.sleep(2000);
     
        driver.switchTo().defaultContent();
        POM_BaeRoadAccountspage.AccountpagePaymentOptionEnterPayButton.click();
        Thread.sleep(8000);
	
	}
	
	@Test(priority =53)
	public void AccountsPagepaymentOptionAddValidCardinValidCvvValidExpDateTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		
        POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
        POM_BaeRoadAccountspage.AccountpagePaymentOptionClick.click();
        POM_BaeRoadAccountspage.AccountpagePaymentOptionAddNewCreditCardNumber.click();
        
        List<WebElement> Fram= driver.findElements(By.tagName("iframe"));
        System.out.println(Fram.size());
//        Thread.sleep(4000);
        driver.switchTo().frame(4);
        Thread.sleep(6000);
        POM_BaeRoadAccountspage.AccountpagePaymentOptionEnterCardNumber.sendKeys("4242424242424242");
        Thread.sleep(2000);
        POM_BaeRoadAccountspage.AccountpagePaymentOptionEnterExpiryDate.sendKeys("1221");
        Thread.sleep(2000);
        POM_BaeRoadAccountspage.AccountpagePaymentOptionEnterCVV.sendKeys("13");
        Thread.sleep(2000);
        POM_BaeRoadAccountspage.AccountpagePaymentOptionEnterZipCode.sendKeys("12345");
        Thread.sleep(2000);
     
        driver.switchTo().defaultContent();
        POM_BaeRoadAccountspage.AccountpagePaymentOptionEnterPayButton.click();
        Thread.sleep(8000);
	
	}
	
	
	@Test(priority =54)
	public void AccountsPagepaymentOptionAddValidCardInvaliExpValidCvvZipTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		
        POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
        POM_BaeRoadAccountspage.AccountpagePaymentOptionClick.click();
        POM_BaeRoadAccountspage.AccountpagePaymentOptionAddNewCreditCardNumber.click();
        
        List<WebElement> Fram= driver.findElements(By.tagName("iframe"));
        System.out.println(Fram.size());
//        Thread.sleep(4000);
        driver.switchTo().frame(4);
        Thread.sleep(6000);
        POM_BaeRoadAccountspage.AccountpagePaymentOptionEnterCardNumber.sendKeys("4242424242424242");
        Thread.sleep(2000);
        POM_BaeRoadAccountspage.AccountpagePaymentOptionEnterExpiryDate.sendKeys("1212");
        Thread.sleep(2000);
        POM_BaeRoadAccountspage.AccountpagePaymentOptionEnterCVV.sendKeys("123");
        Thread.sleep(2000);
        POM_BaeRoadAccountspage.AccountpagePaymentOptionEnterZipCode.sendKeys("12345");
        Thread.sleep(2000);
     
        driver.switchTo().defaultContent();
        POM_BaeRoadAccountspage.AccountpagePaymentOptionEnterPayButton.click();
        Thread.sleep(8000);
	
	}
	
	@Test(priority =55)
	public void AccountsPagepaymentOptionAddedCardDeletionTest() throws InterruptedException
	{
		SuccefulLogin();	
		PageFactory.initElements(driver,POM_BaeRoadAccountspage.class);
		
        POM_BaeRoadAccountspage.HomepageAccountOptionClick.click();
		POM_BaeRoadAccountspage.AccountpageSettingsOption.click();
        POM_BaeRoadAccountspage.AccountpagePaymentOptionClick.click();
        Thread.sleep(1000);
        POM_BaeRoadAccountspage.AccountpagePaymentOptionAddCardDeleteButton.click();   
        Thread.sleep(3000);
       
        
        
	}
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

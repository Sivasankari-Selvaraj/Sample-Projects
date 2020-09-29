package BAE_ROAD_TESTCASES;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import BAE_RORD_COMMON_FUNCTIONS.CommonFunctions_BaeRoad;
import PAGE_OBJECT_MODEL.POM_BaeRoad;
import PAGE_OBJECT_MODEL.POM_BaeRoadMessagePage;
import PAGE_OBJECT_MODEL.POM_BaeRoadProfilePage;

public class MessagePage_BaeRoad extends CommonFunctions_BaeRoad{
	
	@Test(priority =1)
	public void SuccefulLogin() throws InterruptedException
	{
		
		PageFactory.initElements(driver,POM_BaeRoad.class);
		
		POM_BaeRoad.UserName.sendKeys("shobanvikki");
		POM_BaeRoad.Password.sendKeys("Smrs321#");
		POM_BaeRoad.LoginButton.click();
		
		
		}
	
	@Test(priority =2)
	public void MessageOptionSearchBoxFunctionalityTest() throws InterruptedException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoadMessagePage.class);
		
		POM_BaeRoadMessagePage.HomepageMessgeOptionClick.click();
		Thread.sleep(1000);
		POM_BaeRoadMessagePage.MessagepageSearchBoxTest.sendKeys("buvi");
		Thread.sleep(2000);
		WebElement SearchName=POM_BaeRoadMessagePage.MessagepageSearchBoxSeachNameList;
		String NameList=SearchName.getText();
		System.out.println(NameList);
		Assert.assertEquals("buvi", NameList);
		
		
	}
	
	@Test(priority =3)
	public void MessageOptionInvalidSearchBoxFunctionalityTest() throws InterruptedException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoadMessagePage.class);
		
		POM_BaeRoadMessagePage.HomepageMessgeOptionClick.click();
		Thread.sleep(1000);
		POM_BaeRoadMessagePage.MessagepageSearchBoxTest.sendKeys("kahfiuhuih");
		Thread.sleep(2000);
	}	
		
	@Test(priority =4)
	public void MessageOptionMessageSendingFunctionalityTest() throws InterruptedException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoadMessagePage.class);
		
		POM_BaeRoadMessagePage.HomepageMessgeOptionClick.click();
		Thread.sleep(1000);
		POM_BaeRoadMessagePage.MessagepageSearchBoxTest.sendKeys("vikkii");
		Thread.sleep(2000);
		POM_BaeRoadMessagePage.MessagepageSearchNameList.click();
		POM_BaeRoadMessagePage.MessagepageMeassageCommentBody.sendKeys("hiii");
		Thread.sleep(1000);
		POM_BaeRoadMessagePage.MessagepageMeassageSendButtonClick.click();
		Thread.sleep(2000);
        WebElement TextMessage=	POM_BaeRoadMessagePage.MessagepageMeassageTextValidation;
	    String Text=TextMessage.getText();
		System.out.println(Text);
		Assert.assertEquals(Text, "hiii");
	}
		
	@Test(priority =5)
	public void MessageOptionMessageFreeWritePostFunctionalityTest() throws InterruptedException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoadMessagePage.class);
		
		POM_BaeRoadMessagePage.HomepageMessgeOptionClick.click();
		Thread.sleep(1000);
		POM_BaeRoadMessagePage.MessagepageSearchBoxTest.sendKeys("vikkii");
		Thread.sleep(2000);
		POM_BaeRoadMessagePage.MessagepageSearchNameList.click();
		POM_BaeRoadMessagePage.MessagepageMeassageAttachmentbuttonClick.click();
		POM_BaeRoadMessagePage.MessagepageMeassageWritePostCommentBody.sendKeys("hi all");
		POM_BaeRoadMessagePage.MessagepageMeassagePostSendButton.click();
		Thread.sleep(3000);
        WebElement FreePostValidation=	POM_BaeRoadMessagePage.MessagepageMeassagePostFreeWritePostValidation;
		String PostStatus=FreePostValidation.getText();
		System.out.println(PostStatus);
	    Assert.assertEquals("Post Created", PostStatus);
	
	}
	
	@Test(priority =6)
	public void MessageOptionMessagePaidWritePostFunctionalityTest() throws InterruptedException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoadMessagePage.class);
		
		POM_BaeRoadMessagePage.HomepageMessgeOptionClick.click();
		Thread.sleep(1000);
		POM_BaeRoadMessagePage.MessagepageSearchBoxTest.sendKeys("vikkii");
		Thread.sleep(2000);
		POM_BaeRoadMessagePage.MessagepageSearchNameList.click();
		POM_BaeRoadMessagePage.MessagepageMeassageAttachmentbuttonClick.click();
		POM_BaeRoadMessagePage.MessagepageMeassageWritePostCommentBody.sendKeys("Hi Vikki Welcome");
		POM_BaeRoadMessagePage.MessagepageMeassageWritePostOptionClick.click();
		POM_BaeRoadMessagePage.MessagepageMeassageWritePostPaidOptionClick.click();
		POM_BaeRoadMessagePage.MessagepageMeassageWritePostPayMoneyOptionClick.sendKeys(".5");
		POM_BaeRoadMessagePage.MessagepageMeassagePostSendButton.click();
		Thread.sleep(3000);
		WebElement PaidPostValidation=	POM_BaeRoadMessagePage.MessagepageMeassagePostPaidWritePostValidation;
		String PostStatus=PaidPostValidation.getText();
		System.out.println(PostStatus);
	    Assert.assertEquals("Post Created", PostStatus);
		
	}
		
	@Test(priority =7)
	public void MessageOptionMessageFreePhotoOrVideoUploadPostFunctionalityTest() throws InterruptedException, AWTException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoadMessagePage.class);
		
		POM_BaeRoadMessagePage.HomepageMessgeOptionClick.click();
		Thread.sleep(1000);
		POM_BaeRoadMessagePage.MessagepageSearchBoxTest.sendKeys("vikki");
		Thread.sleep(2000);
		POM_BaeRoadMessagePage.MessagepageSearchNameList.click();
		POM_BaeRoadMessagePage.MessagepageMeassageAttachmentbuttonClick.click();
		POM_BaeRoadMessagePage.MessagepageMeassagePhotoOrVideoPostOptionClick.click();
		Thread.sleep(2000);
		POM_BaeRoadMessagePage.MessagepageMeassagePhotoOrVideoPostUpload.click();
		
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
		 Thread.sleep(12000);
		 POM_BaeRoadMessagePage.DokaImageEdit.click();
		 Thread.sleep(12000);
		 POM_BaeRoadMessagePage.MessagepageMeassagePhotoOrVideoPostSubmitButton.click();
		 Thread.sleep(3000);
		 WebElement FreePostValidation=	POM_BaeRoadMessagePage.MessagepageMeassagePostFreeWritePostValidation;
		 String PostStatus=FreePostValidation.getText();
		 System.out.println(PostStatus);
	     Assert.assertEquals("Post Created", PostStatus);
		
	}
		
	@Test(priority =8)
	public void MessageOptionMessagePaidPhotoOrVideoUploadPostFunctionalityTest() throws InterruptedException, AWTException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoadMessagePage.class);
		
		POM_BaeRoadMessagePage.HomepageMessgeOptionClick.click();
		Thread.sleep(1000);
		POM_BaeRoadMessagePage.MessagepageSearchBoxTest.sendKeys("vikkii");
		Thread.sleep(2000);
		POM_BaeRoadMessagePage.MessagepageSearchNameList.click();
		POM_BaeRoadMessagePage.MessagepageMeassageAttachmentbuttonClick.click();
		POM_BaeRoadMessagePage.MessagepageMeassagePhotoOrVideoPostOptionClick.click();
		Thread.sleep(2000);
		POM_BaeRoadMessagePage.MessagepageMeassagePhotoOrVideoPostUpload.click();
		
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
		 Thread.sleep(12000);
		 POM_BaeRoadMessagePage.DokaImageEdit.click();
		 Thread.sleep(12000);
		 POM_BaeRoadMessagePage.MessagepageMeassagePhotoVideoPostOptionClick.click();
		 POM_BaeRoadMessagePage.MessagepageMeassagePhotoVideoPaidOptionClick.click();
		 POM_BaeRoadMessagePage.MessagepageMeassagePhotoVideoPayMoneyOptionClick.sendKeys(".5"); 
		 POM_BaeRoadMessagePage.MessagepageMeassagePhotoOrVideoPostSubmitButton.click();
		 Thread.sleep(4000);
		 WebElement PaidPostValidation=	POM_BaeRoadMessagePage.MessagepageMeassagePostPaidWritePostValidation;
		 String PostStatus=PaidPostValidation.getText();
		 System.out.println(PostStatus);
		 Assert.assertEquals("Post Created", PostStatus);
		
	}
	
	@Test(priority =9)
	public void MessageOptionMessageEmptyWritePostFunctionalityTest() throws InterruptedException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoadMessagePage.class);
		
		POM_BaeRoadMessagePage.HomepageMessgeOptionClick.click();
		Thread.sleep(1000);
		POM_BaeRoadMessagePage.MessagepageSearchBoxTest.sendKeys("vikki");
		Thread.sleep(2000);
		POM_BaeRoadMessagePage.MessagepageSearchNameList.click();
		Thread.sleep(2000);
		POM_BaeRoadMessagePage.MessagepageMeassageAttachmentbuttonClick.click();
		POM_BaeRoadMessagePage.MessagepageMeassageWritePostCommentBody.sendKeys("");
		POM_BaeRoadMessagePage.MessagepageMeassagePostSendButton.click();
		Thread.sleep(3000);
		WebElement EmptyPost=POM_BaeRoadMessagePage.MessagepageMeassagePostEmptyPostValidation;
		String EmptyPostValidation=EmptyPost.getText();
		System.out.println(EmptyPostValidation);
		Assert.assertEquals("Post Cannot be Empty", EmptyPostValidation);
		
		
	}
	@Test(priority =10)
	public void MessageOptionMessageEmptyPhotoOrVideoUploadPostFunctionalityTest() throws InterruptedException, AWTException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoadMessagePage.class);
		
		POM_BaeRoadMessagePage.HomepageMessgeOptionClick.click();
		Thread.sleep(1000);
		POM_BaeRoadMessagePage.MessagepageSearchBoxTest.sendKeys("vikkii");
		Thread.sleep(2000);
		POM_BaeRoadMessagePage.MessagepageSearchNameList.click();
		POM_BaeRoadMessagePage.MessagepageMeassageAttachmentbuttonClick.click();
		POM_BaeRoadMessagePage.MessagepageMeassagePhotoOrVideoPostOptionClick.click();
		POM_BaeRoadMessagePage.MessagepageMeassagePhotoOrVideoPostSubmitButton.click();
		Thread.sleep(3000);
		WebElement EmptyPost=POM_BaeRoadMessagePage.MessagepageMeassagePostEmptyPostValidation;
		String EmptyPostValidation=EmptyPost.getText();
		System.out.println(EmptyPostValidation);
		Assert.assertEquals("Post Cannot be Empty", EmptyPostValidation);
	}
		
	@Test(priority =11)
	public void MessageOptionInfluencerFollowerTipOptionFunctionalityTest() throws InterruptedException, AWTException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoadMessagePage.class);
		
		POM_BaeRoadMessagePage.HomepageMessgeOptionClick.click();
		POM_BaeRoadMessagePage.MessagepageSearchBoxTest.sendKeys("ravimr");
		Thread.sleep(2000);
		POM_BaeRoadMessagePage.MessagepageSearchNameList.click();
		Thread.sleep(2000);
		POM_BaeRoadMessagePage.MessagepageMeassageInfFolowerTipOption.click();
		POM_BaeRoadMessagePage.MessagepageMeassageInfFolowerTipMessageBox.sendKeys("hi");
	    POM_BaeRoadMessagePage.MessagepageMeassageInfFolowerTipSendButton.click();
		Thread.sleep(3000);
		WebElement TipAmount=POM_BaeRoadMessagePage.MessagepageMeassageInfFolowerTipValidation;
		String Tip=TipAmount.getText();
		System.out.println(Tip);
		Assert.assertEquals("$5", Tip);
		WebElement TipPaymentValidation=POM_BaeRoadMessagePage.MessagepageMeassageInfluencerTipPaymentValidation;
		String TipPayment=TipPaymentValidation.getText();
		System.out.println(TipPayment);
		Assert.assertEquals("Payment received!", TipPayment);
		
	}	
	
	
	@Test(priority =12)
	public void MessageOptionBroadcastsFunctionalityTest() throws InterruptedException, AWTException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoadMessagePage.class);
		
		POM_BaeRoadMessagePage.HomepageMessgeOptionClick.click();
		POM_BaeRoadMessagePage.MessagepageBroadCastOption.click();
		POM_BaeRoadMessagePage.MessagepageBroadCastCoversationClick.click();
		Thread.sleep(3000);
		POM_BaeRoadMessagePage.MessagepageBroadCastTextMessage.sendKeys("hii");
		Thread.sleep(3000);
		POM_BaeRoadMessagePage.MessagepageBroadCastTextMessageButtonClick.click();
		Thread.sleep(4000);
        WebElement BroadCasteText=	POM_BaeRoadMessagePage.MessagepageBroadCastTextMessageValidation;
		String Textvalidation=BroadCasteText.getText();
		System.out.println(Textvalidation);
		Assert.assertEquals("hii", Textvalidation);
	
	}
	
	@Test(priority =13)
	public void MessageOptionMessageDeleteCancelPostFunctionalityTest() throws InterruptedException, AWTException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoadMessagePage.class);
		
		POM_BaeRoadMessagePage.HomepageMessgeOptionClick.click();
		POM_BaeRoadMessagePage.MessagepageSearchBoxTest.sendKeys("vikkii");
		Thread.sleep(2000);
		POM_BaeRoadMessagePage.MessagepageSearchNameList.click();
		Thread.sleep(2000);
		POM_BaeRoadMessagePage.MessagepageMessagePostDeletion.click();
		Thread.sleep(1000);
		POM_BaeRoadMessagePage.MessagepageMessagePostDeletionCancelClick.click();
		
		}
	
	@Test(priority =14)
	public void MessageOptionMessageDeleteForMePostFunctionalityTest() throws InterruptedException, AWTException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoadMessagePage.class);
		
        POM_BaeRoadMessagePage.HomepageMessgeOptionClick.click();
		POM_BaeRoadMessagePage.MessagepageSearchBoxTest.sendKeys("vikkii");
		Thread.sleep(2000);
		POM_BaeRoadMessagePage.MessagepageSearchNameList.click();
		Thread.sleep(2000);
		POM_BaeRoadMessagePage.MessagepageMessagePostDeletion.click();
		Thread.sleep(1000);
		POM_BaeRoadMessagePage.MessagepageMessagePostDeletionForMeClick.click();
		driver.navigate().refresh();
		System.out.println("Refreshed1");
		}
	
	@Test(priority =15)
	public void MessageOptionMessageDeleteForEveryOnePostFunctionalityTest() throws InterruptedException, AWTException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoadMessagePage.class);
		
		POM_BaeRoadMessagePage.HomepageMessgeOptionClick.click();
		POM_BaeRoadMessagePage.MessagepageSearchBoxTest.sendKeys("vikkii");
		Thread.sleep(2000);
		POM_BaeRoadMessagePage.MessagepageSearchNameList.click();
		Thread.sleep(2000);
		POM_BaeRoadMessagePage.MessagepageMessagePostDeletion.click();
		Thread.sleep(1000);
		POM_BaeRoadMessagePage.MessagepageMessagePostDeletionForEveryOneClick.click();
		driver.navigate().refresh();
		System.out.println("Refreshed2");
		}
	
	
	@Test(priority =16)
	public void MessageOptionMessageConversationCancelFunctionalityTest() throws InterruptedException, AWTException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoadMessagePage.class);
		
		POM_BaeRoadMessagePage.HomepageMessgeOptionClick.click();
		POM_BaeRoadMessagePage.MessagepageSearchBoxTest.sendKeys("ravimr");
		Thread.sleep(2000);
		POM_BaeRoadMessagePage.MessagepageSearchNameList.click();
		Thread.sleep(2000);
		POM_BaeRoadMessagePage.MessagepageMeassagePostDeleteionOption.click();
		POM_BaeRoadMessagePage.MessagepageAllMessagecancelClick.click();
		
		
	}	
		
	@Test(priority =17)
	public void MessageOptionMessageConversationDeleteFunctionalityTest() throws InterruptedException, AWTException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoadMessagePage.class);
		
		POM_BaeRoadMessagePage.HomepageMessgeOptionClick.click();
		POM_BaeRoadMessagePage.MessagepageSearchBoxTest.sendKeys("ravimr");
		Thread.sleep(2000);
		POM_BaeRoadMessagePage.MessagepageSearchNameList.click();
		Thread.sleep(2000);
		POM_BaeRoadMessagePage.MessagepageMeassagePostDeleteionOption.click();
		POM_BaeRoadMessagePage.MessagepageAllMessageDeleteClick.click();
		Thread.sleep(3000);
		}	
		
		

	

}

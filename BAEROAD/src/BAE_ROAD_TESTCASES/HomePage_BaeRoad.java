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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import BAE_RORD_COMMON_FUNCTIONS.CommonFunctions_BaeRoad;
import PAGE_OBJECT_MODEL.POM_BaeRoad;

public class HomePage_BaeRoad extends CommonFunctions_BaeRoad{
	
	@Test(priority =1)
	public void SuccefulLogin() throws InterruptedException
	{
		
		PageFactory.initElements(driver,POM_BaeRoad.class);
		
		POM_BaeRoad.UserName.sendKeys("shobanvikki");
		POM_BaeRoad.Password.sendKeys("Smrs321#");
		POM_BaeRoad.LoginButton.click();
		
		
		}
	@Test(priority = 2)
	public void CreateNewPostWrite() throws InterruptedException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoad.class);
		
		POM_BaeRoad.CreateButton.click();
		POM_BaeRoad.CommentBody.sendKeys("Welcome to BaeRoad");
		POM_BaeRoad.PostSendButton.click();
		Thread.sleep(2000);
		WebElement Postvalidation=POM_BaeRoad.CreatePostValidation;
		String PostStatus=Postvalidation.getText();
		System.out.println(PostStatus);
		Assert.assertEquals("Post Created", PostStatus);
		
		
		}
	
	
	@Test(priority = 3)
	public void CreateNewPostWriteTextValidation() throws InterruptedException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoad.class);
		
		POM_BaeRoad.CreateButton.click();
		POM_BaeRoad.CommentBody.sendKeys("Welcome All");
		POM_BaeRoad.PostSendButton.click();
		Thread.sleep(3000);
	    WebElement TextValidation=POM_BaeRoad.CreatePostTextValidtion;
	    String Text=	TextValidation.getText();
	    System.out.println(Text);
		Assert.assertEquals("Welcome All", Text);
		
		
		
		
	}
	
	@Test(priority =4)
	public void EmptyCreateNewPostWrite() throws InterruptedException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoad.class);
		
		POM_BaeRoad.CreateButton.click();
		POM_BaeRoad.CommentBody.sendKeys("");
		POM_BaeRoad.PostSendButton.click();
		WebElement EmptyPostvalidation=POM_BaeRoad.CreatePostEmptyValidation;
		String PostStatus=EmptyPostvalidation.getText();
		System.out.println(PostStatus);
		Thread.sleep(2000);
		Assert.assertEquals("Post Cannot be Empty", PostStatus);
		
	}
	
	@Test(priority = 5)
	public void CreateNewPostImages() throws InterruptedException, AWTException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoad.class);
		
		POM_BaeRoad.CreateButton.click();
		POM_BaeRoad.PhotoVideoheadLine.click();
		POM_BaeRoad.UploadImageVideo.click();
		
		 Thread.sleep(5000);
		   String file="C:\\Users\\MEN IN BLUE\\img2.jpg";
		   
		   StringSelection selection=new StringSelection(file);
		   
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		   
		   Robot rebot=new Robot();
		   rebot.keyPress(KeyEvent.VK_CONTROL);
		   
		   rebot.keyPress(KeyEvent.VK_V);
		   
		   rebot.keyRelease(KeyEvent.VK_V);
		   rebot.keyRelease(KeyEvent.VK_CONTROL);
		   Thread.sleep(6000);
		   rebot.keyPress(KeyEvent.VK_ENTER);
		
		   rebot.keyRelease(KeyEvent.VK_ENTER);
		   Thread.sleep(12000);
		   
		   POM_BaeRoad.DokaImageEdit.click();
		   Thread.sleep(15000);
		   System.out.println("Test end");
		   POM_BaeRoad.PostSendButton.click();
		   Thread.sleep(3000);
		   
		   WebElement ImagePostvalidation=POM_BaeRoad.CreatePostImageValidation;
		   String PostStatus=ImagePostvalidation.getText();
		   System.out.println(PostStatus);
		   Thread.sleep(2000);
		   Assert.assertEquals("Post Created", PostStatus);
		   
		 }
	
	@Test(priority = 6)
	public void CreatePaidpostWrite() throws InterruptedException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoad.class);
		
		POM_BaeRoad.CreateButton.click();
		POM_BaeRoad.CommentBody.sendKeys("hi everyone");
		POM_BaeRoad.FreepaidOption.click();
		List<WebElement> list=POM_BaeRoad.UnOrderedList;
		int size=list.size();
		System.out.println(size);
		
	for (WebElement webElement : list) {
		
		if(webElement.getAttribute("data-value").equals("paid"))
		{
			webElement.click();
		}
		
	}
	
	Thread.sleep(2000);
	WebElement payMoney=POM_BaeRoad.PaidClick;
	payMoney.clear();
	Thread.sleep(2000);
	payMoney.sendKeys(".5");
	Thread.sleep(3000);
	POM_BaeRoad.PostSendButton.click();
	Thread.sleep(3000);
	WebElement ImagePostvalidation=POM_BaeRoad.CreatePostPaidValidation;
	String PostStatus=ImagePostvalidation.getText();
	System.out.println(PostStatus);
	Assert.assertEquals("Post Created", PostStatus);
	
	}	
	
	
	@Test(priority = 7)
	public void HomePageNewPostLikeTest() throws InterruptedException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoad.class);
		
		POM_BaeRoad.CreateButton.click();
		POM_BaeRoad.CommentBody.sendKeys("hi");
		POM_BaeRoad.PostSendButton.click();
		Thread.sleep(3000);
		POM_BaeRoad.NewPostLike.click();
		Thread.sleep(2000);
		}
	
	
	@Test(priority =8)
	public void HomePageNewPostMessageTest() throws InterruptedException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoad.class);
		
		POM_BaeRoad.CreateButton.click();
		POM_BaeRoad.CommentBody.sendKeys("hellooo");
		POM_BaeRoad.PostSendButton.click();
		Thread.sleep(3000);
		POM_BaeRoad.NewPostMessage.click();
		POM_BaeRoad.NewPostMessageCommentBody.sendKeys("Hellooooo");
		POM_BaeRoad.NewPostMessageCommentSubmit.click();
		Thread.sleep(2000);
		
		WebElement TextValidation=POM_BaeRoad.NewPostMessageCommentTextValidation;
		String Text=TextValidation.getText();
		System.out.println(Text);
	    Assert.assertEquals("Hellooooo", Text);
	}
	
	
	@Test(priority = 9)
	public void ValidHomePageFollowersUI() throws InterruptedException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoad.class);
	
		POM_BaeRoad.HomePageFollowers.click();
	    POM_BaeRoad.HomePageFollowersSearchBox.sendKeys("ravimr");
	    Thread.sleep(2000);
		POM_BaeRoad.HomePageFollowerProfile.click();
	    driver.navigate().back();
	    Thread.sleep(1000); 
	    WebElement FollowersCount= POM_BaeRoad.HomePageFollowersCountValidation;
	    String Count= FollowersCount.getText();
	    System.out.println(Count);
//	    Assert.assertEquals("3", Count);
	}
	
	@Test(priority = 10)
	public void InvalidHomePageFollowersUI() throws InterruptedException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoad.class);
	
		POM_BaeRoad.HomePageFollowers.click();
	    POM_BaeRoad.HomePageFollowersSearchBox.sendKeys("DJJKNCN");
		Thread.sleep(3000);
	    WebElement Validation= POM_BaeRoad.HomePageFollowersValidation;
	    String text= Validation.getText();
	    System.out.println(text);
	    Assert.assertEquals(text, "No followers");
	    
	}
	
	@Test(priority = 11)
	public void ValidHomePageFollowingUI() throws InterruptedException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoad.class);
	
		POM_BaeRoad.HomePageFollowing.click();
	    POM_BaeRoad.HomePageFollowersSearchBox.sendKeys("vikki");
	    Thread.sleep(3000);
		POM_BaeRoad.HomePageFollowingProfile.click();
	    driver.navigate().back();
		Thread.sleep(1000); 
		WebElement FollowersCount= POM_BaeRoad.HomePageFollowingCountValidation;
        String Count= FollowersCount.getText();
        System.out.println(Count);
//		Assert.assertEquals("20", Count);
	}
	
	@Test(priority = 12)
	public void InvalidHomePageFollowingUI() throws InterruptedException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoad.class);
	
		POM_BaeRoad.HomePageFollowing.click();
	    POM_BaeRoad.HomePageFollowersSearchBox.sendKeys("dgyujd");
	    Thread.sleep(5000);
	    WebElement Validation= POM_BaeRoad.HomePageFollowersValidation;
	    String text= Validation.getText();
		System.out.println(text);
		Assert.assertEquals(text, "No following");
	    
		
	}
	
	@Test(priority = 13)
	public void HomePageFollowingOrFollowerNavigateBarCancelTest() throws InterruptedException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoad.class);
	
		POM_BaeRoad.HomePageFollowing.click();
	    POM_BaeRoad.HomePageFollowersSearchBox.sendKeys("vikki");
	    POM_BaeRoad.HomePageFollowingFollowerBarCancelButtonTest.click();
	    Thread.sleep(1000);
	}
	    
	@Test(priority = 14)
	public void ValidHomePageSearchBoxFunctionalityTesting() throws InterruptedException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoad.class);
	
		POM_BaeRoad.HomePageSearchBoxFunctionality.sendKeys("sho");
		Thread.sleep(1000);
		System.out.println("Name List Appearing");
		
	}   
	
	@Test(priority = 15)
	public void InvalidHomePageSearchBoxFunctionalityTesting() throws InterruptedException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoad.class);
	
		POM_BaeRoad.HomePageSearchBoxFunctionality.sendKeys("kuhacuiu");
		Thread.sleep(1000);
		POM_BaeRoad.HomePageSearchBoxFunctionality.sendKeys("");
		Thread.sleep(1000);
	}   
	
	@Test(priority = 16)
	public void HomePageProfileOptionClickTesting() throws InterruptedException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoad.class);
	    POM_BaeRoad.HomepageProfileOptionClick.click();
		Thread.sleep(1000);
		
	}   
	
	@Test(priority = 17)
	public void HomePageMessageOptionClickTesting() throws InterruptedException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoad.class);
	    POM_BaeRoad.HomepageMessgeOptionClick.click();
		Thread.sleep(1000);
		
	} 
	@Test(priority = 18)
	public void HomePagePurchaseOptionClickTesting() throws InterruptedException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoad.class);
	    POM_BaeRoad.HomepagePurchaseOptionClick.click();
		Thread.sleep(1000);
		
	} 
	
	@Test(priority = 19)
	public void HomePageNotifictionsOptionClickTesting() throws InterruptedException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoad.class);
	    POM_BaeRoad.HomepagePurchaseOptionClick.click();
		Thread.sleep(1000);
		
	} 
	
	@Test(priority = 20)
	public void HomePageSettingsOptionOptionClickTesting() throws InterruptedException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoad.class);
	
		POM_BaeRoad.HomepageAccountOptionClick.click();
		POM_BaeRoad.AccountpageSettingsOption.click();
		Thread.sleep(1000);
	}
	
	@Test(priority = 21)
	public void HomePageCreatedPostDeletion() throws InterruptedException
	{
		
		SuccefulLogin();
		
		PageFactory.initElements(driver,POM_BaeRoad.class);
		
		POM_BaeRoad.CreateButton.click();
		POM_BaeRoad.CommentBody.sendKeys("Testing Sample");
		POM_BaeRoad.PostSendButton.click();
		Thread.sleep(2000);
		POM_BaeRoad.HomePageCreatePostOption.click();
		Thread.sleep(2000);
		POM_BaeRoad.CreatedPostDeleteOption.click();
		Thread.sleep(2000);
		POM_BaeRoad.CreatedPostDeletedConfirmButton.click();
		Thread.sleep(2000);
		WebElement DeletePostValidation=POM_BaeRoad.CreatedPostDeleteValidation;
		String PostDelete=DeletePostValidation.getText();
		System.out.println(PostDelete);
		Assert.assertEquals("Post Deleted Successfully", PostDelete);
		}
	
	
	@Test(priority = 22)
	public void HomePageCreatedPostEditTest() throws InterruptedException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoad.class);

		POM_BaeRoad.CreateButton.click();
		POM_BaeRoad.CommentBody.sendKeys("Sample Test");
		POM_BaeRoad.PostSendButton.click();
	    Thread.sleep(1000);
		POM_BaeRoad.HomePageCreatePostOption.click();
		Thread.sleep(1000);
		POM_BaeRoad.CreatedPostEditOption.click();
		Thread.sleep(2000);
		POM_BaeRoad.CreatedPostEditCommentBody.sendKeys("Hello ");
		Thread.sleep(2000);
		POM_BaeRoad.EditPostSendButton.click();
		Thread.sleep(3000);
		
		WebElement EditValidation=POM_BaeRoad.EditPostValidation;
		String EditPost=EditValidation.getText();
		System.out.println(EditPost);
		Assert.assertEquals("Post Modified", EditPost);
	
	}
	
	
	@Test(priority = 23)
	public void CreateNewPostmultiuploadsTest() throws InterruptedException, AWTException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoad.class);
	
		POM_BaeRoad.CreateButton.click();
		POM_BaeRoad.PhotoVideoheadLine.click();
		POM_BaeRoad.UploadImageVideo.click();
	    Thread.sleep(5000);
		String file="C:\\Users\\MEN IN BLUE\\img2.jpg";
		StringSelection selection=new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot rebot=new Robot();
		rebot.keyPress(KeyEvent.VK_CONTROL);
	    rebot.keyPress(KeyEvent.VK_V);
		rebot.keyRelease(KeyEvent.VK_V);
		rebot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(4000);
		rebot.keyPress(KeyEvent.VK_ENTER);
		rebot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(12000);
		POM_BaeRoad.DokaImageEdit.click();
		Thread.sleep(15000);
		   
		   for(int i=1;i<4;i++)
		   {
			   POM_BaeRoad.HomePageMultiPostUploads.click();
			   Thread.sleep(5000);
			  
			   
			   if(i==1 || i==3)
			   {
				   String file1="C:\\Users\\MEN IN BLUE\\img2.jpg";
				   StringSelection selection1=new StringSelection(file1);
			       Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection1, null);
			       Robot rebot1=new Robot();
			       rebot.keyPress(KeyEvent.VK_CONTROL);
			       rebot.keyPress(KeyEvent.VK_V);
			       rebot.keyRelease(KeyEvent.VK_V);
			       rebot.keyRelease(KeyEvent.VK_CONTROL);
			       Thread.sleep(4000);
			       rebot.keyPress(KeyEvent.VK_ENTER);
			       rebot.keyRelease(KeyEvent.VK_ENTER);
			       Thread.sleep(12000);
			       POM_BaeRoad.DokaImageEdit.click();
				   Thread.sleep(12000);
			   }
			   else
			   {
				   String file2="C:\\Users\\MEN IN BLUE\\img3.jpg";
				   StringSelection selection2=new StringSelection(file2);
				   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection2, null);
	               Robot rebot2=new Robot();
				   rebot.keyPress(KeyEvent.VK_CONTROL);
				   rebot.keyPress(KeyEvent.VK_V);
		           rebot.keyRelease(KeyEvent.VK_V);
				   rebot.keyRelease(KeyEvent.VK_CONTROL);
				   Thread.sleep(4000);
				   rebot.keyPress(KeyEvent.VK_ENTER);
			       rebot.keyRelease(KeyEvent.VK_ENTER);
				   Thread.sleep(12000);
				   POM_BaeRoad.DokaImageEdit.click();
				   Thread.sleep(12000);
				   } }
		   
		  POM_BaeRoad.PostSendButton.click();
		  Thread.sleep(3000);
          WebElement ImagePostvalidation=POM_BaeRoad.CreatePostImageValidation;
		  String PostStatus=ImagePostvalidation.getText();
		  System.out.println(PostStatus);
		  Thread.sleep(2000);
		  Assert.assertEquals("Post Created", PostStatus);
		   
		 }
	
	@Test(priority =24)
	public void CreatePaidGamepostWrite() throws InterruptedException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoad.class);
		
		POM_BaeRoad.CreateButton.click();
		POM_BaeRoad.CommentBody.sendKeys("Hi All");
		POM_BaeRoad.HomePagePaidWritePostOption.click();
		Thread.sleep(2000);
		POM_BaeRoad.HomePagePaidWriteGamePostOptionClick.click();
	
	Thread.sleep(2000);
	WebElement payMoney=POM_BaeRoad.PaidClick;
	payMoney.clear();
	Thread.sleep(2000);
	payMoney.sendKeys("30");
	Thread.sleep(1000);
	POM_BaeRoad.HomePagePaidWriteGamePostDiscountOption.sendKeys("20");
	Thread.sleep(2000);
	POM_BaeRoad.PostSendButton.click();
	Thread.sleep(3000);
	WebElement ImagePostvalidation=POM_BaeRoad.CreatePostPaidValidation;
	String PostStatus=ImagePostvalidation.getText();
	System.out.println(PostStatus);
	Assert.assertEquals("Post Created", PostStatus);
	
	}	
	
	@Test(priority =25)
	public void CreateFreeGamepostWrite() throws InterruptedException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoad.class);
		
		POM_BaeRoad.CreateButton.click();
		POM_BaeRoad.CommentBody.sendKeys("Hi All");
		POM_BaeRoad.FreepaidOption.click();
		Thread.sleep(2000);
		List<WebElement> list=POM_BaeRoad.UnOrderedList;
		int size=list.size();
		System.out.println(size);
		
	for (WebElement webElement : list) {
		
		if(webElement.getAttribute("data-value").equals("game"))
		{
			webElement.click();
		}
		
	}
	
	Thread.sleep(2000);
	WebElement payMoney=POM_BaeRoad.PaidClick;
	payMoney.clear();
	Thread.sleep(2000);
	payMoney.sendKeys("30");
	Thread.sleep(1000);
	POM_BaeRoad.HomePagePaidWriteGamePostFreeCheckBoxOption.click();
	POM_BaeRoad.PostSendButton.click();
	Thread.sleep(3000);
	WebElement ImagePostvalidation=POM_BaeRoad.CreatePostPaidValidation;
	String PostStatus=ImagePostvalidation.getText();
	System.out.println(PostStatus);
	Assert.assertEquals("Post Created", PostStatus);
	
	}	
	
	@Test(priority =26)
	public void CreateNewGameUploadPaidPost() throws InterruptedException, AWTException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoad.class);

		POM_BaeRoad.CreateButton.click();
		POM_BaeRoad.PhotoVideoheadLine.click();
		POM_BaeRoad.UploadImageVideo.click();

		Thread.sleep(5000);
		String file="C:\\Users\\MEN IN BLUE\\img2.jpg";

		StringSelection selection=new StringSelection(file);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Robot rebot=new Robot();
		rebot.keyPress(KeyEvent.VK_CONTROL);

		rebot.keyPress(KeyEvent.VK_V);

		rebot.keyRelease(KeyEvent.VK_V);
		rebot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(6000);
		rebot.keyPress(KeyEvent.VK_ENTER);

		rebot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(12000);

		POM_BaeRoad.DokaImageEdit.click();
		Thread.sleep(15000);

		POM_BaeRoad.HomePagePaidWritePostOption.click();
		Thread.sleep(2000);
		POM_BaeRoad.HomePagePaidWriteGamePostOptionClick.click();

		WebElement payMoney=POM_BaeRoad.PaidClick;
		payMoney.clear();
		Thread.sleep(2000);
		payMoney.sendKeys("30");
		Thread.sleep(1000);
		POM_BaeRoad.HomePagePaidWriteGamePostDiscountOption.sendKeys("20");
		Thread.sleep(2000);
		POM_BaeRoad.PostSendButton.click();
		Thread.sleep(3000);

		WebElement ImagePostvalidation=POM_BaeRoad.CreatePostImageValidation;
		String PostStatus=ImagePostvalidation.getText();
		System.out.println(PostStatus);
		Thread.sleep(2000);
		Assert.assertEquals("Post Created", PostStatus);

		 }
	
	@Test(priority =27)
	public void CreateNewGameUploadFreePost() throws InterruptedException, AWTException
	{
		SuccefulLogin();
		PageFactory.initElements(driver,POM_BaeRoad.class);

		POM_BaeRoad.CreateButton.click();
		POM_BaeRoad.PhotoVideoheadLine.click();
		POM_BaeRoad.UploadImageVideo.click();

		Thread.sleep(5000);
		String file="C:\\Users\\MEN IN BLUE\\img2.jpg";

		StringSelection selection=new StringSelection(file);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Robot rebot=new Robot();
		rebot.keyPress(KeyEvent.VK_CONTROL);

		rebot.keyPress(KeyEvent.VK_V);

		rebot.keyRelease(KeyEvent.VK_V);
		rebot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(6000);
		rebot.keyPress(KeyEvent.VK_ENTER);

		rebot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(12000);

		POM_BaeRoad.DokaImageEdit.click();
		Thread.sleep(15000);
		POM_BaeRoad.FreepaidOption.click();
		Thread.sleep(2000);
		List<WebElement> list=POM_BaeRoad.UnOrderedList;
		int size=list.size();
		System.out.println(size);
		
	for (WebElement webElement : list) {
		
		if(webElement.getAttribute("data-value").equals("game"))
		{
			webElement.click();
		}
		
	}
	
	Thread.sleep(2000);
	WebElement payMoney=POM_BaeRoad.PaidClick;
	payMoney.clear();
	Thread.sleep(2000);
	payMoney.sendKeys("30");
	Thread.sleep(1000);
	POM_BaeRoad.HomePagePaidWriteGamePostFreeCheckBoxOption.click();
		POM_BaeRoad.PostSendButton.click();
		Thread.sleep(3000);

		WebElement ImagePostvalidation=POM_BaeRoad.CreatePostImageValidation;
		String PostStatus=ImagePostvalidation.getText();
		System.out.println(PostStatus);
		Thread.sleep(2000);
		Assert.assertEquals("Post Created", PostStatus);

		 }

	
	
	
	
	
	
	
	
	


	
	
	    
		
	} 
	
	
	
	
	
	
	
	
	
	    
	
	
		
	

		     
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	



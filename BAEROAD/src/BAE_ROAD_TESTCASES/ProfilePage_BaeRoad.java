package BAE_ROAD_TESTCASES;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import BAE_RORD_COMMON_FUNCTIONS.CommonFunctions_BaeRoad;
import PAGE_OBJECT_MODEL.POM_BaeRoad;
import PAGE_OBJECT_MODEL.POM_BaeRoadProfilePage;



public class ProfilePage_BaeRoad  extends CommonFunctions_BaeRoad {
	
	@Test(priority =1)
	public void SuccefulLogin() throws InterruptedException
	{
		
		PageFactory.initElements(driver,POM_BaeRoadProfilePage.class);
		
		POM_BaeRoadProfilePage.UserName.sendKeys("shobanvikki");
		POM_BaeRoadProfilePage.Password.sendKeys("Smrs321#");
		POM_BaeRoadProfilePage.LoginButton.click();
	}
	
	@Test(priority =2)
	public void UploadingProfilePicture() throws InterruptedException, AWTException
	{
		SuccefulLogin();		
		PageFactory.initElements(driver,POM_BaeRoadProfilePage.class);
		
		POM_BaeRoadProfilePage.HomepageProfileOptionClick.click();
		POM_BaeRoadProfilePage.ProfilePicClick.click();
		Thread.sleep(7000);
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
		POM_BaeRoadProfilePage.DokaImageEdit.click();
		Thread.sleep(12000);
		}
	
	@Test(priority =3)
	public void UploadingCoverPicture() throws InterruptedException, AWTException
	{
		SuccefulLogin();		
		PageFactory.initElements(driver,POM_BaeRoadProfilePage.class);
		
		POM_BaeRoadProfilePage.HomepageProfileOptionClick.click();
		POM_BaeRoadProfilePage.CoverPicClick.click();
		Thread.sleep(7000);
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
		POM_BaeRoadProfilePage.DokaImageEdit.click();
		Thread.sleep(12000);
		}
	
	
	
	@Test(priority =4)
	public void ProfilePageDisplyedPostEditing() throws InterruptedException, AWTException
	{
		SuccefulLogin();		
		PageFactory.initElements(driver,POM_BaeRoadProfilePage.class);
		POM_BaeRoadProfilePage.HomepageProfileOptionClick.click();
		Thread.sleep(2000);
		POM_BaeRoadProfilePage.ProfilePageDisplayedPostOption.click();
		POM_BaeRoadProfilePage.DisplayedEditOption.click();
		POM_BaeRoadProfilePage.ProfilePagePostCommentBody.sendKeys("Testing ");
		POM_BaeRoadProfilePage.PostSendButton.click();
		Thread.sleep(3000);
		WebElement EditPost=POM_BaeRoadProfilePage.ProfilePagePostEditValidation;
		String PostVaidation=EditPost.getText();
		System.out.println(PostVaidation);
		Assert.assertEquals("Post Modified", PostVaidation);
	    
		}
	
	@Test(priority =5)
	public void ProfilePageDisplyedPostDeletion() throws InterruptedException, AWTException
	{
		SuccefulLogin();		
		PageFactory.initElements(driver,POM_BaeRoadProfilePage.class);
		POM_BaeRoadProfilePage.HomepageProfileOptionClick.click();
		Thread.sleep(2000);
		POM_BaeRoadProfilePage.ProfilePageDisplayedPostOption.click();
		POM_BaeRoadProfilePage.ProfilePageDisplayedDeleteOption.click();
		POM_BaeRoadProfilePage.ProfilePageDisplayedPostDeletedConfirmButton.click();
		Thread.sleep(3000);
		WebElement DeletePost=POM_BaeRoadProfilePage.ProfilePagePostDeleteValidation;
		String PostVaidation=DeletePost.getText();
		System.out.println(PostVaidation);
		Assert.assertEquals("Post Deleted Successfully", PostVaidation);
	    
		}
	
	@Test(priority =6)
	public void VerifyingFollowersTipSendingOption() throws InterruptedException, AWTException
	{
		SuccefulLogin();		
		PageFactory.initElements(driver,POM_BaeRoadProfilePage.class);
		POM_BaeRoadProfilePage.HomepageProfileOptionClick.click();
		POM_BaeRoadProfilePage.ProfilePageFollowers.click();
		POM_BaeRoadProfilePage.ProfilePageFolloweresSearchBox.sendKeys("ravimr");
		POM_BaeRoadProfilePage.ProfilePageFollowersProfile.click();
		POM_BaeRoadProfilePage.ProfilePageTipButton.click();
		POM_BaeRoadProfilePage.ProfilePageEnterTipAmount.clear();
		POM_BaeRoadProfilePage.ProfilePageEnterTipAmount.sendKeys("");
		POM_BaeRoadProfilePage.ProfilePageEnterTipMessage.sendKeys("Hi");
		POM_BaeRoadProfilePage.ProfilePageSendTipButton.click();
		Thread.sleep(4000);
		WebElement TipValidation=POM_BaeRoadProfilePage.ProfilePagePostDeleteValidation;
		String TipStatus=TipValidation.getText();
		System.out.println(TipStatus);
		Assert.assertEquals("Payment received!", TipStatus);
		}
	
	@Test(priority =7)
	public void VerifyingFollowersTipSendbuttonStatusTest() throws InterruptedException, AWTException
	{
		SuccefulLogin();		
		PageFactory.initElements(driver,POM_BaeRoadProfilePage.class);
		POM_BaeRoadProfilePage.HomepageProfileOptionClick.click();
		POM_BaeRoadProfilePage.ProfilePageFollowers.click();
		POM_BaeRoadProfilePage.ProfilePageFolloweresSearchBox.sendKeys("ravimr");
		POM_BaeRoadProfilePage.ProfilePageFollowersProfile.click();
		WebElement TipButton=POM_BaeRoadProfilePage.ProfilePageTipButton;
		boolean TipButtonStatus=TipButton.isEnabled();
		System.out.println(TipButtonStatus);
		Assert.assertEquals(true, TipButtonStatus);
		}
	
	
	
	@Test(priority =8)
	public void ProfilePagePostEnabledOrNot() throws InterruptedException, AWTException
	{
		SuccefulLogin();		
		PageFactory.initElements(driver,POM_BaeRoadProfilePage.class);
		POM_BaeRoadProfilePage.HomepageProfileOptionClick.click();
		POM_BaeRoadProfilePage.ProfilePageFollowers.click();
		POM_BaeRoadProfilePage.ProfilePageFolloweresSearchBox.sendKeys("ravimr");
		POM_BaeRoadProfilePage.ProfilePageFollowersProfile.click();	
		Thread.sleep(2000);
	    WebElement post=POM_BaeRoadProfilePage.PostValidation;
		boolean checkStatus=post.isEnabled();
		System.out.println(checkStatus);
		Assert.assertEquals(true, checkStatus);
		
		
		}
	
	@Test(priority =9)
	public void ProfilePageToFollowingProfilePageNavigation() throws InterruptedException, AWTException
	{
		SuccefulLogin();		
		PageFactory.initElements(driver,POM_BaeRoadProfilePage.class);
		POM_BaeRoadProfilePage.HomepageProfileOptionClick.click();
		POM_BaeRoadProfilePage.ProfilePageFollowingClick.click();
		POM_BaeRoadProfilePage.ProfilePageFollowingSearchBox.sendKeys("buvi");
		Thread.sleep(2000);
		POM_BaeRoadProfilePage.ProfilePageFollowingProfile.click();	
		Thread.sleep(3000);
		WebElement Profilevalidation=POM_BaeRoadProfilePage.ProfilePageFollowingProfileValidation;
		String ProfileStatus=Profilevalidation.getText();
		System.out.println(ProfileStatus);
		Assert.assertEquals("buvi", ProfileStatus);
	}
	
	@Test(priority =10)
	public void ProfilePageToFollowersProfilePageNavigation() throws InterruptedException, AWTException
	{
		SuccefulLogin();		
		PageFactory.initElements(driver,POM_BaeRoadProfilePage.class);
		POM_BaeRoadProfilePage.HomepageProfileOptionClick.click();
		POM_BaeRoadProfilePage.ProfilePageFollowersClick.click();
		POM_BaeRoadProfilePage.ProfilePageFollowersSearchBox.sendKeys("ravimr");
		Thread.sleep(2000);
		POM_BaeRoadProfilePage.ProfilePageFollowersProfile.click();	
		Thread.sleep(3000);
		
	    WebElement Profilevalidation=POM_BaeRoadProfilePage.ProfilePageFollowersProfileValidation;
	    String ProfileStatus=Profilevalidation.getText();
		System.out.println(ProfileStatus);
		Assert.assertEquals("ravimr", ProfileStatus);
	}
	
	@Test(priority =11)
	public void ProfilePageFollowersCountValidation() throws InterruptedException, AWTException
	{
		SuccefulLogin();		
		PageFactory.initElements(driver,POM_BaeRoadProfilePage.class);
		POM_BaeRoadProfilePage.HomepageProfileOptionClick.click();
		WebElement FollowersCount=POM_BaeRoadProfilePage.ProfilePageFollowersCountValidation;
		String CountStatus=FollowersCount.getText();
		System.out.println("Followers Count :"+CountStatus);
//		Assert.assertEquals("3", CountStatus);
	}
	
	@Test(priority =12)
	public void ProfilePageFollowingCountValidation() throws InterruptedException, AWTException
	{
		SuccefulLogin();		
		PageFactory.initElements(driver,POM_BaeRoadProfilePage.class);
		POM_BaeRoadProfilePage.HomepageProfileOptionClick.click();
		WebElement FollowingCount=POM_BaeRoadProfilePage.ProfilePageFollowingCountValidation;
		String CountStatus=FollowingCount.getText();
		System.out.println("Following Count :" +CountStatus);
//		Assert.assertEquals("20", CountStatus);
	}
	
	@Test(priority =13)
	public void ProfilePageMyFavoriteAddTest() throws InterruptedException, AWTException
	{
		SuccefulLogin();		
		PageFactory.initElements(driver,POM_BaeRoadProfilePage.class);
		POM_BaeRoadProfilePage.HomepageProfileOptionClick.click();
		POM_BaeRoadProfilePage.ProfilePageClickMyFavBae.click();
		POM_BaeRoadProfilePage.ProfilePageMyFavBaeUserName.sendKeys("vikkii");
		Thread.sleep(2000);
		POM_BaeRoadProfilePage.ProfilePageMyFavBaeNameList.click();
		Thread.sleep(2000);
		POM_BaeRoadProfilePage.ProfilePageMyFavBaeAddBaeButton.click();
		Thread.sleep(2000);
		WebElement MyFavBaevalidtion=POM_BaeRoadProfilePage.ProfilePageMyFavBaeAddValidation;
		String Status=MyFavBaevalidtion.getText();
		System.out.println(Status);
		Assert.assertEquals("Bae Added", Status);
	}
	
	@Test(priority =14)
	public void ProfilePageMyFavoriteRemoveTest() throws InterruptedException, AWTException
	{
		SuccefulLogin();		
		PageFactory.initElements(driver,POM_BaeRoadProfilePage.class);
		POM_BaeRoadProfilePage.HomepageProfileOptionClick.click();
		POM_BaeRoadProfilePage.ProfilePageMyFavBaeRemoveClick.click();
		Thread.sleep(2000);
		WebElement MyFavBaevalidtion=POM_BaeRoadProfilePage.ProfilePageMyFavBaeRemoveValidation;
		String Status=MyFavBaevalidtion.getText();
		System.out.println(Status);
		Assert.assertEquals("Bae Removed", Status);
	}
	
	@Test(priority =15)
	public void ProfilePageMyFavoriteAddMultipleBae() throws InterruptedException, AWTException
	{
		SuccefulLogin();		
		PageFactory.initElements(driver,POM_BaeRoadProfilePage.class);
		POM_BaeRoadProfilePage.HomepageProfileOptionClick.click();
		
		List<String> followerNames=Arrays.asList("vikkii","kishore","buvi","ravimr");
		for(String followerName:followerNames)
		{
			POM_BaeRoadProfilePage.ProfilePageClickMyFavBae.click();
			POM_BaeRoadProfilePage.ProfilePageMyFavBaeUserName.sendKeys(followerName);
			Thread.sleep(2000);
			POM_BaeRoadProfilePage.ProfilePageMyFavBaeNameList.click();
			Thread.sleep(2000);
			POM_BaeRoadProfilePage.ProfilePageMyFavBaeAddBaeButton.click();
			
			Thread.sleep(2000);
			System.out.println("followerName=" +followerName);
		}
	}
		
	@Test(priority =16)
	public void ProfilePageMyFavoriteRemoveMultipleBae() throws InterruptedException, AWTException
	{
		SuccefulLogin();		
		PageFactory.initElements(driver,POM_BaeRoadProfilePage.class);
		POM_BaeRoadProfilePage.HomepageProfileOptionClick.click();
		
			
			List<String> followerNames=Arrays.asList("vikkii","kishore","buvi","ravimr");
			for(String followerName:followerNames)
			{
				POM_BaeRoadProfilePage.ProfilePageMyFavBaeRemoveClick.click();
				Thread.sleep(3000);
				
			}
			}
			
		
	@Test(priority =17)
	public void ProfilePageAboutShowdetailsValidation() throws InterruptedException, AWTException
	{
		SuccefulLogin();		
		PageFactory.initElements(driver,POM_BaeRoadProfilePage.class);
		POM_BaeRoadProfilePage.HomepageProfileOptionClick.click();
		POM_BaeRoadProfilePage.ProfilePageAboutShowDetails.click();
		WebElement TextValidation=POM_BaeRoadProfilePage.ProfilePageAboutShowDetailsValidation;
        String Status=TextValidation.getText();
		System.out.println(Status);
		Assert.assertEquals("Software Testing", Status);	
			
			}
			
		
	
			
		
	














}

	
	
	
	
	
	
		
	
	
	

	
			
	
	








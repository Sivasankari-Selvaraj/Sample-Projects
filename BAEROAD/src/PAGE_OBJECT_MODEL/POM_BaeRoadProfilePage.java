package PAGE_OBJECT_MODEL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_BaeRoadProfilePage {

	
	//Login Page
	
		@FindBy(id="email")
		public static WebElement UserName;
		
		@FindBy(id="password")
		public static WebElement Password;

		@FindBy(xpath="//button[contains(@class,'MuiButtonBase-root MuiButton-root jss6')]")
		public static WebElement LoginButton;
		
		//Profile Picture changing
		
		@FindBy(xpath = "//img[@src='/static/media/Person.4848ebfe.svg']/parent::span")
		public static WebElement HomepageProfileOptionClick;
		
		@FindBy(xpath="//div[@class='profile_pic_wrap']/child::img")
		public static WebElement ProfilePicClick;
		
		//Cover Picture changing
		
		@FindBy(xpath="//label[contains(@for,'coverPictureUpload')]")
		public static WebElement CoverPicClick;
		
		
		@FindBy(xpath="//*[@id=\"navbar_container\"]/div/div/div[1]/div/div[1]/div[2]/div[2]/div/div[1]")
		public static WebElement PostValidation;
		
		//Delete Post
		
		@FindBy(xpath="//button[@class='MuiButtonBase-root MuiIconButton-root'][@aria-controls='long-menu']")
		public static WebElement ProfilePageDisplayedPostOption;
		
		@FindBy(xpath = "//*[@id=\"long-menu\"]/div[3]/ul/div/li[2]")
		public static WebElement ProfilePageDisplayedDeleteOption;
	
		@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root jss20 MuiButton-contained MuiButton-disableElevation']/child::span[1]")
		public static WebElement ProfilePageDisplayedPostDeletedConfirmButton;
		
		@FindBy(xpath="//div[contains(@class,'MuiSnackbar-root jss18 MuiSnackbar-anchorOriginTopRight')]/child::div")
		public static WebElement ProfilePagePostDeleteValidation;
	
		//Edit Post
		
		@FindBy(xpath = "//*[@id=\"long-menu\"]/div[3]/ul/div/li[1]")
		public static WebElement DisplayedEditOption;
		
		@FindBy(xpath="//textarea[contains(@type,text)]")
		public static WebElement ProfilePagePostCommentBody;
		
		@FindBy(xpath="//div[contains(@class,'post_submit_btn')]")
		public static WebElement PostSendButton;
		
		@FindBy(xpath="//div[contains(@class,'MuiSnackbar-root jss18 MuiSnackbar-anchorOriginTopRight')]/child::div")
		public static WebElement ProfilePagePostEditValidation;
		
		
		//Verifying followers Tip sending options
		
		@FindBy(xpath = "//*[@id=\"navbar_container\"]/div/div/div[1]/div/div[1]/div[2]/div[2]/div/div[2]/p")
		public static WebElement ProfilePageFollowers;
		
		@FindBy(xpath = "//input[contains(@placeholder,'Search Here')]")
		public static WebElement ProfilePageFolloweresSearchBox;
		
		@FindBy(xpath = "//div[contains(@class,'follow_name')]")
		public static WebElement ProfilePageFollowersProfile;	
			
		@FindBy(xpath = "//div[contains(@class,'subscribe_btn')]")
		public static WebElement ProfilePageTipButton;
		
		@FindBy(xpath = "//input[contains(@name,'amount')]")
		public static WebElement ProfilePageEnterTipAmount;
		
		@FindBy(xpath = "//input[contains(@name,'message')]")
		public static WebElement ProfilePageEnterTipMessage;
		
		@FindBy(xpath = "//div[@class='payment_icon']/child::button")
		public static WebElement ProfilePageSendTipButton;
		
		@FindBy(xpath="//div[contains(@class,'MuiSnackbar-root jss18 MuiSnackbar-anchorOriginTopRight')]/child::div")
		public static WebElement ProfilePageFollowersTipSentValidation;
		
		
		//Verify the ProfilePageTofollowing Profile
		
		@FindBy(xpath = "//*[@id=\"navbar_container\"]/div/div/div[1]/div/div[1]/div[2]/div[2]/div/div[3]/h3")
		public static WebElement ProfilePageFollowingClick;
		
		@FindBy(xpath = "//input[contains(@placeholder,'Search Here')]")
		public static WebElement ProfilePageFollowingSearchBox;
		
		@FindBy(xpath = "//div[contains(@class,'follow_name')]")
		public static WebElement ProfilePageFollowingProfile;
		
		@FindBy(xpath = "//div[contains(@class,'profile_detail')]/child::div[2]/div")
		public static WebElement ProfilePageFollowingProfileValidation;
		
		@FindBy(xpath = "//div[contains(@class,'post_details_wrap')]/child::div/div[3]/h3")
		public static WebElement ProfilePageFollowingCountValidation;
		
		
		//Verify the ProfilePageTofollowers Profile
		
		@FindBy(xpath = "//div[contains(@class,'post_details_wrap')]/child::div[1]/div[2]")
		public static WebElement ProfilePageFollowersClick;
				
		@FindBy(xpath = "//input[contains(@placeholder,'Search Here')]")
		public static WebElement ProfilePageFollowersSearchBox;
				
		@FindBy(xpath = "//div[contains(@class,'follow_name')]")
		public static WebElement ProfilePageFollowersProfileList;
		
		@FindBy(xpath = "//div[contains(@class,'profile_detail')]/child::div[2]/div")
		public static WebElement ProfilePageFollowersProfileValidation;
		
		@FindBy(xpath = "//div[contains(@class,'post_details_wrap')]/child::div/div[2]/h3")
		public static WebElement ProfilePageFollowersCountValidation;
		
		
		
		//Add My Favorite  Bae
		
		
		@FindBy(xpath = "//div[@class='card_wrap']/child::span")
		public static WebElement ProfilePageClickMyFavBae;	
		
		@FindBy(xpath = "//input[contains(@name,'username')]")
		public static WebElement ProfilePageMyFavBaeUserName;	
		
		@FindBy(xpath = "//div[@class='search_container']/child::div")
		public static WebElement ProfilePageMyFavBaeNameList;
		
		@FindBy(xpath = "//div[@class='input_wrap']/child::button")
		public static WebElement ProfilePageMyFavBaeAddBaeButton;
		
		@FindBy(xpath = "//div[contains(@class,'MuiSnackbar-root jss18 MuiSnackbar-anchorOriginTopRight')]/child::div")
		public static WebElement ProfilePageMyFavBaeAddValidation;
		
		
		//Remove My favorite Bae's
		
		@FindBy(xpath = "//img[contains(@class,'plus')]	")
		public static WebElement ProfilePageMyFavBaeRemoveClick;
		
		@FindBy(xpath = "//div[contains(@class,'MuiSnackbar-root jss18 MuiSnackbar-anchorOriginTopRight')]/child::div")
		public static WebElement ProfilePageMyFavBaeRemoveValidation;
		
		//About 
		
		@FindBy(xpath = "//div[contains(@class,'about_profile_container')]/child::div[1]/div")
		public static WebElement ProfilePageAboutShowDetails;

		@FindBy(xpath = "//div[contains(@class,'about_profile_container')]/div[2]/div")
		public static WebElement ProfilePageAboutShowDetailsValidation;
		
		
		//Post Message Text
		
        @FindBy(xpath = "//div[contains(@class,'post_container')]/child::div[4]/div[1]/div[2]/img[1]")
		public static WebElement ProfilePagePostMessageTest;
        
        @FindBy(xpath = "//div[contains(@class,'jss257')]/parent::div")
		public static WebElement ProfilePagePostMessageTextValidation;
		
        //Doka edit image
        
        @FindBy(xpath = "//span[contains(text(),'Done')]")
    	public static WebElement DokaImageEdit;
		






}



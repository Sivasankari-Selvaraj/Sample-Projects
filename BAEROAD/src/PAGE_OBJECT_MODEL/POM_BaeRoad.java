package PAGE_OBJECT_MODEL;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_BaeRoad {
	
	//Registration Page
	@FindBy(xpath="//a[contains(@class,'login_font')]")
	public static WebElement SignUpPageClick;
	
	@FindBy(name="username")
	public static WebElement RegUserName;
	
	@FindBy(id="outlined-error-helper-text")
	public static WebElement RegEmailAddress;
	
	@FindBy(name="password")
	public static WebElement RegPassword;
	
	@FindBy(xpath="//input[contains(@type,'checkbox')]")
	public static WebElement SignUpCheckboxTermsAndConditions;
	
//	@FindBy(xpath="//div[contains(@class,'recaptcha-checkbox-border')]")
//	public static WebElement SignUpCheckBoxCAPTCHA;
	
	@FindBy(xpath="//div[contains(@class,'signup_input_divider')]/child::form/div[4]")
	public static WebElement SignUpButtonClick;
	
	@FindBy(id="identifierId")
	public static WebElement MailUserName;
	
	@FindBy(xpath="//div[contains(@class,'VfPpkd-RLmnJb')]")
	public static WebElement UserNextButton;
	
	@FindBy(name="password")
	public static WebElement MailPassword;
	
	@FindBy(xpath="//div[contains(@class,'VfPpkd-Jh9lGc')]")
	public static WebElement PasswordNextButton;
	
	@FindBy(id="login-username")
	public static WebElement YahooMailUserName;
	
	@FindBy(id="login-signin")
	public static WebElement YahooMailUserNextButton;
	
	@FindBy(id="login-passwd")
	public static WebElement YahooMailPassword;
	
	@FindBy(name="verifyPassword")
	public static WebElement YahooMailPasswordNextButton;
	
	@FindBy(xpath="//a[contains(@class,'button mymail')]")
	public static WebElement YahooMymailbutton;
	
	//Login Page 
	
	@FindBy(id="email")
	public static WebElement UserName;
	
	@FindBy(id="password")
	public static WebElement Password;

	@FindBy(xpath="//button[contains(@class,'MuiButtonBase-root MuiButton-root jss6')]")
	public static WebElement LoginButton;
	
	@FindBy(xpath="//p[contains(@class,'response_error')]")
	public static WebElement InvalidUserNamePasswordValidation;
	
	@FindBy(xpath="//p[contains(@class,'response_error')]")
	public static WebElement ValidUserNameInvalidPasswordValidation;
	
	@FindBy(xpath="//p[contains(@class,'response_error')]")
	public static WebElement InvalidUserNameValidPasswordValidation;
	
	@FindBy(xpath="//p[contains(@class,'response_error')]")
	public static WebElement ValidUserNameBlankPassswordValidation;
	
	@FindBy(xpath="//p[contains(@class,'response_error')]")
	public static WebElement InvalidUserNameBlankPasswordValidation;
	
	@FindBy(xpath="//p[contains(@class,'response_error')]")
	public static WebElement BlankUserNameValidPasswordValidation;
	
	@FindBy(xpath="//p[contains(@class,'response_error')]")
	public static WebElement BlankUserNamInvalidPasswordValidation;
	
	@FindBy(xpath="//p[contains(@class,'response_error')]")
	public static WebElement BlankUserNameBlankPasswordValidation;
	
	@FindBy(xpath="//div[contains(@class,'forget_password_wrap')]/child::a")
	public static WebElement LoginForgotPasswordClick;
	
	@FindBy(xpath="//input[contains(@id,'outlined-error-helper-text')]")
	public static WebElement LoginForgotPasswordEmailTextBox;
	
	@FindBy(xpath="//div[contains(@class,'forget_button_wrap')]/child::button")
	public static WebElement LoginForgotPasswordEmailSubmitbutton;
	
	@FindBy(xpath="//div[contains(@class,'MuiSnackbar-root jss7 MuiSnackbar-anchorOriginTopRight')]/child::div")
	public static WebElement LoginForgotPasswordInvalidEmailVerification;
	
	//Home Page Create Write NewPost
	
	@FindBy(xpath = "//h1[contains(@class,'descri')]")
	public static WebElement CreateButton;
	
	@FindBy(xpath="//textarea[contains(@type,text)]")
	public static WebElement CommentBody;
	
	@FindBy(xpath="//div[contains(@class,'post_submit_btn')]")
	public static WebElement PostSendButton;
	
	@FindBy(xpath="//div[contains(@class,'MuiSnackbar-root jss18 MuiSnackbar-anchorOriginTopRight')]/child::div")
	public static WebElement CreatePostValidation;
	
	@FindBy(xpath="//div[contains(@class,'MuiSnackbar-root jss18 MuiSnackbar-anchorOriginTopRight')]/child::div")
	public static WebElement CreatePostEmptyValidation;
	
	@FindBy(xpath="//div[contains(@class,'MuiSnackbar-root jss18 MuiSnackbar-anchorOriginTopRight')]/child::div")
	public static WebElement CreatePostImageValidation;
	
	
	//Home Page Create Video/Image NewPost
	
	@FindBy(xpath = "//div[contains(@class,'media_content_top ')]")
	public static WebElement PhotoVideoheadLine;
	
	@FindBy(xpath = "//div[contains(@class,'post_media_wrap')]")
	public static WebElement UploadImageVideo;
	
	@FindBy(xpath = "//span[contains(text(),'Done')]")
	public static WebElement DokaImageEdit;
	
	
	//Home Page Create Post Text Validation
	
	@FindBy(xpath = "//div[contains(@class,'text_container')]")
	public static WebElement CreatePostTextValidtion;
	
	//Home page create paid post
	
	@FindBy(xpath = "//div[contains(@class,'modal_select_wrap')]")
	public static WebElement FreepaidOption;
	
	@FindBy(xpath = "//*[@id=\"menu-amount_type\"]/div[3]/ul/li")
	public static List<WebElement> UnOrderedList;
	
	@FindBy(xpath = "//input[@name='amount'][@type='number']")
	public static WebElement PaidClick;
	
	@FindBy(xpath="//div[contains(@class,'MuiSnackbar-root jss18 MuiSnackbar-anchorOriginTopRight')]/child::div")
	public static WebElement CreatePostPaidValidation;
	
	
	//Create Post Message And Like
	
	@FindBy(xpath = "//img[contains(@src,'/static/media/Heart.25d030ac.svg')]")
	public static WebElement NewPostLike;
	
	@FindBy(xpath = "//img[contains(@class,'jss78')]")
	public static WebElement NewPostDisLike;
	
	@FindBy(xpath = "//img[contains(@src,'/static/media/Message_filled.a275901b.svg')]")
	public static WebElement NewPostMessage;
	
	@FindBy(xpath = "//input[contains(@name,'comment')]")
	public static WebElement NewPostMessageCommentBody;
	
	@FindBy(xpath = "//img[contains(@src,'/static/media/Paperplane.b9e23145.svg')]")
	public static WebElement NewPostMessageCommentSubmit;
	
	@FindBy(xpath = "//div[contains(@id,'post_description')]/child::div[5]/div[1]/div/div/div")
	public static WebElement NewPostMessageCommentTextValidation;
	
	
	//Followers Confirmation
	
	@FindBy(xpath = "//div[contains(@class,'number')]")
	public static WebElement HomePageFollowers;
	
	@FindBy(xpath = "//input[contains(@placeholder,'Search Here')]")
	public static WebElement HomePageFollowersSearchBox;
	
	@FindBy(xpath = "//div[contains(@class,'follow_name')]")
	public static WebElement HomePageFollowerProfile;
	
	@FindBy(xpath = "//div[contains(@class,'no_followers')]")
	public static WebElement HomePageFollowersValidation;	
	
	@FindBy(xpath = "//div[contains(@class,'topbar_container')]/child::div[2]/div/div")
	public static WebElement HomePageFollowersCountValidation;	
	
	//Following Confirmation
	
	@FindBy(xpath = "//*[@id=\"navbar_container\"]/div/div/div[1]/div[2]/div[2]")
	public static WebElement HomePageFollowing;
	
	@FindBy(xpath = "//input[contains(@placeholder,'Search Here')]")
	public static WebElement HomePageFolloweringSearchBox;
	
	@FindBy(xpath = "//div[contains(@class,'follow_name')]")
	public static WebElement HomePageFollowingProfile;	
	
	@FindBy(xpath = "//div[contains(@class,'topbar_container')]/child::div[2]/div[2]/div")
	public static WebElement HomePageFollowingCountValidation;	
	
	
	//Following/Follower Bar cancel Button Test
	
	@FindBy(xpath = "//button[contains(@class,'react-responsive-modal-closeButton')]")
	public static WebElement HomePageFollowingFollowerBarCancelButtonTest;	
	
	//Home Page Search box functionality testing
	
	@FindBy(xpath = "//input[contains(@placeholder,'Search…')]")
	public static WebElement HomePageSearchBoxFunctionality;
	
	
	//Delete post
	
		@FindBy(xpath="//button[@class='MuiButtonBase-root MuiIconButton-root'][@aria-controls='long-menu']")
		public static WebElement HomePageCreatePostOption;
		
		@FindBy(xpath = "//*[@id=\'long-menu\']/div[3]/ul/div/li[2]")
		public static WebElement CreatedPostDeleteOption;
	
		//button[@class='MuiButtonBase-root MuiButton-root jss20 MuiButton-contained MuiButton-disableElevation']/child::span[1]
		
		@FindBy(xpath= "//span[contains(text(),'Confirm')]")
		public static WebElement CreatedPostDeletedConfirmButton;
		
		@FindBy(xpath = "//div[contains(@class,'MuiSnackbar-root jss18 MuiSnackbar-anchorOriginTopRight')]/child::div")
		public static WebElement CreatedPostDeleteValidation;
		
		
		//Edit post
		
			@FindBy(xpath = "//*[@id=\'long-menu\']/div[3]/ul/div/li[1]")
			public static WebElement CreatedPostEditOption;
		
			@FindBy(xpath = "//textarea[contains(@type,text)]")
			public static WebElement CreatedPostEditCommentBody;
			
			@FindBy(xpath="//div[contains(@class,'post_submit_btn')]")
			public static WebElement EditPostSendButton;
			
			@FindBy(xpath="//div[contains(@class,'MuiSnackbar-root jss18 MuiSnackbar-anchorOriginTopRight')]/child::div")
			public static WebElement EditPostValidation;
			
		
		//HomePage ProfileOption Test
		
		@FindBy(xpath = "//img[@src='/static/media/Person.4848ebfe.svg']/parent::span")
		public static WebElement HomepageProfileOptionClick;
		
		//HomePage MessageOption Test
		
		@FindBy(xpath = "//img[@src='/static/media/Message.eefd21ff.svg']/parent::span")
		public static WebElement HomepageMessgeOptionClick;
	
		//HomePage PurchaseOption Test
		
		@FindBy(xpath = "//a[contains(@href,'/purchase')]")
		public static WebElement HomepagePurchaseOptionClick;
	
		//HomePage PurchaseOption Test
		
		@FindBy(xpath = "//img[contains(@src,'/static/media/Bell.1aced721.svg')]/parent::span")
	    public static WebElement HomepageNotificationOptionClick;
		
		
		//HomePage HomePageSettingsOption Test
		
		@FindBy(xpath = "//button[contains(@aria-controls,'primary-search-account-menu')]/child::span")
		public static WebElement HomepageAccountOptionClick;

	    @FindBy(xpath = "//a[contains(@class,'settings_link')]")
		public static WebElement AccountpageSettingsOption;
	    
	    
	    //Home Page Multiple Post Upload    
	    @FindBy(xpath = "//label[contains(@for,'additional-file-upload')]/parent::div")
		public static WebElement HomePageMultiPostUploads;
	
	
	  //Home Page Report followers post    
	    @FindBy(xpath = "//div[contains(@class,'news_feed_actions')]/child::button")
		public static WebElement HomePageReportPostOption;
	    
	    @FindBy(xpath = "//div[@id='long-menu']/div[3]/ul/li")
		public static WebElement HomePagePostReportClick;
	    
	    @FindBy(xpath = "(//input[@value=''])[5]")
		public static WebElement HomePagePostSpamSelection;
	
	    @FindBy(xpath = "//div/div/div[3]/button/span")
		public static WebElement HomePageReportClickbutton;
	
	    @FindBy(xpath = "//a[contains(@href, '/ravimr')]")
		public static WebElement HomePageFollowerPostNameText;
	    
	    //Game post
	    
	    @FindBy(xpath = "//div[@class='modal_body']/child::div[3]/div/div[1]")
		public static WebElement HomePagePaidWritePostOption;
	    
	    @FindBy(xpath = "//li[contains(text(),'Game')]")
		public static WebElement HomePagePaidWriteGamePostOptionClick;
	    
	    @FindBy(xpath = "(//input[contains(@name,'discount')])[1]")
		public static WebElement HomePagePaidWriteGamePostDiscountOption;
	
	    @FindBy(xpath = "//input[contains(@name,'discount_type')]")
		public static WebElement HomePagePaidWriteGamePostFreeCheckBoxOption;
	
	
	
	
	
	
	
	
	
	
	
	
}

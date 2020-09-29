package PAGE_OBJECT_MODEL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_BaeRoadMessagePage {
	
	@FindBy(xpath = "//img[@src='/static/media/Message.eefd21ff.svg']/parent::span")
	public static WebElement HomepageMessgeOptionClick;
	
	//Message searchBox Test
	
	@FindBy(xpath = "//input[contains(@placeholder,'Search or start new chat')]")
	public static WebElement MessagepageSearchBoxTest;
	
	@FindBy(xpath = "//span[contains(@class,'MuiTypography-root MuiListItemText-primary MuiTypography-body1 MuiTypography-displayBlock')]")
	public static WebElement MessagepageSearchBoxSeachNameList;
	//Message sending test
	
	@FindBy(xpath = "//span[contains(@class,'MuiTypography-root MuiListItemText-primary MuiTypography-body1 MuiTypography-displayBlock')]")
	public static WebElement MessagepageSearchNameList;
	
	@FindBy(xpath = "//input[contains(@placeholder,'Write a message')]")
	public static WebElement MessagepageMeassageCommentBody;

	@FindBy(xpath = "//img[contains(@src,'/static/media/Paperplane.b9e23145.svg')]")
	public static WebElement MessagepageMeassageSendButtonClick;
	
	@FindBy(xpath = "//div[contains(@class,'message_text_send')]")
	public static WebElement MessagepageMeassageTextValidation;
	
	
	
	//Messsage Attachment free write post test
	
	@FindBy(xpath = "//img[contains(@src,'/static/media/Attachment.1cf1e4b5.svg')]")
	public static WebElement MessagepageMeassageAttachmentbuttonClick;	

	@FindBy(xpath = "//textarea[contains(@placeholder,'Your post here')]")
	public static WebElement MessagepageMeassageWritePostCommentBody;	
	
	@FindBy(xpath = "//div[contains(@class,'post_submit_btn')]/child::img")
	public static WebElement MessagepageMeassagePostSendButton;	
	
	@FindBy(xpath = "//div[contains(@class,'MuiSnackbar-root jss18 MuiSnackbar-anchorOriginTopRight')]/child::div[1]")
	public static WebElement MessagepageMeassagePostEmptyPostValidation;	
	
	@FindBy(xpath = "//div[contains(@class,'MuiSnackbar-root jss18 MuiSnackbar-anchorOriginTopRight')]/child::div[1]")
	public static WebElement MessagepageMeassagePostFreeWritePostValidation;
	
	//Messsage Attachment paid write post test
	
	@FindBy(xpath = "//div[contains(@id,'demo-simple-select')]")
	public static WebElement MessagepageMeassageWritePostOptionClick;
	
	@FindBy(xpath = "//*[@id=\"menu-amount_type\"]/div[3]/ul/li[2]")
	public static WebElement MessagepageMeassageWritePostPaidOptionClick;
	
	@FindBy(xpath = "//div[contains(@class,'MuiInputBase-root MuiOutlinedInput-root MuiInputBase-formControl MuiInputBase-adornedStart MuiOutlinedInput-adornedStart MuiInputBase-marginDense MuiOutlinedInput-marginDense')]/child::input")
	public static WebElement MessagepageMeassageWritePostPayMoneyOptionClick;
	
	@FindBy(xpath = "//div[contains(@class,'MuiSnackbar-root jss18 MuiSnackbar-anchorOriginTopRight')]/child::div[1]")
	public static WebElement MessagepageMeassagePostPaidWritePostValidation;
	
	//Messsage Attachment free upload post test

	@FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div[1]/div[2]")
	public static WebElement MessagepageMeassagePhotoOrVideoPostOptionClick;
	
	@FindBy(xpath = "//div[contains(@class,'initial_state')]/child::label")
	public static WebElement MessagepageMeassagePhotoOrVideoPostUpload;
	
	@FindBy(xpath = "//div[contains(@class,'post_submit_btn')]")
	public static WebElement MessagepageMeassagePhotoOrVideoPostSubmitButton;
	
	//Messsage Attachment paid Photo Video post test
	
		@FindBy(xpath = "//div[contains(@id,'demo-simple-select')]")
		public static WebElement MessagepageMeassagePhotoVideoPostOptionClick;
		
		@FindBy(xpath = "//*[@id=\"menu-amount_type\"]/div[3]/ul/li[2]")
		public static WebElement MessagepageMeassagePhotoVideoPaidOptionClick;
		
		@FindBy(xpath = "//div[contains(@class,'MuiInputBase-root MuiOutlinedInput-root MuiInputBase-formControl MuiInputBase-adornedStart MuiOutlinedInput-adornedStart MuiInputBase-marginDense MuiOutlinedInput-marginDense')]/child::input")
		public static WebElement MessagepageMeassagePhotoVideoPayMoneyOptionClick;
		
		//Influencer follower tip option test
		
		@FindBy(xpath = "//img[contains(@src,'/static/media/Dollar.8cbf03c3.svg')]")
		public static WebElement MessagepageMeassageInfFolowerTipOption;
		
		@FindBy(xpath = "//input[contains(@name,'message')]")
		public static WebElement MessagepageMeassageInfFolowerTipMessageBox;
		
		@FindBy(xpath = "//div[contains(@class,'payment_icon')]/child::button")
		public static WebElement MessagepageMeassageInfFolowerTipSendButton;
		
		@FindBy(xpath = "//div[contains(@class,'send_tip')]/child::div[2]")
		public static WebElement MessagepageMeassageInfFolowerTipValidation;
		
		@FindBy(xpath = "//div[contains(@class,'MuiSnackbar-root jss18 MuiSnackbar-anchorOriginTopRight')]/child::div[1]")
		public static WebElement MessagepageMeassageInfluencerTipPaymentValidation;
		
		//MessageConversation Deletion and cancel Option test
		
		@FindBy(xpath = "//img[contains(@class,'deleteIcon')]")
		public static WebElement MessagepageMeassagePostDeleteionOption;
	
		@FindBy(xpath = "//div[contains(@class,'delete_body')]/child::div[2]")
		public static WebElement MessagepageAllMessagecancelClick;

		@FindBy(xpath = "//div[contains(@class,'delete_body')]/child::div[1]")
		public static WebElement MessagepageAllMessageDeleteClick;
		
		//Broadcasting option
		
		@FindBy(xpath = "//button[contains(@id,'Broadcasts-tab')]")
		public static WebElement MessagepageBroadCastOption;
		
		@FindBy(xpath = "//div[contains(@id,'Broadcasts')]/child::div")
		public static WebElement MessagepageBroadCastCoversationClick;
		
		@FindBy(xpath = "//div[contains(@class,'message_input_box')]/child::input")
		public static WebElement MessagepageBroadCastTextMessage;
		
		@FindBy(xpath = "//img[contains(@src,'/static/media/Paperplane.b9e23145.svg')]")
		public static WebElement MessagepageBroadCastTextMessageButtonClick;
		
		@FindBy(xpath = "//div[contains(@class,'message_container')]/child::div[2]/div/div[3]/div[2]")
		public static WebElement MessagepageBroadCastTextMessageValidation;
		
		//Message post delete  test
		
		@FindBy(xpath = "//div[contains(@class,'content_wrap')]/child::div[2]")
		public static WebElement MessagepageMessagePostDeletion;
		
		@FindBy(xpath = "//div[contains(@class,'delete_body')]/child::div[1]")
		public static WebElement MessagepageMessagePostDeletionForMeClick;
		
		@FindBy(xpath = "//div[contains(@class,'delete_body')]/child::div[2]")
		public static WebElement MessagepageMessagePostDeletionForEveryOneClick;
		
        @FindBy(xpath = "//div[contains(@class,'delete_body')]/child::div[3]")
        public static WebElement MessagepageMessagePostDeletionCancelClick;
        
        @FindBy(xpath = "//div[contains(@class,'conversation_wrap active')]/child::div[1]/div[2]/p[2]")
        public static WebElement MessagepageMessageConversationDeletionValidation;
        
 //Doka edit image
        
        @FindBy(xpath = "//span[contains(text(),'Done')]")
    	public static WebElement DokaImageEdit;
        
        


}

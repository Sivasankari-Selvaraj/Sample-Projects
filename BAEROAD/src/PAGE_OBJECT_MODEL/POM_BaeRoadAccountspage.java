package PAGE_OBJECT_MODEL;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_BaeRoadAccountspage {
	
	
	@FindBy(xpath = "//button[contains(@aria-controls,'primary-search-account-menu')]/child::span")
	public static WebElement HomepageAccountOptionClick;

     //Settings	
	@FindBy(xpath = "//a[contains(@class,'settings_link')]")
	public static WebElement AccountpageSettingsOption;
	
	//LogOut
	@FindBy(xpath = "//*[@id=\"primary-search-account-menu\"]/div[3]/ul/li")
	public static WebElement AccountpageLogOutOption;
	
	
	//MessgeOption Tip mandatory CheckBox Test
	
	@FindBy(xpath = "//div[contains(@class,'types_wrap')]/child::a[2]")
	public static WebElement AccountpageMessageOptionClick;
	
	@FindBy(xpath = "//span[contains(@class,'MuiIconButton-label')]/child::input")
	public static WebElement AccountpageMessageOptionTipCheckBoxClick;
	
	
	
	//MessgeOption Add Post Test
	
	@FindBy(xpath = "//div[contains(@class,'add_post_button_wrap')]/child::button")
	public static WebElement AccountpageMessageOptionAddPostButtonClick;
	
	//MessgeOption Free write Post
	
	@FindBy(xpath = "//div[contains(@class,'modal_input')]/child::textarea")
	public static WebElement AccountpageMessageOptionWritePostCommentText;
	
	@FindBy(xpath = "//div[contains(@class,'post_submit_btn')]/child::img")
	public static WebElement AccountpageMessageOptionWritePostSendButton;
	
	@FindBy(xpath = "//div[contains(@class,'MuiSnackbar-root jss18 MuiSnackbar-anchorOriginTopRight')]/child::div")
	public static WebElement AccountpageMessageOptionTipPostValidation;
	
	//MessgeOption paid write Post
	
    @FindBy(xpath = "//div[contains(@class,'modal_select_wrap')]/child::div")
	public static WebElement AccountpageMessageOptionWritePostPayChooseOption;

    @FindBy(xpath = "//*[@id=\"menu-amount_type\"]/div[3]/ul/li")
	public static List<WebElement> AccountpageMessageOptionWritePostUlListSelect;
	
    @FindBy(xpath = "//div[contains(@class,'MuiInputBase-root MuiOutlinedInput-root MuiInputBase-formControl MuiInputBase-adornedStart MuiOutlinedInput-adornedStart MuiInputBase-marginDense MuiOutlinedInput-marginDense')]/child::input")
	public static WebElement AccountpageMessageOptionWritePostPayAmount;
    
    //MessageOption Free Upload Post
    
    @FindBy(xpath = "//div[contains(@class,'modal_content')]/child::div[2]")
	public static WebElement AccountpageMessageOptionFreePhotoVideoOption;

    @FindBy(xpath = "//div[contains(@class,'post_media_wrap')]/child::div[1]")
   	public static WebElement AccountpageMessageOptionFreeUploadClick;
    
    //doke image edit
    
    @FindBy(xpath = "//span[contains(text(),'Done')]")
   	public static WebElement AccountpageMessageOptionUploadPostDokaEditClick;
    
    
    
    //MessageOption Post edit option click
    
    @FindBy(xpath = "//li[contains(text(),'Edit')]")
   	public static WebElement AccountpageMessageOptionPostEditOptionClick;
    
    @FindBy(xpath = "//div[contains(@class,'modal_input')]/child::textarea")
	public static WebElement AccountpageMessageOptionEditPostAppendCommentText;
    
    @FindBy(xpath = "//div[contains(@class,'MuiSnackbar-root jss18 MuiSnackbar-anchorOriginTopRight')]/child::div")
	public static WebElement AccountpageMessageOptionEditPostValidation;
    
    
  //MessageOption Post delete Option
    
    @FindBy(xpath = "//div[contains(@class,'news_feed_actions')]/child::button")
   	public static WebElement AccountpageMessageOptionPostOption;
    
    @FindBy(xpath = "//li[contains(text(),'Delete')]")
   	public static WebElement AccountpageMessageOptionPostDeleteOptionClick;
    
    @FindBy(xpath = "/html/body/div[5]/div/div/div/div[3]/button[1]/span[1]")
   	public static WebElement AccountpageMessageOptionPostDeleteCancelButtonClick;

    @FindBy(xpath = "//button[contains(@class,'MuiButtonBase-root MuiButton-root jss')][2]")
   	public static WebElement AccountpageMessageOptionPostDeletebuttonClick;
    
    @FindBy(xpath = "//div[contains(@class,'MuiSnackbar-root jss18 MuiSnackbar-anchorOriginTopRight')]/child::div")
   	public static WebElement AccountpageMessageOptionDeletePostValidation;
    
    //enter message
    
    @FindBy(xpath = "//textarea[contains(@id,'message')]")
   	public static WebElement AccountpageMessageOptionEnterMessageBody;
    
    @FindBy(xpath = "//div[contains(@class,'MuiSnackbar-root jss18 MuiSnackbar-anchorOriginTopRight')]/child::div")
	public static WebElement AccountpageMessageOptionValidation;
    
    //Save button
    
    @FindBy(xpath = "//div[contains(@class,'message_settings_container')]/child::div[4]/button")
   	public static WebElement AccountpageMessageOptionSaveButton;
    
    
//Save button remove
    
    @FindBy(xpath = "//div[contains(@class,'button_wrap')]/child::button")
   	public static WebElement AccountpageMessageOptionSaveButtonRemove;
    
    //Support Option
    
    @FindBy(xpath = "//div[contains(@class,'types_wrap')]/child::a[6]")
   	public static WebElement AccountpageSupportOptionClick;
    
    @FindBy(xpath = "//div[contains(@class,'support_container')]/child::input")
   	public static WebElement AccountpageSupportOptionSubjectBox;
    
    @FindBy(xpath = "//div[contains(@class,'support_container')]/child::textarea")
   	public static WebElement AccountpageSupportOptionMessageBox;
    
    @FindBy(xpath = "//div[contains(@class,'support_container')]/child::div[2]")
   	public static WebElement AccountpageSupportOptionSendButton;
    
    @FindBy(xpath = "//div[contains(@class,'MuiSnackbar-root jss18 MuiSnackbar-anchorOriginTopRight')]/child::div")
   	public static WebElement AccountpageSupportOptionSupportTestvalidation;
    
    //Earning Page Option
    
    @FindBy(xpath = "//div[contains(@class,'types_wrap')]/child::a[3]")
   	public static WebElement AccountpageEarningOptionClick;
    
    @FindBy(xpath = "//div[contains(@class,'earning_container')]/child::div[2]")
   	public static WebElement AccountpageEarningOptionChangeSubscriptionTypeBoxClick;
    
    @FindBy(xpath = "//*[@id=\"menu-subscription_type\"]/div[3]/ul/li")
   	public static List<WebElement> AccountpageEarningOptionChangeSubscriptionTypeBoxUOlit;
    
    @FindBy(xpath = "//div[@id='mui-component-select-subscription_type']")
   	public static WebElement AccountpageEarningOptionFreeSubscriptionValidation;
    
    @FindBy(xpath = "//div[@id='mui-component-select-subscription_type']")
   	public static WebElement AccountpageEarningOptionPaidSubscriptionValidation;
    
    @FindBy(xpath = "//div[contains(@class,'button_wrap')]/child::button")
   	public static WebElement AccountpageEarningOptionAddSubscriptionButton;
    
    @FindBy(xpath = "//div[contains(@class,'input_wrap')]/child::div/div")
   	public static WebElement AccountpageEarningOptionAddSubscriptionSetFrequencyClick;
    
    @FindBy(xpath = "//*[@id=\"menu-interval\"]/div[3]/ul/li")
   	public static List<WebElement> AccountpageEarningOptionAddSubscriptionSetFreqencyUOList;
    
    @FindBy(xpath = "//span[contains(@class,'MuiSlider-root MuiSlider-colorPrimary')]/child::span[5]")
   	public static WebElement AccountpageEarningOptionAddSubscriptionSetDiscountClick;
    
    @FindBy(xpath = "//div[contains(@class,'body')]/child::div[4]/button")
   	public static WebElement AccountpageEarningOptionAddSubscriptionAddButton;
    
    //earning recent earning validation
    
    @FindBy(xpath = "//div[@class='pay_table']/div/table/tbody/tr")
   	public static List<WebElement> AccountpageEarningOptionRecentEarningtableList;
    
    @FindBy(xpath = "//div[@class='pay_table']/div/table/tbody/tr[\" + i + \"]/td[4]")
   	public static WebElement AccountpageEarningOptionRecentEarningsColoumnSelect;
    
    @FindBy(xpath = "//p[contains(text(),'Gross Earnings')]/following-sibling::h2")
   	public static WebElement AccountpageEarningOptionRecentEarningsGrossEarning;
    
    
    
    //Earning Subscription plan edit option
    
    @FindBy(xpath = "//div[contains(@class,'subscription_card_wrap')]/child::div[2]/div[2]/img")
   	public static WebElement AccountpageEarningOptionAddSubscriptionPlanEditOptionClick;
    
    @FindBy(xpath = "//div[contains(@class,'body')]/child::div[4]/button")
   	public static WebElement AccountpageEarningOptionAddSubscriptionPlanEditOptionUpdateButton;
    
    @FindBy(xpath = "//button[contains(@class,'react-responsive-modal-closeButton')]/child::*")
   	public static WebElement AccountpageEarningOptionAddSubscriptionPlanEditOpionCancelClick;
    
    @FindBy(xpath = "//span[contains(@class,'MuiSlider-root MuiSlider-colorPrimary')]/child::span[8]")
   	public static WebElement AccountpageEarningOptionAddSubscriptionUpdated50PercentageSetDisCountClick;
    
    @FindBy(xpath = "//span[contains(@class,'MuiSlider-root MuiSlider-colorPrimary')]/child::span[9]")
   	public static WebElement AccountpageEarningOptionAddSubscriptionUpdated60PercentageSetDisCountClick;
    
    @FindBy(xpath = "//div[contains(@class,'MuiSnackbar-root jss18 MuiSnackbar-anchorOriginTopRight')]/child::div/div[2]")
   	public static WebElement AccountpageEarningOptionAddSubscriptionPlanEditOpionValidation;
    
    @FindBy(xpath = "//div[contains(@class,'subscription_card_wrap')]/child::div[2]/div/div")
   	public static WebElement AccountpageEarningOptionAddSubscriptionPlanEditOpionMonthValidation;
    
    @FindBy(xpath = "//div[contains(@class,'subscription_card_wrap')]/child::div[2]/div[1]/div[2]")
   	public static WebElement AccountpageEarningOptionAddSubscriptionPlanEditOpionAmountValidation;
    
    //Earning page earning Summary
    
    @FindBy(xpath = "//div[contains(@class,'pay_row pay_bot')][2]/child::div[2]/div/div/h2")
   	public static WebElement AccountpageEarningOptionEarningSummaryCommissionsOptionText;
    
    @FindBy(xpath = "//div[contains(@class,'pay_row pay_bot')][2]/child::div[4]/div/div/h2")
   	public static WebElement AccountpageEarningOptionEarningSummaryWithdrawnOptionText;
    
    
    //Change Password Option
    
    @FindBy(xpath = "//div[contains(@class,'types_wrap')]/child::a[5]")
   	public static WebElement AccountpageChangePasswordOptionClick;
    
    @FindBy(xpath = "//input[contains(@id,\'outlined-error-helper-text\')]")
   	public static WebElement AccountpageChangePasswordOptionOldPassWordBoxClick;   
    
    @FindBy(xpath = "//div[contains(@class,'input_wrap')]/child::div[2]/div/div/input")
   	public static WebElement AccountpageChangePasswordOptionNewPassWordBoxClick;  
    
    @FindBy(xpath = "//input[contains(@name,'confirm_password')]")
   	public static WebElement AccountpageChangePasswordOptionConfirmPassWordBoxClick;  
    
    @FindBy(xpath = "//div[contains(@class,'button_wrap')]/child::button")
   	public static WebElement AccountpageChangePasswordOptionChangePasswordButton;
    
    @FindBy(xpath = "//div[contains(@class,'MuiSnackbar-root jss18 MuiSnackbar-anchorOriginTopRight')]/child::div")
   	public static WebElement AccountpageChangePasswordOptionValidPssValidation;
    
    @FindBy(xpath = "//p[contains(@class,'MuiFormHelperText-root MuiFormHelperText-contained MuiFormHelperText-filled')]")
   	public static WebElement AccountpageChangePasswordOptionValidOldNewPssInvalidConfirmpssValidation;
    
    @FindBy(xpath = "//div[contains(@class,'MuiSnackbar-root jss18 MuiSnackbar-anchorOriginTopRight')]/child::div")
   	public static WebElement AccountpageChangePasswordOptionInvalidOldVlaidNewAndConfirmpssValidation;
    
    @FindBy(xpath = "//p[contains(@class,'MuiFormHelperText-root MuiFormHelperText-contained MuiFormHelperText-filled')]")
   	public static WebElement AccountpageChangePasswordOptionValidOldInvalidNewPssValidConfirmpssValidation;
    
    @FindBy(xpath = "//p[contains(@class,'MuiFormHelperText-root MuiFormHelperText-contained MuiFormHelperText-filled')]")
   	public static WebElement AccountpageChangePasswordOptionValidOldBlankNewPssValidConfirmpssValidation;
   
    @FindBy(xpath = "//p[contains(@class,'MuiFormHelperText-root MuiFormHelperText-contained MuiFormHelperText-filled')]")
   	public static WebElement AccountpageChangePasswordOptionValidOldBlankInvalidpssLimitNewAndConfirmpssValidation;
    
    //Profile Option
    
    @FindBy(xpath = "//div[contains(@class,'types_wrap')]/child::a[1]")
   	public static WebElement AccountpageProfileOption;
    
    @FindBy(xpath = "//div[contains(@class,'MuiInputBase-root MuiOutlinedInput-root')]/child::div")
   	public static WebElement AccountpageProfileOptionPrivacyClickTest;
    
    @FindBy(xpath = "//*[@id=\"menu-profile_privacy\"]/div[3]/ul/li")
   	public static List<WebElement> AccountpageProfileOptionPrivacyUOListTest;
    
    @FindBy(xpath = "//div[contains(@class,'MuiSnackbar-root jss18 MuiSnackbar-anchorOriginTopRight')]/child::div")
   	public static WebElement AccountpageProfileOptionPrivacyPublicOptionValidationTest;
    
    @FindBy(xpath = "//div[contains(@class,'MuiSnackbar-root jss18 MuiSnackbar-anchorOriginTopRight')]/child::div")
   	public static WebElement AccountpageProfileOptionPrivacyPrivateOptionValidationTest;
    
    @FindBy(xpath = "//div[contains(@class,'MuiInputBase-root MuiOutlinedInput-root MuiInputBase-formControl')]/child::input")
   	public static WebElement AccountpageProfileOptionNameBoxTest;
    
    @FindBy(xpath = "//input[contains(@name,'username')]")
   	public static WebElement AccountpageProfileOptionUserNameBoxTest;
    
    @FindBy(xpath = "//div[contains(@class,'username_link')]")
   	public static WebElement AccountpageProfileOptionUserNameLinkValidationTest;
    
    @FindBy(xpath = "//input[contains(@name,'website')]")
   	public static WebElement AccountpageProfileOptionWebsiteTest;
    
    @FindBy(xpath = "//input[contains(@name,'amazon_wishlist_url')]")
   	public static WebElement AccountpageProfileOptionAmazonWishListURLLinkTest;
    
    @FindBy(xpath = "//input[contains(@name,'amazon_wishlist_url')]")
   	public static WebElement AccountpageProfileOptionLocationBoxTest;
    
    @FindBy(xpath = "//input[contains(@name,'bio')]")
   	public static WebElement AccountpageProfileOptionAboutBoxTest;
    
    @FindBy(xpath = "//div[contains(@class,'button_wrap')]/child::button")
   	public static WebElement AccountpageProfileOptionSaveButtonTest;
    
    
    
    
 //PayMent Page
    
    @FindBy(xpath = "//div[contains(@class,'types_wrap')]/child::a[4]")
   	public static WebElement AccountpagePaymentOptionClick;
    
    @FindBy(xpath = "//div[contains(@class,'payment_icon')]/child::button")
   	public static WebElement AccountpagePaymentOptionAddNewCreditCardNumber;
    
    @FindBy(xpath = "//div[@class='CardField CardField--ltr']/child::div[2]/span/span/div/div[2]/span/input")
   	public static WebElement AccountpagePaymentOptionEnterCardNumber;
    
  
    
    @FindBy(xpath = "//span[contains(@class,'InputContainer')]/child::input")
   	public static WebElement EnterCardNumber;
    
    @FindBy(xpath = "//div[@class='CardField CardField--ltr']/child::div[2]/span[2]/span/span/input")
   	public static WebElement AccountpagePaymentOptionEnterExpiryDate;
    
    @FindBy(xpath = "//div[@class='CardField CardField--ltr']/child::div[2]/span[3]/span/span/input")
   	public static WebElement AccountpagePaymentOptionEnterCVV;
    
    @FindBy(xpath = "//div[@class='CardField CardField--ltr']/child::div[2]/span[4]/span/span/input[1]")
   	public static WebElement AccountpagePaymentOptionEnterZipCode;
    
    @FindBy(xpath = "//div[contains(@class,'payment_btn')]/child::div[2]")
   	public static WebElement AccountpagePaymentOptionEnterPayButton;
    
    @FindBy(xpath = "//div[contains(@class,'pay_row pay_bot')][2]/div/div[2]")
   	public static WebElement AccountpagePaymentOptionAddCardDeleteButton;
    
    //Recent Spendings
    @FindBy(xpath = "//div[@class='pay_table']/div/table/tr")
   	public static List<WebElement> AccountpagePaymentOptionRecentSpendingAmountsTest;
    
    @FindBy(xpath = "//div[@class='table-responsive']/table/tr[\"+i+\"]/td[4]")
   	public static WebElement AccountpagePaymentOptionRecentSpendingTableAmountColoumn;
    
    
  //Doka edit image
    
    @FindBy(xpath = "//span[contains(text(),'Done')]")
	public static WebElement DokaImageEdit;
    
    
    
    
    





}

package PAGE_OBJECT_MODEL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_BaeRoadPurchasePage {
	
	
	
	 @FindBy(xpath = "//div[contains(@class,'news_feed_container')]/child::div[1]/div[1]/a[1]")
	 public static WebElement PurchasePagePostProfileNameValidation;

	 @FindBy(xpath = "//div[contains(@class,'news_feed_container')]/child::div[1]/div[2]/div")
	 public static WebElement PurchasePagePostFeedValidation;
	 
	 @FindBy(xpath = "//div[contains(@class,'news_feed_container')]/child::div[1]/div[2]/div[2]")
	 public static WebElement PurchasePagePostMoneyValidation;
	 
	 @FindBy(xpath = "//div[contains(@class,'news_feed_container')]/child::div[1]/div[2]/div[3]")
	 public static WebElement PurchasePagePostDateValidation;
	 
	 @FindBy(xpath = "//div[contains(@class,'news_feed_container')]/child::div[2]/div[2]/div")
	 public static WebElement PurchasePagePostTextValidation;
	 
	 
	 
	 
	 
}

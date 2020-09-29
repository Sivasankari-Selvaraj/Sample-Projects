package PAGE_OBJECT_MODEL;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_BaeRoadAdminPanel {
	
	
	@FindBy(id="email")
	public static WebElement UserName;
	
	@FindBy(id="password")
	public static WebElement Password;

	@FindBy(xpath="//button[contains(@class,'MuiButtonBase-root MuiButton-root jss6')]")
	public static WebElement LoginButton;
	
	
	@FindBy(xpath="//a[contains(@href,'/admin/complaints_feedback')]/child::li")
	public static WebElement SuuportReq;
	
	@FindBy(xpath="//table[contains(@class,'MuiTable-root jss11')]/child::tbody/tr")
	public static List<WebElement> SupportReqTables;
	
	@FindBy(xpath="//table[contains(@class,'MuiTable-root jss11')]/child::tbody/tr[\\\"+i+\\\"]/td[3]")
	public static List<WebElement> SupportReqTablesColoumn;
}

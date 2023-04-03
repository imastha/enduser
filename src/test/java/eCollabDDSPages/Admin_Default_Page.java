package eCollabDDSPages;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Admin_Default_Page {
	WebDriver driver;

	public Admin_Default_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='col_hos']")
	private WebElement myProfileIcon;

	@FindBy(xpath = "/html/body/div[1]/div/p/button[1]")
	private WebElement homeIcon;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[1]/li/div/a[3]")
	private WebElement logoutIcon;

	@FindBy(xpath = "//*[@id='cardbgcase']/h7")
	private WebElement casesVcard;
	
	@FindBy(xpath = "//*[@id='countcase']")
	private WebElement casesVcardCount;

	@FindBy(xpath = "//*[@id='cardbgorgan']/h7")
	private WebElement coVcard;
	
	@FindBy(xpath = "//*[@id='countorgan']")
	private WebElement coVcardCount;

	@FindBy(xpath = "//*[@id='cardbgclient']/h7")
	private WebElement caVcard;
	
	@FindBy(xpath = "//*[@id='countclient']")
	private WebElement caVcardCount;

	@FindBy(xpath = "//*[@id='cardbghospitals']/h7")
	private WebElement hosVcard;
	
	@FindBy(xpath = "//*[@id='counthospital']")
	private WebElement hosVcardCount;

	@FindBy(xpath = "//*[@id='cardbguser']/h7")
	private WebElement hosUserVcard;
	
	@FindBy(xpath = "//*[@id='countuser']")
	private WebElement hosUserVcardCount;

	public void Admin_myProfile_button(SoftAssert Assert) {
		myProfileIcon.isDisplayed();
		myProfileIcon.isEnabled();
	    Assert.assertEquals(myProfileIcon.getAttribute("title"), "Account","Failed: Admin_Account_Button, title test fail ,");
		myProfileIcon.click();

	}

	public void Admin_Home_Button(SoftAssert Assert) {
		homeIcon.isDisplayed();
		homeIcon.isEnabled();
	    Assert.assertEquals(homeIcon.getAttribute("title"), "Home","Failed: Admin_Home_Button, title test fail ,");
		homeIcon.click();
	}
	
	public void Admin_Logout_Button(SoftAssert Assert) {
		logoutIcon.isDisplayed();
		logoutIcon.isEnabled();
	    //logoutIcon.click();
	}

	public void Admin_Default_Page_vCards(SoftAssert Assert) {
		Assert.assertEquals(casesVcard.getText(), "CASES", "Failed: Admin_Default_Page_vCards ,");
		Assert.assertEquals(coVcard.getText(), "CLIENT ORGANIZATIONS", "Failed: Admin_Default_Page_vCards ,");
		Assert.assertEquals(caVcard.getText(), "CLIENT APPLICATIONS", "Failed: Admin_Default_Page_vCards ,");
		Assert.assertEquals(hosVcard.getText(), "HOSPITALS", "Failed: Admin_Default_Page_vCards ,");
		Assert.assertEquals(hosUserVcard.getText(), "HOSPITAL USERS", "Failed: Admin_Default_Page_vCards ,");
	}
	
	public void Admin_Dafault_Page_vCardsCounts(SoftAssert Assert) throws IOException{
		String casesVcardCount1=casesVcardCount.getText();
		String coVcardCount1=coVcardCount.getText();
		String caVcardCount1=caVcardCount.getText();
		String hosVcardCount1=hosVcardCount.getText();
		String hosUserVcardCount1=hosUserVcardCount.getText();
		Properties properties = new Properties();
		FileOutputStream outputstream = new FileOutputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\adminVcardCounts.properties");
		properties.setProperty("casesVcardCount", casesVcardCount1);
		properties.setProperty("coVcardCount", coVcardCount1);
		properties.setProperty("caVcardCount", caVcardCount1);
		properties.setProperty("hosVcardCount", hosVcardCount1);
		properties.setProperty("hosUserVcardCount", hosUserVcardCount1);
		properties.store(outputstream, null);
	}
}

package radiologistPages;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Radio_Default_Page {
	
	WebDriver driver;

	public Radio_Default_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/div[1]/div/p/button")
	private WebElement homeIcon;
	
	@FindBy(xpath = "//*[@id='cardbgpending']/h6[1]")
	private WebElement pendingVcard;
	
	@FindBy(xpath = "//*[@id='countpending']")
	private WebElement pendingCount;
	
	@FindBy(xpath = "//*[@id='cardbgcomplete']/h6[1]")
	private WebElement completedVcard;
	
	@FindBy(xpath = "//*[@id='countcomplete']")
	private WebElement completedCount;
	
	@FindBy(xpath = "//*[@id='cardbgreject']/h6[1]")
	private WebElement rejectedVcard;
	
	@FindBy(xpath = "//*[@id='countreject']")
	private WebElement rejectedCount;
	
	@FindBy(xpath = "//*[@id='cardbghistory']/h6[1]")
	private WebElement reassignVcard;
	
	@FindBy(xpath = "//*[@id='cardbgtotal']/h6[1]")
	private WebElement totalVcard;
	
	@FindBy(xpath = "//*[@id='counttotal']")
	private WebElement totalCount;

	public void radio_Home_button(SoftAssert Assert) {
		homeIcon.isDisplayed();
		homeIcon.isEnabled();
	    Assert.assertEquals(homeIcon.getAttribute("title"), "Home","Failed: Radio_Home_Button, title test fail ,");
		homeIcon.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	public void radio_Default_vCards(SoftAssert Assert) {
		Assert.assertEquals(totalVcard.getText(), "TOTAL", "Total vCard is missing. ");
		Assert.assertEquals(pendingVcard.getText(), "PENDING", "PENDING vCard is missing. ");
		Assert.assertEquals(completedVcard.getText(), "COMPLETED", "COMPLETED vCard is missing. ");
		Assert.assertEquals(rejectedVcard.getText(), "REJECTED", "REJECTED vCard is missing. ");
		Assert.assertEquals(reassignVcard.getText(), "REASSIGNED", "REASSIGNED vCard is missing. ");	
	}

	public void radio_Default_vCards_Count(SoftAssert Assert) throws IOException {
		String totalCount1=totalCount.getText();
		String pendingCount1=pendingCount.getText();
		String completeCount1=completedCount.getText();
		String rejectedCount1=rejectedCount.getText();
		Properties properties = new Properties();
		FileOutputStream outputstream = new FileOutputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\endUserProperties\\radioVcardCounts.properties");
		properties.setProperty("totalCount", totalCount1);
		properties.setProperty("pendingCount", pendingCount1);
		properties.setProperty("completeCount", completeCount1);
		properties.setProperty("rejectedCount", rejectedCount1);
		properties.store(outputstream, null);
		
	}

}

package endUserPages;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class EndUser_Default_Page {
	WebDriver driver;

	public EndUser_Default_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/div[1]/div[1]/p/button[1]")
	private WebElement homeIcon;
	
	@FindBy(xpath = "//*[@id='cardbgpending']/h6[1]")
	private WebElement pendingVcard;
	
	@FindBy(xpath = "//*[@id='countpending']")
	private WebElement pendingCount;
	
	@FindBy(xpath = "//*[@id='cardbgcomplete']/h6[1]")
	private WebElement completeVcard;
	
	@FindBy(xpath = "//*[@id='countcomplete']")
	private WebElement completeCount;
	
	@FindBy(xpath = "//*[@id='cardbgreject']/h6[1]")
	private WebElement rejectedVcard;
	
	@FindBy(xpath = "//*[@id='countreject']")
	private WebElement rejectedCount;
	
	@FindBy(xpath = "//*[@id='cardbgpatient']/h6[1]")
	private WebElement patientVcard;
	
	@FindBy(xpath = "//*[@id='countpatient']")
	private WebElement patientCount;
	
	@FindBy(xpath = "//*[@id='cardbghistory']/h6[1]")
	private WebElement caseRequestVcard;
	
	@FindBy(xpath = "//*[@id='cardbgtotal']/h6[1]")
	private WebElement totalVcard;
	
	@FindBy(xpath = "//*[@id='counttotal']")
	private WebElement totalCount;
	
	

	public void EU_Home_button(SoftAssert Assert) throws InterruptedException {
		homeIcon.isDisplayed();
		Thread.sleep(2000);
		homeIcon.isEnabled();
		Thread.sleep(2000);
	    Assert.assertEquals(homeIcon.getAttribute("title"), "Home","Failed: EndUser_Home_Button, title test fail ,");
		homeIcon.click();
	}

	public void EU_Default_vCards(SoftAssert Assert) throws InterruptedException {
		Assert.assertEquals(totalVcard.getText(), "TOTAL", "Total vCard is missing. ");
		Thread.sleep(2000);
		Assert.assertEquals(pendingVcard.getText(), "PENDING", "PENDING vCard is missing. ");
		Thread.sleep(2000);
		Assert.assertEquals(completeVcard.getText(), "COMPLETED", "COMPLETED vCard is missing. ");
		Thread.sleep(2000);
		Assert.assertEquals(rejectedVcard.getText(), "REJECTED", "REJECTED vCard is missing. ");
		Thread.sleep(2000);
		Assert.assertEquals(patientVcard.getText(), "PATIENT", "PATIENT vCard is missing. ");
		Thread.sleep(2000);
		Assert.assertEquals(caseRequestVcard.getText(), "CASE REQUEST", "CASE REQUEST vCard is missing. ");
	}

	public void EU_Default_vCards_Count(SoftAssert Assert) throws IOException, InterruptedException {
		String totalCount1=totalCount.getText();
		Thread.sleep(2000);
		String pendingCount1=pendingCount.getText();
		Thread.sleep(2000);
		String completeCount1=completeCount.getText();
		Thread.sleep(2000);
		String rejectedCount1=rejectedCount.getText();
		Thread.sleep(2000);
		String patientCount1=patientCount.getText();
		Thread.sleep(2000);
		Properties properties = new Properties();
		FileOutputStream outputstream = new FileOutputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\endUserProperties\\euVcardCounts.properties");
		properties.setProperty("totalCount", totalCount1);
		properties.setProperty("pendingCount", pendingCount1);
		properties.setProperty("completeCount", completeCount1);
		properties.setProperty("rejectedCount", rejectedCount1);
		properties.setProperty("patientCount", patientCount1);
		properties.store(outputstream, null);
		
	}

}

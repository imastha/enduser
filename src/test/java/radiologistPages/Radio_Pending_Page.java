package radiologistPages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Radio_Pending_Page {

	WebDriver driver;

	public Radio_Pending_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='cardbgpending']/h6[1]")
	private WebElement pendingVcard;

	@FindBy(xpath = "//*[@id='tblPendingCases_wrapper']/div[2]/button[1]")
	private WebElement hideColumn;

	@FindBy(xpath = "//*[@id='tblPendingCases_wrapper']/div[2]/div[2]/button[1]")
	private WebElement hideCaseId;

	@FindBy(xpath = "//*[@id='tblPendingCases_wrapper']/div[2]/div[1]")
	private WebElement background;

	@FindBy(xpath = "//*[@id='tblPendingCases_wrapper']/div[3]/div[1]/div/table/thead/tr/th[1]")
	private WebElement headerOne;

	@FindBy(xpath = "//*[@id='tblPendingCases_wrapper']/div[2]/button[2]")
	private WebElement resetButton;

	@FindBy(xpath = "//*[@id='tblPendingCases_wrapper']/div[2]/button[3]")
	private WebElement filterButton;

	@FindBy(xpath = "//*[@id='tblusrdashindexcase0']")
	private WebElement caseIdSearchBox;

	@FindBy(xpath = "//*[@id='popupclose']")
	private WebElement filterCloseButton;

	@FindBy(xpath = "//*[@id='pending_reviewer_tbl']/tr/td[1]")
	private WebElement caseIdResult;
	
	@FindBy(xpath = "//*[@id='pending_reviewer_tbl']/tr/td[2]")
	private WebElement domainResult;
	
	@FindBy(xpath = "//*[@id='pending_reviewer_tbl']/tr/td[6]")
	private WebElement imageTypeResult;
	
	@FindBy(xpath = "//*[@id='pending_reviewer_tbl']/tr[1]/td[8]/button")
	private WebElement viewButton;
	
	@FindBy(xpath = "//*[@id='report']")
	private WebElement reportTextbox;
	
	@FindBy(xpath = "//*[@id='impression']")
	private WebElement impressionTextbox;
	
	@FindBy(xpath = "//*[@id='completeReview']")
	private WebElement saveReport;
	
	@FindBy(xpath = "//*[@id='closeBtn']")
	private WebElement closeReport;
	
	@FindBy(xpath = "//*[@id='xx']/div[1]/div/div[5]")
	private WebElement dicomButton;
	
	@FindBy(xpath = "//*[@id='toolbox']")
	private WebElement toolboxButton;
	
	@FindBy(xpath = "//*[@id='addannotation']")
	private WebElement reportFormButton;
	
	@FindBy(xpath = "//*[@id='msgclose']")
	private WebElement msgClose;
	
	@FindBy(xpath = "//*[@id='backbutton']/div[1]")
	private WebElement backButton;
	
	

	public void open_Pending_Vcard(SoftAssert Assert) {
		// TODO Auto-generated method stub
		Assert.assertTrue(pendingVcard.isDisplayed(), "Radiologist pending vcard not displayed. ,");
		if (pendingVcard.isDisplayed()) {
			pendingVcard.click();
		}

	}

	public void hideColumn_validation(SoftAssert Assert) {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.elementToBeClickable(hideColumn));
		Assert.assertTrue(hideColumn.isDisplayed(), "Radiologist hideColumn button not displayed. ,");
		hideColumn.click();
		Assert.assertTrue(hideCaseId.isDisplayed(), "Radiologist hideCaseId button not displayed. ,");
		hideCaseId.click();
		background.click();
		Assert.assertNotEquals(headerOne.getText(), "CaseId", "Hide Column not working. ,");
	}

	public void search_Open_Pending_Case(SoftAssert Assert) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream inputStream = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\endUserProperties\\caseDetails.properties");
		Properties property = new Properties();
		property.load(inputStream);
		String caseId = property.getProperty("caseId");
		System.out.println("caseId is " + caseId);
		resetButton.click();
		Assert.assertTrue(filterButton.isDisplayed(), "Radiologist filter button not displayed. ,");
		if (filterButton.isDisplayed()) {
			filterButton.click();
			caseIdSearchBox.sendKeys(caseId);
			filterCloseButton.click();
			Assert.assertEquals(caseIdResult.getText(), caseId, "Searched and resulted caseId is not matching. ,");
			String domain = domainResult.getText();
			String imageType = imageTypeResult.getText();
			viewButton.click();
			WebDriverWait wait= new WebDriverWait(driver, 6);
			wait.until(ExpectedConditions.visibilityOf(impressionTextbox));
			if(imageType.equals("Image and DICOM"))
			{
				closeReport.click();
				dicomButton.click();
				Thread.sleep(10000);
				//wait.until(ExpectedConditions.elementToBeClickable(toolboxButton));
				toolboxButton.click();
				reportFormButton.click();
			}
			reportTextbox.sendKeys(domain);
			impressionTextbox.sendKeys(imageType);
			saveReport.click();
			wait.until(ExpectedConditions.visibilityOf(msgClose));
			wait.until(ExpectedConditions.elementToBeClickable(msgClose));
			msgClose.click();
			backButton.click();
		}

	}
}

package radiologistPages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Radio_Completed_Page {

	WebDriver driver;
	public Radio_Completed_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='cardbgcomplete']/h6[1]")
	private WebElement completedVcard;
	
	@FindBy(xpath = "//*[@id='tblCompletedCases_wrapper']/div[2]/button[1]")
	private WebElement hideButton;
	
	@FindBy(xpath = "//*[@id='tblCompletedCases_wrapper']/div[2]/div[2]/button[1]")
	private WebElement caseIdButton;
	
	@FindBy(xpath = "//*[@id='tblCompletedCases_wrapper']/div[2]/div[1]")
	private WebElement background;
	
	@FindBy(xpath = "//*[@id='tblCompletedCases_wrapper']/div[3]/div[1]/div/table/thead/tr/th[1]")
	private WebElement firstColumn;
	
	@FindBy(xpath = "//*[@id='tblCompletedCases_wrapper']/div[2]/button[2]")
	private WebElement resetButton;
	
	@FindBy(xpath = "//*[@id='tblCompletedCases_wrapper']/div[2]/button[3]")
	private WebElement filterButton;
	
	@FindBy(xpath = "//*[@id='tblusrdashindexcase0']")
	private WebElement caseIdSearchBox;
	
	@FindBy(xpath = "//*[@id='popupclose']")
	private WebElement filterCloseButton;
	
	@FindBy(xpath = "//*[@id='completed_reviewer_tbl']/tr/td[1]")
	private WebElement caseIdResult;
	
	@FindBy(xpath = "//*[@id='completed_reviewer_tbl']/tr[1]/td[9]/button")
	private WebElement viewButton;
	
	@FindBy(xpath = "//*[@id='completed_reviewer_tbl']/tr[1]/td[10]/button")
	private WebElement reportButton;
	
	@FindBy(xpath = "//*[@id='completed_reviewer_tbl']/tr[1]/td[11]/button")
	private WebElement detailButton;
	
	@FindBy(xpath = "//*[@id='TDstatus']")
	private WebElement status;
	
	@FindBy(xpath = "//*[@id='downloadReport']")
	private WebElement reportDDownload;
	
	@FindBy(xpath = "//*[@id='col_hos']")
	private WebElement accountIcon;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[1]/div/a[3]")
	private WebElement logout;



	public void open_Completed_Vcard(SoftAssert Assert) {
		// TODO Auto-generated method stub
		Assert.assertEquals(completedVcard.getText(), "COMPLETED", "Completed vcard missing. ,");
		Assert.assertTrue(completedVcard.isDisplayed(), "Completed vcard not displayed. ,");
		if(completedVcard.isDisplayed())
		{
			completedVcard.click();
		}
	}

	public void hideColumn_validation(SoftAssert Assert) {
		// TODO Auto-generated method stub
		hideButton.click();
		Assert.assertTrue(caseIdButton.isDisplayed(), "caseIdButton not displayed in hide Coloumn. ,");
		if(caseIdButton.isDisplayed())
			caseIdButton.click();
		background.click();
		Assert.assertNotEquals(firstColumn.getText(), "Case ID", "Hide Column functionality not working. ,");
	}

	public void completed_case_Validation(SoftAssert Assert) throws IOException {
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
			reportButton.click();
			detailButton.click();
			Assert.assertEquals(status.getText(), "COMPLETED", "Status is incorrect in details. ,");
			Assert.assertTrue(reportDDownload.isDisplayed(), "Report download option in details is missing. ,");
			if(reportDDownload.isDisplayed())
				reportDDownload.click();
			accountIcon.click();
			logout.click();
		}
		
	}

}

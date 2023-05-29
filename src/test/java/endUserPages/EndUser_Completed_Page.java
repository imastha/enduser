package endUserPages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class EndUser_Completed_Page {

	WebDriver driver;

	public EndUser_Completed_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='cardbgcomplete']")
	private WebElement completedVcard;

	@FindBy(xpath = "//button[@class='dt-button buttons-collection buttons-colvis tableButton']")
	private WebElement hideColumnButton;

	@FindBy(xpath = "//*//span[normalize-space()='Case ID']")
	private WebElement caseIdButton;

	@FindBy(xpath = "//label[@id='completecase']")
	private WebElement allButton;

	@FindBy(xpath = "//b[normalize-space()='Completed Cases']")
	private WebElement background;

	@FindBy(xpath = "//*[@id='tblCompletedCases_wrapper']/div[3]/div[1]/div/table/thead/tr/th[1]")
	private WebElement firstColumn;

	@FindBy(xpath = "//button[@title='Reset The Table']")
	private WebElement resetButton;

	@FindBy(xpath = "//*//button[@title='Filter Data']")
	private WebElement filterButton;

	@FindBy(xpath = "//*//button[@title='Reload Table Data']")
	private WebElement refreshButton;

	@FindBy(xpath = "//*//input[@id='tblusrdashindexcase0']")
	private WebElement caseIdSearchBox;

	@FindBy(xpath = "//input[@id='popupclose']")
	private WebElement filterCloseButton;

	@FindBy(xpath = "//*[@id='completed_reviewer_tbl']/tr[1]/td[1]")
	private WebElement caseIdResult;

	@FindBy(xpath = "//tbody/tr[@role='row']/td[12]/button[1]")
	private WebElement detailButton;

	@FindBy(xpath = "//*[@id='completed_reviewer_tbl']/tr[1]/td[9]/button")
	private WebElement viewButton;

	@FindBy(xpath = "//*[@id='completed_reviewer_tbl']/tr[1]/td[10]/button")
	private WebElement reportButton;

	@FindBy(xpath = "//*[@id='TEstatus']")
	private WebElement status;

	@FindBy(xpath = "//*[@id='downloadReport']")
	private WebElement reportDDownload;

	@FindBy(xpath = "//*[@id='col_hos']")
	private WebElement accountIcon;

	@FindBy(xpath = "/html/body/div[1]/div/div[1]/div/a[3]")
	private WebElement logout;

	@FindBy(xpath = "(//i)[4]")
	private WebElement Viewbtn;

	@findby(xpath = "(//div[@class='toggffpicon']//i[@class='fa fa-arrow-left']")
	private WebElement ViewBackbtn;

	@findby(xpath = "(//i[@class='fa fa-edit'])[1]")
	private WebElement detailsbtn;

	@findby(xpath = "(//button[@type='button'])[8]")
	private WebElement Actionbtn;

	@findby(xpath = "(//tbody/tr[1]/td[11]/button[1]/i[1]]")
	private WebElement reportbtn;

	@findby(xpath = "((//i[@class='fa fa-edit'])[1]")
	private WebElement detailtbtn;

	public void open_Completed_vcard(SoftAssert Assert) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, 50, 5000);
		WebElement completedVcard = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='cardbgcomplete']")));
		completedVcard.click();

		Assert.assertEquals(completedVcard.getText(), "COMPLETED", "Completed vcard is missing. ,");
		Assert.assertTrue(completedVcard.isDisplayed(), "Completed vcard is not displayed. ,");
		if (completedVcard.isDisplayed()) {
			// Thread.sleep(3000);
			// completedVcard.click();
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(100,500)");
		}
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(
				"document.querySelector(\"div[style='position: relative; overflow: auto; width: 100%;']\").scrollLeft=300\r\n");
	}

	public void Completed_Viewbtn(SoftAssert Assert) throws InterruptedException {
		WebElement Viewbtn = driver.findElement(By.xpath("(//i)[4]"));
		Thread.sleep(2000);
		Viewbtn.click();
		Thread.sleep(2000);

		WebElement ViewBackbtn = driver
				.findElement(By.xpath("//div[@class='toggffpicon']//i[@class='fa fa-arrow-left']"));
		ViewBackbtn.click();
		System.out.println(3);
		Thread.sleep(3000);

		WebElement completedVcard1 = driver.findElement(By.xpath("//div[@id='cardbgcomplete']"));
		completedVcard1.click();

		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(100,400)");
		Thread.sleep(2000);
		JavascriptExecutor js111 = (JavascriptExecutor) driver;
		js111.executeScript(
				"document.querySelector(\"div[style='position: relative; overflow: auto; width: 100%;']\").scrollLeft=300\r\n");
//		Thread.sleep(3000);
//		WebElement reportbtn = driver.findElement(By.xpath("(//tbody/tr[1]/td[11]/button[1]/i[1]"));
//				
//		reportbtn.click();

		Thread.sleep(2000);
		WebElement detailtbtn = driver.findElement(By.xpath("(//i[@class='fa fa-edit'])[1]"));
		detailtbtn.click();

	}

	public void completed_case_Validation(SoftAssert assert1) {
		// TODO Auto-generated method stub

	}

	public void hideColumn_Validation(SoftAssert assert1) {
		// TODO Auto-generated method stub

	}

	
		
	}

//
//	public void completed_case_Validation(SoftAssert Assert) throws IOException, InterruptedException {
//		// TODO Auto-generated method stub
//
//		Thread.sleep(3000);
//		allButton.click();
//
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript(
//				"document.querySelector(\"div[style='position: relative; overflow: auto; width: 100%;']\").scrollLeft=300\r\n");
//
////			JavascriptExecutor js= (JavascriptExecutor) driver;
////			js.executeScript("document.querySelector(\"div[style='position: relative; overflow: auto; width: 100%;']\").scrollLeft=300\r\n");
////			Thread.sleep(3000);
//		detailButton.click();
//
//		FileInputStream inputStream = new FileInputStream(
//				System.getProperty("user.dir") + "\\src\\test\\resources\\endUserProperties\\caseDetails.properties");
//		Properties property = new Properties();
//		property.load(inputStream);
//		String caseId = property.getProperty("caseId");
//		System.out.println("caseId is " + caseId);
//		resetButton.click();
//		Assert.assertTrue(filterButton.isDisplayed(), "EU Completed filter button not displayed. ,");
//		if (filterButton.isDisplayed()) {
//			filterButton.click();
//			caseIdSearchBox.sendKeys(caseId);
//			filterCloseButton.click();
//			Assert.assertEquals(caseIdResult.getText(), caseId, "Searched and resulted caseId is not matching. ,");
//			reportButton.click();
//			detailButton.click();
//			Assert.assertEquals(status.getText(), "COMPLETED", "Status is incorrect in details. ,");
//			Assert.assertTrue(reportDDownload.isDisplayed(), "Report download option in details is missing. ,");
//			if (reportDDownload.isDisplayed())
//				reportDDownload.click();
//			accountIcon.click();
//			logout.click();
//		}
//	}
//
//	public void hideColumn_Validation(SoftAssert Assert) throws IOException, InterruptedException {
//		// TODO Auto-generated method stub
//		Assert.assertTrue(hideColumnButton.isDisplayed(), "HideColumn Button is not displayed. ,");
//		Assert.assertTrue(hideColumnButton.isEnabled(), "HideColumn Button is not enabled. ,");
//		if (hideColumnButton.isDisplayed() && hideColumnButton.isEnabled()) {
//			Thread.sleep(2000);
//			hideColumnButton.click();
//			Assert.assertTrue(caseIdButton.isDisplayed(), "CaseId Button is not displayed. ,");
//			Assert.assertTrue(caseIdButton.isEnabled(), "CaseId Button is not enabled. ,");
//			if (caseIdButton.isDisplayed() && caseIdButton.isEnabled()) {
//				Thread.sleep(2000);
//				caseIdButton.click();
//				Thread.sleep(2000);
//				background.click();
//				// Assert.assertNotEquals(firstColumn.getText(), "Case Id", "Hide Column is not
//				// working. ,");
//			}
//		}
//	}
//
//}

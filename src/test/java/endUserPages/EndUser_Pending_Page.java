package endUserPages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.util.Assert;

public class EndUser_Pending_Page {
	WebDriver driver;

	public EndUser_Pending_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@findby(xpath = "//div[@id='cardbgpending']")
	private WebElement pendingcard;

	@findby(xpath = "//div[@id='cardbgpending']")
	private WebElement pendingcard1;

	@findby(xpath = "//label[@id='pendingcase']")
	private WebElement Allbtn;

	@findby(xpath = "//div[@id='tblPendingCases_wrapper']//div[@class='dataTables_scrollBody']")
	private WebElement sidescroll;

	@findby(xpath = "(//i)[5]")
	private WebElement detailsbtn;

	@findby(xpath = "(//button[@id='btnimage'])[2]")
	private WebElement details_img_btn;

	@findby(xpath = "//tr[@id='TRimages']//button[@id='btndicom']")
	private WebElement details_dicom_btn;

	@findby(xpath = "//tr[@id='TRimages']//button[@id='btnpdf']")
	private WebElement details_pdf_btn;

	@findby(xpath = "(//button[@type='button'])[6]")
	private WebElement Viewbtn;

	@findby(xpath = "(//div[@class='toggffpicon']")
	private WebElement ViewBackbtn;

	@findby(xpath = "((//i)[6]")
	private WebElement Actionbtn;

	@findby(xpath = "(//label[contains(@class,'btn nicbgcolor pendingcase')][normalize-space()='Today']]")
	private WebElement Todaybtn;

	@findby(xpath = "(//label[@class='btn nicbgcolor pendingcase'])[1]")
	private WebElement Yesterdaybtn;

	@findby(xpath = "(//div[@class='dataTables_scroll']")
	private WebElement table;

	@findby(xpath = "(//td[@id='TEstatus']")
	private WebElement currentstatus;

	@findby(xpath = "(//td[@id='TEcaseId']")
	private WebElement caseid;

	@findby(xpath = "//div[@class='dataTables_scroll']")
	private WebElement requesteddate;

	@findby(xpath = "//div[@class='dataTables_scroll']")
	private WebElement assigneddate;

	@findby(xpath = "//td[@id='TEradiologist']")
	private WebElement assignedto;

	@findby(xpath = "//td[@id='TEpatientId']")
	private WebElement patientid;

	public void open_Pending_vcard(SoftAssert assert1) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 20, 1000);
		WebElement pendingcard = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[ @id='cardbgpending']")));

		pendingcard.click();
		WebElement pendingcard1 = driver.findElement(By.xpath("//div[ @id='cardbgpending']"));
		// Display pending card
		assertTrue(pendingcard1.isDisplayed());
		System.out.println("Pending card is displayed");

		// Pending card Count
		int expectedCount = 6;
		WebElement countElement = driver.findElement(By.id("card-count"));
		int actualCount = Integer.parseInt(countElement.getText());
		assertEquals(expectedCount, actualCount);
		System.out.println("Pending Count is correct");

		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(100,400)");
		Thread.sleep(2000);
	}

	public void Pending_allbtn(SoftAssert assert1) throws InterruptedException {

		WebDriverWait wait1 = new WebDriverWait(driver, 20, 1000);
		WebElement Allbtn = wait1
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[@id='pendingcase']")));
		Allbtn.click();
		Thread.sleep(3000);

		// Verify Table Data
//		  WebElement table = driver.findElement(By.xpath("//div[@class='dataTables_scroll']"));
//		
//		  List rows = (List) table.findElements(By.tagName("tr"));
//		  java.util.List<WebElement> rows1 = table.findElements(By.tagName("tr"));
//		

		System.out.println(1);
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(
				"document.querySelector(\"div[style='position: relative; overflow: auto; width: 100%;']\").scrollLeft=300\r\n");

		System.out.println(2);
	}

	public void Pending_Viewbtn(SoftAssert assert1) throws InterruptedException {

		WebElement Viewbtn = driver.findElement(By.xpath("(//button[@type='button'])[6]"));
		Viewbtn.click();
		Thread.sleep(2000);
		assertTrue(Viewbtn.isDisplayed());
		System.out.println("View icon is displayed");
		Thread.sleep(3000);
		WebElement ViewBackbtn = driver.findElement(By.xpath("//div[@class='toggffpicon']"));
		ViewBackbtn.click();
		System.out.println(3);
		
		WebElement pendingcard = driver.findElement(By.xpath("//div[@id='cardbgpending']"));
		pendingcard.click();

		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(100,400)");
		Thread.sleep(2000);
		JavascriptExecutor js11 = (JavascriptExecutor) driver;
		js11.executeScript(
				"document.querySelector(\"div[style='position: relative; overflow: auto; width: 100%;']\").scrollLeft=300\r\n");
	}

	public void Pending_Detailsbtn(SoftAssert assert1) throws InterruptedException {
		Thread.sleep(3000);
		
		WebElement detailsbtn = driver.findElement(By.xpath("(//i)[5]"));
		detailsbtn.click();
		Thread.sleep(2000);
		assertTrue(detailsbtn.isDisplayed());
		System.out.println("Detail button is displayed");
		JavascriptExecutor js111 = (JavascriptExecutor) driver;
		js111.executeScript("window.scrollBy(100,400)");

		// Verify details of case data
		WebElement currentstatus = driver.findElement(By.xpath("//td[@id='TEstatus']"));
		String actualTitle = currentstatus.getText();	
		String expectedTitle = "PENDING";
		assertEquals(actualTitle, expectedTitle, "current  status is incorrect");
		System.out.println("current status is"+ "");
		
		// scrollup
		JavascriptExecutor js1111 = (JavascriptExecutor) driver;
		js1111.executeScript("window.scrollBy(400,100)");

		Thread.sleep(5000);
		WebElement pendingcard1 = driver.findElement(By.xpath("//div[@id='cardbgpending']"));
		pendingcard1.click();

		Thread.sleep(2000);
		JavascriptExecutor js11111 = (JavascriptExecutor) driver;
		js11111.executeScript("window.scrollBy(100,400)");
		Thread.sleep(2000);
		JavascriptExecutor js111111 = (JavascriptExecutor) driver;
		js111111.executeScript(
				"document.querySelector(\"div[style='position: relative; overflow: auto; width: 100%;']\").scrollLeft=300\r\n");
	}

	public void Pending_Actionbtn(SoftAssert assert1) throws InterruptedException {
		Thread.sleep(3000);
		
		Thread.sleep(2000);
		WebElement Actionbtn = driver.findElement(By.xpath("(//i)[6]"));
		Actionbtn.click();
		assertTrue(Actionbtn.isDisplayed());
		System.out.println("Action button is displayed");
		Thread.sleep(2000);
		JavascriptExecutor js1111111 = (JavascriptExecutor) driver;
		js1111111.executeScript("window.scrollBy(100,400)");
		Thread.sleep(2000);
		JavascriptExecutor js11111111 = (JavascriptExecutor) driver;
		js11111111.executeScript("window.scrollBy(100,400)");
		Thread.sleep(2000);
		JavascriptExecutor js111111111 = (JavascriptExecutor) driver;
		js111111111.executeScript("window.scrollBy(400,100)");

		Thread.sleep(5000);
		WebElement pendingcard1 = driver.findElement(By.xpath("//div[@id='cardbgpending']"));
		pendingcard1.click();
		System.out.println(4);
	}

	public void Pending_Todaybtn(SoftAssert assert1) throws InterruptedException {
		
		WebElement Todaybtn = driver.findElement(
				By.xpath("//label[contains(@class,'btn nicbgcolor pendingcase')][normalize-space()='Today']"));
		Todaybtn.click();
		assertTrue(Todaybtn.isDisplayed());
		System.out.println("Today button is displayed");
		System.out.println(5);
	}

	public void Pending_Yesterdaybtn(SoftAssert assert1) throws InterruptedException {
		
		Thread.sleep(3000);
		WebElement Yesterdaybtn = driver.findElement(By.xpath("(//label[@class='btn nicbgcolor pendingcase'])[1]"));
		Yesterdaybtn.click();
		assertTrue(Yesterdaybtn.isDisplayed());
		System.out.println("Yesterday button is displayed");
		System.out.println(6);
	}

	private JavascriptExecutor getDriver() {
		// TODO Auto-generated method stub
		return null;
	}

}
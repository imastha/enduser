package endUserPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class EndUser_Pending_Page {
	WebDriver driver;

	public EndUser_Pending_Page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@findby(xpath="//p[normalize-space()='0']")
	private WebElement pendingVcard;
	
	@findby(xpath="//label[@id='pendingcase']")
	private WebElement Allbtn;
	

	@findby(xpath="//div[@id='tblPendingCases_wrapper']//div[@class='dataTables_scrollBody']")
	private WebElement sidescroll;
	
	@findby(xpath="//body[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[3]/div[2]/table[1]/tbody[1]/tr[1]/td[11]/button[1]/i[1]")
	private WebElement detailsicon;
	
	@findby(xpath="//tr[@id='TRimages']//button[@id='btnimage']")
	private WebElement details_img_btn;
	
	@findby(xpath="//tr[@id='TRimages']//button[@id='btndicom']")
	private WebElement details_dicom_btn;
	
	@findby(xpath="//tr[@id='TRimages']//button[@id='btnpdf']")
	private WebElement details_pdf_btn;
	
	//download file use after pdf btn click
	
//	  <!-- @findby(xpath="")
//	private WebElement tdfgfext;
	
//	@findby(xpath="")
//	private WebElement tegfxt;
	
	//@findby(xpath="")
	//private WebElement tegfbhxt;
	
	//@findby(xpath="")
//	private WebElement tfghext;
	
//	@findby(xpath="")
//	private WebElement tefghxt; 
	
	public void open_Pending_vcard(SoftAssert assert1) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		pendingVcard.click();
		Thread.sleep(2000);
		Allbtn.click();
		 WebElement table = driver.findElement(By.id("tblPendingCases"));
		 Actions actions = new Actions(driver);
	        actions.moveToElement(table).clickAndHold().moveByOffset(500, 0).release().perform();
		

	}	
}
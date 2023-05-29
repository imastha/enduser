package radiologistPages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Radio_Rejected_Pages {

	WebDriver driver;
	public Radio_Rejected_Pages(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@id='cardbgreject']")
	private WebElement rejectVcard;
	
	@FindBy(xpath = "//label[@id='rejectcase']")
	private WebElement allBtn;
	
	@FindBy(xpath = "//label[@class='btn nicbgcolor rejectcase'][normalize-space()='Today']")
	private WebElement todayBtn;
	
	@FindBy(xpath = "//label[@class='btn nicbgcolor rejectcase'][normalize-space()='Yesterday']")
	private WebElement yesterdayBtn;
	
	@FindBy(xpath = "(//button[@type='button'])[6]")
	private WebElement viewBtn;
	
	@FindBy(xpath = "//i[@class='fa fa-th-large fa-sm']")
	private WebElement thumbnailIcon;
	
	@FindBy(xpath = "//*[@id='tblCompletedCases_wrapper']/div[2]/button[3]")
	private WebElement toolBox;
	
	@FindBy(xpath = "//tbody/tr[1]/td[11]/button[1]/i[1]")
	private WebElement detailBtn;
	
//	@FindBy(xpath = "//*[@id='popupclose']")
//	private WebElement filterCloseButton;
//	
//	@FindBy(xpath = "//*[@id='completed_reviewer_tbl']/tr/td[1]")
//	private WebElement caseIdResult;
//	
//	@FindBy(xpath = "//*[@id='completed_reviewer_tbl']/tr[1]/td[9]/button")
//	private WebElement viewButton;
//	
//	@FindBy(xpath = "//*[@id='completed_reviewer_tbl']/tr[1]/td[10]/button")
//	private WebElement reportButton;
//	
//	@FindBy(xpath = "//*[@id='completed_reviewer_tbl']/tr[1]/td[11]/button")
//	private WebElement detailButton;
//	
//	@FindBy(xpath = "//*[@id='TDstatus']")
//	private WebElement status;
//	
//	@FindBy(xpath = "//*[@id='downloadReport']")
//	private WebElement reportDDownload;
//	
//	@FindBy(xpath = "//*[@id='col_hos']")
//	private WebElement accountIcon;
//	
//	@FindBy(xpath = "/html/body/div[1]/div/div[1]/div/a[3]")
//	private WebElement logout;



	public void open_Rejected_Vcard(SoftAssert Assert) {
		
		Assert.assertEquals(rejectVcard.getText(), "Rejected", "Completed vcard missing. ,");
		Assert.assertTrue(rejectVcard.isDisplayed(), "Rejected vcard not displayed. ,");
		if(rejectVcard.isDisplayed())
		{
			rejectVcard.click();
		}
	}
		
		


	public void hideColumn_validation(SoftAssert Assert) {
		
		
	
	}
	

	public void Rejected_case_Validation(SoftAssert Assert) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(100,400)");
		Thread.sleep(3000);
		
		WebElement allBtn = driver.findElement(By.xpath("//label[@id='completecase']"));
		allBtn.click();
		
		Thread.sleep(3000);
		JavascriptExecutor js11 = (JavascriptExecutor) driver;
		js11.executeScript("window.scrollBy(100,400)");
		Thread.sleep(3000);
		
		viewBtn.click();
		Thread.sleep(3000);
		
		// icon visibility
		WebElement thumbnailIcon = driver.findElement(By.xpath("//i[@class='fa fa-th-large fa-sm']"));
		boolean isIconVisible = thumbnailIcon.isDisplayed();
		if (isIconVisible) {
            System.out.println("Thumbnail icon is visible.");
        } else {
            System.out.println("Thumbnail icon is not visible.");
        }
		
		
	}	
}

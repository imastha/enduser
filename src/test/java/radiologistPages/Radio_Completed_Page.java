package radiologistPages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
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
	
//	@FindBy(xpath = "//*[@id='tblCompletedCases_wrapper']/div[2]/button[1]")
//	private WebElement hideButton;
//	
//	@FindBy(xpath = "//*[@id='tblCompletedCases_wrapper']/div[2]/div[2]/button[1]")
//	private WebElement caseIdButton;
//	
//	@FindBy(xpath = "//*[@id='tblCompletedCases_wrapper']/div[2]/div[1]")
//	private WebElement background;
//	
//	@FindBy(xpath = "//*[@id='tblCompletedCases_wrapper']/div[3]/div[1]/div/table/thead/tr/th[1]")
//	private WebElement firstColumn;
//	
//	@FindBy(xpath = "//*[@id='tblCompletedCases_wrapper']/div[2]/button[2]")
//	private WebElement resetButton;
//	
	@FindBy(xpath = "//div[@class='toggffpicon']//i[@class='fa fa-arrow-left']")
	private WebElement ViewBckbtnicon;
	
	@FindBy(xpath = "//i[@class='fa fa-th-large fa-sm']")
	private WebElement thumbnailIcon;
	
	@FindBy(xpath = "//i[@class='fa fa-cogs fa-sm']")
	private WebElement toolBoxbtn;
	
	@FindBy(xpath = "//div[@class='toggffpicon']//i[@class='fa fa-arrow-left']")
	private WebElement viewBackbtn;
	
	@FindBy(xpath = "(//i)[14]")
	private WebElement viewButton;
	
	@FindBy(xpath = "(//i[@class='fa fa-file-pdf-o'])[1]")
	private WebElement reportButton;
	
	@FindBy(xpath = "//*(//i[@class='fa fa-edit'])[5]")
	private WebElement detailButton;
	
	@FindBy(xpath = "//*[@id='TDstatus']")
	private WebElement status;
	
	@FindBy(xpath = "//*[@id='downloadReport']")
	private WebElement reportDDownload;
	
	@FindBy(xpath = "//*[@id='col_hos']")
	private WebElement accountIcon;
	
	@FindBy(xpath = "(//div[@class='topicon'])[2]")
	private WebElement toolBox;
	
	@FindBy(xpath = "(//label[@id='completecase']")
	private WebElement allBtn;
	
	
	


	public void open_Completed_Vcard(SoftAssert Assert) {
		// TODO Auto-generated method stub
		Assert.assertEquals(completedVcard.getText(), "COMPLETED", "Completed vcard missing. ,");
		Assert.assertTrue(completedVcard.isDisplayed(), "Completed vcard not displayed. ,");
		if(completedVcard.isDisplayed())
		{
			completedVcard.click();
		}
	}

//	public void hideColumn_validation(SoftAssert Assert) {
//		// TODO Auto-generated method stub
//		hideButton.click();
//		Assert.assertTrue(caseIdButton.isDisplayed(), "caseIdButton not displayed in hide Coloumn. ,");
//		if(caseIdButton.isDisplayed())
//			caseIdButton.click();
//		background.click();
//		Assert.assertNotEquals(firstColumn.getText(), "Case ID", "Hide Column functionality not working. ,");
//	}
	
	
	public void all_btn_validation(SoftAssert Assert) throws IOException, InterruptedException {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(100,400)");
		Thread.sleep(3000);
		
		WebElement allBtn = driver.findElement(By.xpath("//label[@id='completecase']"));
		allBtn.click();
		
		Thread.sleep(3000);
		JavascriptExecutor js11 = (JavascriptExecutor) driver;
		js11.executeScript("window.scrollBy(100,400)");
		Thread.sleep(3000);
		
		
		viewButton.click();
		Thread.sleep(3000);
		
		// icon visibility
		WebElement thumbnailIcon = driver.findElement(By.xpath("//i[@class='fa fa-th-large fa-sm']"));
		boolean isIconVisible = thumbnailIcon.isDisplayed();
		if (isIconVisible) {
            System.out.println("Thumbnail icon is visible.");
        } else {
            System.out.println("Thumbnail icon is not visible.");
        }
		
		WebElement toolBoxbtn = driver.findElement(By.xpath("//i[@class='fa fa-cogs fa-sm']"));
		toolBoxbtn.click();
		Thread.sleep(3000);
		
		
		
		WebElement viewBackbtn = driver.findElement(By.xpath("//div[@class='toggffpicon']//i[@class='fa fa-arrow-left']"));
		viewBackbtn.click();
		Thread.sleep(2000);
		
		WebElement completedVcard = driver.findElement(By.xpath("//*[@id='cardbgcomplete']/h6[1]"));
		completedVcard.click();
		
		
		// Report download
//		WebElement reportButton = driver.findElement(By.xpath("//i[@class='fa fa-file-pdf-o'])[1]"));
//		reportButton.click();
		
		
//		ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-extensions"); 
//        
//        // Disable any extensions that might block the download
//        options.setCapability("download.default_directory", "C:\\Users\\NICSI\\Downloads"); 
//        WebElement reportButton = driver.findElement(By.xpath("(//i[@class='fa fa-file-pdf-o'])[1]"));
//        reportButton.click();
//        try {
//            Thread.sleep(5000); 
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        Thread.sleep(2000);
		detailButton.click();
		Thread.sleep(2000);
		JavascriptExecutor js111 = (JavascriptExecutor) driver;
		js111.executeScript("window.scrollBy(100,400)");
		
		
	}
	
	
//	
//	public void completed_case_Validation(SoftAssert Assert) throws IOException {
//		// TODO Auto-generated method stub
//		FileInputStream inputStream = new FileInputStream(
//				System.getProperty("user.dir") + "\\src\\test\\resources\\endUserProperties\\caseDetails.properties");
//		Properties property = new Properties();
//		property.load(inputStream);
//		String caseId = property.getProperty("caseId");
//		System.out.println("caseId is " + caseId);
//		resetButton.click();
//		Assert.assertTrue(filterButton.isDisplayed(), "Radiologist filter button not displayed. ,");
//		if (filterButton.isDisplayed()) {
//			filterButton.click();
//			caseIdSearchBox.sendKeys(caseId);
//			filterCloseButton.click();
//			Assert.assertEquals(caseIdResult.getText(), caseId, "Searched and resulted caseId is not matching. ,");
//			reportButton.click();
//			detailButton.click();
//			Assert.assertEquals(status.getText(), "COMPLETED", "Status is incorrect in details. ,");
//			Assert.assertTrue(reportDDownload.isDisplayed(), "Report download option in details is missing. ,");
//			if(reportDDownload.isDisplayed())
//				reportDDownload.click();
//			accountIcon.click();
////			logout.click();
////		}
//	}
//	
//	}
	}			
		
		
	


package radiologistPages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

	@FindBy(xpath = "//div[@id='cardbgpending']")
	private WebElement pendingVcard;

	@FindBy(xpath = "//label[@id='pendingcase']")
	private WebElement AllBtn;

	@FindBy(xpath = "(//span[contains(text(),'Hide Column')])[1]")
	private WebElement hideColumn;

	@FindBy(xpath = "//div[@role='menu']//button[1]")
	private WebElement CaseIdBtn;

	@FindBy(xpath = "(//i)[5]")
	private WebElement ViewBtn;
	
	@FindBy(xpath = "(//i)[6]")
	private WebElement DetailsBtn;

	@FindBy(xpath = "//textarea[@id='report']")
	private WebElement ReportTextBox;

	@FindBy(xpath = "//textarea[@id='impression']")
	private WebElement ImpressionTextBox;

	@FindBy(xpath = "//button[@id='completeReview']")
	private WebElement ReportSaveBtn;

	@FindBy(xpath = "//label[@class='btn nicbgcolor pendingcase'][normalize-space()='Today']")
	private WebElement TodayBtn;
	
	@FindBy(xpath = "//label[@class='btn nicbgcolor pendingcase'][normalize-space()='Yesterday']")
	private WebElement YesterdayBtn;
	
	@FindBy(xpath = "//i[@class='fas fa-window-close']")
	private WebElement reportCloseBtn;
	
	@FindBy(xpath = "//div[@class='topbar']//div[6]")
	private WebElement viewImageButton;
	
	@FindBy(xpath = "//i[@class='fas fa-x-ray']")
	private WebElement viewDicomButton;
	
	@FindBy(xpath = "//i[@class='fa fa-cogs fa-sm']")
	private WebElement viewToolboxButton;
	
	@FindBy(xpath = "//div[@class='toggffpicon']//i[@class='fa fa-arrow-left']")
	private WebElement viewBackBtn;
	
	@FindBy(xpath = "//select[@id='reviewerStatusId']")
	private WebElement StatusDropDown;
	
	@FindBy(xpath = "//textarea[@id='caseRemarks']")
	private WebElement RemarkTextBox;
	
	@FindBy(xpath = "(//div[@class='datalist'])[1]")
	private WebElement table ;
	
	@FindBy(xpath = "(//div[@class='charttitle'])[2]")
	private WebElement chartTitle;
	
	@FindBy(xpath = "//*[@id='msgclose']")
	private WebElement rowCount;
	
	@FindBy(xpath = "//*[@id='backbutton']/div[1]")
	private WebElement columnCount;
	
	@FindBy(xpath = "//button[@id='msgclose']")
	private WebElement alertClosebtn;
//	
//	@FindBy(xpath = "//*[@id='backbutton']/div[1]")
//	private WebElement colCount;
//	
//	@FindBy(xpath = "//*[@id='backbutton']/div[1]")
//	private WebElement colount;
//	
//	@FindBy(xpath = "//*[@id='backbutton']/div[1]")
//	private WebElement colount;
//	
//	@FindBy(xpath = "//*[@id='backbutton']/div[1]")
//	private WebElement count;

	public void open_Pending_Vcard(SoftAssert Assert) {
		// TODO Auto-generated method stub
		Assert.assertTrue(pendingVcard.isDisplayed(), "Radiologist pending vcard not displayed. ,");
		if (pendingVcard.isDisplayed()) {
			pendingVcard.click();
		}

	}

	public void All_btn_validation(SoftAssert Assert) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(100,400)");
		Thread.sleep(3000);
		AllBtn.click();
		
		JavascriptExecutor js11 = (JavascriptExecutor) driver;
		js11.executeScript("window.scrollBy(100,400)");
		
		WebElement AllBtn = driver.findElement(By.xpath("//label[@id='pendingcase']"));
		
		// Check if the button is highlighted
        String buttonColor = AllBtn.getCssValue("background-color");
        boolean isHighlighted = !buttonColor.equals("rgba(0, 0, 0, 0)")
                && !buttonColor.equals("Yellow");
        
     // Print the button text
        String buttonText = AllBtn.getText();
        System.out.println("Button Text: " + buttonText);
       if (isHighlighted) {
            System.out.println("Test case passed: Button is highlighted.");
        } else {
            System.out.println("Test case failed: Button is not highlighted.");
        
  
            WebElement chartTitle = driver.findElement(By.xpath("(//div[@class='charttitle'])[2]"));
            String titleText = chartTitle.getText();
            System.out.println("Chart Title: " + titleText);
            
      
        }
       
		//table data
        WebElement table = driver.findElement(By.xpath("(//div[@class='datalist'])[1]"));
     //  number of rows in the table
        int rowCount = table.findElements(By.tagName("tr")).size();
     //  number of columns in the table
        int columnCount = table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("td")).size();
		
     // Verify the expected data in the table
        String expectedData = "Expected Value";
        boolean isDataCorrect = false;
        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
            	
                // Get the text of the cell at the current row and column
                String cellText = table.findElements(By.tagName("tr")).get(row)
                        .findElements(By.tagName("td")).get(column).getText();
                
                
             // Check if the cell text matches the expected data
                if (cellText.equals(expectedData)) {
                    isDataCorrect = true;
                    break;
                }
            }
            if (isDataCorrect) {
                break;
            }
        }
        
     // the test result
        if (isDataCorrect) {
            System.out.println("Test case passed: Table data is correct.");
        } else {
            System.out.println("Test case failed: Table data is not correct.");
        }
 
       
		Thread.sleep(3000);
		ViewBtn.click();
		Thread.sleep(3000);
		WebElement ReportTextBox = driver.findElement(By.xpath("//textarea[@id='report']"));
		String inputText = "There is a small, well-defined mass observed in the right frontal lobe.";
		ReportTextBox.sendKeys(inputText);
		 String textBoxValue = ReportTextBox.getAttribute("value");
	        System.out.println("Report Textbox Value: " + textBoxValue);
		
	
		
		Thread.sleep(3000);
		WebElement ImpressionTextBox= driver.findElement(By.xpath("//textarea[@id='impression']"));	
		String inputText1 = "Based on the MRI brain scan, the findings suggest the presence of a small, well-defined mass in the right frontal lobe. Further evaluation and consultation with a neurologist are recommended to determine the nature and significance of the mass. No other significant abnormalities are noted in the brain structures.";
		ImpressionTextBox.sendKeys(inputText1);
		String ImpressionTextBox1 = ReportTextBox.getAttribute("value");
        System.out.println("Impression Textbox Value: " + textBoxValue);
        Thread.sleep(3000);
        ReportSaveBtn.click();
        Thread.sleep(3000);
        alertClosebtn.click();
	    Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 20, 2000);
		viewBackBtn.click();
		
		 Thread.sleep(3000);
		 WebElement pendingVcard = driver.findElement(By.xpath("//div[@id='cardbgpending']"));
		 int vcardCount = pendingVcard.findElements(By.xpath("//div[@id='cardbgpending']")).size();
		 System.out.println("Number of vCards: " + vcardCount);
		 System.out.println("Text of vCards:");
	        for (WebElement vcard : pendingVcard.findElements(By.xpath("//div[@id='cardbgpending']"))) {
	            System.out.println(vcard.getText());
	        }	 
		pendingVcard.click();
		 Thread.sleep(5000);
		DetailsBtn.click();
		JavascriptExecutor js111 = (JavascriptExecutor) driver;
		js111.executeScript("window.scrollBy(100,400)");
		 Thread.sleep(5000);
		pendingVcard.click();
		
	
        }
		
	
	public void Today_Btn_validation(SoftAssert Assert) {
//		// TODO Auto-generated method stub
//		
		TodayBtn.click();
		WebElement TodayBtn = driver.findElement(By.xpath("//label[@class='btn nicbgcolor pendingcase'][normalize-space()='Today']"));
		String buttonText = TodayBtn.getText();
        System.out.println("Button Text: " + buttonText);
	}
	
	public void Yesterday_Btn_validation(SoftAssert Assert) {
//		// TODO Auto-generated method stub
//		
		YesterdayBtn.click();
		WebElement YesterdayBtn = driver.findElement(By.xpath("//label[@class='btn nicbgcolor pendingcase'][normalize-space()='Yesterday']]"));
		String buttonText = YesterdayBtn.getText();
        System.out.println("Button Text: " + buttonText);
	}
		
	
	}


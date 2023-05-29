package endUserPages;

import java.io.FileOutputStream;
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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class EndUser_Patient_CaseReq_Page {

	WebDriver driver;
	public String patient_Id;

	public EndUser_Patient_CaseReq_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='cardbgpatient']")
	private WebElement patientVcard;

	@FindBy(xpath = "//*[@id='cardbghistory']")
	private WebElement caseReqVcard;

	@FindBy(xpath = "//label[@id='patient']")
	private WebElement ListButton;

	@FindBy(xpath = "//*[@id='col_hos']")
	private WebElement accountIcon;

	@FindBy(xpath = "/html/body/div[1]/div/div[1]/div/a[3]")
	private WebElement logout;


	// Add form

	@FindBy(xpath = "//label[@id='pIDAdd']")
	private WebElement AddButton;

	@FindBy(xpath = "//*[@id='divnewpatienttitle']/span")
	private WebElement FormTitle;

	@FindBy(xpath = "//*[@id='divname3']/div/b")
	private WebElement PatientName_level;

	@FindBy(xpath = "//*[@id='divname3']/div/span")
	private WebElement PatientName_hint;

	@FindBy(xpath = "//*[@id='pname']")
	private WebElement PatientName_textbox;

	@FindBy(xpath = "//*[@id='patientnameErrs']")
	private WebElement PatientName_err;

	@FindBy(xpath = "//*[@id='divgender']/b")
	private WebElement Gender_level;

	@FindBy(xpath = "//*[@id='gender_1']")
	private WebElement radio1;

	@FindBy(xpath = "//*[@id='divgender']/label[1]")
	private WebElement radioLevel1;

	@FindBy(xpath = "//*[@id='gender_2']")
	private WebElement radio2;

	@FindBy(xpath = "//*[@id='divgender']/label[2]")
	private WebElement radioLevel2;

	@FindBy(xpath = "//*[@id='gender_3']")
	private WebElement radio3;

	@FindBy(xpath = "//*[@id='divgender']/label[3]")
	private WebElement radioLevel3;

	@FindBy(xpath = "//*[@id='patientgenderErrs']")
	private WebElement Gender_err;

	@FindBy(xpath = "//*[@id='divmobile']/div/b")
	private WebElement Mobile_level;

	@FindBy(xpath = "//*[@id='divmobile']/div/span")
	private WebElement Mobile_hint;

	@FindBy(xpath = "//*[@id='mobilep']")
	private WebElement Mobile_textbox;

	@FindBy(xpath = "//*[@id='patientmobileErrs']")
	private WebElement Mobile_err;

	@FindBy(xpath = "//*[@id='divaddnewpatient']/div[2]/div[5]/label")
	private WebElement DOB_level;

	@FindBy(xpath = "//*[@id='dobDate']")
	private WebElement DOB_textbox;

	@FindBy(xpath = "//*[@id='patientdobErrs']")
	private WebElement DOB_err;

	@FindBy(xpath = "//button[@id='patient-save']")
	private WebElement Save_button;

	@FindBy(xpath = "//*[@id='patientsavemsg']")
	private WebElement success_msg;

	@FindBy(xpath = "//*[@id='TDreferencePatientId']")
	private WebElement patientId;

	//case request
	@FindBy(xpath = "//*[@id='referencePatientId']")
	private WebElement pIdSearchBox;

	@FindBy(xpath = "//*[@id='patient-search-byid']")
	private WebElement searchButton;

	@FindBy(xpath = "//*[@id='domainId']")
	private WebElement domainDdown;

	@FindBy(xpath = "//*[@id='modalityId']")
	private WebElement modalityDdown;

	@FindBy(xpath = "//*[@id='clinical']")
	private WebElement complaintTextbox;

	@FindBy(xpath = "//*[@id='openimage']")
	private WebElement imageButton;

	@FindBy(xpath = "//*[@id='imagefile']")
	private WebElement chooseimage;

	@FindBy(xpath = "//*[@id='uploadImage']")
	private WebElement imageuploadButton;

	@FindBy(xpath = "//*[@id='opendicom']")
	private WebElement dicomButton;

	@FindBy(xpath = "//*[@id='dicomfile']")
	private WebElement choosedicom;

	@FindBy(xpath = "//*[@id='uploadDicom']")
	private WebElement dicomuploadButton;

	@FindBy(xpath = "//*[@id='patientConsent']")
	private WebElement checkbox;

	@FindBy(xpath = "//*[@id='caserequest-save']")
	private WebElement saveButton;

	@FindBy(xpath = "//button[@id='caserequest-save']")
	private WebElement caseSuccessMsg;

	@FindBy(xpath = "//*[@id='TDDcaseId']")
	private WebElement caseID;




	public void Open_Patients_Test(SoftAssert Assert) throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(patientVcard.isDisplayed(), "Patient vCard not displayed. ");
		Assert.assertTrue(patientVcard.isEnabled(), "Patient vCard not enabled. ");
		if (patientVcard.isDisplayed() && patientVcard.isEnabled()) {
			WebElement patientVcard = driver.findElement(By.xpath("//div[@id='cardbgpatient']"));
			Thread.sleep(5000);
			
			patientVcard.click();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			Assert.assertEquals(patientVcard.getAttribute("class"), "card-body bg-success border border-danger",
					"Failed: Open_Patients_Test, patientVcard not highlighted when clicked ,");
		}
	}
	

	public void Patient_Registration_NoData_Test(SoftAssert Assert) throws InterruptedException {
		Assert.assertTrue(AddButton.isDisplayed(), "Add Button not displayed. ");
		Assert.assertTrue(AddButton.isEnabled(), "Add Button not enabled. ");
		if (AddButton.isDisplayed() && AddButton.isEnabled()) {
			Thread.sleep(3000);
			AddButton.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
			Assert.assertEquals(AddButton.getAttribute("class"), "btn nicbgcolor patientcase focus active",
					"Failed: AddButton not highlighted when clicked ,");
			Assert.assertEquals(FormTitle.getText(),"Add new Patient", "Failed: Add patient page title test, ");
			Assert.assertEquals(PatientName_level.getText(), "Patient Name*", "Failed: Add PatientName_level test, ");
			Assert.assertEquals(PatientName_hint.getText(), "[ Only alphabets and special characters dot and Space are allowed. Minimum 3 and maximum 70 character]",
					"Failed: Add PatientName_hint test, ");
			Assert.assertEquals(Gender_level.getText(), "Gender *", "Failed: Gender_level test, ");
			Assert.assertTrue(radio1.isDisplayed(), "Gender Male radio button not displayed., ");
			Assert.assertTrue(radio2.isDisplayed(), "Gender Female radio button not displayed., ");
			Assert.assertTrue(radio3.isDisplayed(), "Gender Transgender radio button not displayed., ");
			Assert.assertTrue(radio1.isEnabled(), "Gender Male radio button not Enabled., ");
			Assert.assertTrue(radio2.isEnabled(), "Gender Female radio button not Enabled., ");
			Assert.assertTrue(radio3.isEnabled(), "Gender Transgender radio button not Enabled., ");
			Assert.assertFalse(radio1.isSelected(), "Gender Male radio button auto isSelected., ");
			Assert.assertFalse(radio2.isSelected(), "Gender Female radio button auto isSelected., ");
			Assert.assertFalse(radio3.isSelected(), "Gender Transgender radio button auto isSelected., ");
			Assert.assertEquals(radioLevel1.getText(), "Male", "Male radio level is missing., ");
			Assert.assertEquals(radioLevel2.getText(), "Female", "Female radio level is missing., ");
			Assert.assertEquals(radioLevel3.getText(), "Transgender", "Transgender radio level is missing., ");
			Assert.assertEquals(Mobile_level.getText(), "Mobile*", "Failed: Mobile_level test, ");
			Assert.assertEquals(Mobile_hint.getText(), "[ 10 Digits]","Failed: Mobile_hint test, ");
			Assert.assertEquals(DOB_level.getText(), "DOB [dd-mm-yyyy] / Age*", "Failed: DOB_level test, ");
			Assert.assertTrue(Save_button.isDisplayed(), "Save_button not displayed., ");
			Assert.assertTrue(Save_button.isEnabled(), "Save_button not enabled., ");
			if(Save_button.isDisplayed() && Save_button.isEnabled())
				Save_button.click();
			WebDriverWait wait = new WebDriverWait(driver, 3);
			wait.until(ExpectedConditions.textToBePresentInElement(PatientName_err,
					"Required Field"));
			Assert.assertEquals(PatientName_err.getText(), "Required Field","Failed: PatientName_err test, ");
			Assert.assertEquals(Gender_err.getText(), "Required Field","Failed: Gender_err test, ");
			Assert.assertEquals(Mobile_err.getText(), "Required Field","Failed: Mobile_err test, ");
			Assert.assertEquals(DOB_err.getText(), "Required Field","Failed: DOB_err test, ");
		}

	}

	public void Patient_Registration_InvalidData_Test(SoftAssert Assert) throws InterruptedException {
		// TODO Auto-generated method stub
		if (AddButton.isDisplayed() && AddButton.isEnabled())
			Thread.sleep(2000);
			AddButton.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Thread.sleep(3000);
		PatientName_textbox.sendKeys("aa");
		Thread.sleep(3000);
		radio1.click();
		Mobile_textbox.sendKeys("00");
		Thread.sleep(3000);
		DOB_textbox.sendKeys("111111");
		Thread.sleep(3000);
		if(Save_button.isDisplayed() && Save_button.isEnabled())
			Save_button.click();
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.textToBePresentInElement(PatientName_err,
				"Allows characters, dot and space and length 3 - 70"));
		Assert.assertEquals(PatientName_err.getText(), "Allows characters, dot and space and length 3 - 70","Failed: PatientName_err test, ");
		Assert.assertEquals(Mobile_err.getText(), "Please enter valid 10 digit mobile","Failed: Mobile_err test, ");
		Assert.assertEquals(DOB_err.getText(), "Invalid Data","Failed: DOB_err test, ");

	}

	public String Patient_Registration_ValidData_Test(String patientName, String mobile, String dob, SoftAssert Assert) throws InterruptedException {
		// TODO Auto-generated method stub
		if (AddButton.isDisplayed() && AddButton.isEnabled())
			Thread.sleep(3000);
			AddButton.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Thread.sleep(3000);
		PatientName_textbox.sendKeys(patientName);
		//PatientName_textbox.sendKeys("Naam");
		Thread.sleep(2000);
		radio1.click();
		Thread.sleep(2000);
		Mobile_textbox.sendKeys(mobile);
		Thread.sleep(2000);
		DOB_textbox.sendKeys(dob);
		Thread.sleep(2000);
		if(Save_button.isDisplayed() && Save_button.isEnabled())
			Save_button.click();
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.textToBePresentInElement(success_msg,
				"New Patient saved successfully."));
		Assert.assertEquals(success_msg.getText(), "New Patient saved successfully.","Failed: success_msg test, ");
		//System.out.println(patientId.getText());
		patient_Id= patientId.getText();
		Thread.sleep(2000);
		return patient_Id;
	}

	public void Add_CaseReq_Page(SoftAssert Assert, String pid) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		ListButton.click();
		Thread.sleep(2000);
		System.out.println(pid);
		caseReqVcard.click();
		Thread.sleep(2000);
		pIdSearchBox.sendKeys(pid);
		Thread.sleep(2000);
		searchButton.click();
		Thread.sleep(2000);
		Select s= new Select(domainDdown);
		s.selectByVisibleText("Chest");
		Select s1= new Select(modalityDdown);
		s1.selectByVisibleText("Digital X-Ray");
		Thread.sleep(2000);
		complaintTextbox.sendKeys("My Comment Chest");
		
		JavascriptExecutor js111 = (JavascriptExecutor) driver;
		js111.executeScript("window.scrollBy(100,500)");
		Thread.sleep(2000);
		dicomButton.click();
		Thread.sleep(2000);
		choosedicom.sendKeys("C:\\Users\\NICSI\\Desktop\\512KB_dicoms\\512KB_dicoms");
		Thread.sleep(2000);
		dicomuploadButton.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		/*wait.until(ExpectedConditions.visibilityOf(imageButton));*/
	//driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	Thread.sleep(3000);

//	    imageButton.click();
//		Thread.sleep(2000);
//		chooseimage.sendKeys("C:\Users\NICSI\Desktop\abnormal");
//		Thread.sleep(3000);
//		imageuploadButton.click();
		/*WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.visibilityOf(checkbox));*/
		//driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		Thread.sleep(3000);
		checkbox.click();
		Thread.sleep(3000);
		saveButton.click();
		wait.until(ExpectedConditions.textToBePresentInElement(caseSuccessMsg, "The Case Details are Successfully Submitted."));
		Assert.assertEquals(caseSuccessMsg.getText(), "The Case Details are Successfully Submitted.", "Failed: Add_CaseReq_SuccessMsg. ,");
		String caseId = caseID.getText();
		Properties properties = new Properties();
		FileOutputStream outputstream = new FileOutputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\endUserProperties\\caseDetails.properties");
		properties.setProperty("caseId", caseId);
		properties.store(outputstream, null);
		Thread.sleep(3000);
		accountIcon.click();
		Thread.sleep(3000);
		logout.click();
	}

	
}

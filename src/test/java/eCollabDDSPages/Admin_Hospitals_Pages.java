package eCollabDDSPages;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Admin_Hospitals_Pages {

	WebDriver driver;

	public Admin_Hospitals_Pages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// WEB ELEMENTS
	@FindBy(xpath = "//*[@id='cardbghospitals']")
	private WebElement Hospitals_vcard;

	@FindBy(xpath = "//*[@id='counthospital']")
	private WebElement hos_vcardCount;

	@FindBy(xpath = "//*[@id='cardbghospitals']/h7")
	private WebElement hos_vacardName;

	@FindBy(xpath = "//*[@id='cardadmin']/div[4]/div/label[1]")
	private WebElement List_Button;

	@FindBy(xpath = "//*[@id='cardadmin']/div[4]/div/label[2]")
	private WebElement Add_Button;

	@FindBy(xpath = "//*[@id='cardadmin']/div[4]/div/label[3]")
	private WebElement Search_Button;

	// Add form elements

	@FindBy(xpath = "//*[@id='hospital-save']")
	private WebElement hospitalSaveButton;

	@FindBy(xpath = "//*[@id='div_hospital_level']/div/b")
	private WebElement hospitalLevel_label;

	@FindBy(xpath = "//*[@id='hospitalLevel']")
	private WebElement hospitalLevel_ddown;

	@FindBy(xpath = "//*[@id='hospitalLevelErrr']")
	private WebElement hospitalLevel_err;

	@FindBy(xpath = "//*[@id='divhospitals']/div[2]/div[4]/div/b")
	private WebElement hospitalName_label;

	@FindBy(xpath = "//*[@id='divhospitals']/div[2]/div[4]/div/span")
	private WebElement hospitalName_hint;

	@FindBy(xpath = "//*[@id='hospitalName']")
	private WebElement hospitalName_input;

	@FindBy(xpath = "//*[@id='hospitalNameErrr']")
	private WebElement hospitalName_err;

	@FindBy(xpath = "//*[@id='divhospitals']/div[2]/div[5]/div/b")
	private WebElement hospitalType_label;

	@FindBy(xpath = "//*[@id='hospitalType']")
	private WebElement hospitalType_ddown;

	@FindBy(xpath = "//*[@id='hospitalTypeErrr']")
	private WebElement hospitalType_err;

	@FindBy(xpath = "//*[@id='divhospitals']/div[2]/div[6]/div/b")
	private WebElement Address_label;

	@FindBy(xpath = "//*[@id='divhospitals']/div[2]/div[6]/div/span")
	private WebElement Address_hint;

	@FindBy(xpath = "//*[@id='address']")
	private WebElement Address_input;

	@FindBy(xpath = "//*[@id='addressErrr']")
	private WebElement Address_err;

	@FindBy(xpath = "//*[@id='divhospitals']/div[2]/div[7]/div/b")
	private WebElement state_label;

	@FindBy(xpath = "//*[@id='stateId']")
	private WebElement state_ddown;

	@FindBy(xpath = "//*[@id='stateIdErrr']")
	private WebElement state_err;

	@FindBy(xpath = "//*[@id='divhospitals']/div[2]/div[8]/div/b")
	private WebElement district_label;

	@FindBy(xpath = "//*[@id='districtId']")
	private WebElement district_ddown;

	@FindBy(xpath = "//*[@id='districtIdErrr']")
	private WebElement district_err;

	@FindBy(xpath = "//*[@id='divhospitals']/div[2]/div[9]/div/b")
	private WebElement city_label;

	@FindBy(xpath = "//*[@id='divhospitals']/div[2]/div[9]/div/span")
	private WebElement city_hint;

	@FindBy(xpath = "//*[@id='city']")
	private WebElement city_input;

	@FindBy(xpath = "//*[@id='cityErrr']")
	private WebElement city_err;

	@FindBy(xpath = "//*[@id='divhospitals']/div[2]/div[10]/div/b")
	private WebElement pin_label;

	@FindBy(xpath = "//*[@id='divhospitals']/div[2]/div[10]/div/span")
	private WebElement pin_hint;

	@FindBy(xpath = "//*[@id='pin']")
	private WebElement pin_input;

	@FindBy(xpath = "//*[@id='pinErrr']")
	private WebElement pin_err;

	@FindBy(xpath = "//*[@id='spannodaltitle']")
	private WebElement caFormTitle;

	@FindBy(xpath = "//*[@id='divnodalusername']/div/b")
	private WebElement caUsernameLabel;

	@FindBy(xpath = "//*[@id='divnodalusername']/div/span")
	private WebElement caUsernameHint;

	@FindBy(xpath = "//*[@id='nodalOfficerUsername']")
	private WebElement caUsernameInput;

	@FindBy(xpath = "//*[@id='nodalOfficerUsernameErrr']")
	private WebElement caUsernameErr;

	@FindBy(xpath = "//*[@id='divhospitals']/div[2]/div[11]/div[3]/div/b")
	private WebElement caNameLabel;

	@FindBy(xpath = "//*[@id='divhospitals']/div[2]/div[11]/div[3]/div/span")
	private WebElement caNameHint;

	@FindBy(xpath = "//*[@id='nodalOfficerName']")
	private WebElement caNameInput;

	@FindBy(xpath = "//*[@id='nodalOfficerNameErrr']")
	private WebElement caNameErr;

	@FindBy(xpath = "//*[@id='divhospitals']/div[2]/div[11]/div[4]/div/b")
	private WebElement caEmailLabel;

	@FindBy(xpath = "//*[@id='nodalOfficerEmail']")
	private WebElement caEmailInput;

	@FindBy(xpath = "//*[@id='nodalOfficerEmailErrr']")
	private WebElement caEmailErr;

	@FindBy(xpath = "//*[@id='divhospitals']/div[2]/div[11]/div[5]/div/b")
	private WebElement caMobileLabel;

	@FindBy(xpath = "//*[@id='divhospitals']/div[2]/div[11]/div[5]/div/span")
	private WebElement caMobileHint;

	@FindBy(xpath = "//*[@id='nodalOfficerMobile']")
	private WebElement caMobileInput;

	@FindBy(xpath = "//*[@id='nodalOfficerMobileErrr']")
	private WebElement caMobileErr;

	@FindBy(xpath = "//*[@id='divhospitals']/div[2]/div[17]/div/b")
	private WebElement caSelectionLabel;

	@FindBy(xpath = "//*[@id='extClientSelection']")
	private WebElement caSelectionCheck;

	@FindBy(xpath = "//*[@id='divhospitals']/div[2]/div[17]/div/label/b")
	private WebElement caSelectionQues;

	// success page

	@FindBy(xpath = "//*[@id='trMsg']/td[1]")
	private WebElement successMsgHead;

	@FindBy(xpath = "//*[@id='hospitalsavemsg']")
	private WebElement successMsg;

	// Table WebElements

	@FindBy(xpath = "//*[@id='tblHospitalList_info']")
	private WebElement listRecordCount;

	@FindBy(xpath = "//*[@id='divhospitals']/div[1]/div[1]/b[1]")
	private WebElement listHeading;

	@FindBy(xpath = "//*[@id='tblHospitalList_wrapper']/div[2]/button[1]")
	private WebElement hideButton;

	@FindBy(xpath = "//*[@id='tblHospitalList_wrapper']/div[2]/div[2]")
	private WebElement hideColumnMenu;

	@FindBy(xpath = "//*[@id='tblHospitalList_wrapper']/div[2]/div[2]/button[1]")
	private WebElement codeButton;

	@FindBy(xpath = "//*[@id='tblHospitalList_wrapper']/div[2]/div[1]")
	private WebElement background;

	@FindBy(xpath = "//*[@id='tblHospitalList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[1]")
	private WebElement firstColumn;

	@FindBy(xpath = "//*[@id='tblHospitalList_wrapper']/div[2]/button[2]")
	private WebElement resetButton;

	@FindBy(xpath = "//*[@id='tblHospitalList_wrapper']/div[2]/button[4]")
	private WebElement reloadButton;

	@FindBy(xpath = "//*[@id='tblHospitalList_wrapper']/div[2]/button[3]")
	private WebElement filterButton;

	@FindBy(xpath = "//*[@id='filterPopup']")
	private WebElement filterPopup;

	@FindBy(xpath = "//*[@id='filterform']/label")
	private WebElement filterPopupHeading;

	@FindBy(xpath = "//*[@id='tblusrdashcombcase0']")
	private WebElement codeFilterDdown;

	@FindBy(xpath = "//*[@id='tblusrdashcombcase1']")
	private WebElement hosNameFilterDdown;

	@FindBy(xpath = "//*[@id='tblusrdashcombcase6']")
	private WebElement hosCityFilterDdown;

	@FindBy(xpath = "//*[@id='tblusrdashcombcase3']")
	private WebElement hosLevelFilterDdown;

	@FindBy(xpath = "//*[@id='popupclose']")
	private WebElement filterPopupCloseButton;

	@FindBy(xpath = "//*[@id='tblHospitalList_title']")
	private WebElement appliedFilterName;

	@FindBy(xpath = "//*[@id='tblHospitalList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[1]")
	private WebElement thCode;

	@FindBy(xpath = "//*[@id='tblHospitalList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[2]")
	private WebElement thName;

	@FindBy(xpath = "//*[@id='tblHospitalList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[3]")
	private WebElement thType;

	@FindBy(xpath = "//*[@id='tblHospitalList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[4]")
	private WebElement thLevel;

	@FindBy(xpath = "//*[@id='tblHospitalList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[5]")
	private WebElement thState;

	@FindBy(xpath = "//*[@id='tblHospitalList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[6]")
	private WebElement thDistrict;

	@FindBy(xpath = "//*[@id='tblHospitalList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[7]")
	private WebElement thCity;

	@FindBy(xpath = "//*[@id='tblHospitalList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[8]")
	private WebElement thCreatedOn;

	@FindBy(xpath = "//*[@id='tblHospitalList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[9]")
	private WebElement thStatus;

	@FindBy(xpath = "//*[@id='tblHospitalList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[10]")
	private WebElement thAction;

	// Table Data
	@FindBy(xpath = "//*[@id='registered_hospitals_tbl']/tr/td[2]")
	private WebElement HosNameData;

	@FindBy(xpath = "//*[@id='registered_hospitals_tbl']/tr/td[7]")
	private WebElement HosCityData;

	@FindBy(xpath = "//*[@id='registered_hospitals_tbl']/tr/td[10]/button")
	private WebElement ActionButton;

	// update/action

	@FindBy(xpath = "//*[@id='divhospitalcode']/div/b")
	private WebElement HospitalCodeLabel;

	@FindBy(xpath = "//*[@id='hospitalcode']")
	private WebElement HospitalCode;

	@FindBy(xpath = "//*[@id='divhospitalremark']/div/b")
	private WebElement Remark;

	@FindBy(xpath = "//*[@id='hospitalRemarks']")
	private WebElement RemarkInput;

	@FindBy(xpath = "//*[@id='hospitalStatus']")
	private WebElement hospitalStatusCheck;

	// search

	@FindBy(xpath = "//*[@id='divhospitals']/div[3]/div[1]/span")
	private WebElement SearchHeading;

	@FindBy(xpath = "//*[@id='commonError']")
	private WebElement noDataError;

	@FindBy(xpath = "//*[@id='divhospitals']/div[3]/div[2]/div/b")
	private WebElement sHosCode_label;

	@FindBy(xpath = "//*[@id='hospShospitalCode']")
	private WebElement sHosCode_input;

	@FindBy(xpath = "//*[@id='divhospitals']/div[3]/div[3]/div/b")
	private WebElement sHosLevel_label;

	@FindBy(xpath = "//*[@id='hospShospitalLevel']")
	private WebElement sHosLevel_ddown;

	@FindBy(xpath = "//*[@id='divhospitals']/div[3]/div[4]/div/b")
	private WebElement sHosName_label;

	@FindBy(xpath = "//*[@id='hospShospitalName']")
	private WebElement sHosName_input;

	@FindBy(xpath = "//*[@id='divhospitals']/div[3]/div[5]/div/b")
	private WebElement sHosType_label;

	@FindBy(xpath = "//*[@id='hospShospitalType']")
	private WebElement sHosType_ddown;

	@FindBy(xpath = "//*[@id='divhospitals']/div[3]/div[6]/div/b")
	private WebElement sState_label;

	@FindBy(xpath = "//*[@id='hospSstate']")
	private WebElement sState_ddown;

	@FindBy(xpath = "//*[@id='divhospitals']/div[3]/div[7]/div/b")
	private WebElement sCity_label;

	@FindBy(xpath = "//*[@id='hospScity']")
	private WebElement sCity_input;

	@FindBy(xpath = "//*[@id='hospital-search']")
	private WebElement sButton;

	@FindBy(xpath = "//*[@id='msgclose']")
	private WebElement msgClose;

	@FindBy(xpath = "//*[@id='tbodyhospitals']/tr/td[2]")
	private WebElement searchedHosName;

	// code
	public void Open_Hospitals_Tests(SoftAssert Assert) {
		Assert.assertTrue(Hospitals_vcard.isDisplayed(),
				"Failed: Open_Hospitals_Tests, Hospitals_vcard not displayed ,");
		Assert.assertTrue(Hospitals_vcard.isEnabled(), "Failed: Open_Hospitals_Tests, Hospitals_vcard not enabled ,");
		Hospitals_vcard.click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Assert.assertEquals(Hospitals_vcard.getAttribute("class"), "card-body bg-success border border-danger",
				"Failed: Open_Hospitals_Tests, Hospitals_vcard not highlighted when clicked ,");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		Assert.assertEquals(List_Button.getAttribute("class"), "btn nicbgcolor hospitals active",
				"Failed: Open_Hospitals_Tests, List button not highlighted. ,");
	}

	public void Hospitals_Add_Button_Tests(SoftAssert Assert) {
		Assert.assertEquals(Add_Button.getAttribute("class"), "btn nicbgcolor hospitals",
				"Failed: Hospitals_Add_Button_Tests, Add button should not highlighted by default. ,");
		Assert.assertTrue(Add_Button.isEnabled(), "Failed: Hospitals_Add_Button_Tests, AddButton not enabled ,");
		Add_Button.click();
		Assert.assertEquals(Add_Button.getAttribute("class"), "btn nicbgcolor hospitals focus active",
				"Failed: Hospitals_Add_Button_Tests, AddButton not highlighted after click. ,");
	}

	public void Hospitals_AddForm_NoData_Tests(SoftAssert Assert) {
		Assert.assertTrue(hospitalSaveButton.isDisplayed(),
				"Failed:Hospitals_AddForm_NoData_Tests, hospitalSaveButton not displayed. ,");
		Assert.assertTrue(hospitalSaveButton.isEnabled(),
				"Failed: Hospitals_AddForm_NoData_Tests, hospitalSaveButton not enabled. ,");
		Assert.assertEquals(hospitalSaveButton.getAttribute("title"), "Save Hospital Details",
				"hospitalSaveButton mouse over text is incorrect. ,");
		hospitalSaveButton.click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        Assert.assertEquals(hospitalLevel_err.getText(), "Required Field", "hospitalLevel_error is incorrect. ,");
		Assert.assertEquals(hospitalName_label.getText(), "Hospital Name *", "hospitalName_label is incorrect. ,");
		Assert.assertEquals(hospitalName_hint.getText(),
				"Hospital name should have 3-70 characters and allowed special characters are ('.'and space)",
				"hospitalName_hint is incorrect. ,");
		Assert.assertEquals(hospitalName_err.getText(), "Invalid Data", "hospitalName_error is incorrect. ,");
		Assert.assertEquals(hospitalType_label.getText(), "Hospital Type*", "hospitalType_label is incorrect. ,");
		Assert.assertEquals(hospitalType_err.getText(), "Required Field", "hospitalType_error is incorrect. ,");
		Assert.assertEquals(Address_label.getText(), "Address *", "Address_label is incorrect. ,");
		Assert.assertEquals(Address_hint.getText(),
				"Address should have 3-100 alphanumeric characters and allowed special characters are ('.',',', '-' and space)",
				"Address_hint is incorrect. ,");
		Assert.assertEquals(Address_err.getText(), "Invalid Data", "Address_error is incorrect. ,");
		Assert.assertEquals(state_label.getText(), "State*", "state_label is incorrect. ,");
		Assert.assertEquals(state_err.getText(), "Required Field", "state_error is incorrect. ,");
		Assert.assertEquals(district_label.getText(), "District*", "district_label is incorrect. ,");
		Assert.assertEquals(district_err.getText(), "Required Field", "district_error is incorrect. ,");
		Assert.assertEquals(city_label.getText(), "City*", "city_label is incorrect. ,");
		Assert.assertEquals(city_hint.getText(),
				"[City should have 3-50 characters and allowed special characters are ('.' and space)]",
				"city_hint is incorrect. ,");
		Assert.assertEquals(city_err.getText(), "Invalid Data", "city_error is incorrect. ,");
		Assert.assertEquals(pin_label.getText(), "Pin*", "pin_label is incorrect. ,");
		Assert.assertEquals(pin_hint.getText(), "[ 6 Digits]", "pin_hint is incorrect. ,");
		Assert.assertEquals(pin_err.getText(), "Invalid Data", "pin_error is incorrect. ,");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		Add_Button.click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	}

	public void Hospitals_AddForm_Tests(String Test, SoftAssert Assert, String hosName, String hosAdd, String hosCity,
			String pin) throws InterruptedException, IOException {

		Select s = new Select(hospitalLevel_ddown);
		s.selectByVisibleText("ENDUSER");
		hospitalName_input.sendKeys(hosName);
		Select s1 = new Select(hospitalType_ddown);
		s1.selectByValue("1");
		Address_input.sendKeys(hosAdd);
		Select s2 = new Select(state_ddown);
		s2.selectByValue("1");
		Select s3 = new Select(district_ddown);
		s3.selectByValue("1");
		city_input.sendKeys(hosCity);
		pin_input.sendKeys(pin);
		hospitalSaveButton.click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		if (Test.equals("0")) {
			Assert.assertEquals(hospitalName_err.getText(),
					"Hospital name should have 3-70 characters and  allowed special characters are ('.', ',', '-',and space)",
					"Failed:AddEndUserHos_Neg_Tests, hospital Name_err is incorrect, ");
			Assert.assertEquals(Address_err.getText(),
					"Address should have 3-100 alphanumeric characters and allowed special characters are ('.', ',', '-' and space)",
					"Failed:AddEndUserHos_Neg_Tests, hospital Address_err is incorrect, ");
			Assert.assertEquals(city_err.getText(),
					"City should have 3-50 characters and allowed special characters are ('.' and space)",
					"Failed:AddEndUserHos_Neg_Tests, hospital City_err is incorrect, ");
			Assert.assertEquals(pin_err.getText(), "Pincode should be 6 digits only",
					"Failed:AddEndUserHos_Neg_Tests, hospital Pin_err is incorrect, ");
			Add_Button.click();
		} else {
			WebDriverWait wait = new WebDriverWait(driver, 3);
			wait.until(ExpectedConditions.textToBePresentInElement(successMsg,
					"New Hospital Details are saved Successfully."));
			Assert.assertEquals(successMsg.getText(), "New Hospital Details are saved Successfully.",
					"Failed:AddEndUserHos_Tests, successMsg is incorrect, ");
			Add_Button.click();
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			Properties properties = new Properties();
			FileOutputStream outputstream = new FileOutputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\endUserHos.properties");
			properties.setProperty("hosName", hosName);
			properties.setProperty("hosAdd", hosAdd);
			properties.setProperty("hosCity", hosCity);
			properties.setProperty("pin", pin);
			properties.store(outputstream, null);
		}

	}

	public void Hospitals_AddReviewerHosForm_NoData_Tests(SoftAssert Assert) {
		Select s = new Select(hospitalLevel_ddown);
		s.selectByVisibleText("REVIEWER");
		hospitalSaveButton.click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		Assert.assertEquals(caFormTitle.getText(), "Nodal Officer Details",
				"Failed:Hospitals_AddReviewerHosForm_Tests, Nodal Officer Form title is incorrect, ");
		Assert.assertEquals(caUsernameLabel.getText(), "Username*",
				"Failed:Hospitals_AddReviewerHosForm_Tests, Nodal Officer Username Label is incorrect, ");
		Assert.assertEquals(caUsernameHint.getText(),
				"Username should be alphanumeric [allowed special characters dot(.), @, underscore(_),dash(-)] and length 3 to 50",
				"Failed:Hospitals_AddReviewerHosForm_Tests, Nodal Officer Username Hint is incorrect, ");
		Assert.assertEquals(caUsernameErr.getText(), "Required Field",
				"Failed:Hospitals_AddReviewerHosForm_Tests, Nodal Officer Username Error is incorrect, ");
		Assert.assertEquals(caNameLabel.getText(), "Nodal Officer Name *",
				"Failed:Hospitals_AddReviewerHosForm_Tests, Nodal Officer Name Label is incorrect, ");
		Assert.assertEquals(caNameHint.getText(), "Allows characters, dot and space and length 3 - 70",
				"Failed:Hospitals_AddReviewerHosForm_Tests, Nodal Officer Name Hint is incorrect, ");
		Assert.assertEquals(caNameErr.getText(), "Required Field",
				"Failed:Hospitals_AddReviewerHosForm_Tests, Nodal Officer Name Error is incorrect, ");
		Assert.assertEquals(caEmailLabel.getText(), "Nodal Officer Email *",
				"Failed:Hospitals_AddReviewerHosForm_Tests, Nodal Officer Email Label is incorrect, ");
		Assert.assertEquals(caEmailErr.getText(), "Required Field",
				"Failed:Hospitals_AddReviewerHosForm_Tests, Nodal Officer Email Error is incorrect, ");
		Assert.assertEquals(caMobileLabel.getText(), "Nodal Officer Mobile *",
				"Failed:Hospitals_AddReviewerHosForm_Tests, Nodal Officer Mobile Label is incorrect, ");
		Assert.assertEquals(caMobileHint.getText(), "[10 Digits]",
				"Failed:Hospitals_AddReviewerHosForm_Tests, Nodal Officer Mobile Hint is incorrect, ");
		Assert.assertEquals(caMobileErr.getText(), "Required Field",
				"Failed:Hospitals_AddReviewerHosForm_Tests, Nodal Officer Mobile Error is incorrect, ");
		Assert.assertEquals(caSelectionLabel.getText(), "Client App Selection: *",
				"Failed:Hospitals_AddReviewerHosForm_Tests, Nodal Officer ClientApp Selection Label is incorrect, ");
		Assert.assertTrue(caSelectionCheck.isDisplayed(),
				"Failed:Hospitals_AddReviewerHosForm_Tests, Nodal Officer ClientApp Selection Checkbox is not displayed, ");
		Assert.assertEquals(caSelectionQues.getText(), "Is Enabled ?",
				"Failed:Hospitals_AddReviewerHosForm_Tests, Nodal Officer ClientApp Selection Ques is incorrect, ");
		Add_Button.click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	public void ReviewerHos_AddForm_Tests(String test, SoftAssert Assert, String hosName, String hosAdd, String hosCity,
			String pin, String caUsername, String caName, String caEmail, String caMobile) throws IOException {
		Select s = new Select(hospitalLevel_ddown);
		s.selectByVisibleText("REVIEWER");
		hospitalName_input.sendKeys(hosName);
		Select s1 = new Select(hospitalType_ddown);
		s1.selectByValue("1");
		Address_input.sendKeys(hosAdd);
		Select s2 = new Select(state_ddown);
		s2.selectByValue("1");
		Select s3 = new Select(district_ddown);
		s3.selectByValue("1");
		city_input.sendKeys(hosCity);
		pin_input.sendKeys(pin);
		caUsernameInput.sendKeys(caUsername);
		caNameInput.sendKeys(caName);
		caEmailInput.sendKeys(caEmail);
		caMobileInput.sendKeys(caMobile);
		caSelectionCheck.click();
		hospitalSaveButton.click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		if (test.equals("0")) {
			Assert.assertEquals(hospitalName_err.getText(),
					"Hospital name should have 3-70 characters and  allowed special characters are ('.', ',', '-',and space)",
					"Failed:AddReviewerHos_Neg_Tests, hospital Name_err is incorrect, ");
			Assert.assertEquals(Address_err.getText(),
					"Address should have 3-100 alphanumeric characters and allowed special characters are ('.', ',', '-' and space)",
					"Failed:AddReviewerHos_Neg_Tests, hospital Address_err is incorrect, ");
			Assert.assertEquals(city_err.getText(),
					"City should have 3-50 characters and allowed special characters are ('.' and space)",
					"Failed:AddReviewerHos_Neg_Tests, hospital City_err is incorrect, ");
			Assert.assertEquals(pin_err.getText(), "Pincode should be 6 digits only",
					"Failed:AddReviewerHos_Neg_Tests, hospital Pin_err is incorrect, ");
			Assert.assertEquals(caUsernameErr.getText(),
					"Username should be alphanumeric [allowed special characters dot(.), @, underscore(_),dash(-)] and length 3 to 50",
					"Failed:AddReviewerHos_Neg_Tests, Nodal officer Username Error is incorrect., ");
			Assert.assertEquals(caNameErr.getText(), "Allows characters, dot and space and length 3 - 70",
					"Failed:AddReviewerHos_Neg_Tests, Nodal officer Name Error is incorrect., ");
			Assert.assertEquals(caEmailErr.getText(), "Wrong Email",
					"Failed:AddReviewerHos_Neg_Tests, Nodal officer Email Error is incorrect., ");
			Assert.assertEquals(caMobileErr.getText(), "Please enter valid 10 digit mobile",
					"Failed:AddReviewerHos_Neg_Tests, Nodal officer Mobile Error is incorrect., ");
			Add_Button.click();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		} else {
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOf(successMsg));
			Assert.assertEquals(successMsg.getText(),
					"New Hospital Details are saved Successfully. A password generation link has been sent to registered email address.",
					"Failed:AddReviewerHos_Tests, Reviewer hospitals Success Msg is incorrect., ");
			Properties properties = new Properties();
			FileOutputStream outputstream = new FileOutputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\reviewerHos.properties");
			properties.setProperty("hosName", hosName);
			properties.setProperty("hosAdd", hosAdd);
			properties.setProperty("hosCity", hosCity);
			properties.setProperty("pin", pin);
			properties.setProperty("caUsername", caUsername);
			properties.setProperty("caName", caName);
			properties.setProperty("caEmail", caEmail);
			properties.setProperty("caMobile", caMobile);
			properties.store(outputstream, null);
		}

	}

	public void Hospitals_vCardCount_recordCount(SoftAssert Assert) throws IOException {
		String hosCountNew = hos_vcardCount.getText();
		Properties properties = new Properties();
		FileInputStream inputstream = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\adminVcardCounts.properties");
		properties.load(inputstream);
		String hosCountOld = properties.getProperty("hosVcardCount");
		Assert.assertNotEquals(hosCountNew, hosCountOld,
				"Failed: hospitals_vcard_count_Tests, Hospitals vCard count not updated., ");
		Hospitals_List_Button_Tests(Assert);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Assert.assertTrue(listRecordCount.getText().contains(hosCountNew),
				"Showing list record count does not match with Hospitals vcard count ");
		String listCount = listRecordCount.getText();
		if (listCount.equals("Showing 0 to 0 of 0 entries"))
			driver.quit();
	}

	public void Hospitals_List_Button_Tests(SoftAssert Assert) {
		Assert.assertEquals(List_Button.getAttribute("class"), "btn nicbgcolor hospitals",
				"Failed: Hospitals_List_Button_Tests, List button should not highlight when Add clicked. ,");
		Assert.assertTrue(List_Button.isEnabled(), "Failed: Hospitals_List_Button_Tests, List Button not enabled ,");
		List_Button.click();
		Assert.assertEquals(List_Button.getAttribute("class"), "btn nicbgcolor hospitals focus active",
				"Failed: Hospitals_List_Button_Tests, List Button not highlighted after click. ,");
	}

	public void List_Hospitals_TableHeading(SoftAssert Assert) {
		Assert.assertEquals(listHeading.getText(), "Registered Hospitals",
				"Failed:List_Hospitals_TableHeading, Hospitals Table Heading is incorrect., ");
	}

	public void List_Hospitals_HideColumn_Validation(SoftAssert Assert) {
		Assert.assertTrue(hideButton.isDisplayed(),
				"Failed:List_Hospitals_HideColumn_Validation, hideColumn button not dislayed., ");
		Assert.assertEquals(hideButton.getText(), "Hide Column",
				"Failed:List_Hospitals_HideColumn_Validation, hideColumn button not dislayed., ");
		if (hideButton.isDisplayed()) {
			hideButton.click();
			Assert.assertEquals(hideColumnMenu.getAttribute("class"), "dt-button-collection",
					"Failed:List_Hospitals_HideColumn_Validation, hideColumn menu not dislayed., ");
			Assert.assertTrue(codeButton.isDisplayed(),
					"Failed:List_Hospitals_HideColumn_Validation, Hide Code button not dislayed., ");
			if (codeButton.isDisplayed()) {
				Assert.assertEquals(codeButton.getAttribute("class"), "dt-button buttons-columnVisibility active",
						"Failed:List_Hospitals_HideColumn_Validation, Code button not active in Hide Column menu, ");
				codeButton.click();
				Assert.assertEquals(codeButton.getAttribute("class"), "dt-button buttons-columnVisibility",
						"Failed:List_Hospitals_HideColumn_Validation, Code button not inactive in Hide Column menu after click, ");
				background.click();
				Assert.assertEquals(firstColumn.getText(), "Name",
						"Failed:List_Hospitals_HideColumn_Validation, Hide Column is not working, ");
				Assert.assertTrue(resetButton.isDisplayed(), "Reset button not displayed., ");
				if (resetButton.isDisplayed())
					resetButton.click();
			}
		}
	}

	public void List_Hospitals_Filter_Validation(SoftAssert Assert) throws IOException {
		Assert.assertTrue(filterButton.isDisplayed(), "Filter Button is not displayed., ");
		if (filterButton.isDisplayed()) {
			filterButton.click();
			Assert.assertEquals(filterPopupHeading.getText(),
					"Filter the Table By Using either Drop Down or Search Box", "Filter popup heading is incorrect., ");
			Assert.assertTrue(codeFilterDdown.isDisplayed(), "Code filter is not displayed, ");
			if (codeFilterDdown.isDisplayed()) {
				Select s = new Select(codeFilterDdown);
				s.selectByValue("1");
				Assert.assertTrue(filterPopupCloseButton.isDisplayed(), "filter Popup Close_Button not displayed");
				if (filterPopupCloseButton.isDisplayed()) {
					filterPopupCloseButton.click();
					Assert.assertEquals(appliedFilterName.getText(), ", [Filtered By Column- Code: 1, ]",
							"Applied filter is not coming with the tablename.");
					reloadButton.click();
				}
			}
		}
	}

	public void List_Hospitals_ColumnSorting_Tests(SoftAssert Assert) {
		Assert.assertEquals(thCode.getText(), "Code", "Code Column missing. ,");
		Assert.assertEquals(thCode.getAttribute("class"), "thTd sorting_desc",
				"descending sorting is missing on code column. ,");
		Assert.assertEquals(thName.getText(), "Name", "Name Column missing. ,");
		Assert.assertEquals(thName.getAttribute("class"), "thTd sorting",
				"sorting option is missing on code column. ,");
		Assert.assertEquals(thType.getText(), "Type", "Type Column missing. ,");
		Assert.assertEquals(thType.getAttribute("class"), "thTd sorting",
				"sorting option is missing on Type column. ,");
		Assert.assertEquals(thLevel.getText(), "Level", "Level Column missing. ,");
		Assert.assertEquals(thLevel.getAttribute("class"), "thTd sorting",
				"sorting option is missing on Level column. ,");
		Assert.assertEquals(thState.getText(), "State", "State Column missing. ,");
		Assert.assertEquals(thState.getAttribute("class"), "thTd sorting",
				"sorting option is missing on State column. ,");
		Assert.assertEquals(thDistrict.getText(), "District", "District Column missing. ,");
		Assert.assertEquals(thDistrict.getAttribute("class"), "thTd sorting",
				"sorting option is missing on District column. ,");
		Assert.assertEquals(thCity.getText(), "City", "City Column missing. ,");
		Assert.assertEquals(thCity.getAttribute("class"), "thTd sorting",
				"sorting option is missing on City column. ,");
		Assert.assertEquals(thCreatedOn.getText(), "Created On", "Created On Column missing. ,");
		Assert.assertEquals(thCreatedOn.getAttribute("class"), "thTd sorting",
				"sorting option is missing on Created On column. ,");
		Assert.assertEquals(thStatus.getText(), "Status", "Status column missing. ,");
		Assert.assertEquals(thStatus.getAttribute("class"), "thTd sorting",
				"sorting option is missing on Status column. ,");
		Assert.assertEquals(thAction.getText(), "Action", "Action column missing. ,");
		Assert.assertEquals(thAction.getAttribute("class"), "thTd sorting_disabled",
				"Remove Sorting option from Action column. ,");
	}

	public void List_Hospitals_ReviewerData_Tests(SoftAssert Assert) throws IOException {
		resetButton.click();
		Properties properties = new Properties();
		FileInputStream inputstream = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\reviewerHos.properties");
		properties.load(inputstream);
		String hosName = properties.getProperty("hosName");
		hosName = hosName.toUpperCase();
		String hosCity = properties.getProperty("hosCity");
		String level = "REVIEWER";
		filterButton.click();
		Select s = new Select(hosNameFilterDdown);
		s.selectByValue(hosName);
		Select s1 = new Select(hosLevelFilterDdown);
		s1.selectByValue(level);
		// scroll filters
		Actions actions = new Actions(driver);
		actions.moveToElement(hosCityFilterDdown).perform();	
		Select s2 = new Select(hosCityFilterDdown);
		s2.selectByValue(hosCity);
		filterPopupCloseButton.click();
		Assert.assertTrue(listRecordCount.getText().contains("Showing 1 to 1 of 1 entries"),
				"Duplicate Records Found., ");
		String hosnameTData = HosNameData.getText();
		String hoscityTData = HosCityData.getText();
		if (hosnameTData.equals(hosName) && hoscityTData.equals(hosCity)) {
			Assert.assertTrue(true, "REVIEWER Hos Data is correctly populated in the table., ");
		} else {
			Assert.assertTrue(false, "REVIEWER Hos Data is not populated correctly in the table., ");
		}
	}

	public void List_Hospitals_UpdateReviewerHos_Tests(SoftAssert Assert) throws IOException {
		Assert.assertTrue(ActionButton.isDisplayed(), "ActionButton is not displayed. ,");
		Assert.assertTrue(ActionButton.isEnabled(), "ActionButton is not Enabled. ,");
		Properties properties = new Properties();
		FileInputStream inputstream = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\reviewerHos.properties");
		properties.load(inputstream);
		String hosName = properties.getProperty("hosName");
		hosName = hosName.toUpperCase();
		String hosAdd = properties.getProperty("hosAdd");
		String hosCity = properties.getProperty("hosCity");
		String pin = properties.getProperty("pin");
		String caUsername = properties.getProperty("caUsername");
		String caName = properties.getProperty("caName");
		String caEmail = properties.getProperty("caEmail");
		String caMobile = properties.getProperty("caMobile");
		if (ActionButton.isDisplayed() && ActionButton.isEnabled()) {
			ActionButton.click();
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOf(HospitalCodeLabel));
			Assert.assertEquals(HospitalCodeLabel.getText(), "Hospital Code:",
					"Failed:List_Hospitals_UpdateReviewerHos_Tests, Hospital Code Label missing. ,");
			Assert.assertTrue(HospitalCode.isDisplayed(),
					"Failed:List_Hospitals_UpdateReviewerHos_Tests, Hospital Code is missing. ,");
			Assert.assertEquals(hospitalName_label.getText(), "Hospital Name *",
					"Failed:List_Hospitals_UpdateReviewerHos_Tests, hospitalName label is missing. ,");
			Assert.assertEquals(hospitalName_input.getAttribute("value"), hosName,
					"Failed:List_Hospitals_UpdateReviewerHos_Tests, hospitalName is incorrectly populated. ,");
			Assert.assertEquals(hospitalType_label.getText(), "Hospital Type*",
					"Failed:List_Hospitals_UpdateReviewerHos_Tests, hospitalType label is missing. ,");
			Assert.assertEquals(Address_label.getText(), "Address *",
					"Failed:List_Hospitals_UpdateReviewerHos_Tests, Address label is missing. ,");
			Assert.assertEquals(Address_input.getAttribute("value"), hosAdd,
					"Failed:List_Hospitals_UpdateReviewerHos_Tests, Address is incorrectly populated. ,");
			Assert.assertEquals(state_label.getText(), "State*",
					"Failed:List_Hospitals_UpdateReviewerHos_Tests, state label is missing. ,");
			Assert.assertEquals(district_label.getText(), "District*",
					"Failed:List_Hospitals_UpdateReviewerHos_Tests, District label is missing. ,");
			Assert.assertEquals(city_label.getText(), "City*",
					"Failed:List_Hospitals_UpdateReviewerHos_Tests, city label is missing. ,");
			Assert.assertEquals(city_input.getAttribute("value"), hosCity,
					"Failed:List_Hospitals_UpdateReviewerHos_Tests, city is incorrectly populated. ,");
			Assert.assertEquals(pin_label.getText(), "Pin*",
					"Failed:List_Hospitals_UpdateReviewerHos_Tests, pin label is missing. ,");
			Assert.assertEquals(pin_input.getAttribute("value"), pin,
					"Failed:List_Hospitals_UpdateReviewerHos_Tests, Pin is incorrectly populated. ,");

			Assert.assertEquals(caFormTitle.getText(), "Nodal Officer Details", "Nodal Officer title is missing. ,");
			Assert.assertEquals(caUsernameLabel.getText(), "Username*",
					"Failed:List_Hospitals_UpdateReviewerHos_Tests, username label is missing. ,");
			Assert.assertEquals(caUsernameInput.getAttribute("value"), caUsername,
					"Failed:List_Hospitals_UpdateReviewerHos_Tests, Username is incorrectly populated. ,");
			Assert.assertEquals(caNameLabel.getText(), "Nodal Officer Name *",
					"Failed:List_Hospitals_UpdateReviewerHos_Tests, Nodal Officer Name label is missing. ,");
			Assert.assertEquals(caNameInput.getAttribute("value"), caName,
					"Failed:List_Hospitals_UpdateReviewerHos_Tests, Nodal Officer Name is incorrectly populated. ,");
			Assert.assertEquals(caEmailLabel.getText(), "Nodal Officer Email *",
					"Failed:List_Hospitals_UpdateReviewerHos_Tests, Nodal Officer Email label is missing. ,");
			Assert.assertEquals(caEmailInput.getAttribute("value"), caEmail,
					"Failed:List_Hospitals_UpdateReviewerHos_Tests, Nodal Officer Email is incorrectly populated. ,");
			Assert.assertEquals(caMobileLabel.getText(), "Nodal Officer Mobile *",
					"Failed:List_Hospitals_UpdateReviewerHos_Tests, Nodal Officer Mobile label is missing. ,");
			Assert.assertEquals(caMobileInput.getAttribute("value"), caMobile,
					"Failed:List_Hospitals_UpdateReviewerHos_Tests, Nodal Officer Mobile is incorrectly populated. ,");
			if (hospitalStatusCheck.isSelected()) {
				// System.out.println("Checkbox already selected. ");
			} else {
				hospitalStatusCheck.click();
			}
			if (caSelectionCheck.isSelected()) {
				// System.out.println("Checkbox already selected. ");
			} else {
				caSelectionCheck.click();
			}
			Assert.assertEquals(Remark.getText(), "Remarks*", "Remark label is missing. ,");
			RemarkInput.sendKeys(hosCity);
			hospitalSaveButton.click();
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			driver.switchTo().alert().accept();
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			wait.until(ExpectedConditions.visibilityOf(successMsg));
			Assert.assertEquals(successMsg.getText(), "The Hospital Details are updated Successfully",
					"Failed:List_Hospitals_UpdateReviewerHos_Tests, Reviewer hospitals Success Msg is incorrect., ");
		}

	}

	public void List_Hospitals_EndUserData_Tests(SoftAssert Assert) throws IOException {
		List_Button.click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(resetButton));
		resetButton.click();
		Properties properties = new Properties();
		FileInputStream inputstream = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\endUserHos.properties");
		properties.load(inputstream);
		String hosName = properties.getProperty("hosName");
		hosName = hosName.toUpperCase();
		String hosCity = properties.getProperty("hosCity");
		String level = "ENDUSER";
		filterButton.click();
		Select s = new Select(hosNameFilterDdown);
		s.selectByValue(hosName);
		Select s1 = new Select(hosLevelFilterDdown);
		s1.selectByValue(level);
		// scroll filters
		Actions actions = new Actions(driver);
		actions.moveToElement(hosCityFilterDdown).perform();
		Select s2 = new Select(hosCityFilterDdown);
		s2.selectByValue(hosCity);
		filterPopupCloseButton.click();
		Assert.assertTrue(listRecordCount.getText().contains("Showing 1 to 1 of 1 entries"),
				"Only Filtered record should display., ");
		String hosNameTData = HosNameData.getText();
		String hosCityTData = HosCityData.getText();
		if (hosNameTData.equals(hosName) && hosCityTData.equals(hosCity)) {
			Assert.assertTrue(true, "ENDUSER Hos Data is correctly populated in the table., ");
		} else {
			Assert.assertTrue(false, "ENDUSER Hos Data is not populated correctly in the table., ");
		}

	}

	public void List_Hospitals_UpdateEnduserHos_Tests(SoftAssert Assert) throws IOException {
		Assert.assertTrue(ActionButton.isDisplayed(), "ActionButton is not displayed. ,");
		Assert.assertTrue(ActionButton.isEnabled(), "ActionButton is not Enabled. ,");
		Properties properties = new Properties();
		FileInputStream inputstream = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\endUserHos.properties");
		properties.load(inputstream);
		String hosName = properties.getProperty("hosName");
		hosName = hosName.toUpperCase();
		String hosAdd = properties.getProperty("hosAdd");
		String hosCity = properties.getProperty("hosCity");
		String pin = properties.getProperty("pin");
		if (ActionButton.isDisplayed() && ActionButton.isEnabled()) {
			ActionButton.click();
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOf(HospitalCodeLabel));
			Assert.assertEquals(HospitalCodeLabel.getText(), "Hospital Code:",
					"Failed:List_Hospitals_UpdateEnduserHos_Tests, Hospital Code Label missing. ,");
			Assert.assertTrue(HospitalCode.isDisplayed(),
					"Failed:List_Hospitals_UpdateEnduserHos_Tests, Hospital Code is missing. ,");
			Assert.assertEquals(hospitalName_label.getText(), "Hospital Name *",
					"Failed:List_Hospitals_UpdateEnduserHos_Tests, hospitalName label is missing. ,");
			Assert.assertEquals(hospitalName_input.getAttribute("value"), hosName,
					"Failed:List_Hospitals_UpdateEnduserHos_Tests, hospitalName is incorrectly populated. ,");
			Assert.assertEquals(hospitalType_label.getText(), "Hospital Type*",
					"Failed:List_Hospitals_UpdateEnduserHos_Tests, hospitalType label is missing. ,");
			Assert.assertEquals(Address_label.getText(), "Address *",
					"Failed:List_Hospitals_UpdateEnduserHos_Tests, Address label is missing. ,");
			Assert.assertEquals(Address_input.getAttribute("value"), hosAdd,
					"Failed:List_Hospitals_UpdateEnduserHos_Tests, Address is incorrectly populated. ,");
			Assert.assertEquals(state_label.getText(), "State*",
					"Failed:List_Hospitals_UpdateEnduserHos_Tests, state label is missing. ,");
			Assert.assertEquals(district_label.getText(), "District*",
					"Failed:List_Hospitals_UpdateEnduserHos_Tests, District label is missing. ,");
			Assert.assertEquals(city_label.getText(), "City*",
					"Failed:List_Hospitals_UpdateEnduserHos_Tests, city label is missing. ,");
			Assert.assertEquals(city_input.getAttribute("value"), hosCity,
					"Failed:List_Hospitals_UpdateEnduserHos_Tests, city is incorrectly populated. ,");
			Assert.assertEquals(pin_label.getText(), "Pin*",
					"Failed:List_Hospitals_UpdateEnduserHos_Tests, pin label is missing. ,");
			Assert.assertEquals(pin_input.getAttribute("value"), pin,
					"Failed:List_Hospitals_UpdateEnduserHos_Tests, Pin is incorrectly populated. ,");
			if (hospitalStatusCheck.isSelected()) {
				System.out.println("Checkbox already selected. ");
			} else {
				hospitalStatusCheck.click();
			}
			Assert.assertEquals(Remark.getText(), "Remarks*", "Remark label is missing. ,");
			RemarkInput.sendKeys(hosCity);
			hospitalSaveButton.click();
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			driver.switchTo().alert().accept();
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			wait.until(ExpectedConditions.visibilityOf(successMsg));
			Assert.assertEquals(successMsg.getText(), "The Hospital Details are updated Successfully",
					"Failed:List_Hospitals_UpdateEnduserHos_Tests, Enduser hospitals Success Msg is incorrect., ");

		}

	}

	public void List_Hospitals_Search_Validations(SoftAssert Assert) throws IOException {
		Assert.assertTrue(Search_Button.isDisplayed(), "Search_Button not diaplayed. ,");
		Assert.assertTrue(Search_Button.isEnabled(), "Search_Button not enabled. ,");
		if (Search_Button.isDisplayed() && Search_Button.isEnabled()) {
			Assert.assertEquals(Search_Button.getAttribute("class"), "btn nicbgcolor hospitals",
					"Search button should not highlight by default. ,");
			Search_Button.click();
			Assert.assertEquals(Search_Button.getAttribute("class"), "btn nicbgcolor hospitals focus active",
					"Search button should highlight after click. ,");
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.elementToBeClickable(sButton));
			sButton.click();
			Assert.assertEquals(noDataError.getText(), "At least one input is required for searching",
					"Error msg is incorrect when no prameter given for search. ,");
			Search_Button.click();
			Assert.assertEquals(sHosCode_label.getText(), "Hospital Code", "Hospital Code label is missing. ,");
			Assert.assertEquals(sHosLevel_label.getText(), "Hospital Level", "Hospital Level label is missing. ,");
			Assert.assertEquals(sHosName_label.getText(), "Hospital Name", "Hospital Name label is missing. ,");
			Assert.assertEquals(sHosType_label.getText(), "Hospital Type", "Hospital Type label is missing. ,");
			Assert.assertEquals(sState_label.getText(), "State", "State label is missing. ,");
			Assert.assertEquals(sCity_label.getText(), "City", "City label is missing. ,");
			sHosCode_input.sendKeys("zz");
			sButton.click();
			wait.until(ExpectedConditions.elementToBeClickable(msgClose));
			Assert.assertTrue(msgClose.isDisplayed(),
					"error msg with close button not displayed for incorrect code searched. ,");
			if (msgClose.isDisplayed()) {
				msgClose.click();
			}
			Search_Button.click();
			Properties properties = new Properties();
			FileInputStream inputstream = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\reviewerHos.properties");
			properties.load(inputstream);
			String hosName = properties.getProperty("hosName");
			hosName = hosName.toUpperCase();
			sHosName_input.sendKeys(hosName);
			sButton.click();
			wait.until(ExpectedConditions.visibilityOf(searchedHosName));
			Assert.assertEquals(searchedHosName.getText(), hosName, "Search failed. ,");
		}

	}

}

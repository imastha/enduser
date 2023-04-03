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

public class Admin_HospitalUsers_Pages {

	WebDriver driver;

	public Admin_HospitalUsers_Pages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// WebElements

	@FindBy(xpath = "//*[@id='cardbguser']")
	WebElement hosUsersVcard;

	@FindBy(xpath = "//*[@id='countuser']")
	WebElement vCardCount;

	@FindBy(xpath = "//*[@id='cardbguser']/h7")
	WebElement vCardName;

	@FindBy(xpath = "//*[@id='cardadmin']/div[5]/div/label[1]")
	WebElement listButton;

	@FindBy(xpath = "//*[@id='cardadmin']/div[5]/div/label[2]")
	WebElement addButton;

	@FindBy(xpath = "//*[@id='cardadmin']/div[5]/div/label[3]")
	WebElement searchButton;

	// Add Form elements

	@FindBy(xpath = "//*[@id='addupdateform']/div/div[5]/div[2]/div[1]/span")
	WebElement addFormTitle;

	@FindBy(xpath = "//*[@id='divmainuser']/div[2]/div[3]/div/b")
	WebElement userType_label;

	@FindBy(xpath = "//*[@id='usrroleId']")
	WebElement userType_ddown;

	@FindBy(xpath = "//*[@id='usrroleIdErr']")
	WebElement userType_err;

	@FindBy(xpath = "//*[@id='divusrhospitalId']/div/b")
	WebElement hospital_label;

	@FindBy(xpath = "//*[@id='usrhospitalId']")
	WebElement hospital_ddown;

	@FindBy(xpath = "//*[@id='usrhospitalIdErr']")
	WebElement hospital_err;

	@FindBy(xpath = "//*[@id='addupdateform']/div/div[5]/div[2]/div[5]/div/b")
	WebElement userName_label;

	@FindBy(xpath = "//*[@id='addupdateform']/div/div[5]/div[2]/div[5]/div/span")
	WebElement userName_hint;

	@FindBy(xpath = "//*[@id='usrusername']")
	WebElement userName_input;

	@FindBy(xpath = "//*[@id='usrusernameErr']")
	WebElement userName_err;

	@FindBy(xpath = "//*[@id='addupdateform']/div/div[5]/div[2]/div[6]/div/b")
	WebElement name_label;

	@FindBy(xpath = "//*[@id='addupdateform']/div/div[5]/div[2]/div[6]/div/span")
	WebElement name_hint;

	@FindBy(xpath = "//*[@id='usrname']")
	WebElement name_input;

	@FindBy(xpath = "//*[@id='usrnameErr']")
	WebElement name_err;

	@FindBy(xpath = "//*[@id='addupdateform']/div/div[5]/div[2]/div[7]/div/b")
	WebElement email_label;

	@FindBy(xpath = "//*[@id='addupdateform']/div/div[5]/div[2]/div[7]/div/span")
	WebElement email_hint;

	@FindBy(xpath = "//*[@id='usremail']")
	WebElement email_input;

	@FindBy(xpath = "//*[@id='usremailErr']")
	WebElement email_err;

	@FindBy(xpath = "//*[@id='addupdateform']/div/div[5]/div[2]/div[8]/div/b")
	WebElement mobile_label;

	@FindBy(xpath = "//*[@id='addupdateform']/div/div[5]/div[2]/div[8]/div/span")
	WebElement mobile_hint;

	@FindBy(xpath = "//*[@id='usrmobile']")
	WebElement mobile_input;

	@FindBy(xpath = "//*[@id='usrmobileErr']")
	WebElement mobile_err;

	@FindBy(xpath = "//*[@id='user-save']")
	WebElement saveUserButton;

	// Success Page

	@FindBy(xpath = "//*[@id='usersavemsg']")
	WebElement successmsg;

	// List

	@FindBy(xpath = "//*[@id='tblUserList_info']")
	WebElement listRecCount;

	@FindBy(xpath = "//*[@id='divmainuser']/div[1]/div[1]/b[1]")
	WebElement tableHeading;

	@FindBy(xpath = "//*[@id='tblUserList_wrapper']/div[2]/button[1]")
	WebElement hideColumnButton;

	@FindBy(xpath = "//*[@id='tblUserList_wrapper']/div[2]/div[2]")
	WebElement hideColumnMenu;

	@FindBy(xpath = "//*[@id='tblUserList_wrapper']/div[2]/div[1]")
	WebElement background;

	@FindBy(xpath = "//*[@id='tblUserList_wrapper']/div[2]/div[2]/button[1]")
	WebElement hideCodeButton;

	@FindBy(xpath = "//*[@id='tblUserList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[1]")
	WebElement tableHeader1;

	@FindBy(xpath = "//*[@id='tblUserList_wrapper']/div[2]/button[2]")
	WebElement resetButton;

	@FindBy(xpath = "//*[@id='tblUserList_wrapper']/div[2]/button[3]")
	WebElement filterButton;

	@FindBy(xpath = "//*[@id='tblUserList_wrapper']/div[2]/button[4]")
	WebElement reloadButton;

	// Filter popup

	@FindBy(xpath = "//*[@id='filterPopup']")
	WebElement filterPopup;

	@FindBy(xpath = "//*[@id='filterform']/label")
	WebElement filterPopupHeading;

	@FindBy(xpath = "//*[@id='tblusrdashcombcase0']")
	WebElement codeFilter;

	@FindBy(xpath = "//*[@id='tblusrdashcombcase1']")
	WebElement typeFilter;

	@FindBy(xpath = "//*[@id='tblusrdashcombcase3']")
	WebElement nameFilter;

	@FindBy(xpath = "//*[@id='tblusrdashcombcase4']")
	WebElement hosFilter;

	@FindBy(xpath = "//*[@id='popupclose']")
	WebElement popupCloseButton;

	@FindBy(xpath = "//*[@id='tblUserList_title']")
	WebElement appliedFilterName;

	// FilterResult

	@FindBy(xpath = "//*[@id='user_list_tbl']/tr/td[2]")
	WebElement tdType;

	@FindBy(xpath = "//*[@id='user_list_tbl']/tr/td[4]")
	WebElement tdName;

	@FindBy(xpath = "//*[@id='user_list_tbl']/tr/td[5]")
	WebElement tdHospital;

	// update action

	@FindBy(xpath = "//*[@id='user_list_tbl']/tr/td[12]/button")
	WebElement actionButton;

	// sorting

	@FindBy(xpath = "//*[@id='tblUserList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[1]")
	WebElement thCode;

	@FindBy(xpath = "//*[@id='tblUserList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[2]")
	WebElement thType;

	@FindBy(xpath = "//*[@id='tblUserList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[3]")
	WebElement thUsername;

	@FindBy(xpath = "//*[@id='tblUserList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[4]")
	WebElement thName;

	@FindBy(xpath = "//*[@id='tblUserList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[5]")
	WebElement thHospital;

	@FindBy(xpath = "//*[@id='tblUserList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[6]")
	WebElement thEmail;

	@FindBy(xpath = "//*[@id='tblUserList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[7]")
	WebElement thMobile;

	@FindBy(xpath = "//*[@id='tblUserList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[8]")
	WebElement thCreatedOn;

	@FindBy(xpath = "//*[@id='tblUserList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[9]")
	WebElement thIsActive;

	@FindBy(xpath = "//*[@id='tblUserList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[10]")
	WebElement thIsLocked;

	@FindBy(xpath = "//*[@id='tblUserList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[11]")
	WebElement thIsAvailable;

	@FindBy(xpath = "//*[@id='tblUserList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[12]")
	WebElement thActions;
	
	//update/acton
	
	@FindBy(xpath = "//*[@id='divusrcode']/div/b")
	WebElement userCode_label;
	
	@FindBy(xpath = "//*[@id='usrcode']")
	WebElement userCode;
	
	@FindBy(xpath = "//*[@id='divusrstatus']/div/b")
	WebElement statusCheckBoxesLabel;
	
	@FindBy(xpath = "//*[@id='usrstatus']")
	WebElement isActiveCheckBox;
	
	@FindBy(xpath = "//*[@id='usrisAvailable']")
	WebElement isAvailableCheckBox;
	
	@FindBy(xpath = "//*[@id='divusrremark']/div/b")
	WebElement remarkLabel;
	
	@FindBy(xpath = "//*[@id='usruserRemarks']")
	WebElement remarkTextArea;
	
	//search
	
	@FindBy(xpath = "//*[@id='user-search']")
	WebElement sButton;
	
	@FindBy(xpath = "//*[@id='commonError']")
	WebElement noDataError;
	
	@FindBy(xpath = "//*[@id='divmainuser']/div[3]/div[2]/div/b")
	WebElement sHospital_label;
	
	@FindBy(xpath = "//*[@id='userShospitalName']")
	WebElement sHospital_input;
	
	@FindBy(xpath = "//*[@id='divmainuser']/div[3]/div[3]/div/b")
	WebElement sUsername_label;
	
	@FindBy(xpath = "//*[@id='userSusername']")
	WebElement sUsername_input;
	
	@FindBy(xpath = "//*[@id='divmainuser']/div[3]/div[4]/div/b")
	WebElement sEmail_label;
	
	@FindBy(xpath = "//*[@id='userSemail']")
	WebElement sEmail_input;
	
	@FindBy(xpath = "//*[@id='divmainuser']/div[3]/div[5]/div/b")
	WebElement sMobile_label;

	@FindBy(xpath = "//*[@id='userSmobile']")
	WebElement sMobile_input;
	
	@FindBy(xpath = "//*[@id='msgclose']")
	WebElement msgClose;
	
	@FindBy(xpath = "//*[@id='tbodyradiologists']/tr/td[5]")
	WebElement searchedHosName;
	
	@FindBy(xpath = "/html/body/div[1]/div/p/button[2]")
	WebElement logoutButton;

	// code

	public void open_HosUsers_Tests(SoftAssert Assert) {
		Assert.assertTrue(hosUsersVcard.isDisplayed(), "Hospital Users vCard is not displayed. ,");
		if (hosUsersVcard.isDisplayed()) {
			Assert.assertEquals(hosUsersVcard.getAttribute("class"), "card-body bg-success",
					"Hospital Users vCard should not highlight by default. ,");
			hosUsersVcard.click();
			Assert.assertEquals(hosUsersVcard.getAttribute("class"), "card-body bg-success border border-danger",
					"Hospital Users vCard should highlight when clicked. ,");
		}
	}

	public void hospitalUsers_DefaultPage_Test(SoftAssert Assert) {
		Assert.assertTrue(listButton.isDisplayed(), "List button not displayed. ,");
		Assert.assertTrue(addButton.isDisplayed(), "Add button not displayed. ,");
		Assert.assertTrue(searchButton.isDisplayed(), "Search button not displayed. ,");
		if (listButton.isDisplayed()) {
			Assert.assertEquals(listButton.getAttribute("class"), "btn nicbgcolor user active",
					"List button is not highlighted by default. ,");
		}
		if (addButton.isDisplayed()) {
			Assert.assertEquals(addButton.getAttribute("class"), "btn nicbgcolor user",
					"Add button should not highlighted by default. ,");
		}
		if (searchButton.isDisplayed()) {
			Assert.assertEquals(searchButton.getAttribute("class"), "btn nicbgcolor user",
					"Search button should not highlighted by default. ,");
		}
	}

	public void hospitalUsers_AddForm_NoData_Tests(SoftAssert Assert) {
		if (addButton.isDisplayed()) {
			addButton.click();
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.textToBePresentInElement(userType_label, "User Type*"));
			Assert.assertEquals(addButton.getAttribute("class"), "btn nicbgcolor user focus active",
					"Add button should highlight when clicked. ,");
			Assert.assertEquals(addFormTitle.getText(), "Add new User", "Add new User form title is incorrect. ,");
			Assert.assertTrue(saveUserButton.isDisplayed(), "save User Button is not displayed. ,");
			Assert.assertTrue(saveUserButton.isEnabled(), "Save User Button is not enabled. ,");
			if (saveUserButton.isDisplayed() && saveUserButton.isEnabled()) {
				saveUserButton.click();
				Assert.assertEquals(userType_label.getText(), "User Type*", "User Type label is incorrect. ,");
				Assert.assertEquals(userType_err.getText(), "Required Field", "User Type error msg is incorrect. ,");
				Assert.assertEquals(hospital_label.getText(), "Hospital*", "Hospital label is incorrect. ,");
				Assert.assertEquals(hospital_err.getText(), "Required Field", "Hospital Error msg is incorrect. ,");
				Assert.assertEquals(userName_label.getText(), "Username*", "Username label is incorrect. ,");
				Assert.assertEquals(userName_hint.getText(),
						"[Username should be alphanumeric [allowed special characters dot(.), @, underscore(_), dash(-) and length 3 to 50]",
						"Username hint is incorrect. ,");
				Assert.assertEquals(userName_err.getText(), "Required Field", "Username Error msg is incorrect. ,");
				Assert.assertEquals(name_label.getText(), "Full Name*", "Full Name label is incorrect. ,");
				Assert.assertEquals(name_hint.getText(), "[Allows characters, dot, space and length 3 - 70]",
						"Full Name hint is incorrect. ,");
				Assert.assertEquals(name_err.getText(), "Required Field", "Full Name Error msg is incorrect. ,");
				Assert.assertEquals(email_label.getText(), "Email*", "Email label is incorrect. ,");
				Assert.assertEquals(email_hint.getText(), "[ Minimum 3 and maximum 70 character]",
						"Email hint is incorrect. ,");
				Assert.assertEquals(email_err.getText(), "Required Field", "Email Error msg is incorrect. ,");
				Assert.assertEquals(mobile_label.getText(), "Mobile*", "Mobile label is incorrect. ,");
				Assert.assertEquals(mobile_hint.getText(), "[ 10 Digits]", "Mobile hint is incorrect. ,");
				Assert.assertEquals(mobile_err.getText(), "Required Field", "Mobile Error msg is incorrect. ,");
			}
		}
	}

	public void HosUsers_AddForm_Tests(String test, SoftAssert Assert, String userName, String name, String email,
			String mobile) throws IOException, InterruptedException {
		if (addButton.isDisplayed()) {
			addButton.click();
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.textToBePresentInElement(userType_label, "User Type*"));
			if (test.equals("0")) {
				Select s = new Select(userType_ddown);
				s.selectByValue("-1");
			} else if (test.equals("1")) {
				Select s = new Select(userType_ddown);
				s.selectByValue("7");
				Properties properties = new Properties();
				FileInputStream inputstream = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\reviewerHos.properties");
				properties.load(inputstream);
				String hosName = properties.getProperty("hosName");
				hosName = hosName.toUpperCase() + ", AIIMS, Jammu and Kashmir";
				Select s1 = new Select(hospital_ddown);
				s1.selectByVisibleText(hosName);
			} else {
				Select s = new Select(userType_ddown);
				s.selectByValue("9");
				Properties properties = new Properties();
				FileInputStream inputstream = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\endUserHos.properties");
				properties.load(inputstream);
				String hosName = properties.getProperty("hosName");
				hosName = hosName.toUpperCase() + ", AIIMS, Jammu and Kashmir";
				Select s1 = new Select(hospital_ddown);
				s1.selectByVisibleText(hosName);
			}
			userName_input.sendKeys(userName);
			name_input.sendKeys(name);
			email_input.sendKeys(email);
			mobile_input.sendKeys(mobile);
			saveUserButton.click();
			if (test.equals("0")) {
				Assert.assertEquals(userType_err.getText(), "Please select valid data",
						"Neg Test: UserType error msg is incorrect. ,");
				Assert.assertEquals(userName_err.getText(),
						"Username should be alphanumeric [allowed special characters dot(.), @, underscore(_),dash(-)] and length 3 to 50",
						"Neg Test: UserName error msg is incorrect. ,");
				Assert.assertEquals(name_err.getText(), "Allows characters, dot, space and length 3 - 70",
						"Neg Test: Full Name error msg is incorrect. ,");
				Assert.assertEquals(email_err.getText(), "Wrong Email", "Neg Test: Email error msg is incorrect. ,");
				Assert.assertEquals(mobile_err.getText(), "Please enter valid 10 digit mobile",
						"Neg Test: Mobile error msg is incorrect. ,");
			} else {
				wait.until(ExpectedConditions.textToBePresentInElement(successmsg,
						"New User saved successfully. A password reset link has been sent to registered email address."));
				Assert.assertEquals(successmsg.getText(),
						"New User saved successfully. A password reset link has been sent to registered email address.",
						"Success msg for radiologist is incorrect. ,");
			}
			if (test.equals("1")) {
				Properties properties = new Properties();
				FileOutputStream outputstream = new FileOutputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\radiologist.properties");
				properties.setProperty("userName", userName);
				properties.setProperty("name", name);
				properties.setProperty("email", email);
				properties.setProperty("mobile", mobile);
				properties.store(outputstream, null);
			} else if (test.equals("2")) {
				Properties properties = new Properties();
				FileOutputStream outputstream = new FileOutputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\endUser.properties");
				properties.setProperty("userName", userName);
				properties.setProperty("name", name);
				properties.setProperty("email", email);
				properties.setProperty("mobile", mobile);
				properties.store(outputstream, null);
			}
		}
	}

	public void hospitalUsers_vCardCount_recordCount(SoftAssert Assert) throws IOException {
		String vCardCountNew = vCardCount.getText();
		Properties properties = new Properties();
		FileInputStream inputstream = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\adminVcardCounts.properties");
		properties.load(inputstream);
		String vCardCountOld = properties.getProperty("hosUserVcardCount");
		Assert.assertNotEquals(vCardCountNew, vCardCountOld,
				"Failed: hospitalUsers_vcard_count_Tests, Hospital Users vCard count not updated., ");
		listButton.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		// scroll
		Actions actions = new Actions(driver);
		actions.moveToElement(listRecCount).perform();
		Assert.assertEquals(listRecCount.getText(), "Showing 1 to 15 of 26 entries");
		Assert.assertTrue(listRecCount.getText().contains(vCardCountNew),
				"Showing list record count does not match with Hospital users vcard count ,");
		if (listRecCount.getText().equals("Showing 0 to 0 of 0 entries"))
			driver.quit();
	}

	public void hospitalUsers_TableHeading(SoftAssert Ravi) {
		Ravi.assertEquals(tableHeading.getText(), "Registered Users", "List heading is incorrect. ,");
	}

	public void hospitalUsers_HideColumn(SoftAssert Assert) {
		Actions actions = new Actions(driver);
		actions.moveToElement(hideColumnButton).perform();
		Assert.assertTrue(hideColumnButton.isDisplayed(), "hide Column Button is not displayed. ,");
		Assert.assertTrue(hideColumnButton.isEnabled(), "hide Column Button is not enabled. ,");
		Assert.assertEquals(hideColumnButton.getText(), "Hide Column", "Hide Column button is missing. ,");
		if (hideColumnButton.isDisplayed() && hideColumnButton.isEnabled()) {
			hideColumnButton.click();
			Assert.assertTrue(hideColumnMenu.isDisplayed(),
					"hide Column Menu should display when clicked on hide Column Button. ,");
			Assert.assertTrue(hideCodeButton.isDisplayed(), "hide Buttons in menu is not displayed. ,");
			Assert.assertEquals(hideCodeButton.getText(), "Code", "hide Code Button is not displayed. ,");
			Assert.assertTrue(hideCodeButton.isEnabled(), "hide Buttons in menu is not enabled. ,");
			if (hideCodeButton.isDisplayed() && hideCodeButton.isEnabled()) {
				hideCodeButton.click();
				background.click();
				Assert.assertEquals(tableHeader1.getText(), "Type", "Hide Column is not working as expected. ,");
				Assert.assertTrue(resetButton.isDisplayed(), "Reset Button is not displayed. ,");
				Assert.assertTrue(resetButton.isEnabled(), "Reset Button is not enabled. ,");
				resetButton.click();
				Assert.assertEquals(tableHeader1.getText(), "Code", "Reset button is not working. ,");
			}
		}
	}

	public void hospitalUsers_Filters(SoftAssert Assert) {
		Assert.assertTrue(filterButton.isDisplayed(), "Filter button is not displayed. ,");
		Assert.assertTrue(filterButton.isEnabled(), "Filter button is not enabled. ,");
		if (filterButton.isDisplayed() && filterButton.isEnabled()) {
			filterButton.click();
			Assert.assertTrue(filterPopup.isDisplayed(),
					"Filter pop up should be displayed when clicked on Filter button. ,");
			if (filterPopup.isDisplayed()) {
				Assert.assertEquals(filterPopupHeading.getText(),
						"Filter the Table By Using either Drop Down or Search Box",
						"Filter popup heading is incorrect. ,");
				Select s = new Select(codeFilter);
				s.selectByIndex(1);
				Assert.assertTrue(popupCloseButton.isDisplayed(), "Filter popup close button not displayed. ,");
				Assert.assertTrue(popupCloseButton.isEnabled(), "Filter popup close button not enabled. ,");
				if (popupCloseButton.isDisplayed() && popupCloseButton.isEnabled()) {
					popupCloseButton.click();
					Assert.assertTrue(listRecCount.getText().contains("Showing 1 to 1 of 1 entries"),
							"Filter option is not working. ,");
					Assert.assertTrue(appliedFilterName.getText().contains("[Filtered By Column- Code:"),
							"Applied filter name is not displayed in the List Heading. ,");
					Assert.assertTrue(reloadButton.isDisplayed(), "Reload Button is not displayed. ,");
					Assert.assertTrue(reloadButton.isEnabled(), "Reload Button is not enabled. ,");
					if (reloadButton.isDisplayed() && reloadButton.isEnabled()) {
						reloadButton.click();
						Actions actions = new Actions(driver);
						actions.moveToElement(listRecCount).perform();
						Assert.assertFalse(listRecCount.getText().contains("Showing 1 to 1 of 1 entries"),
								"Reload option is not working. ,");
						actions.moveToElement(appliedFilterName).perform();
						Assert.assertFalse(appliedFilterName.getText().contains("[Filtered By Column- Code:"),
								"Applied filter name is not removed from the List Heading when clicked on reload. ,");
						resetButton.click();
					}
				}
			}
		}
	}

	public void hospitalUsers_columnSorting(SoftAssert Assert) {
		Assert.assertEquals(thCode.getText(), "Code", "Code Column missing. ,");
		Assert.assertEquals(thCode.getAttribute("class"), "thTd sorting_desc",
				"descending sorting is missing on code column. ,");
		Assert.assertEquals(thType.getText(), "Type", "Type Column missing. ,");
		Assert.assertEquals(thType.getAttribute("class"), "thTd sorting",
				"sorting option is missing on Type column. ,");
		Assert.assertEquals(thUsername.getText(), "Username", "Username Column missing. ,");
		Assert.assertEquals(thUsername.getAttribute("class"), "thTd sorting",
				"sorting option is missing on Username column. ,");
		Assert.assertEquals(thName.getText(), "Name", "Name column missing. ,");
		Assert.assertEquals(thName.getAttribute("class"), "thTd sorting",
				"sorting option is missing on Name column. ,");
		Assert.assertEquals(thHospital.getText(), "Hospital", "Hospital column missing. ,");
		Assert.assertEquals(thHospital.getAttribute("class"), "thTd sorting",
				"sorting option is missing on Hospital column. ,");
		Assert.assertEquals(thEmail.getText(), "Email", "Email column missing. ,");
		Assert.assertEquals(thEmail.getAttribute("class"), "thTd sorting",
				"sorting option is missing on Email column. ,");
		Assert.assertEquals(thMobile.getText(), "Mobile", "Mobile column missing. ,");
		Assert.assertEquals(thMobile.getAttribute("class"), "thTd sorting",
				"sorting option is missing on Mobile column. ,");
		Assert.assertEquals(thCreatedOn.getText(), "Created On", "Created On column missing. ,");
		Assert.assertEquals(thCreatedOn.getAttribute("class"), "thTd sorting",
				"sorting option is missing on Created On column. ,");
		Actions actions = new Actions(driver);
		actions.moveToElement(thActions).perform();
		Assert.assertEquals(thIsActive.getText(), "Is Active", "Is Active column missing. ,");
		Assert.assertEquals(thIsActive.getAttribute("class"), "thTd sorting",
				"sorting option is missing on Is Active column. ,");
		Assert.assertEquals(thIsLocked.getText(), "Is Locked", "Is Locked column missing. ,");
		Assert.assertEquals(thIsLocked.getAttribute("class"), "thTd sorting",
				"sorting option is missing on Is Locked column. ,");
		Assert.assertEquals(thIsAvailable.getText(), "Is Available", "Is Available column missing. ,");
		Assert.assertEquals(thIsAvailable.getAttribute("class"), "thTd sorting",
				"sorting option is missing on Is Available column. ,");
		Assert.assertEquals(thActions.getText(), "Actions", "Actions column missing. ,");
		Assert.assertEquals(thActions.getAttribute("class"), "thTd sorting_disabled",
				"Remove Sorting option from Action column. ,");
	}

	public void hosUsersList_radiologistData(SoftAssert Assert) throws IOException {
		Properties properties = new Properties();
		FileInputStream inputStream = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\radiologist.properties");
		properties.load(inputStream);
		String name = properties.getProperty("name");
		FileInputStream fileinputStream = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\reviewerHos.properties");
		properties.load(fileinputStream);
		String hosName = properties.getProperty("hosName");
		hosName = hosName.toUpperCase();
		String userType = "RADIOLOGIST";
		filterButton.click();
		Select s1 = new Select(typeFilter);
		s1.selectByValue(userType);
		Select s2 = new Select(nameFilter);
		s2.selectByValue(name);
		Select s3 = new Select(hosFilter);
		s3.selectByValue(hosName);
		popupCloseButton.click();
		Actions action = new Actions(driver);
		action.moveToElement(listRecCount).perform();
		Assert.assertTrue(listRecCount.getText().contains("Showing 1 to 1 of 1 entries"),
				"Only one filtered record should display in the list. ,");
		String typeTbData = tdType.getText();
		String nameTbData = tdName.getText();
		String hosTbData = tdHospital.getText();
		if (typeTbData.equals(userType) && nameTbData.equals(name) && hosTbData.equals(hosName)) {
			Assert.assertTrue(true, "RADIOLOGIST Data is correctly populated in the table., ");
		} else {
			Assert.assertTrue(true, "RADIOLOGIST Data is not correctly populated in the table., ");
		}
	}

	public void update_radiologistUserData(SoftAssert Assert) throws IOException {
		Properties properties = new Properties();
		FileInputStream inputStream = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\radiologist.properties");
		properties.load(inputStream);
		String name = properties.getProperty("name");
		String email = properties.getProperty("email");
		String mobile = properties.getProperty("mobile");
		Actions action = new Actions(driver);
		action.moveToElement(thActions).perform();
		Assert.assertTrue(actionButton.isDisplayed(), "Action/update button is not displayed. ,");
		Assert.assertTrue(actionButton.isEnabled(), "Action/update button is not enabled. ,");
        if(actionButton.isDisplayed() && actionButton.isEnabled()){
        	actionButton.click();
        	WebDriverWait wait =new WebDriverWait(driver, 5);
        	wait.until(ExpectedConditions.visibilityOf(userCode_label));
        	Assert.assertEquals(addFormTitle.getText(), "Add new User", "Add/update form title is incorrect. ,");
        	Assert.assertEquals(userCode_label.getText(), "User Code:", "User Code label is incorrect. ,");
        	Assert.assertTrue(userCode.isDisplayed(), "User Code is not displayed. ,");
        	Assert.assertEquals(userType_label.getText(), "User Type*", "User Type label is incorrect. ,");
        	Assert.assertEquals(hospital_label.getText(), "Hospital*", "Hospital label is incorrect. ,");
			Assert.assertEquals(userName_label.getText(), "Username*", "Username label is incorrect. ,");
			Assert.assertEquals(userName_hint.getText(),
					"[Username should be alphanumeric [allowed special characters dot(.), @, underscore(_), dash(-) and length 3 to 50]",
					"Username hint is incorrect. ,");
			Assert.assertEquals(name_label.getText(), "Full Name*", "Full Name label is incorrect. ,");
			Assert.assertEquals(name_hint.getText(), "[Allows characters, dot, space and length 3 - 70]",
					"Full Name hint is incorrect. ,");
			Assert.assertEquals(email_label.getText(), "Email*", "Email label is incorrect. ,");
			Assert.assertEquals(email_hint.getText(), "[ Minimum 3 and maximum 70 character]",
					"Email hint is incorrect. ,");
			Assert.assertEquals(mobile_label.getText(), "Mobile*", "Mobile label is incorrect. ,");
			Assert.assertEquals(mobile_hint.getText(), "[ 10 Digits]", "Mobile hint is incorrect. ,");
        	Assert.assertEquals(statusCheckBoxesLabel.getText(), "Status of User*", "status CheckBoxes Label is incorrect. ,");
        	Assert.assertEquals(name_input.getAttribute("value"), name, "Name is populated incorrectly. ,");
        	Assert.assertEquals(email_input.getAttribute("value"), email, "Email is populated incorrectly. ,");
        	Assert.assertEquals(mobile_input.getAttribute("value"), mobile, "Mobile is populated incorrectly. ,");
        	if(isActiveCheckBox.isSelected())
        		Assert.assertTrue(true);
        	else
        		isActiveCheckBox.click();
        	if(isAvailableCheckBox.isSelected())
        		Assert.assertTrue(true);
        	else
        		isAvailableCheckBox.click();
        	remarkTextArea.sendKeys(name);
        	saveUserButton.click();
        	wait.until(ExpectedConditions.textToBePresentInElement(successmsg,
					"User data updated successfully."));
			Assert.assertEquals(successmsg.getText(),
					"User data updated successfully.",
					"Success msg for update radiologist is incorrect. ,");
        }
	}

	public void hosUsersList_endUserData(SoftAssert Assert) throws IOException {
		listButton.click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.textToBePresentInElement(tdType, "END_USER"));
		Properties properties = new Properties();
		FileInputStream inputStream = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\endUser.properties");
		properties.load(inputStream);
		String name = properties.getProperty("name");
		FileInputStream fileinputStream = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\endUserHos.properties");
		properties.load(fileinputStream);
		String hosName = properties.getProperty("hosName");
		hosName = hosName.toUpperCase();
		String userType = "END_USER";
		filterButton.click();
		Select s1 = new Select(typeFilter);
		s1.selectByValue(userType);
		Select s2 = new Select(nameFilter);
		s2.selectByValue(name);
		Select s3 = new Select(hosFilter);
		s3.selectByValue(hosName);
		popupCloseButton.click();
		Actions action = new Actions(driver);
		action.moveToElement(listRecCount).perform();
		Assert.assertTrue(listRecCount.getText().contains("Showing 1 to 1 of 1 entries"),
				"Only one filtered record should display in the list. ,");
		String typeTbData = tdType.getText();
		String nameTbData = tdName.getText();
		String hosTbData = tdHospital.getText();
		if (typeTbData.equals(userType) && nameTbData.equals(name) && hosTbData.equals(hosName)) {
			Assert.assertTrue(true, "END_USER Data is correctly populated in the table., ");
		} else {
			Assert.assertTrue(true, "END_USER Data is not correctly populated in the table., ");
		}
		
	}

	public void update_endUserData(SoftAssert Assert) throws IOException {
		Properties properties = new Properties();
		FileInputStream inputStream = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\endUser.properties");
		properties.load(inputStream);
		String name = properties.getProperty("name");
		String email = properties.getProperty("email");
		String mobile = properties.getProperty("mobile");
		Actions action = new Actions(driver);
		action.moveToElement(thActions).perform();
		Assert.assertTrue(actionButton.isDisplayed(), "Action/update button is not displayed. ,");
		Assert.assertTrue(actionButton.isEnabled(), "Action/update button is not enabled. ,");
        if(actionButton.isDisplayed() && actionButton.isEnabled()){
        	actionButton.click();
        	WebDriverWait wait =new WebDriverWait(driver, 5);
        	wait.until(ExpectedConditions.visibilityOf(userCode_label));
        	Assert.assertEquals(addFormTitle.getText(), "Add new User", "Add/update form title is incorrect. ,");
        	Assert.assertEquals(userCode_label.getText(), "User Code:", "User Code label is incorrect. ,");
        	Assert.assertTrue(userCode.isDisplayed(), "User Code is not displayed. ,");
        	Assert.assertEquals(userType_label.getText(), "User Type*", "User Type label is incorrect. ,");
        	Assert.assertEquals(hospital_label.getText(), "Hospital*", "Hospital label is incorrect. ,");
			Assert.assertEquals(userName_label.getText(), "Username*", "Username label is incorrect. ,");
			Assert.assertEquals(userName_hint.getText(),
					"[Username should be alphanumeric [allowed special characters dot(.), @, underscore(_), dash(-) and length 3 to 50]",
					"Username hint is incorrect. ,");
			Assert.assertEquals(name_label.getText(), "Full Name*", "Full Name label is incorrect. ,");
			Assert.assertEquals(name_hint.getText(), "[Allows characters, dot, space and length 3 - 70]",
					"Full Name hint is incorrect. ,");
			Assert.assertEquals(email_label.getText(), "Email*", "Email label is incorrect. ,");
			Assert.assertEquals(email_hint.getText(), "[ Minimum 3 and maximum 70 character]",
					"Email hint is incorrect. ,");
			Assert.assertEquals(mobile_label.getText(), "Mobile*", "Mobile label is incorrect. ,");
			Assert.assertEquals(mobile_hint.getText(), "[ 10 Digits]", "Mobile hint is incorrect. ,");
        	Assert.assertEquals(statusCheckBoxesLabel.getText(), "Status of User*", "status CheckBoxes Label is incorrect. ,");
        	Assert.assertEquals(name_input.getAttribute("value"), name, "Name is populated incorrectly. ,");
        	Assert.assertEquals(email_input.getAttribute("value"), email, "Email is populated incorrectly. ,");
        	Assert.assertEquals(mobile_input.getAttribute("value"), mobile, "Mobile is populated incorrectly. ,");
        	if(isActiveCheckBox.isSelected())
        		Assert.assertTrue(true);
        	else
        		isActiveCheckBox.click();
        	/*if(isAvailableCheckBox.isSelected())
        		Assert.assertTrue(true);
        	else
        		isAvailableCheckBox.click();*/
        	remarkTextArea.sendKeys(name);
        	saveUserButton.click();
        	wait.until(ExpectedConditions.textToBePresentInElement(successmsg,
					"User data updated successfully."));
			Assert.assertEquals(successmsg.getText(),
					"User data updated successfully.",
					"Success msg for update enduser is incorrect. ,");
        }	
	}

	public void hospitalUsers_search(SoftAssert Assert) throws IOException {
		Assert.assertTrue(searchButton.isDisplayed(), "Search_Button not diaplayed. ,");
		Assert.assertTrue(searchButton.isEnabled(), "Search_Button not enabled. ,");
		if (searchButton.isDisplayed() && searchButton.isEnabled()) {
			Assert.assertEquals(searchButton.getAttribute("class"), "btn nicbgcolor user",
					"Search button should not highlight by default. ,");
			searchButton.click();
			Assert.assertEquals(searchButton.getAttribute("class"), "btn nicbgcolor user focus active",
					"Search button should highlight after click. ,");
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.elementToBeClickable(sButton));
			sButton.click();
			wait.until(ExpectedConditions.textToBePresentInElement(noDataError,
					"At least one input is required for searching"));
			Assert.assertEquals(noDataError.getText(), "At least one input is required for searching",
					"Error msg is incorrect when no prameter given for search. ,");
			searchButton.click();
			wait.until(ExpectedConditions.elementToBeClickable(sButton));
			Assert.assertEquals(sHospital_label.getText(), "Hospital", "Hospital label is missing. ,");
			Assert.assertEquals(sUsername_label.getText(), "Username", "Username label is missing. ,");
			Assert.assertEquals(sEmail_label.getText(), "Email", "Email label is missing. ,");
			Assert.assertEquals(sMobile_label.getText(), "Mobile", "Mobile label is missing. ,");
			sHospital_input.sendKeys("zzfkhvbkjfd");
			sButton.click();
			wait.until(ExpectedConditions.elementToBeClickable(msgClose));
			Assert.assertTrue(msgClose.isDisplayed(),
					"error msg with close button not displayed for incorrect code searched. ,");
			if (msgClose.isDisplayed()) {
				msgClose.click();
			}
			searchButton.click();
			Properties properties = new Properties();
			FileInputStream inputstream = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\endUser.properties");
			properties.load(inputstream);
			String userName = properties.getProperty("userName");
			sUsername_input.sendKeys(userName);
			sButton.click();
			wait.until(ExpectedConditions.visibilityOf(searchedHosName));
			logoutButton.click();
		}	
	}
}

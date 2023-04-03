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

public class Admin_ClientApplication_Pages {
	WebDriver driver;

	public Admin_ClientApplication_Pages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='cardbgclient']")
	private WebElement caVcard;

	@FindBy(xpath = "//*[@id='cardadmin']/div[3]/div/label[1]")
	private WebElement ListButton;

	@FindBy(xpath = "//*[@id='cardadmin']/div[3]/div/label[2]")
	private WebElement AddButton;

	// Add Client App Form
	@FindBy(xpath = "//*[@id='divnewclienttitle']/span")
	private WebElement AddFormHeading;

	@FindBy(xpath = "//*[@id='divappname']/div/b")
	private WebElement ClientAppName_label;

	@FindBy(xpath = "//*[@id='divappname']/div/span")
	private WebElement ClientAppName_hint;

	@FindBy(xpath = "//*[@id='Cappname']")
	private WebElement ClientAppName_input;

	@FindBy(xpath = "//*[@id='CappnameErr']")
	private WebElement ClientAppName_errmsg;

	@FindBy(xpath = "//*[@id='addupdateform']/div/div[3]/div[2]/div[3]/div/b")
	private WebElement SelectOrg_label;

	@FindBy(xpath = "//*[@id='CorganizationId']")
	private WebElement SelectOrg_ddown;

	@FindBy(xpath = "//*[@id='CorganizationIdErr']")
	private WebElement SelectOrg_errmsg;

	@FindBy(xpath = "//*[@id='divclientid']/div/b")
	private WebElement ClientId_label;

	@FindBy(xpath = "//*[@id='divclientid']/div/span")
	private WebElement ClientId_hint;

	@FindBy(xpath = "//*[@id='CclientId']")
	private WebElement ClientId_input;

	@FindBy(xpath = "//*[@id='CclientIdErr']")
	private WebElement ClientId_err;

	@FindBy(xpath = "//*[@id='divnewusertitle']/span")
	private WebElement ClientAdmin_heading;

	@FindBy(xpath = "//*[@id='divusername']/div/b")
	private WebElement clientAdmin_username_label;

	@FindBy(xpath = "//*[@id='divusername']/div/span")
	private WebElement clientAdmin_username_hint;

	@FindBy(xpath = "//*[@id='Cusername']")
	private WebElement clientAdmin_username_input;

	@FindBy(xpath = "//*[@id='CusernameErr']")
	private WebElement clientAdmin_username_err;

	@FindBy(xpath = "//*[@id='divname']/div/b")
	private WebElement clientAdmin_name_label;

	@FindBy(xpath = "//*[@id='divname']/div/span")
	private WebElement clientAdmin_name_hint;

	@FindBy(xpath = "//*[@id='Cname']")
	private WebElement clientAdmin_name_input;

	@FindBy(xpath = "//*[@id='CnameErr']")
	private WebElement clientAdmin_name_err;

	@FindBy(xpath = "//*[@id='divemail']/div/b")
	private WebElement email_label;

	@FindBy(xpath = "//*[@id='divemail']/div/span")
	private WebElement email_hint;

	@FindBy(xpath = "//*[@id='Cemail']")
	private WebElement email_input;

	@FindBy(xpath = "//*[@id='CemailErr']")
	private WebElement email_err;

	@FindBy(xpath = "//*[@id='divmobile']/div/b")
	private WebElement mobile_label;

	@FindBy(xpath = "//*[@id='divmobile']/div/span")
	private WebElement mobile_hint;

	@FindBy(xpath = "//*[@id='Cmobile']")
	private WebElement mobile_input;

	@FindBy(xpath = "//*[@id='CmobileErr']")
	private WebElement mobile_err;

	@FindBy(xpath = "//*[@id='client-save']")
	private WebElement clientSaveButton;

	// Success msg page
	@FindBy(xpath = "//*[@id='trMsg']/td[1]")
	private WebElement successMsgColumn;

	@FindBy(xpath = "//*[@id='clientsavemsg']")
	private WebElement successMsg;

	// ca vcard count

	@FindBy(xpath = "//*[@id='countclient']")
	private WebElement caVcardCount;

	// Table

	@FindBy(xpath = "//*[@id='tblClientList_info']")
	private WebElement CaRecordCount;

	@FindBy(xpath = "//*[@id='addupdateform']/div/div[3]/div[1]/div[1]/b[1]")
	private WebElement caTableHeading;

	@FindBy(xpath = "//*[@id='tblClientList_wrapper']/div[2]/button[1]")
	private WebElement hideColumnButton;

	@FindBy(xpath = "//*[@id='tblClientList_wrapper']/div[2]/div[2]/button[1]")
	private WebElement hideCodeButton;

	@FindBy(xpath = "//*[@id='tblClientList_wrapper']/div[2]/div[2]")
	private WebElement hideColumnMenu;

	@FindBy(xpath = "//*[@id='tblClientList_wrapper']/div[2]/div[1]")
	private WebElement background;

	@FindBy(xpath = "//*[@id='tblClientList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[1]")
	private WebElement th1;

	@FindBy(xpath = "//*[@id='tblClientList_wrapper']/div[2]/button[3]")
	private WebElement filterButton;

	@FindBy(xpath = "//*[@id='filterPopup']")
	private WebElement filterPopup;

	@FindBy(xpath = "//*[@id='filterform']/label")
	private WebElement filterLabel;

	@FindBy(xpath = "//*[@id='tblusrdashcombcase0']")
	private WebElement searchByCodeDdown;

	@FindBy(xpath = "//*[@id='popupclose']")
	private WebElement popupclose;

	@FindBy(xpath = "//*[@id='tblClientList_title']")
	private WebElement appliedFilter;

	@FindBy(xpath = "//*[@id='tblClientList_wrapper']/div[2]/button[2]")
	private WebElement resetButton;

	@FindBy(xpath = "//*[@id='tblClientList_wrapper']/div[2]/button[4]")
	private WebElement reloadButton;

	// Table Headers

	@FindBy(xpath = "//*[@id='tblClientList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[1]")
	private WebElement thCode;

	@FindBy(xpath = "//*[@id='tblClientList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[2]")
	private WebElement thName;

	@FindBy(xpath = "//*[@id='tblClientList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[3]")
	private WebElement thOrg;

	@FindBy(xpath = "//*[@id='tblClientList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[4]")
	private WebElement thClientId;

	@FindBy(xpath = "//*[@id='tblClientList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[5]")
	private WebElement thCreatedOn;

	@FindBy(xpath = "//*[@id='tblClientList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[6]")
	private WebElement thStatus;

	@FindBy(xpath = "//*[@id='tblClientList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[7]")
	private WebElement thUsername;

	@FindBy(xpath = "//*[@id='tblClientList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[8]")
	private WebElement thAdminname;

	@FindBy(xpath = "//*[@id='tblClientList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[9]")
	private WebElement thEmail;

	@FindBy(xpath = "//*[@id='tblClientList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[10]")
	private WebElement thMobile;

	@FindBy(xpath = "//*[@id='tblClientList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[11]")
	private WebElement thAdminStatus;

	@FindBy(xpath = "//*[@id='tblClientList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[12]")
	private WebElement thAction;

	// Filters

	@FindBy(xpath = "//*[@id='tblusrdashcombcase1']")
	private WebElement searchBycaName;

	@FindBy(xpath = "//*[@id='tblusrdashcombcase3']")
	private WebElement searchByclientID;

	@FindBy(xpath = "//*[@id='tblusrdashcombcase6']")
	private WebElement searchByusername;

	@FindBy(xpath = "//*[@id='tblusrdashcombcase7']")
	private WebElement searchByname;

	@FindBy(xpath = "//*[@id='tblusrdashcombcase8']")
	private WebElement searchByemail;

	@FindBy(xpath = "//*[@id='tblusrdashcombcase9']")
	private WebElement searchBymobile;

	@FindBy(xpath = "//*[@id='client_list_tbl']/tr[1]/td[12]/button")
	private WebElement ActionButton;

	// Action/update

	@FindBy(xpath = "//*[@id='addupdateform']/div/div[3]/div[2]/div[5]/div/b")
	private WebElement statusOfCA_label;

	@FindBy(xpath = "//*[@id='CclientStatus']")
	private WebElement statusOfCA_checkbox;

	@FindBy(xpath = "//*[@id='addupdateform']/div/div[3]/div[2]/div[7]/div/b")
	private WebElement UserCode_label;

	@FindBy(xpath = "//*[@id='Usercode']")
	private WebElement Usercode;

	@FindBy(xpath = "//*[@id='addupdateform']/div/div[3]/div[2]/div[12]/div/b")
	private WebElement statusOfClientAdmin_label;

	@FindBy(xpath = "//*[@id='CclientAdminStatus']")
	private WebElement statusOfClientAdmin_checkbox;

	// Search

	@FindBy(xpath = "//*[@id='cardadmin']/div[3]/div/label[3]")
	private WebElement SearchButton;

	@FindBy(xpath = "//*[@id='divupdateclienttitle']/span")
	private WebElement SearchHeading;

	@FindBy(xpath = "//*[@id='divsappname']/div/b")
	private WebElement sappname_label;

	@FindBy(xpath = "//*[@id='sappname']")
	private WebElement sappname_input;

	@FindBy(xpath = "//*[@id='sappnameErr']")
	private WebElement sappname_Err;

	@FindBy(xpath = "//*[@id='divsclientid']/div/b")
	private WebElement sclientId_label;

	@FindBy(xpath = "//*[@id='sclientId']")
	private WebElement sclientId_input;

	@FindBy(xpath = "//*[@id='sclientIdErr']")
	private WebElement sclientId_Err;

	@FindBy(xpath = "//*[@id='divsusername']/div/b")
	private WebElement susername_label;

	@FindBy(xpath = "//*[@id='susername']")
	private WebElement susername_input;

	@FindBy(xpath = "//*[@id='susernameErr']")
	private WebElement susername_Err;

	@FindBy(xpath = "//*[@id='divsemail']/div/b")
	private WebElement semail_label;

	@FindBy(xpath = "//*[@id='semail']")
	private WebElement semail_input;

	@FindBy(xpath = "//*[@id='semailErr']")
	private WebElement semail_Err;

	@FindBy(xpath = "//*[@id='divsmobile']/div/b")
	private WebElement smobile_label;

	@FindBy(xpath = "//*[@id='smobile']")
	private WebElement smobile_input;

	@FindBy(xpath = "//*[@id='smobileErr']")
	private WebElement smobile_Err;

	@FindBy(xpath = "//*[@id='client-search']")
	private WebElement clientSearchButton;

	@FindBy(xpath = "//*[@id='tbodyclients']/tr/td[12]/button")
	private WebElement ActionButtonSearch;

	public void Open_Client_Application_Tests(SoftAssert Assert) throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(caVcard.isDisplayed(), "Failed: Open_Client_Application, vCard not displayed ,");
		Assert.assertTrue(caVcard.isEnabled(), "Failed: Open_Client_Application, vCard not enabled ,");
		caVcard.click();
		Thread.sleep(6000);
		Assert.assertEquals(caVcard.getAttribute("class"), "card-body bg-info border border-danger",
				"Failed: Open_Client_Application, vCard not highlighted when clicked ,");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		Assert.assertEquals(ListButton.getAttribute("class"), "btn nicbgcolor client active",
				"Failed: Open_Client_Application, List button not highlighted. ,");
		Thread.sleep(2000);
	}

	public void CA_Add_Button_Tests(SoftAssert Assert) {
		Assert.assertEquals(AddButton.getAttribute("class"), "btn nicbgcolor client",
				"Failed: Add_Client_Application, Add button should not highlighted. ,");
		Assert.assertTrue(AddButton.isEnabled(), "Failed: Add_Client_Application, AddButton not enabled ,");
		AddButton.click();
		Assert.assertEquals(AddButton.getAttribute("class"), "btn nicbgcolor client focus active",
				"Failed: Add_Client_Application, AddButton not highlighted. ,");
		Assert.assertTrue(AddFormHeading.isDisplayed(),
				"Failed: Add_Client_Application_Form, AddFormHeading not displayed ,");
		Assert.assertEquals(AddFormHeading.getText(), "Details of Client Application",
				"AddFormHeading is incorrect. ,");
	}

	public void CA_AddForm_NoData_Tests(SoftAssert Assert) throws InterruptedException {
		Assert.assertTrue(clientSaveButton.isDisplayed(),
				"Failed:CA_AddForm_NoData_Tests, clientSaveButton not displayed. ,");
		Assert.assertTrue(clientSaveButton.isEnabled(),
				"Failed:CA_AddForm_NoData_Tests, clientSaveButton not enabled. ,");
		Assert.assertEquals(clientSaveButton.getAttribute("title"), "Save Client Details",
				"clientSaveButton mouse over text is incorrect. ,");
		clientSaveButton.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		Assert.assertEquals(ClientAppName_label.getText(), "Unique Client Application Name*",
				"Client App Name label is incorrect. ,");
		Assert.assertEquals(ClientAppName_hint.getText(),
				"[Allows characters only and Special Characters Allowed are dash(-). Min Length 5 and Max Length 100]",
				"Client App Name hint is incorrect. ,");
		Assert.assertEquals(ClientAppName_errmsg.getText(), "Invalid Data",
				"Failed:CA_AddForm_NoData_Tests, Client App Name errmsg is incorrect. ,");
		Assert.assertEquals(SelectOrg_errmsg.getText(), "Required Field",
				"Failed:CA_AddForm_NoData_Tests, SelectOrg errmsg is incorrect. ,");

		Assert.assertEquals(ClientId_label.getText(), "Client ID for Token Access*", "Client Id label is incorrect. ,");
		Assert.assertEquals(ClientId_err.getText(), "Required Field",
				"Failed:CA_AddForm_NoData_Tests, ClientId errmsg is incorrect. ,");

		Assert.assertEquals(ClientAdmin_heading.getText(), "Details of Client Administrator",
				"ClientAdmin_heading is incorrect. ,");

		Assert.assertEquals(clientAdmin_username_label.getText(), "Username*",
				"clientAdmin_username_label is incorrect. ,");
		Assert.assertEquals(clientAdmin_username_err.getText(), "Required Field",
				"Failed:CA_AddForm_NoData_Tests, clientAdmin_username errmsg is incorrect. ,");

		Assert.assertEquals(clientAdmin_name_label.getText(), "Full Name*", "clientAdmin_name_label is incorrect. ,");
		Assert.assertEquals(clientAdmin_name_hint.getText(), "[ Allows characters, dot and space and length 3 - 70]",
				"clientAdmin_name_hint is incorrect. ,");
		Assert.assertEquals(clientAdmin_name_err.getText(), "Required Field",
				"Failed:CA_AddForm_NoData_Tests, clientAdmin_name_errmsg is incorrect. ,");

		Assert.assertEquals(email_label.getText(), "Email*", "email_label is incorrect. ,");
		Assert.assertEquals(email_hint.getText(), "[ Minimum 3 and maximum 70 character]",
				"email_hint is incorrect. ,");
		Assert.assertEquals(email_err.getText(), "Required Field",
				"Failed:CA_AddForm_NoData_Tests, email_err is incorrect. ,");

		Assert.assertEquals(mobile_label.getText(), "Mobile*", "mobile_label is incorrect. ,");
		Assert.assertEquals(mobile_hint.getText(), "[ 10 Digits]", "mobile_hint is incorrect. ,");
		Assert.assertEquals(mobile_err.getText(), "Required Field",
				"Failed:CA_AddForm_NoData_Tests, mobile_err is incorrect. ,");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		AddButton.click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	}

	public void ClientApp_AddForm_Validations(SoftAssert Assert, String caName, String clientID, String username,
			String name, String email, String mobile, String Test) throws InterruptedException, IOException {
		AddButton.click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		ClientAppName_input.sendKeys(caName);
		Select s = new Select(SelectOrg_ddown);
		s.selectByIndex(1);
		ClientId_input.sendKeys(clientID);
		clientAdmin_username_input.sendKeys(username);
		clientAdmin_name_input.sendKeys(name);
		email_input.sendKeys(email);
		mobile_input.sendKeys(mobile);
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		clientSaveButton.click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		if (Test.equals("0")) {
			Assert.assertEquals(ClientAppName_errmsg.getText(),
					"Allows characters only and Special Characters Allowed are dash(-). Min Length 5 and Max Length 100",
					"Failed:ClientApp_AddForm_Validations,  ClientAppName_errmsg is incorrect, ");
			Assert.assertEquals(ClientId_err.getText(),
					"ClientID should be alphanumeric [allowed special characters dot(.), @, underscore(_),dash(-)] and length 10 to 100",
					"Failed:ClientApp_AddForm_Validations, ClientID_errmsg is incorrect, ");
			Assert.assertEquals(clientAdmin_username_err.getText(),
					"Username should be alphanumeric [allowed special characters dot(.), @, underscore(_),dash(-)] and length 3 to 50",
					"Failed:ClientApp_AddForm_Validations, clientAdmin_username_err is incorrect, ");
			Assert.assertEquals(clientAdmin_name_err.getText(), "Allows characters, dot and space and length 3 - 70",
					"Failed:ClientApp_AddForm_Validations, clientAdmin_name_err msg is incorrect, ");
			Assert.assertEquals(email_err.getText(), "Wrong Email",
					"Failed:ClientApp_AddForm_Validations, email_err msg is incorrect, ");
			Assert.assertEquals(mobile_err.getText(), "Please enter valid 10 digit mobile",
					"Failed:ClientApp_AddForm_Validations, mobile_err msg is incorrect, ");
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		} else {
			Thread.sleep(2000);
			Assert.assertEquals(successMsgColumn.getText(), "Message",
					"Failed:ClientApp_AddForm_Validations, Success msg column missing.");
			Assert.assertEquals(successMsg.getText(),
					"New Client saved successfully. A password generation link has been sent to registered email address. Kindly login to your account and configure your Client Application",
					"Failed:ClientApp_AddForm_Validations, successMsg is incorrect, ");
			Properties properties = new Properties();
			FileOutputStream outputstream = new FileOutputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\clientApp.properties");
			properties.setProperty("caName", caName);
			properties.setProperty("clientID", clientID);
			properties.setProperty("username", username);
			properties.setProperty("name", name);
			properties.setProperty("email", email);
			properties.setProperty("mobile", mobile);
			properties.store(outputstream, null);
		}
		
	}

	public void Client_App_vCardCount_recordCount(SoftAssert Assert) throws IOException, InterruptedException {
		String caCountNew = caVcardCount.getText();
		Properties properties = new Properties();
		FileInputStream inputstream = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\adminVcardCounts.properties");
		properties.load(inputstream);
		String caCountOld = properties.getProperty("caVcardCount");
		System.out.println(caCountOld + " is caCountOld & " + caCountNew + " is caCountNew");
		if (caCountOld.equals(caCountNew)) {
			Assert.assertTrue(false, "Client Application vcard count not updated");
		}
		Thread.sleep(2000);
		ListButton.click();
		Thread.sleep(2000);
		String recordCountShowing = CaRecordCount.getText();
		Assert.assertTrue(recordCountShowing.contains(caCountNew),
				"Showing list record count does not match with CO vcard count ");
		if (recordCountShowing.equals("Showing 0 to 0 of 0 entries")) {
			driver.quit();
		}

	}

	public void List_CA_TableHeading(SoftAssert Assert) {
		//Assert.assertEquals(caTableHeading.getText(), "Registered Clients", "CA List Table Heading is incorrect, ");

	}

	public void List_CA_HideColumn_Validation(SoftAssert Assert) throws InterruptedException {
		Thread.sleep(10000);
		Assert.assertTrue(hideColumnButton.isDisplayed(), "HideColumn Button not displayed");
		Assert.assertTrue(hideColumnButton.isEnabled(), "HideColumn Button not enabled");
		hideColumnButton.click();
		Assert.assertTrue(hideColumnMenu.isDisplayed(), "HideColumn Menu not displayed");
		if (hideColumnMenu.isDisplayed() == true) {
			Assert.assertEquals(hideCodeButton.getText(), "Code", "Hide buttons should be in table column sequence");
			if (hideCodeButton.getText().equals("Code")) {
				hideCodeButton.click();
				background.click();
				Thread.sleep(2000);
				Assert.assertEquals(th1.getText(), "Name", "Hide column functionality not working");
				hideColumnButton.click();
				hideCodeButton.click();
				background.click();
				Thread.sleep(2000);
				Assert.assertEquals(th1.getText(), "Code", "Hide column functionality not working");
			} else {
				Assert.assertTrue(false, "Hide Code Button not found");
			}
		}
	}

	public void List_CA_Filter_Validation(SoftAssert Assert) throws InterruptedException {
		Assert.assertTrue(filterButton.isDisplayed(), "Filter Button not displayed");
		Assert.assertTrue(filterButton.isEnabled(), "Filter Button not enabled");
		if (filterButton.isEnabled()) {
			filterButton.click();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			Assert.assertTrue(filterPopup.isDisplayed(), "Filter Popup not displayed");
			if (filterPopup.isDisplayed()) {
				Assert.assertEquals(filterLabel.getText(), "Filter the Table By Using either Drop Down or Search Box",
						"Filter Heading is Incorrect");
				Select s = new Select(searchByCodeDdown);
				WebElement selectedOption = s.getFirstSelectedOption();
				String selectedOptionValue = selectedOption.getAttribute("value");
				Assert.assertEquals(selectedOptionValue, "Code", "Code Filter is Missing");
				s.selectByValue("CLI0000000002");
				if (popupclose.isDisplayed())
					popupclose.click();
				else
					Assert.assertTrue(false, "Filter close button missing");
				Assert.assertEquals(appliedFilter.getText(), ", [Filtered By Column- " + selectedOptionValue + ": CLI0000000002, ]",
						"CO List Table Heading -Filter applied is not displayed ,");
				Assert.assertTrue(resetButton.isDisplayed(), "Reset button not displayed");
				Assert.assertTrue(resetButton.isEnabled(), "Reset button not enabled");
				if (resetButton.isDisplayed())
					resetButton.click();
				Assert.assertEquals(appliedFilter.getText(), "",
						"CO List Table Heading -Filter applied is not removed on reset ,");
				filterButton.click();
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				s.selectByValue("CLI0000000002");
				popupclose.click();
				Assert.assertTrue(reloadButton.isDisplayed(), "Reload button not displayed");
				Assert.assertTrue(reloadButton.isEnabled(), "Reload button not enabled");
				if (reloadButton.isDisplayed())
					reloadButton.click();
				Assert.assertEquals(appliedFilter.getText(), "",
						"CO List Table Heading -Filter applied is not removed on Reload ,");
				Thread.sleep(3000);
				resetButton.click();
				Thread.sleep(2000);
			}
		}

	}

	public void List_CA_Column_Sorting_Test(SoftAssert Assert) throws InterruptedException {
		Assert.assertEquals(thCode.getText(), "Code", "Code Column missing. ,");
		Assert.assertEquals(thCode.getAttribute("class"), "thTd sorting_desc",
				"Desc Sorting is missing on Code column. ,");
		Assert.assertEquals(thName.getText(), "Name", "Name Column missing. ,");
		Assert.assertEquals(thName.getAttribute("class"), "thTd sorting",
				"Sorting option is missing on Name column. ,");
		Assert.assertEquals(thOrg.getText(), "Organization", "Organization Column missing. ,");
		Assert.assertEquals(thOrg.getAttribute("class"), "thTd sorting",
				"Sorting option is missing on Organization column. ,");
		Assert.assertEquals(thClientId.getText(), "ClientId", "ClientId Column missing. ,");
		Assert.assertEquals(thClientId.getAttribute("class"), "thTd sorting",
				"Sorting option is missing on ClientId column. ,");
		Assert.assertEquals(thCreatedOn.getText(), "Created On", "Created On Column missing. ,");
		Assert.assertEquals(thCreatedOn.getAttribute("class"), "thTd sorting",
				"Sorting option is missing on Created On column. ,");
		Assert.assertEquals(thStatus.getText(), "Status", "Status Column missing. ,");
		Assert.assertEquals(thStatus.getAttribute("class"), "thTd sorting",
				"Sorting option is missing on Status column. ,");
		Assert.assertEquals(thUsername.getText(), "Username", "Username Column missing. ,");
		Assert.assertEquals(thUsername.getAttribute("class"), "thTd sorting",
				"Sorting option is missing on Username column. ,");
		Assert.assertEquals(thAdminname.getText(), "Admin Name", "Admin Name Column missing. ,");
		Assert.assertEquals(thAdminname.getAttribute("class"), "thTd sorting",
				"Sorting option is missing on Admin Name column. ,");
		Assert.assertEquals(thEmail.getText(), "Email", "Email Column missing. ,");
		Assert.assertEquals(thEmail.getAttribute("class"), "thTd sorting",
				"Sorting option is missing on Email column. ,");
		Assert.assertEquals(thMobile.getText(), "Mobile", "Mobile Column missing. ,");
		Assert.assertEquals(thMobile.getAttribute("class"), "thTd sorting",
				"Sorting option is missing on Mobile column. ,");
		// scroll table
		Actions actions = new Actions(driver);
		actions.moveToElement(thAction).perform();
		Thread.sleep(1000);
		Assert.assertTrue(thAdminStatus.isDisplayed(), "thAdminStatus not diplayed., ");
		Assert.assertEquals(thAdminStatus.getText(), "Admin Status", "Admin Status Column missing. ,");
		Assert.assertEquals(thAdminStatus.getAttribute("class"), "thTd sorting",
				"Sorting option is missing on Admin Status column. ,");
		Assert.assertTrue(thAction.isDisplayed(), "thAction not diplayed., ");
		Assert.assertEquals(thAction.getText(), "Action", "Action Column missing. ,");
		Assert.assertEquals(thAction.getAttribute("class"), "thTd sorting_disabled",
				"Remove Sorting option from Action column. ,");

	}

	public void List_CA_TableData_Test(SoftAssert Assert) throws InterruptedException, IOException {
		filterButton.click();
		Thread.sleep(2000);
		Properties properties = new Properties();
		FileInputStream inputstream = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\clientApp.properties");
		properties.load(inputstream);
		String caName = properties.getProperty("caName");
		String name = properties.getProperty("name");
		//Select s0 = new Select(searchBycaName);
		//s0.selectByValue(caName);
		// scroll filters
		Actions actions = new Actions(driver);
		actions.moveToElement(searchBymobile).perform();
		Thread.sleep(1000);
		Select s3 = new Select(searchByname);
		s3.selectByValue(name);
		popupclose.click();
		Thread.sleep(2000);
		String recordCountShowing = CaRecordCount.getText();
		Assert.assertTrue(recordCountShowing.contains("Showing 1 to 1 of 1 entries"), "Duplicate Records Available");
		Assert.assertEquals(ActionButton.getAttribute("class"), "pencilBtn", "Action button shoud be pencil button ,");
		Assert.assertTrue(ActionButton.isEnabled(), "Action button not enabled. ");
		ActionButton.click();
		Thread.sleep(2000);

	}

	public void List_CA_Action_Update_CApp(SoftAssert Assert) throws IOException {
		Properties properties = new Properties();
		FileInputStream inputstream = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\clientApp.properties");
		properties.load(inputstream);
		String caName = properties.getProperty("caName");
		String clientID = properties.getProperty("clientID");
		String username = properties.getProperty("username");
		String name = properties.getProperty("name");
		String email = properties.getProperty("email");
		String mobile = properties.getProperty("mobile");

		Assert.assertEquals(ClientAppName_label.getText(), "Unique Client Application Name*",
				"Unique Client Application Name label missing. ,");
		Assert.assertEquals(ClientAppName_input.getAttribute("value"), caName,
				"Unique Client Application Name populated incorrectly. ,");
		Assert.assertEquals(ClientId_label.getText(), "Client ID for Token Access*",
				"Client ID for Token Access label missing. ,");
		Assert.assertEquals(ClientId_input.getAttribute("value"), clientID, "clientID populated incorrectly. ,");
		if (statusOfCA_checkbox.isDisplayed()) {
			if (statusOfCA_checkbox.isSelected() == false) {
				statusOfCA_checkbox.click();
			}
		}
		Assert.assertTrue(Usercode.isDisplayed(), "User Code not populated");
		Assert.assertEquals(clientAdmin_username_label.getText(), "Username*", "CA Admin Username label missing. ,");
		Assert.assertEquals(clientAdmin_username_input.getAttribute("value"), username,
				"username populated incorrectly. ,");
		Assert.assertEquals(clientAdmin_name_label.getText(), "Full Name*", "Full Name label missing. ,");
		Assert.assertEquals(clientAdmin_name_input.getAttribute("value"), name, "Full Name populated incorrectly. ,");
		Assert.assertEquals(email_label.getText(), "Email*", "Email label missing. ,");
		Assert.assertEquals(email_input.getAttribute("value"), email, "Email populated incorrectly. ,");
		Assert.assertEquals(mobile_label.getText(), "Mobile*", "Mobile label missing. ,");
		Assert.assertEquals(mobile_input.getAttribute("value"), mobile, "Mobile populated incorrectly. ,");
		if (statusOfClientAdmin_checkbox.isDisplayed()) {
			if (statusOfClientAdmin_checkbox.isSelected() == false) {
				statusOfClientAdmin_checkbox.click();
			}
		}
		clientSaveButton.click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.switchTo().alert().accept();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(successMsgColumn));

		Assert.assertEquals(successMsgColumn.getText(), "Message",
				"Failed:ClientApp_UpdateForm_Validations, Success msg column missing.");
		Assert.assertEquals(successMsg.getText(), "The Client Details are updated Successfully",
				"Failed:ClientApp_UpdateForm_Validations, successMsg is incorrect, ");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//ListButton.click();
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		//resetButton.click();
	}

	public void CA_Search_Validation(SoftAssert Assert) throws IOException {
		String negValue = "zz";
		Assert.assertTrue(SearchButton.isDisplayed(), "SearchButton not displayed, ");
		Assert.assertTrue(SearchButton.isEnabled(), "SearchButton not enabled, ");
		if (SearchButton.isEnabled()) {
			SearchButton.click();
			Assert.assertEquals(SearchButton.getAttribute("class"), "btn nicbgcolor client focus active",
					"Search Button not highlighted when clicked, ");
			Assert.assertEquals(SearchHeading.getText(),
					"Search Client by following parameters. At least one input is mandatory",
					"Search Heading is incorrect., ");
			Assert.assertEquals(sappname_label.getText(), "Application Name", "Application Name label missing., ");
			sappname_input.sendKeys(negValue + "___");
			Assert.assertEquals(sclientId_label.getText(), "Client ID", "Client ID label missing., ");
			sclientId_input.sendKeys(negValue);
			Assert.assertEquals(susername_label.getText(), "Username", "Username label missing., ");
			susername_input.sendKeys(negValue);
			Assert.assertEquals(semail_label.getText(), "Email", "Email label missing., ");
			semail_input.sendKeys(negValue);
			Assert.assertEquals(smobile_label.getText(), "Mobile", "Mobile label missing., ");
			smobile_input.sendKeys(negValue);
			Assert.assertTrue(clientSearchButton.isEnabled(), "clientSearchButton not enabled");
			if (clientSearchButton.isEnabled()) {
				Assert.assertEquals(clientSearchButton.getAttribute("title"), "Search Client Details",
						"on mouse over text is incorrect., ");
				clientSearchButton.click();
				driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
				Properties properties = new Properties();
				FileInputStream inputstream = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\clientApp.properties");
				properties.load(inputstream);
				String caName = properties.getProperty("caName");
				String clientID = properties.getProperty("clientID");
				String username = properties.getProperty("username");
				String email = properties.getProperty("email");
				String mobile = properties.getProperty("mobile");
				Assert.assertEquals(sappname_Err.getText(),
						"Allows characters only and Special Characters Allowed are dash(-). Min Length 5 and Max Length 100",
						"Application Name Err msg is missing/incorrect,underscore should not allow., ");
				Assert.assertEquals(sclientId_Err.getText(),
						"ClientID should be alphanumeric [allowed special characters dot(.), @, underscore(_),dash(-)] and length 10 to 100",
						"Client ID error msg incorrect., ");
				Assert.assertEquals(susername_Err.getText(),
						"Username should be alphanumeric [allowed special characters dot(.), @, underscore(_),dash(-)] and length 3 to 50",
						"Username error msg incorrect., ");
				Assert.assertEquals(semail_Err.getText(), "Wrong Email", "Email error msg incorrect., ");
				Assert.assertEquals(smobile_Err.getText(), "Please enter valid 10 digit mobile",
						"Mobile error msg incorrect., ");
				Assert.assertTrue(clientSearchButton.isEnabled(), "clientSearchButton not enabled, ");
				SearchButton.click();
				driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
				sappname_input.sendKeys(caName);
				sclientId_input.sendKeys(clientID);
				susername_input.sendKeys(username);
				semail_input.sendKeys(email);
				smobile_input.sendKeys(mobile);
				if (clientSearchButton.isEnabled()) {
					clientSearchButton.click();
					driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
					Actions action = new Actions(driver);
					action.moveToElement(ActionButtonSearch);
					ActionButtonSearch.click();
					driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
					if (clientSaveButton.isEnabled()) {
						clientSaveButton.click();
						driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
						driver.switchTo().alert().accept();
						WebDriverWait wait = new WebDriverWait(driver, 5);
						wait.until(ExpectedConditions.visibilityOf(successMsgColumn));

						Assert.assertEquals(successMsgColumn.getText(), "Message",
								"Failed:ClientApp_UpdateForm_Validations, Success msg column missing.");
						Assert.assertEquals(successMsg.getText(), "The Client Details are updated Successfully",
								"Failed:ClientApp_UpdateForm_Validations, successMsg is incorrect, ");
						driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
					}
				}
			}

		}

	}
}

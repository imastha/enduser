package eCollabDDSPages;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class Admin_ClientOrganization_Pages {
	WebDriver driver;

	public Admin_ClientOrganization_Pages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "cardbgorgan")
	private WebElement coVcard;

	@FindBy(xpath = "//*[@id='countorgan']")
	private WebElement coVcardCount;

	@FindBy(xpath = "//*[@id='cardadmin']/div[2]/div/label[1]")
	private WebElement ListButton;

	@FindBy(xpath = "//*[@id='cardadmin']/div[2]/div/label[2]")
	private WebElement AddButton;

	// Add/update organization
	@FindBy(xpath = "//*[@id='divorganization']/div[2]/div[3]/div/b")
	private WebElement OrgName_label;

	@FindBy(xpath = "//*[@id='divorganization']/div[2]/div[3]/div/span")
	private WebElement OrgName_hint;

	@FindBy(xpath = "//*[@id='OorgName']")
	private WebElement OrgName_input;

	@FindBy(xpath = "//*[@id='divorganization']/div[2]/div[4]/div/b")
	private WebElement OrgAdd_label;

	@FindBy(xpath = "//*[@id='divorganization']/div[2]/div[4]/div/span")
	private WebElement OrgAdd_hint;

	@FindBy(xpath = "//*[@id='Oaddress']")
	private WebElement OrgAdd_input;

	@FindBy(xpath = "//*[@id='divorganization']/div[2]/div[5]/div/b")
	private WebElement OrgState_label;

	@FindBy(xpath = "//*[@id='OstateId']")
	private WebElement OrgState_ddown;

	@FindBy(xpath = "//*[@id='OdistrictId']")
	private WebElement OrgDistrict_ddown;

	@FindBy(xpath = "//*[@id='divorganization']/div[2]/div[6]/div/b")
	private WebElement OrgDistrict_label;

	@FindBy(xpath = "//*[@id='divorganization']/div[2]/div[7]/div/b")
	private WebElement OrgCity_label;

	@FindBy(xpath = "//*[@id='divorganization']/div[2]/div[7]/div/span")
	private WebElement OrgCity_hint;

	@FindBy(xpath = "//*[@id='Ocity']")
	private WebElement OrgCity_input;

	@FindBy(xpath = "//*[@id='divorganization']/div[2]/div[8]/div/b")
	private WebElement OrgPin_label;

	@FindBy(xpath = "//*[@id='divorganization']/div[2]/div[8]/div/span")
	private WebElement OrgPin_hint;

	@FindBy(xpath = "//*[@id='Opin']")
	private WebElement OrgPin_input;

	@FindBy(xpath = "//*[@id='divhorganizationcode']/div/b")
	private WebElement OrgCode_label;

	@FindBy(xpath = "//*[@id='organization-save']")
	private WebElement SaveOrg_button;

	@FindBy(xpath = "//*[@id='orgNameErr']")
	private WebElement orgNameErr;

	@FindBy(xpath = "//*[@id='addressErr']")
	private WebElement orgAddErr;

	@FindBy(xpath = "//*[@id='stateIdErr']")
	private WebElement orgStateErr;

	@FindBy(xpath = "//*[@id='districtIdErr']")
	private WebElement orgDistrictErr;

	@FindBy(xpath = "//*[@id='cityErr']")
	private WebElement orgCityErr;

	@FindBy(xpath = "//*[@id='pinErr']")
	private WebElement orgPinErr;

	@FindBy(xpath = "//*[@id='msgtext']")
	private WebElement orgSuccessMsg;

	@FindBy(xpath = "//*[@id='msgclose']")
	private WebElement orgSuccessMsgClose;

	@FindBy(xpath = "//*[@id='tblOrganizationList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[1]")
	private WebElement th1;

	// List Client Organization Table

	@FindBy(xpath = "//*[@id='tblOrganizationList_info']")
	private WebElement CoRecordCount;

	@FindBy(xpath = "//*[@id='divorganization']/div[1]/div[1]/b[1]")
	private WebElement ListCOTableHeading;

	@FindBy(xpath = "//*[@id='tblOrganizationList_length']/label/select")
	private WebElement ListCOTableDisplayPref;

	@FindBy(xpath = "//*[@id='tblOrganizationList_wrapper']/div[2]/button[1]")
	private WebElement hideColumnButton;

	@FindBy(xpath = "//*[@id='tblOrganizationList_wrapper']/div[2]/div[2]")
	private WebElement hideColumnMenu;

	@FindBy(xpath = "//*[@id='tblOrganizationList_wrapper']/div[2]/div[2]/button[1]")
	private WebElement hideCodeButton;

	@FindBy(xpath = "//*[@id='tblOrganizationList_wrapper']/div[2]/div[1]")
	private WebElement background;

	@FindBy(xpath = "//*[@id='tblOrganizationList_wrapper']/div[2]/button[3]")
	private WebElement filterButton;

	@FindBy(xpath = "//*[@id='tblOrganizationList_wrapper']/div[2]/button[2]")
	private WebElement resetButton;

	@FindBy(xpath = "//*[@id='tblOrganizationList_wrapper']/div[2]/button[4]")
	private WebElement reloadButton;

	// Filter popup
	@FindBy(xpath = "//*[@id='filterPopup']")
	private WebElement filterPopup;

	@FindBy(xpath = "//*[@id='filterform']/label")
	private WebElement filterLabel;

	@FindBy(xpath = "//*[@id='tblusrdashcombcase0']")
	private WebElement searchByCodeDdown;

	@FindBy(xpath = "//*[@id='popupclose']")
	private WebElement popupclose;

	@FindBy(xpath = "//*[@id='tblOrganizationList_title']")
	private WebElement appliedFilter;

	@FindBy(xpath = "//*[@id='tblusrdashcombcase1']")
	private WebElement searchByNameDdown;

	@FindBy(xpath = "//*[@id='tblusrdashcombcase2']")
	private WebElement searchByStateDdown;

	@FindBy(xpath = "//*[@id='tblusrdashcombcase3']")
	private WebElement searchByDistrictDdown;

	@FindBy(xpath = "//*[@id='tblusrdashcombcase4']")
	private WebElement searchByCityDdown;

	@FindBy(xpath = "//*[@id='tblusrdashcombcase5']")
	private WebElement searchByPinDdown;

	// Table Header
	@FindBy(xpath = "//*[@id='tblOrganizationList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[1]")
	private WebElement thCode;

	@FindBy(xpath = "//*[@id='tblOrganizationList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[2]")
	private WebElement thName;

	@FindBy(xpath = "//*[@id='tblOrganizationList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[3]")
	private WebElement thState;

	@FindBy(xpath = "//*[@id='tblOrganizationList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[4]")
	private WebElement thDistrict;

	@FindBy(xpath = "//*[@id='tblOrganizationList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[5]")
	private WebElement thCity;

	@FindBy(xpath = "//*[@id='tblOrganizationList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[6]")
	private WebElement thCreatedOn;

	@FindBy(xpath = "//*[@id='tblOrganizationList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[7]")
	private WebElement thStatus;

	@FindBy(xpath = "//*[@id='tblOrganizationList_wrapper']/div[3]/div[1]/div/table/thead/tr/th[8]")
	private WebElement thAction;

	@FindBy(xpath = "//*[@id='tblOrganizationList_info']")
	private WebElement ShowingRecordsCount;

	@FindBy(xpath = "//*[@id='registered_organization_tbl']/tr[1]/td[8]/button")
	private WebElement ActionButton;

	public void Open_Client_Organization(SoftAssert Assert) throws InterruptedException {
		Thread.sleep(7000);
		Assert.assertTrue(coVcard.isDisplayed(), "Failed: Open_Client_Organization, vCard not displayed ,");
		Assert.assertTrue(coVcard.isEnabled(), "Failed: Open_Client_Organization, vCard not enabled ,");
		coVcard.click();
		Thread.sleep(6000);
		Assert.assertEquals(coVcard.getAttribute("class"), "card-body bg-info border border-danger",
				"Failed: Open_Client_Organization, vCard not highlighted when clicked ,");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		Assert.assertEquals(ListButton.getAttribute("class"), "btn nicbgcolor organ active",
				"Failed: Open_Client_Organization, List button not highlighted. ,");
	}

	public void Add_Button_in_clientOrganization(SoftAssert Assert) throws InterruptedException {
		Thread.sleep(10000);
		Assert.assertEquals(AddButton.getAttribute("class"), "btn nicbgcolor organ",
				"Failed: Add_Client_Organization, Add button should not highlighted. ,");
		Assert.assertTrue(AddButton.isEnabled(), "Failed: Add_Button, AddButton not enabled ,");
		AddButton.click();
		Assert.assertEquals(AddButton.getAttribute("class"), "btn nicbgcolor organ focus active",
				"Failed: Add_Button, AddButton not highlighted. ,");
	}

	public void Add_Form_UI_Validations_in_clientOrganization(SoftAssert Assert) {
		Assert.assertEquals(OrgName_label.getText(), "Organization Name *",
				"Failed: Add_Form_UI_Validations_in_clientOrganization, OrgName_label mismatch. ,");
		Assert.assertEquals(OrgName_hint.getText(),
				"[Organization name should have 3-70 characters and allowed special characters are ('.', '-', and space)]",
				"Failed: Add_Form_UI_Validations_in_clientOrganization, OrgName_hint mismatch. ,");

		Assert.assertEquals(OrgAdd_label.getText(), "Address *",
				"Failed: Add_Form_UI_Validations_in_clientOrganization, OrgAdd_label mismatch. ,");
		Assert.assertEquals(OrgAdd_hint.getText(),
				"[Address should have 3-100 alphanumeric characters and allowed special characters are ('.', ',', '-' and space)]",
				"Failed: Add_Form_UI_Validations_in_clientOrganization, OrgAdd_hint mismatch. ,");

		Assert.assertEquals(OrgState_label.getText(), "State*",
				"Failed: Add_Form_UI_Validations_in_clientOrganization, OrgState_label mismatch. ,");

		Assert.assertEquals(OrgDistrict_label.getText(), "District*",
				"Failed: Add_Form_UI_Validations_in_clientOrganization, OrgDistrict_label mismatch. ,");

		Assert.assertEquals(OrgCity_label.getText(), "City*",
				"Failed: Add_Form_UI_Validations_in_clientOrganization, OrgCity_label mismatch. ,");
		Assert.assertEquals(OrgCity_hint.getText(),
				"[City should have 3-50 characters and allowed special characters are ('.' and space)]",
				"Failed: Add_Form_UI_Validations_in_clientOrganization, OrgCity_hint mismatch. ,");

		Assert.assertEquals(OrgPin_label.getText(), "Pin*",
				"Failed: Add_Form_UI_Validations_in_clientOrganization, OrgPin_label mismatch. ,");
		Assert.assertEquals(OrgPin_hint.getText(), "[ 6 digits]",
				"Failed: Add_Form_UI_Validations_in_clientOrganization, OrgPin_hint mismatch. ,");
	}

	public void SaveButton_noData_in_Add_clientOrganization(SoftAssert Assert) throws InterruptedException {
		SaveOrg_button.isDisplayed();
		SaveOrg_button.isEnabled();
		SaveOrg_button.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);

		Assert.assertEquals(orgNameErr.getText(), "Invalid Data",
				"Failed: Save Button Clicked without data, orgName Error mismatch in Add Organization. ,");
		Assert.assertEquals(orgAddErr.getText(), "Invalid Data",
				"Failed: Save Button Clicked without data, orgAdd Error mismatch in Add Organization. ,");
		Assert.assertEquals(orgStateErr.getText(), "Required Field",
				"Failed: Save Button Clicked without data, orgState Error mismatch in Add Organization. ,");
		Assert.assertEquals(orgDistrictErr.getText(), "Required Field",
				"Failed: Save Button Clicked without data, orgDistrict Error mismatch in Add Organization. ,");
		Assert.assertEquals(orgCityErr.getText(), "Invalid Data",
				"Failed: Save Button Clicked without data, orgCity Error mismatch in Add Organization. ,");
		Assert.assertEquals(orgPinErr.getText(), "Invalid Data",
				"Failed: Save Button Clicked without data, orgPin Error mismatch in Add Organization. ,");

	}

	public void Add_Form_Validations_in_clientOrganization(String Test, SoftAssert Assert, String OrgName,
			String OrgAdd, String City, String Pin) throws InterruptedException, IOException {

		AddButton.click();
		Thread.sleep(1000);
		OrgName_input.sendKeys(OrgName);

		OrgAdd_input.sendKeys(OrgAdd);

		Select s = new Select(OrgState_ddown);
		s.selectByVisibleText("West Bengal");

		Select ss = new Select(OrgDistrict_ddown);
		ss.selectByVisibleText("HOWRAH");

		OrgCity_input.sendKeys(City);

		OrgPin_input.sendKeys(Pin);

		SaveOrg_button.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();

		Thread.sleep(2000);
		if (Test.equals("0")) {
			Assert.assertEquals(orgNameErr.getText(),
					"Organization name should have 3-70 characters and  allowed special characters are ('.', '-',and space)",
					"Failed: Save Button Clicked without data, orgName Error mismatch in Add Organization. ,");
			Assert.assertEquals(orgAddErr.getText(),
					"Address should have 3-100 alphanumeric characters and allowed special characters are ('.', ',', '-' and space) ",
					"Failed: Save Button Clicked without data, orgAdd Error mismatch in Add Organization. ,");
			Assert.assertEquals(orgCityErr.getText(),
					"City should have 3-50 characters and allowed special characters are ('.' and space)",
					"Failed: Save Button Clicked without data, orgCity Error mismatch in Add Organization. ,");
			Assert.assertEquals(orgPinErr.getText(), "Pincode should be number only and length 6 digit only",
					"Failed: Save Button Clicked without data, orgPin Error mismatch in Add Organization. ,");
		} else {

			Assert.assertEquals(orgSuccessMsg.getText(), "Organization Details are saved successfully.",
					"Failed: Save Button Clicked with valid data, orgSuccessMsg mismatch in Add Organization. ,");
			Assert.assertEquals(orgSuccessMsgClose.getText(), "Close",
					"Failed: Save Button Clicked with valid data, orgSuccessMsg close button text mismatch in Add Organization. ,");
			orgSuccessMsgClose.isDisplayed();
			orgSuccessMsgClose.isEnabled();
			orgSuccessMsgClose.click();
			Thread.sleep(1000);
			Assert.assertEquals(ListButton.getAttribute("class"), "btn nicbgcolor organ active",
					"Failed: Add_Form_Validations_in_clientOrganization, On Success_Add_Client_Organization, User should nevigate to list view. ,");
		}
		Properties properties = new Properties();
		FileOutputStream outputstream = new FileOutputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\clientOrg.properties");
		properties.setProperty("OrgName", OrgName);
		properties.setProperty("OrgAdd", OrgAdd);
		properties.setProperty("City", City);
		properties.setProperty("Pin", Pin);
		properties.store(outputstream, null);
	}

	public void Client_Organizations_vCardCount_recordCount(SoftAssert Assert) throws IOException {
		String coCountNew = coVcardCount.getText();
		Properties properties = new Properties();
		FileInputStream inputstream = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\adminVcardCounts.properties");
		properties.load(inputstream);
		String coCountOld = properties.getProperty("coVcardCount");
		System.out.println(coCountOld + " is coCountOld & " + coCountNew + " is coCountNew");
		if (coCountOld.equals(coCountNew)) {
			Assert.assertTrue(false, "Client Organization vcard count not updated");
		}
		String recordCountShowing = CoRecordCount.getText();
		Assert.assertTrue(recordCountShowing.contains(coCountNew),
				"Showing list record count does not match with CO vcard count ");
		if (recordCountShowing.equals("Showing 0 to 0 of 0 entries")) {
			driver.quit();
		}
	}

	public void List_CO_TableHeading(SoftAssert Assert) {
		Assert.assertEquals(ListCOTableHeading.getText(), "Registered Organization",
				"CO List Table Heading is incorrect ,");
	}

	public void List_CO_HideColumn_Validation(SoftAssert Assert) throws InterruptedException {
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

	public void List_CO_Filter_Validation(SoftAssert Assert) throws InterruptedException {
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
				s.selectByValue("1");
				if (popupclose.isDisplayed())
					popupclose.click();
				else
					Assert.assertTrue(false, "Filter close button missing");
				Assert.assertEquals(appliedFilter.getText(), ", [Filtered By Column- " + selectedOptionValue + ": 1, ]",
						"CO List Table Heading -Filter applied is not displayed ,");
				Assert.assertTrue(resetButton.isDisplayed(), "Reset button not displayed");
				Assert.assertTrue(resetButton.isEnabled(), "Reset button not enabled");
				if (resetButton.isDisplayed())
					resetButton.click();
				Assert.assertEquals(appliedFilter.getText(), "",
						"CO List Table Heading -Filter applied is not removed on reset ,");
				filterButton.click();
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				s.selectByValue("1");
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

	public void List_CO_Column_Sorting_Test(SoftAssert Assert) {
		Assert.assertEquals(thCode.getText(), "Code", "Code Column missing. ,");
		Assert.assertEquals(thCode.getAttribute("class"), "thTd sorting_desc",
				"Desc Sorting is missing on Code column. ,");
		Assert.assertEquals(thName.getText(), "Name", "Name Column missing. ,");
		Assert.assertEquals(thName.getAttribute("class"), "thTd sorting",
				"Sorting option is missing on Name column. ,");
		Assert.assertEquals(thState.getText(), "State", "State Column missing. ,");
		Assert.assertEquals(thState.getAttribute("class"), "thTd sorting",
				"Sorting option is missing on State column. ,");
		Assert.assertEquals(thDistrict.getText(), "District", "District Column missing. ,");
		Assert.assertEquals(thDistrict.getAttribute("class"), "thTd sorting",
				"Sorting option is missing on District column. ,");
		Assert.assertEquals(thCity.getText(), "City", "City Column missing. ,");
		Assert.assertEquals(thCity.getAttribute("class"), "thTd sorting",
				"Sorting option is missing on City column. ,");
		Assert.assertEquals(thCreatedOn.getText(), "Created On", "Created On Column missing. ,");
		Assert.assertEquals(thCreatedOn.getAttribute("class"), "thTd sorting",
				"Sorting option is missing on Created On column. ,");
		Assert.assertEquals(thStatus.getText(), "Status", "Status Column missing. ,");
		Assert.assertEquals(thStatus.getAttribute("class"), "thTd sorting",
				"Sorting option is missing on Status column. ,");
		Assert.assertEquals(thAction.getText(), "Action", "Action Column missing. ,");
		Assert.assertEquals(thAction.getAttribute("class"), "thTd noVis sorting_disabled",
				"Remove Sorting option from Action column. ,");
	}

	public void List_CO_TableData_Test(SoftAssert Assert) throws IOException, InterruptedException {
		filterButton.click();
		Thread.sleep(2000);
		Properties properties = new Properties();
		FileInputStream inputstream = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\clientOrg.properties");
		properties.load(inputstream);
		String OrgName = properties.getProperty("OrgName");
		String City = properties.getProperty("City");
		Select s0 = new Select(searchByNameDdown);
		s0.selectByValue(OrgName);
		Select s1 = new Select(searchByStateDdown);
		s1.selectByValue("West Bengal");
		Select s2 = new Select(searchByDistrictDdown);
		s2.selectByValue("HOWRAH");
		Select s3 = new Select(searchByCityDdown);
		s3.selectByValue(City);
		popupclose.click();
		Thread.sleep(2000);
		Assert.assertTrue(ShowingRecordsCount.getText().contains("Showing 1 to 1 of 1 entries"),
				"Duplicate Records Available");
		Assert.assertEquals(ActionButton.getAttribute("class"), "pencilBtn", "Action button shoud be pencil button ,");
		Assert.assertTrue(ActionButton.isEnabled(), "Action button not enabled. ");
		ActionButton.click();
		Thread.sleep(4000);
	}

	public void List_CO_Action_Update_Org(SoftAssert Assert) throws IOException, InterruptedException {
		Properties properties = new Properties();
		FileInputStream inputstream = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\clientOrg.properties");
		properties.load(inputstream);
		String OrgName = properties.getProperty("OrgName");
		String OrgAdd = properties.getProperty("OrgAdd");
		String City = properties.getProperty("City");
		String Pin = properties.getProperty("Pin");

		Assert.assertEquals(OrgCode_label.getText(), "Organization Code:", "Organization Code missing. ,");
		Assert.assertEquals(OrgName_input.getAttribute("value"), OrgName, "OrgName populated incorrectly. ,");
		Assert.assertEquals(OrgAdd_input.getAttribute("value"), OrgAdd, "OrgAdd populated incorrectly. ,");
		Assert.assertEquals(OrgState_ddown.getAttribute("value"), "19", "State is populated incorrectly");
		Assert.assertEquals(OrgDistrict_ddown.getAttribute("value"), "313", "District is populated incorrectly");
		Assert.assertEquals(OrgCity_input.getAttribute("value"), City, "City populated incorrectly. ,");
		Assert.assertEquals(OrgPin_input.getAttribute("value"), Pin, "Pin populated incorrectly. ,");
		Thread.sleep(2000);
		SaveOrg_button.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		Assert.assertEquals(orgSuccessMsg.getText(), "Organization Details are saved successfully.",
				"Failed: Save Button Clicked with valid data, orgSuccessMsg mismatch in Add Organization. ,");
		Assert.assertEquals(orgSuccessMsgClose.getText(), "Close",
				"Failed: Save Button Clicked with valid data, orgSuccessMsg close button text mismatch in Add Organization. ,");
		orgSuccessMsgClose.isDisplayed();
		orgSuccessMsgClose.isEnabled();
		orgSuccessMsgClose.click();
		Thread.sleep(1000);
	}

}

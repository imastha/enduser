package tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import eCollabDDSPages.Admin_ClientOrganization_Pages;
import utilities.ReadXlsxFile;

public class Admin_Client_Organization_Pages_Tests extends TestBase {
	@Test(priority = 5, enabled = true)
	public void Open_Client_Organization_Tests() throws InterruptedException {
		SoftAssert Assert = new SoftAssert();
		Admin_ClientOrganization_Pages copages = new Admin_ClientOrganization_Pages(driver);
		copages.Open_Client_Organization(Assert);
		Assert.assertAll();
	}

	@Test(priority = 6, enabled = true)
	public void Add_CO_UI_Tests() throws InterruptedException {
		SoftAssert Assert = new SoftAssert();
		Admin_ClientOrganization_Pages copages = new Admin_ClientOrganization_Pages(driver);
		copages.Add_Button_in_clientOrganization(Assert);
		copages.Add_Form_UI_Validations_in_clientOrganization(Assert);
		Assert.assertAll();

	}

	@Test(priority = 7, enabled = true)
	public void Add_CO_SaveButton_Tests() throws InterruptedException {
		SoftAssert Assert = new SoftAssert();
		Admin_ClientOrganization_Pages copages = new Admin_ClientOrganization_Pages(driver);
		copages.SaveButton_noData_in_Add_clientOrganization(Assert);
		Assert.assertAll();
	}

	@Test(priority = 8, dataProviderClass = ReadXlsxFile.class, dataProvider = "clientdata", enabled = true)
	public void Add_CO_Form_NegValidations(String OrgName, String OrgAdd, String City, String Pin)
			throws EncryptedDocumentException, IOException, InterruptedException {
		SoftAssert Assert = new SoftAssert();
		String Test = "0";
		Admin_ClientOrganization_Pages copages = new Admin_ClientOrganization_Pages(driver);
		copages.Add_Form_Validations_in_clientOrganization(Test, Assert, OrgName, OrgAdd, City, Pin);
		Assert.assertAll();
	}

	@Test(priority = 9, dataProviderClass = ReadXlsxFile.class, dataProvider = "clientdata", enabled = true)
	public void Add_CO_Form_Validations(String OrgName, String OrgAdd, String City, String Pin)
			throws EncryptedDocumentException, IOException, InterruptedException {
		SoftAssert Assert = new SoftAssert();
		String Test = "1";
		Admin_ClientOrganization_Pages copages = new Admin_ClientOrganization_Pages(driver);
		copages.Add_Form_Validations_in_clientOrganization(Test, Assert, OrgName, OrgAdd, City, Pin);
		Assert.assertAll();
	}

	@Test(priority = 10, enabled = true)
	public void CO_vCardCount_Test() throws IOException {
		SoftAssert Assert = new SoftAssert();
		Admin_ClientOrganization_Pages copages = new Admin_ClientOrganization_Pages(driver);
		copages.Client_Organizations_vCardCount_recordCount(Assert);
		Assert.assertAll();
	}

	@Test(priority = 11, enabled = true)
	public void List_CO_Buttons_Tests() throws InterruptedException {
		SoftAssert Assert = new SoftAssert();
		Admin_ClientOrganization_Pages copages = new Admin_ClientOrganization_Pages(driver);
		copages.List_CO_TableHeading(Assert);
		copages.List_CO_HideColumn_Validation(Assert);
		copages.List_CO_Filter_Validation(Assert);
		Assert.assertAll();
	}

	@Test(priority = 12, enabled = true)
	public void List_CO_Table_Tests() throws IOException, InterruptedException {
		SoftAssert Assert = new SoftAssert();
		Admin_ClientOrganization_Pages copages = new Admin_ClientOrganization_Pages(driver);
		copages.List_CO_Column_Sorting_Test(Assert);
		copages.List_CO_TableData_Test(Assert);
		Assert.assertAll();
	}

	@Test(priority = 13, enabled = true)
	public void List_CO_Action_UpdateOrg_Tests() throws IOException, InterruptedException {
		SoftAssert Assert = new SoftAssert();
		Admin_ClientOrganization_Pages copages = new Admin_ClientOrganization_Pages(driver);
		copages.List_CO_Action_Update_Org(Assert);
		Assert.assertAll();
	}

}

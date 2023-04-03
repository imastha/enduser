package tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import eCollabDDSPages.Admin_ClientApplication_Pages;
import utilities.ReadXlsxFile;

public class Admin_Client_Application_Pages_Tests extends TestBase {
	
	@Test(priority = 14, enabled = true)
	public void Open_Client_Application_Tests() throws InterruptedException {
		SoftAssert Assert = new SoftAssert();
		Admin_ClientApplication_Pages capages = new Admin_ClientApplication_Pages(driver);
		capages.Open_Client_Application_Tests(Assert);
		Assert.assertAll();
	}

	@Test(priority = 15, enabled = true)
	public void ClientApp_Open_Add_Form_Tests() {
		SoftAssert Assert = new SoftAssert();
		Admin_ClientApplication_Pages capages = new Admin_ClientApplication_Pages(driver);
		capages.CA_Add_Button_Tests(Assert);
		Assert.assertAll();
	}

	@Test(priority = 16, enabled = true)
	public void ClientApp_AddForm_NoData_Tests() throws InterruptedException {
		SoftAssert Assert = new SoftAssert();
		Admin_ClientApplication_Pages capages = new Admin_ClientApplication_Pages(driver);
		capages.CA_AddForm_NoData_Tests(Assert);
		Assert.assertAll();
	}

	@Test(priority = 17, dataProviderClass = ReadXlsxFile.class, dataProvider = "clientdata", enabled = true)
	public void Add_CA_Form_NegTests(String caName, String clientID, String username, String name, String email,
			String mobile) throws EncryptedDocumentException, IOException, InterruptedException {
		SoftAssert Assert = new SoftAssert();
		String Test = "0";
		Admin_ClientApplication_Pages capages = new Admin_ClientApplication_Pages(driver);
		capages.ClientApp_AddForm_Validations(Assert, caName, clientID, username, name, email, mobile, Test);
		Assert.assertAll();
	}
	
	@Test(priority = 18, dataProviderClass = ReadXlsxFile.class, dataProvider = "clientdata", enabled = true)
	public void Add_CA_Form_Tests(String caName, String clientID, String username, String name, String email,
			String mobile) throws EncryptedDocumentException, IOException, InterruptedException {
		SoftAssert Assert = new SoftAssert();
		String Test = "1";
		Admin_ClientApplication_Pages capages = new Admin_ClientApplication_Pages(driver);
		capages.ClientApp_AddForm_Validations(Assert, caName, clientID, username, name, email, mobile, Test);
		Assert.assertAll();

	}
	
	@Test(priority = 19, enabled = true)
	public void ca_vcard_count_Tests() throws IOException, InterruptedException{
		SoftAssert Assert = new SoftAssert();
		Admin_ClientApplication_Pages capages = new Admin_ClientApplication_Pages(driver);
		capages.Client_App_vCardCount_recordCount(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 20, enabled = true)
	public void List_CA_Buttons_Test() throws InterruptedException{
		SoftAssert Assert = new SoftAssert();
		Admin_ClientApplication_Pages capages = new Admin_ClientApplication_Pages(driver);
		capages.List_CA_TableHeading(Assert);
		capages.List_CA_HideColumn_Validation(Assert);
		capages.List_CA_Filter_Validation(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 21, enabled = true )
	public void List_CA_Table_Tests() throws InterruptedException, IOException{
		SoftAssert Assert = new SoftAssert();
		Admin_ClientApplication_Pages capages = new Admin_ClientApplication_Pages(driver);
		capages.List_CA_Column_Sorting_Test(Assert);
		capages.List_CA_TableData_Test(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 22, enabled = true)
	public void List_CA_Action_UpdateCApp_Tests() throws IOException{
		SoftAssert Assert = new SoftAssert();
		Admin_ClientApplication_Pages capages = new Admin_ClientApplication_Pages(driver);
		capages.List_CA_Action_Update_CApp(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 23, enabled = true)
	public void CA_Search_Tests() throws IOException{
		SoftAssert Assert = new SoftAssert();
		Admin_ClientApplication_Pages capages = new Admin_ClientApplication_Pages(driver);
		capages.CA_Search_Validation(Assert);
		Assert.assertAll();
	}
}

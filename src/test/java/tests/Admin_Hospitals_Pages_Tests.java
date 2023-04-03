package tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import eCollabDDSPages.Admin_Hospitals_Pages;
import utilities.ReadXlsxFile;

public class Admin_Hospitals_Pages_Tests extends TestBase{
	
	@Test(priority = 24, enabled = true)
	public void Open_Hospitals_Tests() {
		SoftAssert Assert = new SoftAssert();
		Admin_Hospitals_Pages hpages = new Admin_Hospitals_Pages(driver);
		hpages.Open_Hospitals_Tests(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 25, enabled = true)
	public void Hospitals_Open_Add_Form_Tests() {
		SoftAssert Assert = new SoftAssert();
		Admin_Hospitals_Pages hpages = new Admin_Hospitals_Pages(driver);
		hpages.Hospitals_Add_Button_Tests(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 26, enabled = true)
	public void Hospitals_AddEndUserHos_NoData_Tests() throws InterruptedException {
		SoftAssert Assert = new SoftAssert();
		Admin_Hospitals_Pages hpages = new Admin_Hospitals_Pages(driver);
		hpages.Hospitals_AddForm_NoData_Tests(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 27, dataProviderClass = ReadXlsxFile.class, dataProvider = "clientdata", enabled = true)
	public void AddEndUserHos_Neg_Tests(String hosName, String hosAdd, String hosCity, String pin) throws EncryptedDocumentException, IOException, InterruptedException {
		SoftAssert Assert = new SoftAssert();
		String Test="0";
		Admin_Hospitals_Pages hpages = new Admin_Hospitals_Pages(driver);
		hpages.Hospitals_AddForm_Tests(Test, Assert, hosName, hosAdd, hosCity, pin);
		Assert.assertAll();
	}
	
	@Test(priority = 28, dataProviderClass = ReadXlsxFile.class, dataProvider = "clientdata", enabled = true)
	public void AddEndUserHos_Tests(String hosName, String hosAdd, String hosCity, String pin) throws EncryptedDocumentException, IOException, InterruptedException {
		SoftAssert Assert = new SoftAssert();
		String Test="1";
		Admin_Hospitals_Pages hpages = new Admin_Hospitals_Pages(driver);
		hpages.Hospitals_AddForm_Tests(Test, Assert, hosName, hosAdd, hosCity, pin);
		Assert.assertAll();
	}
	
	@Test(priority = 29, enabled = true)
	public void Hospitals_AddReviewerHos_NoData_Tests() throws InterruptedException {
		SoftAssert Assert = new SoftAssert();
		Admin_Hospitals_Pages hpages = new Admin_Hospitals_Pages(driver);
		hpages.Hospitals_AddReviewerHosForm_NoData_Tests(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 30, dataProviderClass = ReadXlsxFile.class, dataProvider = "clientdata", enabled = true)
	public void AddReviewerHos_Neg_Tests(String hosName, String hosAdd, String hosCity, String pin, String caUsername, String caName, String caEmail, String caMobile) throws EncryptedDocumentException, IOException, InterruptedException {
		SoftAssert Assert = new SoftAssert();
		String Test="0";
		Admin_Hospitals_Pages hpages = new Admin_Hospitals_Pages(driver);
		hpages.ReviewerHos_AddForm_Tests(Test, Assert, hosName, hosAdd, hosCity, pin, caUsername, caName, caEmail, caMobile);
		Assert.assertAll();
	}
	
	@Test(priority = 31, dataProviderClass = ReadXlsxFile.class, dataProvider = "clientdata", enabled = true)
	public void AddReviewerHos_Tests(String hosName, String hosAdd, String hosCity, String pin, String caUsername, String caName, String caEmail, String caMobile) throws EncryptedDocumentException, IOException, InterruptedException {
		SoftAssert Assert = new SoftAssert();
		String Test="1";
		Admin_Hospitals_Pages hpages = new Admin_Hospitals_Pages(driver);
		hpages.ReviewerHos_AddForm_Tests(Test, Assert, hosName, hosAdd, hosCity, pin, caUsername, caName, caEmail, caMobile);
		Assert.assertAll();
	}
	
	@Test(priority = 32, enabled = true)
	public void hospitals_vcard_count_Tests() throws IOException {
		SoftAssert Assert = new SoftAssert();
		Admin_Hospitals_Pages hpages = new Admin_Hospitals_Pages(driver);
		hpages.Hospitals_vCardCount_recordCount(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 33,enabled = true)
	public void List_Hospitals_Buttons_Tests() throws IOException {
		SoftAssert Assert = new SoftAssert();
		Admin_Hospitals_Pages hpages = new Admin_Hospitals_Pages(driver);
		hpages.List_Hospitals_TableHeading(Assert);
		hpages.List_Hospitals_HideColumn_Validation(Assert);
		hpages.List_Hospitals_Filter_Validation(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 34,enabled = true)
	public void List_Hospitals_ColumnSorting_Tests() throws IOException {
		SoftAssert Assert = new SoftAssert();
		Admin_Hospitals_Pages hpages = new Admin_Hospitals_Pages(driver);
		hpages.List_Hospitals_ColumnSorting_Tests(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 35,enabled = true)
	public void List_Hospitals_ReviewerHosData_Update_Tests() throws IOException {
		SoftAssert Assert = new SoftAssert();
		Admin_Hospitals_Pages hpages = new Admin_Hospitals_Pages(driver);
		hpages.List_Hospitals_ReviewerData_Tests(Assert);
		hpages.List_Hospitals_UpdateReviewerHos_Tests(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 36,enabled = true)
	public void List_Hospitals_EnduserHosData_Update_Tests() throws IOException {
		SoftAssert Assert = new SoftAssert();
		Admin_Hospitals_Pages hpages = new Admin_Hospitals_Pages(driver);
		hpages.List_Hospitals_EndUserData_Tests(Assert);
		hpages.List_Hospitals_UpdateEnduserHos_Tests(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 37,enabled = true)
	public void List_Hospitals_Search_Tests() throws IOException {
		SoftAssert Assert = new SoftAssert();
		Admin_Hospitals_Pages hpages = new Admin_Hospitals_Pages(driver);
		hpages.List_Hospitals_Search_Validations(Assert);
		Assert.assertAll();
	}
	
}

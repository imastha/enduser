package tests;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import eCollabDDSPages.Admin_HospitalUsers_Pages;
import utilities.ReadXlsxFile;

public class Admin_HospitalUsers_Pages_Tests extends TestBase {

	@Test(priority = 38, enabled = true)
	public void Admin_Open_HospitalUsers_Tests() {
		SoftAssert Assert = new SoftAssert();
		Admin_HospitalUsers_Pages hupages =new Admin_HospitalUsers_Pages(driver);
		hupages.open_HosUsers_Tests(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 39, enabled = true)
	public void Admin_HospitalUsers_DefaultPage_Tests() {
		SoftAssert Assert = new SoftAssert();
		Admin_HospitalUsers_Pages hupages =new Admin_HospitalUsers_Pages(driver);
		hupages.hospitalUsers_DefaultPage_Test(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 40, enabled = false)
	public void Admin_HospitalUsers_AddForm_NoData_Tests() {
		SoftAssert Assert = new SoftAssert();
		Admin_HospitalUsers_Pages hupages =new Admin_HospitalUsers_Pages(driver);
		hupages.hospitalUsers_AddForm_NoData_Tests(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 41, dataProviderClass = ReadXlsxFile.class, dataProvider = "clientdata", enabled = false)
	public void AddHosUsers_Neg_Tests(String userName, String name, String email, String mobile) throws IOException, InterruptedException {
		SoftAssert Assert = new SoftAssert();
		String Test="0";
		Admin_HospitalUsers_Pages hupages =new Admin_HospitalUsers_Pages(driver);
		hupages.HosUsers_AddForm_Tests(Test, Assert, userName, name, email, mobile);
		Assert.assertAll();
	}
	
	@Test(priority = 42, dataProviderClass = ReadXlsxFile.class, dataProvider = "clientdata", enabled = false)
	public void Add_Radiologist_Tests(String userName, String name, String email, String mobile) throws IOException, InterruptedException {
		SoftAssert Assert = new SoftAssert();
		String Test="1";
		Admin_HospitalUsers_Pages hupages =new Admin_HospitalUsers_Pages(driver);
		hupages.HosUsers_AddForm_Tests(Test, Assert, userName, name, email, mobile);
		Assert.assertAll();
	}
	
	@Test(priority = 43, dataProviderClass = ReadXlsxFile.class, dataProvider = "clientdata", enabled = false)
	public void Add_EndUser_Tests(String userName, String name, String email, String mobile) throws IOException, InterruptedException {
		SoftAssert Assert = new SoftAssert();
		String Test="2";
		Admin_HospitalUsers_Pages hupages =new Admin_HospitalUsers_Pages(driver);
		hupages.HosUsers_AddForm_Tests(Test, Assert, userName, name, email, mobile);
		Assert.assertAll();
	}
	
	@Test(priority = 44, enabled = true)
	public void HospitalUsers_vCardCount_recordCount_Tests() throws IOException {
		SoftAssert Assert = new SoftAssert();
		Admin_HospitalUsers_Pages hupages = new Admin_HospitalUsers_Pages(driver);
		hupages.hospitalUsers_vCardCount_recordCount(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 45, enabled = true)
	public void HospitalUsers_TableHeading_Tests() throws IOException {
		SoftAssert Assert = new SoftAssert();
		Admin_HospitalUsers_Pages hupages = new Admin_HospitalUsers_Pages(driver);
		hupages.hospitalUsers_TableHeading(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 46, enabled = true)
	public void HospitalUsers_HideColumn_Tests() throws IOException {
		SoftAssert Assert = new SoftAssert();
		Admin_HospitalUsers_Pages hupages = new Admin_HospitalUsers_Pages(driver);
		hupages.hospitalUsers_HideColumn(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 47, enabled = true)
	public void HospitalUsers_Filter_Tests() throws IOException {
		SoftAssert Assert = new SoftAssert();
		Admin_HospitalUsers_Pages hupages = new Admin_HospitalUsers_Pages(driver);
		hupages.hospitalUsers_Filters(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 48, enabled = true)
	public void HospitalUsers_ColumnSorting_Tests() throws IOException {
		SoftAssert Assert = new SoftAssert();
		Admin_HospitalUsers_Pages hupages = new Admin_HospitalUsers_Pages(driver);
		hupages.hospitalUsers_columnSorting(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 49, enabled = true)
	public void HosUsersList_RadiologistData_Tests() throws IOException {
		SoftAssert Assert = new SoftAssert();
		Admin_HospitalUsers_Pages hupages = new Admin_HospitalUsers_Pages(driver);
		hupages.hosUsersList_radiologistData(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 50, enabled = true)
	public void Update_RadiologistUserData_Tests() throws IOException {
		SoftAssert Assert = new SoftAssert();
		Admin_HospitalUsers_Pages hupages = new Admin_HospitalUsers_Pages(driver);
		hupages.update_radiologistUserData(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 51, enabled = true)
	public void HosUsersList_EndUserData_Tests() throws IOException {
		SoftAssert Assert = new SoftAssert();
		Admin_HospitalUsers_Pages hupages = new Admin_HospitalUsers_Pages(driver);
		hupages.hosUsersList_endUserData(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 52, enabled = true)
	public void Update_EndUserData_Tests() throws IOException {
		SoftAssert Assert = new SoftAssert();
		Admin_HospitalUsers_Pages hupages = new Admin_HospitalUsers_Pages(driver);
		hupages.update_endUserData(Assert);
		Assert.assertAll();
	}
	
	@Test(priority = 53, enabled = true)
	public void HosUsers_Search_Tests() throws IOException {
		SoftAssert Assert = new SoftAssert();
		Admin_HospitalUsers_Pages hupages = new Admin_HospitalUsers_Pages(driver);
		hupages.hospitalUsers_search(Assert);
		Assert.assertAll();
	}

}

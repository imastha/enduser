package endUserTests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import endUserPages.EndUser_Patient_CaseReq_Page;
import utilities.ReadXlsxFile;

public class EndUser_Patient_CaseReq_Tests extends TestBase {
private String pid;
	
	@Test(priority = 0)
	public void Open_Patient_Tests() {
		SoftAssert Assert = new SoftAssert();
		EndUser_Patient_CaseReq_Page patpage = new EndUser_Patient_CaseReq_Page(driver);
		patpage.Open_Patients_Test(Assert);
		Assert.assertAll();
	}

	@Test(priority = 1)
	public void Add_Patient_Neg_Tests() {
		SoftAssert Assert = new SoftAssert();
		EndUser_Patient_CaseReq_Page patpage = new EndUser_Patient_CaseReq_Page(driver);
		patpage.Patient_Registration_NoData_Test(Assert);
		patpage.Patient_Registration_InvalidData_Test(Assert);
		Assert.assertAll();
	}

	@Test(priority = 2, dataProviderClass = ReadXlsxFile.class, dataProvider = "clientdata", enabled = true)
	public void Add_Patient_Tests(String patientName, String mobile, String dob)
			throws EncryptedDocumentException, IOException, InterruptedException {
		SoftAssert Assert = new SoftAssert();
		EndUser_Patient_CaseReq_Page patpage = new EndUser_Patient_CaseReq_Page(driver);
		pid = patpage.Patient_Registration_ValidData_Test(patientName, mobile, dob, Assert);
		Assert.assertAll();
			}

	@Test(priority = 3)
	public void Add_CaseReq_Tests() throws IOException, InterruptedException {
		SoftAssert Assert = new SoftAssert();
		EndUser_Patient_CaseReq_Page patpage = new EndUser_Patient_CaseReq_Page(driver);
		patpage.Add_CaseReq_Page(Assert,pid);
		Assert.assertAll();
	

	}
}

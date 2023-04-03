package endUserTests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import endUserPages.EndUser_Pending_Page;

public class EndUser_Pending_Tests {
	

		@Test(priority = 0)
		public void open_Pending_vcard() throws IOException, InterruptedException{
		
			SoftAssert Assert = new SoftAssert();
			WebDriver driver = null;
			EndUser_Pending_Page ecpage = new EndUser_Pending_Page(driver);
			ecpage.open_Pending_vcard(Assert);
			Assert.assertAll();
}
	}


	
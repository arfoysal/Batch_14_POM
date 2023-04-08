package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.DarazHomePage;
import pages.DarazLoginPage;
import utilities.DriverSetup;

public class HomePageTest extends DriverSetup {
	DarazHomePage darazHomePage = new DarazHomePage();
	DarazLoginPage darazLoginPage = new DarazLoginPage();
	
	@Test
	public void TestHomePageTitle() {
		getDriver().get("https://www.daraz.com.bd/");
		assertEquals(getDriver().getTitle(), darazHomePage.HOMEPAGE_TITLE);
		System.out.println(darazHomePage.getElemntText(darazHomePage.SIGNUP_LOGIN_BUTTON));
		darazHomePage.takeScreenShot("Home Page");
		darazHomePage.clickOnelement(darazHomePage.SIGNUP_LOGIN_BUTTON);
		darazLoginPage.doLogin("011111111", "password");
		darazHomePage.takeScreenShot("Failed Login");
		
	}
}

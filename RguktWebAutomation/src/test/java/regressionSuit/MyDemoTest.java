package regressionSuit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import CommonUtils.LaunchBrowser;
import CommonUtils.LoginPage;

public class MyDemoTest {
	
	@BeforeClass
	public void setUp() {
		new LaunchBrowser().LaunchChromeBrowser();
		new LoginPage();
	}
	
	@Test
	public void testGooglePageTitleInIEBrowser() {
		
		@SuppressWarnings("unused")
		String baseUrl = "http://toolsqa.com/automation-practice-form/";
		System.out.println("hello");
	}
}

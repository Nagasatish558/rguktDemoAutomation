package sanity;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import CommonUtils.CloseBrowser;
import CommonUtils.LaunchBrowser;
import CommonUtils.LoginPage;
import PageClasses.BasicTesting;
public class sanityTesting{
	@BeforeClass
	public void setup(){
		new LaunchBrowser().LaunchChromeBrowser();
		new LoginPage().openOnb();
	}
	
	@Test
	public void BasicTesting(){
		BasicTesting pageClass = new BasicTesting();
		pageClass.fillSurvey();
		pageClass.gotoFinalYearGetFirstNotification();
	}
	
	@AfterClass
	public void teardown(){
		new CloseBrowser().teardown();
	}
}




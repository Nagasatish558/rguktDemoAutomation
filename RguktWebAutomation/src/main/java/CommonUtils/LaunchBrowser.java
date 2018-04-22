package CommonUtils;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser extends BasePage{
	public void LaunchChromeBrowser(){
		String driverPath = "C:\\Users\\Cartoon\\Documents\\";
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
}

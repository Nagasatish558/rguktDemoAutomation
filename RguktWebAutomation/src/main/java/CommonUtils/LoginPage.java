package CommonUtils;

public class LoginPage extends BasePage{
	public void loginToCSEsite(){
		driver.get("https://10.11.4.99/cse");
	}
	
	public void openOnb(){
		driver.get("https://10.1.11.111/onb/");
	}

}

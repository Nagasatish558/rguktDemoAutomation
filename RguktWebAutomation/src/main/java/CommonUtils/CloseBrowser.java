package CommonUtils;

public class CloseBrowser extends BasePage{
	
	public void teardown(){
		driver.close();
	}
}

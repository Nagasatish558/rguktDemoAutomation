package PageClasses;
import org.openqa.selenium.WebElement;

import CommonUtils.BasePage;
public class BasicTesting extends BasePage{
	WebElement myelement = driver.findElementByXPath(".//*[@id='id']");
	public void fillSurvey(){
		if(myelement != null){
			myelement.sendKeys("N120558");
			myelement = driver.findElementByXPath(".//*[@id='pass']");
			myelement.sendKeys("QV8T6");
			myelement = driver.findElementByXPath(".//*[@id='light']/div[2]/label[5]/input");
			myelement.click();
			myelement = driver.findElementByXPath(".//*[@id='light']/div[3]/label[4]/input");
			myelement.click();
			myelement = driver.findElementByXPath(".//*[@id='light']/div[4]/label[3]/input");
			myelement.click();
			myelement = driver.findElementByXPath(".//*[@id='light']/div[5]/label[2]/input");
			myelement.click();
			myelement = driver.findElementByXPath(".//*[@id='light']/div[6]/label[1]/input");
			myelement.click();
			myelement = driver.findElementByXPath(".//*[@id='light']/div[7]/label[5]/input");
			myelement.click();
			myelement = driver.findElementByXPath(".//*[@id='mformsubmit']");
			myelement.click();
		}
	}
	public void gotoFinalYearGetFirstNotification(){
		WebElement newElement = driver.findElementByXPath(".//*[@id='part1']//a[contains(.,'E4')]");
		newElement.click();
		newElement = driver.findElementByXPath(".//*[@id='target-content-e4']/table/tbody/tr[1]/td[2]/a/b");
		newElement.click();
		newElement = driver.findElementByXPath(".//table/tbody/tr/td/font");
		String textInNotification = newElement.getText();
		System.out.println(textInNotification);
	}
	
}

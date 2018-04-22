package ProjectDemo.DemoProject;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


 

/**
 * Hello world!
 *
 */
public class PageClass
{
	
	WebDriver driver;
	public PageClass(){
		WebDriver driver = new ChromeDriver();
	}
	
    public boolean closeBrowser(){
    	try{
    		System.setProperty("webdriver.chrome.driver", "C:\\MyDocuments\\chromedriver.exe");
    		driver=new ChromeDriver();
    		driver.close();
    	}catch(Exception e){
    		System.out.println("Failed to close the browser,so returning false");
    		return false;
    	}
    	
    	return true;
    }
    
    public boolean openWebPage(){
    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("http://www.google.com");
    	
    	return true;
    	
    }
}

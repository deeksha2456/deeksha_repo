package PagesScripts;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseScripts.Base;

public class Logout extends Base {
	ChromeDriver driver;
	Properties pr;

public Logout(ChromeDriver driver, Properties pr) {
			this.driver=driver;
			this.pr=pr;
		}
		public void logout() throws InterruptedException
		{
	
	driver.findElement(By.xpath(pr.getProperty("avatar-btn"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(pr.getProperty("signout"))).click();

	Thread.sleep(2000);
	
	

}
}

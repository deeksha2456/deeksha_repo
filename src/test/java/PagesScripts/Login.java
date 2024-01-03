package PagesScripts;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseScripts.Base;

public class Login extends Base {
	ChromeDriver driver;
	Properties pr;
	
	public Login(ChromeDriver driver, Properties pr) {
		this.driver=driver;
		this.pr=pr;
		
		
	}
	
	public void signin(String user, String Password) throws InterruptedException
	{
		driver.findElement(By.xpath(pr.getProperty("Signin"))).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath(pr.getProperty("Email"))).sendKeys("testdeeksha4@gmail.com");

		Thread.sleep(1000);
		driver.findElement(By.xpath(pr.getProperty("next"))).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath(pr.getProperty("password"))).sendKeys("Qwerty@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pr.getProperty("next"))).click();
		Thread.sleep(4000);
	}
}
		
		
		
		
		
		
		


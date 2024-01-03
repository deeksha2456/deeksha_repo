package PagesScripts;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseScripts.Base;

public class Home extends Base {
	ChromeDriver driver;
	Properties pr;
	
	public Home(ChromeDriver driver, Properties pr) {
		this.driver=driver;
		this.pr=pr;
		
	}
	
	public void trending() throws InterruptedException
	{
		driver.findElement(By.xpath(pr.getProperty("Menu"))).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText(pr.getProperty("trending"))).click();
		Thread.sleep(2000);
		
	}
	 public void history() throws InterruptedException
	 {
		 driver.findElement(By.xpath(pr.getProperty("Menu"))).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(pr.getProperty("history"))).click();
		 Thread.sleep(2000);
		 
	 }

	 public void subscription() throws InterruptedException
	 {
		 driver.findElement(By.xpath(pr.getProperty("Menu"))).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(pr.getProperty("Subscriptions"))).click();
		 Thread.sleep(2000);
	 }

	 public void library() throws InterruptedException
	 {
	 
	 driver.findElement(By.xpath(pr.getProperty("Menu"))).click();
	 Thread.sleep(2000);

	 driver.findElement(By.xpath("//yt-formatted-string[text()='Library']")).click();
	 Thread.sleep(2000);
	 }
	 
	 public void watchlater() throws InterruptedException {
			
		 driver.findElement(By.xpath(pr.getProperty("Menu"))).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(pr.getProperty("watchlater"))).click();
		 Thread.sleep(2000);
					
			}
	 
	 
	 
}


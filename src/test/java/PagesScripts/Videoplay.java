package PagesScripts;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseScripts.Base;

public class Videoplay extends Base {
	ChromeDriver driver;
	Properties pr;
	
	public Videoplay(ChromeDriver driver, Properties pr) {
		
		this.driver=driver;
		this.pr=pr;
		
	}
	
	public void channelsubscribe() throws InterruptedException {
		driver.findElement(By.xpath(pr.getProperty("videotitle"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("subscribebutton"))).click();
		Thread.sleep(2000);
		
		
	}
	public void commentvideo() throws InterruptedException {
		driver.findElement(By.xpath(pr.getProperty("videotitle"))).click();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(8000);
		driver.findElement(By.xpath(pr.getProperty("commentplaceholder"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("commenttext"))).sendKeys("very nice video");
		Thread.sleep(5000);
		driver.findElement(By.xpath(pr.getProperty("submitcomment"))).click();
		Thread.sleep(2000);
		
		
	}
	public void likevideo() throws InterruptedException {
	
	driver.findElement(By.xpath(pr.getProperty("videotitle"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(pr.getProperty("likebutton"))).click();
	Thread.sleep(2000);
			
	}
	
	
	
	
	

}

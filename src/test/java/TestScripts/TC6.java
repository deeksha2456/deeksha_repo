package TestScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;
import BaseScripts.Base;
import PagesScripts.Login;
import PagesScripts.Logout;
import PagesScripts.Videoplay;
import Utilities.Screenshots;

@Test
public class TC6 extends Base {

public void Testcase6() throws InterruptedException, IOException
{
	
	Login lg=new Login(driver,pr);
	lg.signin("autodeeksha@gmail.com","Qwerty@123");
	Videoplay vp=new Videoplay(driver,pr);
	vp.commentvideo();
	Screenshots.takescreenshot(driver,"C:\\screenshots\\firsttc_7.png");
	Logout logo=new Logout(driver,pr);
	logo.logout();

	}
	
}
	
	/*
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
driver.findElement(By.xpath(pr.getProperty("avatar-btn"))).click();
Thread.sleep(2000);

driver.findElement(By.xpath(pr.getProperty("signout"))).click();
Thread.sleep(2000);

/*
driver.findElement(By.linkText("Sign in")).click();
Thread.sleep(1000);

driver.findElement(By.xpath("//input[@type='email']")).sendKeys("autodeeksha@gmail.com");

Thread.sleep(1000);
driver.findElement(By.xpath("//span[text()='Next']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Qwerty@123");
Thread.sleep(3000);
driver.findElement(By.xpath("//span[text()='Next']")).click();
Thread.sleep(4000);

//comment on any video and logout

driver.findElement(By.xpath("//yt-formatted-string[@id='video-title']")).click();
Thread.sleep(5000);

//jse.executeScript("window.scrollBy(0,400)");
//Thread.sleep(6000);
JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("window.scrollBy(0,400)");
Thread.sleep(8000);
//jse.executeScript("arguments[0].scrollintoView();",comment);
driver.findElement(By.xpath("//yt-formatted-string[@id='simplebox-placeholder']")).click();;
driver.findElement(By.xpath("//div[@id='contenteditable-root']")).sendKeys("Very Nice Video");;

//jse.executeScript("arguments[0].scrollintoView();",comment);

Thread.sleep(5000);
driver.findElement(By.xpath("//ytd-button-renderer[@id='submit-button']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//button[@id='avatar-btn']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//yt-formatted-string[text()='Sign out']")).click();
*/


package TestScripts;

import java.io.IOException;

import org.openqa.selenium.By;

import org.testng.annotations.Test;
import BaseScripts.Base;
import PagesScripts.Home;
import PagesScripts.Login;
import PagesScripts.Logout;
import Utilities.Screenshots;
public class TC3 extends Base {
@Test
public void Testcase3() throws InterruptedException, IOException
{
	
	Login lg=new Login(driver,pr);
	lg.signin("autodeeksha@gmail.com","Qwerty@123");
	Home hm=new Home(driver,pr);
	hm.subscription();
	Screenshots.takescreenshot(driver,"C:\\screenshots\\firsttc_4.png");
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
driver.findElement(By.xpath(pr.getProperty("Menu"))).click();
Thread.sleep(2000);
driver.findElement(By.xpath(pr.getProperty("Subscriptions"))).click();
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

//Click on Subscription

driver.findElement(By.xpath("//yt-formatted-string[text()='Subscriptions']")).click();
Thread.sleep(2000);
//driver.navigate().refresh();
//driver.findElement(By.xpath("//a[@id='destination-content-root'][1]")).click();
//Thread.sleep(2000);
driver.findElement(By.xpath("//button[@id='avatar-btn']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//yt-formatted-string[text()='Sign out']")).click();
Thread.sleep(2000);
*/


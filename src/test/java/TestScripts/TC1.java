package TestScripts;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import BaseScripts.Base;
import PagesScripts.Home;
import PagesScripts.Login;
import PagesScripts.Logout;
import Utilities.LogsCaptures;
import Utilities.Screenshots;

public class TC1<signin> extends Base {

@Test
public void Testcase1() throws InterruptedException, IOException
{
	/*

Login login=new Login(driver,pr);
login.signin("autodeeksha@gmail.com","Qwerty@123");
Home home= new Home(driver,pr);
home.likevideo();
screenshot.takescreenshot(driver,"C:\\screenshots\\firsttc.png");
home.subscribevideo();
home.commentvideo();
home.clicktrending();
home.clickhistory();
home.watchlater();
*/
LogsCaptures.takelogs("TC1","Login Successful for TC1");

Login lg=new Login(driver,pr);
lg.signin("autodeeksha@gmail.com","Qwerty@123");
Screenshots.takescreenshot(driver,"C:\\screenshots\\firstt_1.png");
Home hm=new Home(driver,pr);
hm.trending();
Screenshots.takescreenshot(driver,"C:\\screenshots\\firsttc_2.png");
Logout logo=new Logout(driver,pr);
logo.logout();

}
}



/*
driver.findElement(By.xpath(pr.getProperty("Signin"))).click();
Thread.sleep(1000);
driver.findElement(By.xpath(pr.getProperty("Email"))).sendKeys("autodeeksha@gmail.com");

Thread.sleep(1000);
driver.findElement(By.xpath(pr.getProperty("next"))).click();

Thread.sleep(5000);
driver.findElement(By.xpath(pr.getProperty("password"))).sendKeys("Qwerty@123");
Thread.sleep(3000);

driver.findElement(By.xpath(pr.getProperty("next"))).click();
Thread.sleep(4000);
driver.findElement(By.xpath(pr.getProperty("Menu"))).click();
Thread.sleep(2000);
driver.findElement(By.linkText(pr.getProperty("trending"))).click();
Thread.sleep(2000);
driver.findElement(By.xpath(pr.getProperty("avatar-btn"))).click();
Thread.sleep(2000);
driver.findElement(By.xpath(pr.getProperty("signout"))).click();
Thread.sleep(2000);
}
}
*/

/*
driver.findElement(By.xpath("//ytd-button-renderer[@class='signin style-scope ytd-consent-bump-v2-lightbox']")).click();
Thread.sleep(1000);


driver.findElement(By.xpath("//input[@type='email']")).sendKeys("testdeeksha4@gmail.com");
Thread.sleep(1000);
driver.findElement(By.xpath("//span[text()='Next']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Qwerty@123");
Thread.sleep(3000);

driver.findElement(By.xpath("//span[text()='Next']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//yt-icon[@icon='yt-icons:menu']")).click();
Thread.sleep(2000);
driver.findElement(By.linkText("Trending")).click();
Thread.sleep(2000);


driver.findElement(By.xpath("//button[@id='avatar-btn']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//yt-formatted-string[text()='Sign out']")).click();
Thread.sleep(2000);

}
}
*/

//WebElement Trending= driver.findElement(null)
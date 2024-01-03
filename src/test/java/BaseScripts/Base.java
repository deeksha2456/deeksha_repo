package BaseScripts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.module.Configuration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;

public class Base {

public ChromeDriver driver;
public Properties pr;

@BeforeMethod
public void launch() throws IOException
{
ChromeOptions ops = new ChromeOptions();
ops.addArguments("--remote-allow-origins=*");

driver= new ChromeDriver(ops);
driver.get("https://www.youtube.com/");

driver.manage().window().maximize();

File f= new File("../SeleniumLearning/object.properties");
FileReader fr= new FileReader(f);
pr = new Properties();
pr.load(fr);



}

@AfterMethod

public void close() throws InterruptedException
{
Thread.sleep(1000);
//driver.close();

}
}
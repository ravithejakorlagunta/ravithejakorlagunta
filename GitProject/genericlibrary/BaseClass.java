package ocsa.genericlibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import ocsa7.elementRepository.LoginLocators;

public class BaseClass {
	  public WebDriver  driver;
	   public DataUtility du=new DataUtility();
	   public static WebDriver listenerdriver;
	  @BeforeClass(alwaysRun=true)
public void launchBrowser()
{
	System.setProperty("webdriver.chrome.driver","D:\\Ravi_Automachine-Engineer\\chromedriver_win32\\chromedriver.exe");
	   driver= new ChromeDriver();
	   listenerdriver=driver;
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
}
	  @BeforeMethod(alwaysRun=true)
public void loginApplication() throws IOException
{
	 driver.get(du.getDataFromProperties("url"));
	  LoginLocators ll=new LoginLocators(driver);
	  ll.loginapplication(du.getDataFromProperties("username"),du.getDataFromProperties("password"));
	  
}
	  @AfterMethod(alwaysRun=true)
public void logoutApp()
{
	 LoginLocators ll=new LoginLocators(driver);
	 ll.getlogoutlink();
}
	  @AfterClass(alwaysRun=true)
public void closeBrowser()
{
	driver.close();
}
}


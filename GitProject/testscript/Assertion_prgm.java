package ocsa7.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ocsa.genericlibrary.BaseClass;
import ocsa.genericlibrary.DataUtility;
@Listeners(ocsa.genericlibrary.ListenerImplementation.class)
public class Assertion_prgm extends BaseClass  {
	@Test
	public void testScript() throws EncryptedDocumentException, IOException
	{
		DataUtility du=new DataUtility();
		driver.findElement(By.id("container_users")).click();
		driver.findElement(By.xpath("//div[text()='New User']")).click();
		driver.findElement(By.id("createUserPanel_firstNameField")).sendKeys(du.getDataFromExcel("sheet1",1,0));
		driver.findElement(By.id("createUserPanel_lastNameField")).sendKeys(du.getDataFromExcel("sheet1",2,0));
		driver.findElement(By.id("createUserPanel_emailField")).sendKeys(du.getDataFromExcel("sheet1",3,0));
		driver.findElement(By.xpath("//div[text()='Save & Send Invitation']")).click();
		driver.findElement(By.xpath("//span[text()='Clos']")).click();
		
	}
}

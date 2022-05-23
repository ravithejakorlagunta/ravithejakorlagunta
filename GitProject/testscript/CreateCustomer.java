package ocsa7.testscript;

import java.io.IOException;
 
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ocsa.genericlibrary.BaseClass;
import ocsa.genericlibrary.DataUtility;
@Listeners(ocsa.genericlibrary.ListenerImplementation.class)
     public class CreateCustomer extends BaseClass
     {
    	 @Test
	 public void customerCreation() throws EncryptedDocumentException, IOException
	 {
		 
		Random r= new Random();
	int num=r.nextInt(10000);
	
	 
	  driver.findElement(By.id("container_tasks")).click();
	  driver.findElement(By.cssSelector(".title.ellipsis")).click();
	  driver.findElement(By.className("createNewCustomer")).click();
	  driver.findElement(By.className("newNameField")).sendKeys(num+du.getDataFromExcel("sheet1",0,0));
	  driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
}
}

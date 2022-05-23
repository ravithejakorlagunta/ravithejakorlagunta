package ocsa.genericlibrary;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		 
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	}

	@Override
	public void onTestFailure(ITestResult result) {
		 
		TakesScreenshot ts=(TakesScreenshot)BaseClass.listenerdriver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./failedscreenshot/screenshot1.png");
		try {
			FileUtils.copyFile(src,trg);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		 
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		 
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		 
	}

	@Override
	public void onStart(ITestContext context) {
		 
	}

	@Override
	public void onFinish(ITestContext context) {
	  
	}

}

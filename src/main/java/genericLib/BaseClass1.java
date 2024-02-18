package genericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {

	// declare globally

	public WebDriver driver;
	public PropertyFile pdata = new PropertyFile();


	public WebDriverDriverUtilies driverutilies = new WebDriverDriverUtilies();

	@BeforeMethod

	public void openApp() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getPropertyfiledata("url1"));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}





	@AfterMethod

	public void CloseApp(ITestResult result) throws IOException {

	int status = result.getStatus();
	String name = result.getName();
	if(status==2) {

	  Screenshot s = new Screenshot();
	  s.getPhoto(driver, name);
	}


	driver.quit();

	}

}

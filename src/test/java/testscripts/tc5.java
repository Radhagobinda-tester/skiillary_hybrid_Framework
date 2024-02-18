package testscripts;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLib.BaseClass1;
import pomPages.CategoryPage;
import pomPages.SkillaryDemoApp;
import pomPages.SkillilayLoginPage;
@Test
public class tc5 extends BaseClass1 {
	
	

	public void tc5() throws IOException, InterruptedException {
	
	
	 SkillilayLoginPage l = new SkillilayLoginPage(driver);
     l.GearsBtn();
     Thread.sleep(3000);
     l.demoApp();
     SkillaryDemoApp d = new SkillaryDemoApp(driver);
     Thread.sleep(3000);
     driverutilies.SwitchingTabs(driver);
    // Thread.sleep(15000);
     driverutilies.dropDown(d.getCourseAdd(), pdata.getPropertyfiledata("coursedd"));
     
     CategoryPage f =new CategoryPage(driver);
     WebElement fb = f.getFacebook();
     Point loc = fb.getLocation();
    int x= loc.getX();
     int y =loc.getY();
    // driverutilies.scrollBar(driver, x, y);
    //Corrected JavaScript function call
     ((JavascriptExecutor) driver).executeScript("window.scrollBy(" + x + ", " + y + ");");
	//driverutilies.scrollBar(driver, x, y);
	f.FacebookIcon();
	// To verify you can use this method on Testng
	Assert.assertEquals(driver.getTitle(), pdata.getPropertyfiledata("tt"));
	//Assert.assertTrue(driver.getTitle().trim().equalsIgnoreCase(pdata.getPropertyfiledata("tt").trim()));
	
	  Reporter.log(driver.getTitle(),true);
     
	}
}

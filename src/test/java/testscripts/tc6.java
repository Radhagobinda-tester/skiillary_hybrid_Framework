package testscripts;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLib.BaseClass1;
import pomPages.CoreJavaForSelenium;
import pomPages.LearnCoreJavaPage;
import pomPages.SkillilayLoginPage;


public class tc6 extends BaseClass1 {
	@Test
	
	public void tc6() throws IOException, InterruptedException {
		 SkillilayLoginPage l = new SkillilayLoginPage(driver);
		 l.searchBtn(pdata.getPropertyfiledata("Coursename"));
		 l.SubmitBtn();
		 
		 CoreJavaForSelenium o = new CoreJavaForSelenium(driver);	
		 
		 o.corejavacourselink();
		 
		 LearnCoreJavaPage v = new LearnCoreJavaPage(driver);
		 // shifting to control to the video window 
		/* driverutilies.switchingframe(driver);
		 try {
	            v.playBtn();
	        } catch (NoSuchElementException e) {
	            System.out.println("Play button not found. Skipping play action.");
	        }
	        
	        try {
	            v.PauseBtn();
	        } catch (NoSuchElementException e) {
	            System.out.println("Pause button not found. Skipping pause action.");
	        }
		 driverutilies.switchbackFrame(driver);
		 */
		 Thread.sleep(10000); 
		 v.Sharetwitterlink();
		 Thread.sleep(10000); 
		 driverutilies.SwitchingTabs(driver);
		 Assert.assertEquals(driver.getTitle(), pdata.getPropertyfiledata("ttt"));
		 Thread.sleep(10000);
		  Reporter.log(driver.getTitle(),true);
		 
		 }
	
	

}

package testscripts;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLib.BaseClass1;
import pomPages.AddToCartPage;
import pomPages.SkillaryDemoApp;
import pomPages.SkillilayLoginPage;
@Test

public class tc4 extends BaseClass1 {
    public void test_tc4() throws IOException, InterruptedException {
        SkillilayLoginPage l = new SkillilayLoginPage(driver);
        l.GearsBtn();
        Thread.sleep(3000);
        l.demoApp();
        SkillaryDemoApp d = new SkillaryDemoApp(driver);
        driverutilies.SwitchingTabs(driver);
        driverutilies.mouseHover(driver,d.getCourse() );
        d.Selenium874Btn();
        AddToCartPage a = new AddToCartPage(driver);
        driverutilies.doubleClick(driver, a.getAdd());
        a.AddToCartbtn();
        driverutilies.alertPopup(driver);
        
        Reporter.log(driver.getTitle(),true);
    }
}

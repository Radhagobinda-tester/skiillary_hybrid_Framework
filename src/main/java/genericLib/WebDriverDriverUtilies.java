package genericLib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverDriverUtilies {

//Dropdown

    public void dropDown(WebElement ele, String text) {


	Select s = new Select(ele);
	s.selectByVisibleText(text);

	}
    //Mouse hover element
    public void mouseHover(WebDriver driver,WebElement ele) {


		Actions a = new Actions(driver);
    	a.moveToElement(ele).perform();

    	}

    //Right click

    public void rightClick(WebDriver driver,WebElement ele) {

    Actions a = new Actions(driver);
    a.contextClick(ele).perform();
    }

   //Double click

    public void doubleClick(WebDriver driver,WebElement ele) {

    Actions a = new Actions(driver);
    a.doubleClick(ele).perform();

    }

    //drag And Drop


    public void dragdrop(WebDriver driver,WebElement source,WebElement target) {

    Actions a = new Actions(driver);
    a.dragAndDrop(source, target).perform();

    }

    //Switching to Frame

    public void switchingframe(WebDriver driver) {

    driver.switchTo().frame(0);

    }

   //Switch back

    public void switchbackFrame(WebDriver driver) {

    driver.switchTo().defaultContent();
    }

    //Alert popup

    public void alertPopup(WebDriver driver) {

    driver.switchTo().alert().accept();
    }

    //Switching Tabs


    public void SwitchingTabs(WebDriver driver) {

    Set<String> child = driver.getWindowHandles();
    for(String c: child) {
    driver.switchTo().window(c);
    }

    }
   // Scroll Bar

    public void scrollBar(WebDriver driver,int x, int y) {

    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("window.ScrollBy("+x+","+y+")");


    }

    }

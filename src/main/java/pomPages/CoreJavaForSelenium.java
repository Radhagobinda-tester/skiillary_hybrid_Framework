package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaForSelenium {

	
	@FindBy(xpath="//a[text()=' Core Java For Selenium Trainin']")
	 public WebElement corejavacourse;
	
	 public CoreJavaForSelenium (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	 
	 public void corejavacourselink() {
		 corejavacourse.click();
	 }
	
}

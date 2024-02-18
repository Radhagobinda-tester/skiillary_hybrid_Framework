package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage {
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	public WebElement Facebook;
	
	public WebElement getFacebook() {
		return Facebook;
	}

	public CategoryPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void FacebookIcon() {
		Facebook.click();
	}

}

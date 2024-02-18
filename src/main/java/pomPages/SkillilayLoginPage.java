package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillilayLoginPage {
  @FindBy(xpath="//a[text()=' GEARS ']")
  private WebElement GearsButton;

  @FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
  private WebElement demoapp;
  @FindBy(xpath="//input[@name='q']")
  private WebElement search; 
  
  @FindBy(xpath="//input[@value='go']")
  private WebElement submit;

  public SkillilayLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void GearsBtn() {

		GearsButton.click();
	}
	public void demoApp() {

		demoapp.click();
	}
	public void searchBtn(String key) {
		search.sendKeys(key);
	}
	
	public void SubmitBtn() {
		submit.click();
	}
}

package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LearnCoreJavaPage {
	
	@FindBy(xpath="//button[contains(@class, 'ytp-play-button')]")
	public WebElement play;

	@FindBy(xpath="//button[contains(@class, 'ytp-play-button') and @aria-label='Pause']")
	public WebElement pause;

	
	@FindBy(xpath="//span[text()='Share via Twitter']")
	public WebElement twitter;
	
	 public LearnCoreJavaPage (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	
	public void playBtn() {
		play.click();
	}
	public void PauseBtn() {
		pause.click();
	}
	
	public void Sharetwitterlink() {
		twitter.click();
	}

}

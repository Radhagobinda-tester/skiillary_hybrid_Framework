package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillaryDemoApp {
	//mouse hover
	@FindBy(id="course")
	public WebElement Course;
	
	@FindBy(name="addresstype")
	public WebElement CourseAdd;

	 //Click on Selenium874 button
	@FindBy(xpath="(//a[text()='Selenium874'])[2]")
	public WebElement Selenium874;

	public SkillaryDemoApp (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCourseAdd() {
		return CourseAdd;
	}

	public void Selenium874Btn() {
		Selenium874.click();
	}

	//getters method created
	public WebElement getCourse() {
		return Course;
	}

}

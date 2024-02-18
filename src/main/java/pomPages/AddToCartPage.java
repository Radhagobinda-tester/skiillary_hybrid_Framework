package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {

	@FindBy(id="add")
	public WebElement add;

	@FindBy(xpath="//button[text()=' Add to Cart']")
	public WebElement AddToCart;

	public AddToCartPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdd() {
		return add;
	}

	public void AddToCartbtn() {
		AddToCart.click();
	}
}

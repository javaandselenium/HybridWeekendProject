package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPage {
@FindBy(id="add")
private WebElement addBtn;

@FindBy(xpath="(//button[@type='submit'])[2]")
private WebElement addtocart;

public AddtoCartPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public WebElement getAddBtn() {
	return addBtn;
}

public void addtocartbutton() {
	addtocart.click();
}


}

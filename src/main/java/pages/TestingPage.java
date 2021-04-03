package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	@FindBy(xpath="//img[@id='munit testing ']")
	private WebElement junit;
	
	@FindBy(xpath="//div[@id='cartArea']")
	private WebElement myCart;
	
	@FindBy(xpath="//a[text()='Contact Us']")
	private WebElement contactus;
	
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getJunit() {
		return junit;
	}

	public WebElement getMyCart() {
		return myCart;
	}
	
	public void contactUsbt() {
		contactus.click();
	}
	
	
	

}

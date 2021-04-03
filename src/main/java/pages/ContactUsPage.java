package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
	
	@FindBy(name="name")
	private WebElement fullname;
	
	@FindBy(name="sender")
	private WebElement email;
	
	@FindBy(name="subject")
	private WebElement subjecttb;
	
	@FindBy(name="message")
	private WebElement message;
	
	
	@FindBy(xpath="//button[text()='Send us mail']")
	private WebElement sendusemeail;
	
	public ContactUsPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void sendEmailtouser(String name,String emailt,String sub,String msg) {
		fullname.sendKeys(name);
		email.sendKeys(emailt);
		subjecttb.sendKeys(sub);
		message.sendKeys(msg);
		sendusemeail.click();
	}

}

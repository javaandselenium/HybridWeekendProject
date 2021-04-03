package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRaryLoginPage {
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gerasbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoapp;
	
	@FindBy(name="q")
	private WebElement serachtb;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement gobtn;
	
	@FindBy(xpath="//i[@class='fa fa-facebook']")
	private WebElement facebookicon;
	
	@FindBy(xpath="//a[text()='X']")
	private WebElement close;
	
 public SkillRaryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void demoAppSkillrary() {
		gerasbtn.click();
		demoapp.click();
	}

	public void sercahforCourse(String courseName) {
		serachtb.sendKeys(courseName);
		gobtn.click();
	}
	
	public void facebook() {
		facebookicon.click();
	}
	
	public void closepopup() {
		close.click();
	}
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Takethiiscourse {
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playicon;
	
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pauseBtn;
	
	
	@FindBy(xpath="//a[text()=' TAKE THIS COURSE ']")
	private WebElement enrollbtn;
	
	public Takethiiscourse(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void playandpausevideo() throws InterruptedException {
		playicon.click();
		Thread.sleep(10000);
		pauseBtn.click();
	}
	
	public void enroll() {
		enrollbtn.click();
		
	}

}

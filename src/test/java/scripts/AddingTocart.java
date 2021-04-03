package scripts;

import org.testng.annotations.Test;

import genericlib.BaseClass;
import pages.AddtoCartPage;
import pages.DemoSkillraryLoginPage;
import pages.SkillRaryLoginPage;

public class AddingTocart extends BaseClass {
	@Test
	public void cart() throws InterruptedException {
		SkillRaryLoginPage s=new SkillRaryLoginPage(driver);
		s.demoAppSkillrary();
		
		u.switchTabs(driver);
		
		DemoSkillraryLoginPage d=new DemoSkillraryLoginPage(driver);
		u.mouseHover(driver,d.getCourseBtn());
		d.seleniumtraining();
		
		AddtoCartPage a=new AddtoCartPage(driver);
		
		u.doubleClickbtn(driver,a.getAddBtn());
		
		a.addtocartbutton();
		
		u.alertPopup(driver);
		
		
	}

}

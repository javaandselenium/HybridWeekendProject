package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericlib.BaseClass;
import pages.ContactUsPage;
import pages.DemoSkillraryLoginPage;
import pages.FacebookPage;
import pages.SkillRaryLoginPage;
import pages.TestingPage;

public class Contact extends BaseClass{
@Test
public void contactUser() throws FileNotFoundException, IOException, InterruptedException {
	SkillRaryLoginPage s=new SkillRaryLoginPage(driver);
	s.closepopup();
	u.scrollbar(driver,0,5000);
	s.facebook();
	
	FacebookPage f=new FacebookPage(driver);
	f.likebtn();
	
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().back();
	
	s.demoAppSkillrary();
	
	u.switchTabs(driver);
	
	DemoSkillraryLoginPage d=new DemoSkillraryLoginPage(driver);
	u.dropDown(d.getTestingdd(),p.getData("dddata"));
	
	TestingPage t1=new TestingPage(driver);
	u.draganddrop(driver,t1.getJunit(),t1.getMyCart());
	t1.contactUsbt();
	
	ContactUsPage c=new ContactUsPage(driver);
	c.sendEmailtouser(p.getData("name"),p.getData("email"),p.getData("subject"),p.getData("message"));
	
	
}
}

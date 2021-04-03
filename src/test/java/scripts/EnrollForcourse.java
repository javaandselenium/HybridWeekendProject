package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericlib.BaseClass;
import pages.SeleniumPage;
import pages.SkillRaryLoginPage;
import pages.Takethiiscourse;

public class EnrollForcourse extends BaseClass{
	@Test
	public void enrollcourses() throws FileNotFoundException, IOException, InterruptedException {
		SkillRaryLoginPage s=new SkillRaryLoginPage(driver);
		s.sercahforCourse(p.getData("course"));
		
		SeleniumPage s1=new SeleniumPage(driver);
		s1.seleniumCourse();
		
		Takethiiscourse t=new Takethiiscourse(driver);
		u.frame(driver);
		t.playandpausevideo();
		u.switchBackframe(driver);
		t.enroll();
		
		
		
		

		
	}

}

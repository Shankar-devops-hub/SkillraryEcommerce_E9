package Scripts;
import org.testng.annotations.Test;

import POM.SkillraryHomepage;
import POM.TestingPage;
import POM.demoSkillraryPage;
import genericLibrary.BaseClass;

public class TestCase1 extends BaseClass{
	
	@Test
	public void tc1() throws Throwable
	{
		
		SkillraryHomepage s = new SkillraryHomepage(driver);
		s.gearsButton();
		s.skillrarydemoappWebElement();
		utilities.childBrowser(driver);
		demoSkillraryPage ds=new demoSkillraryPage(driver);
		utilities.dropDown(ds.getSearchDd(), pdata.getPropertydata("coursedd"));
		TestingPage tP = new TestingPage(driver);
		utilities.Scrolling(driver, tP.getFb());
		tP.FbWebElement();
		
		
	}

}

package org.kff.tests.StateFacts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.kff.pages.HomePage;
import org.kff.pages.StateFactsHomePage;
import org.kff.tests.TestBase;
import org.kff.utilities.BrowserUtils;
import org.kff.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class StateFactsHomePageTest extends TestBase{
	StateFactsHomePage homepage=new StateFactsHomePage();
	HomePage hp=new HomePage();
	
	@Test
	public void HomePgeTitleTest_1197() {
		String expected="Kaiser Family Foundation - Health Policy Research, Analysis, Polling, Facts, Data and Journalism";
		assertEquals(driver.getTitle(), expected);
		hp.AcceptCokisBotton.click();
	}
@Test
	public void StatFactsPagetest() {
    driver.get(ConfigurationReader.getProperty("StatefactsURL"));
	assertTrue( homepage.SearchStateText.isDisplayed());
		assertTrue(homepage.ChooseCategory.isDisplayed());
		
	}

  @Test
  public void thisYearAssertion_1196() throws Exception {
	  hp.menuButton.click();
	 Thread.sleep(1000);
	 hp.AcceptCokisBotton.click();
	 driver.findElement(By.xpath("(//a[@href='#'])[2]")).click();
	 Thread.sleep(1000);
	  hp.MenuStatebutton.click();
		 Thread.sleep(1000);

	  hp.stateButtonclick.click();
	  assertTrue(homepage.ChooseCategory.isDisplayed());
  }


}

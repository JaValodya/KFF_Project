package org.kff.tests.StateFacts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.kff.pages.HomePage;
import org.kff.pages.StateFactsHomePage;
import org.kff.tests.TestBase;
import org.kff.utilities.BrowserUtils;
import org.kff.pages.Demographic_EconomyPage;
import org.kff.pages.HealthCostsBudgetsPage;
import org.kff.pages.HomePage;
import org.kff.pages.StateFactsHomePage;
import org.kff.pages.StateFacts_AlaBamaPage;
import org.kff.tests.TestBase;
import org.kff.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//public class StateFactsHomePageTest extends TestBase{
//	StateFactsHomePage homepage=new StateFactsHomePage();
//	HomePage hp=new HomePage();
//	
//	@Test
//	public void HomePgeTitleTest_1197() {
//		String expected="Kaiser Family Foundation - Health Policy Research, Analysis, Polling, Facts, Data and Journalism";
//		assertEquals(driver.getTitle(), expected);
//		hp.AcceptCokisBotton.click();
//	}
//@Test
//	public void StatFactsPagetest() {
//    driver.get(ConfigurationReader.getProperty("StatefactsURL"));
//	assertTrue( homepage.SearchStateText.isDisplayed());
//		assertTrue(homepage.ChooseCategory.isDisplayed());
//		
//	}
//
//  @Test
//  public void thisYearAssertion_1196() throws Exception {
//	  hp.menuButton.click();
//	 Thread.sleep(1000);
//	 hp.AcceptCokisBotton.click();
//	 driver.findElement(By.xpath("(//a[@href='#'])[2]")).click();
//	 Thread.sleep(1000);
//	  hp.MenuStatebutton.click();
//		 Thread.sleep(1000);
//
//	  hp.stateButtonclick.click();
//	  assertTrue(homepage.ChooseCategory.isDisplayed());
//  }
//
//
//}
public class StateFactsHomePageTest extends TestBase {
	StateFactsHomePage homepage = new StateFactsHomePage();
	HomePage hp = new HomePage();
	StateFacts_AlaBamaPage sfap = new StateFacts_AlaBamaPage();
	HealthCostsBudgetsPage hcbp = new HealthCostsBudgetsPage();
	Demographic_EconomyPage dep = new Demographic_EconomyPage();
	
//	@Ignore
	@Test
	public void HomePgeTitleTest_1197() {
		String expected = "Kaiser Family Foundation - Health Policy Research, Analysis, Polling, Facts, Data and Journalism";
		assertEquals(driver.getTitle(), expected);
		hp.AcceptCokisBotton.click();
	}

//	@Ignore
	@Test
	public void StatFactsPagetest() {
		driver.get(ConfigurationReader.getProperty("StatefactsURL"));
		assertTrue(homepage.SearchStateText.isDisplayed());
		assertTrue(homepage.ChooseCategory.isDisplayed());

	}

//	@Ignore
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
//	@Ignore
	@Test
	public void twelveMenus_1198() {
		driver.get(ConfigurationReader.getProperty("StatefactsURL"));
		assertTrue(homepage.Category_1.isEnabled());
		assertTrue(homepage.Category_2.isEnabled());
		assertTrue(homepage.Category_3.isEnabled());
		assertTrue(homepage.Category_4.isEnabled());
		assertTrue(homepage.Category_5.isEnabled());
		assertTrue(homepage.Category_6.isEnabled());
		assertTrue(homepage.Category_7.isEnabled());
		assertTrue(homepage.Category_8.isEnabled());
		assertTrue(homepage.Category_9.isEnabled());
		assertTrue(homepage.Category_10.isEnabled());
		assertTrue(homepage.Category_11.isEnabled());
		assertTrue(homepage.Category_12.isEnabled());
		
		homepage.selectStateButton.click();
		homepage.SelectAlAbama.click();
		
		assertTrue(sfap.AlaBamaCategory_1.isEnabled());
		assertTrue(sfap.AlaBamaCategory_2.isEnabled());
		assertTrue(sfap.AlaBamaCategory_3.isEnabled());
		assertTrue(sfap.AlaBamaCategory_4.isEnabled());
		assertTrue(sfap.AlaBamaCategory_5.isEnabled());
		assertTrue(sfap.AlaBamaCategory_6.isEnabled());
		assertTrue(sfap.AlaBamaCategory_7.isEnabled());
		assertTrue(sfap.AlaBamaCategory_8.isEnabled());
		assertTrue(sfap.AlaBamaCategory_9.isEnabled());
		assertTrue(sfap.AlaBamaCategory_10.isEnabled());
		assertTrue(sfap.AlaBamaCategory_11.isEnabled());
		assertTrue(sfap.AlaBamaCategory_12.isEnabled());
	}
//	@Ignore
	@Test
	public void aToZ_1199() {
		driver.get(ConfigurationReader.getProperty("StatefactsURL"));
		homepage.Category_2.click();
		hcbp.HealthCareExpendituresButton.click();
		assertTrue(hcbp.Alabama.isEnabled());
		hcbp.Location.click();
		assertTrue(hcbp.Wyoming.isEnabled());
	}
//	@Ignore
	@Test
	public void numOfResidents_1200() throws InterruptedException {
		driver.get(ConfigurationReader.getProperty("StatefactsURL"));
		homepage.Category_1.click();
		dep.AcceptCokisBotton.click();
		dep.numberOfResidentsLink.click();
		
		assertTrue(dep.Alabama.isEnabled());
		assertTrue(dep.NumberOfResident.isEnabled());
	}
	@Ignore
	@Test
	public void activeLinksNumber() throws InterruptedException {
		hp.menuButton.click();
		Thread.sleep(1000);
		hp.AcceptCokisBotton.click();
		driver.findElement(By.xpath("(//a[@href='#'])[2]")).click();
		Thread.sleep(1000);
		hp.MenuStatebutton.click();
		Thread.sleep(1000);

		hp.stateButtonclick.click();
		String expected = "State Health Facts | The Henry J. Kaiser Family Foundation";
		assertEquals(driver.getTitle(), expected);
		
		assertTrue(homepage.links.isEnabled());
	}
	@Ignore
	@Test
	public void smokeTest_1195() throws InterruptedException {
		hp.menuButton.click();
		Thread.sleep(1000);
		hp.AcceptCokisBotton.click();
		driver.findElement(By.xpath("(//a[@href='#'])[2]")).click();
		Thread.sleep(1000);
		hp.MenuStatebutton.click();
		Thread.sleep(1000);

		hp.stateButtonclick.click();
		
		assertTrue(homepage.SearchStateText.isDisplayed());
		driver.get(ConfigurationReader.getProperty("homePageUrl"));
		//Step 5 and step 6 will be added here
	
	}

}

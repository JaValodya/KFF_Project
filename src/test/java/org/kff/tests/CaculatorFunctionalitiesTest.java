package org.kff.tests;

import static org.testng.Assert.assertEquals;

import org.kff.pages.CalculatorPage;
import org.kff.pages.HealthInsuranceMarketplaceCalculatorPage;
import org.kff.pages.HomePage;
import org.kff.pages.PrivateInsurancePage;
import org.kff.utilities.BrowserUtils;
import org.kff.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CaculatorFunctionalitiesTest extends TestBase{
	
	CalculatorPage calculatorPage = new CalculatorPage();
	
	@Test(priority=1)
	public void calculatorDefaultInputsTest_771() {
		

		assertEquals(calculatorPage.enterInfoTxt, "Enter Information About Your Household");
		calculatorPage.selectStateTxt.isDisplayed();
		calculatorPage.enterIncomeTxt.isDisplayed();
		calculatorPage.enterAnnualIncomeTxt.isDisplayed();
		calculatorPage.isCoverageAvailableTxt.isDisplayed();
		calculatorPage.numberOfPeopleTxt.isDisplayed();
		calculatorPage.numberOfAdultsTxt.isDisplayed();
		calculatorPage.numberOfChildrenTxt.isDisplayed();
		calculatorPage.clear.isDisplayed();
		calculatorPage.submit.isDisplayed();
		
		assertEquals(calculatorPage.selectStateMenu().getFirstSelectedOption().getText(), "US Average");
		assertEquals(calculatorPage.enterIncomeMenu().getFirstSelectedOption().getText(), "2018 Dollars");
		assertEquals(calculatorPage.isCoverageAvailableMenu().getFirstSelectedOption().getText(), "No");
		assertEquals(calculatorPage.numberOfPeopleMenu().getFirstSelectedOption().getText(), "1");
		assertEquals(calculatorPage.numberOfAdultsMenu().getFirstSelectedOption().getText(), "No Adults");
		assertEquals(calculatorPage.numberOfChildrenMenu().getFirstSelectedOption().getText(), "No Children");

		calculatorPage.submit.click();
		BrowserUtils.waitForVisibility(calculatorPage.invaidIncomeMessage, 2);
		calculatorPage.invaidIncomeMessage.isDisplayed();
	
	}
	
	@Test(priority=2)
	public void changeIncomeToPoverty() {
		calculatorPage.enterIncomeMenu().selectByIndex(2);
		BrowserUtils.waitFor(2);
		assertEquals(calculatorPage.enterAnnualIncomeTxt.getText(), "% of Federal Poverty Level");
	}
	

	
}

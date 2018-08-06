package org.kff.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.kff.pages.HealthInsuranceMarketplaceCalculatorPage;
import org.kff.pages.HomePage;
import org.kff.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
	
	
	HealthInsuranceMarketplaceCalculatorPage calc = new HealthInsuranceMarketplaceCalculatorPage();
	HomePage homepage = new HomePage();
	
	@Test (priority = 1)
	public void CheckingExplanationsVisibility_601() {
		
	
		homepage.menuButton.click();
		homepage.PrivateIsuranceLink.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		homepage.Calculator.click();
		
		
		String actual = calc.stateTooltip.getAttribute("data-tooltip");
		String expected = "Select your state. If your state has local data available, you will be able to enter your zip code.";
		assertEquals(actual, expected);
		
		String actual1 = calc.houseHoldTooltip.getAttribute("data-tooltip");
		String expected1 = "Enter your estimated yearly household income. Include the income(s) of yourself, your spouse, and any dependents who contribute to the household. See the FAQ section on income for more information.";
		assertEquals(actual1, expected1);
		
		String actual2 = calc.coverageTooltip.getAttribute("data-tooltip");
		String expected2 = "Select “No” if your employer requires you to spend more than 9.66% of your household income on your own insurance premium, or if the health insurance your employer offers does not meet the health care law’s minimum value standards.";
		assertEquals(actual2, expected2);
		
		String actual3 = calc.pplNumberTooltip.getAttribute("data-tooltip");
		String expected3 = "This includes you, your spouse, and any children that you consider dependents on your taxes.";
		assertEquals(actual3, expected3);
		
		String actual4 = calc.adultNumberTooltip.getAttribute("data-tooltip");
		String expected4 = "See the FAQ question on Medicare if you are age 65+";
		assertEquals(actual4, expected4);
		
	}	
		@Test (priority = 2)
		public void CheckingPlusSignExplanationsVisibility_602() throws InterruptedException {
		
			
			homepage.menuButton.click();
			homepage.PrivateIsuranceLink.click();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,2000)");
			homepage.Calculator.click();
			
			String actual = calc.householdText.getText();
			String expected = "Enter Information About Your Household";
			assertEquals(actual, expected);
			
			Actions actions = new Actions(driver);
			actions.moveToElement(calc.notesText).click().build().perform();
			assertTrue(calc.notesText.isDisplayed());
			actions.moveToElement(calc.notesText).click().build().perform();
			
			actions.moveToElement(calc.FAQText).click().build().perform();
		//	assertTrue(calc.FAQAccordion.isDisplayed());
			actions.moveToElement(calc.FAQText).click().build().perform();

			
			
		}
		
		@Test (priority =3)
		public void CheckingAnItemsAcceptingNegativeValue_603() {
			
			homepage.menuButton.click();
			homepage.PrivateIsuranceLink.click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,2000)");
			homepage.Calculator.click();
			
		calc.incomeField.sendKeys("-10000");
		
		
		}
	
	
	
}

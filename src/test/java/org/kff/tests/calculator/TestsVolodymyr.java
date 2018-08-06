
package org.kff.tests.calculator;

import static org.testng.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.kff.pages.HealthInsuranceMarketplaceCalculatorPage;
import org.kff.pages.HomePage;
import org.kff.pages.PrivateInsurancePage;
import org.kff.tests.TestBase;
import org.kff.utilities.BrowserUtils;
import org.kff.utilities.ConfigurationReader;
import org.kff.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestsVolodymyr extends TestBase {
	BrowserUtils wait = new BrowserUtils();


	@Test
	public void calculator_773() {
		// Calculator - "Is coverage available from your or your spouses job?" field,
		// value check
		/*
		 * 1. Select a State 
		 * 2. Enter income as 
		 * 3. Enter annual income (dollars) 
		 * 4. Is coverage available from your or your spouse?s job? 
		 * 5. Number of people in family 
		 * 6. Number of adults (21 to 64) enrolling in Marketplace coverage 
		 * 7. Number of children (20 and younger) enrolling in Marketplace coverage
		 * "Submit" button should be visible "Clear" button should be visible
		 */
		HealthInsuranceMarketplaceCalculatorPage calculator = new HealthInsuranceMarketplaceCalculatorPage();
		driver.get(ConfigurationReader.getProperty("CalculatorUrl"));
		assertTrue(driver.getTitle().contains(expectedCalculatorPageTitle));

	}

}


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

public class CalculatorTests extends TestBase{
 BrowserUtils wait = new BrowserUtils();
	//@Ignore 
	@Test(priority = 1)
	public void default_values_785 () throws InterruptedException {
	HomePage homePage = new HomePage();
	PrivateInsurancePage privateInsurancePage = new PrivateInsurancePage();
	HealthInsuranceMarketplaceCalculatorPage calculator = new HealthInsuranceMarketplaceCalculatorPage();
	assertTrue(Driver.getDriver().getTitle().contains(expectedHomePagetTitle));
	homePage.cookiesAcceptBunnon.click();
	homePage.menuButton.click();
	wait.waitFor(1);
	BrowserUtils.waitForClickablility(homePage.PrivateInsurance, 3).click();	
	Actions ac = new Actions(Driver.getDriver());
	ac.moveToElement(privateInsurancePage.Calculator).click().build().perform();
	ac.moveToElement(calculator.notes).build().perform();
	expected = "Enter Information About Your Household";
	actual = calculator.enterInformationAboutYourHouseholdField.getText();
	assertEquals(actual, expected);
	expected = "Select a State";
	actual = calculator.selectAStateField.getText();
	assertEquals(actual, expected);
	expected = "Enter income as";
	actual = calculator.enterIncomAsText.getText();
	assertEquals(actual, expected);
	expected = "Enter your yearly household income (dollars)";
	actual = calculator.enterYearlyHouseholdField.getText();
	assertEquals(actual, expected);
	expected = "Is coverage available from your or your spouse’s job?";
	actual = calculator.isCoverageAvailableField.getText();
	assertEquals(actual, expected);
	expected = "Number of people in family";
	actual = calculator.numberOfPeopleInFamilyField.getText();
	assertEquals(actual, expected);
	expected = "Number of adults (21 to 64) enrolling in Marketplace coverage";
	actual = calculator.numberOfAdultsField.getText();
	assertEquals(actual, expected);
	expected = "Number of children (20 and younger) enrolling in Marketplace coverage";
	actual = calculator.numberOfChildrenField.getText();
	assertEquals(actual, expected);	
	}
	
	//@Ignore 
	@Test(priority = 2)
	public void yearly_household_income_field_691 () throws InterruptedException {
	HealthInsuranceMarketplaceCalculatorPage calculator = new HealthInsuranceMarketplaceCalculatorPage();
	driver.get(ConfigurationReader.getProperty("CalculatorUrl"));
	actual = driver.getTitle();
	assertEquals(actual, expectedCalculatorPageTitle);
	expected = "Enter Information About Your Household";
	actual = calculator.enterInformationAboutYourHouseholdField.getText();
	assertEquals(actual, expected);
	expected = "Enter your yearly household income (dollars)";
	actual = calculator.householdIncomeText.getText();
	assertEquals(actual, expected);
	expected = "";
	actual = calculator.householdIncomeInputField.getText();
	assertEquals(actual, expected);
	expected = "Enter income as";
	actual = calculator.enterIncomAsText.getText();
	assertEquals(actual, expected);
	if(calculator.popUpCoockie.isDisplayed()) {
		calculator.popUpCoockie.click();}
	Select select = new Select(calculator.enterIncomAsSelectBox);
	WebElement option = select.getFirstSelectedOption();
	String actual = option.getText();
	expected = "2018 Dollars";
	assertEquals(actual, expected);
	Select select2 = new Select(calculator.enterIncomAsSelectBox);
	List<WebElement> availableOptions = select.getOptions();
	ArrayList<String> incomeActualOptions = new ArrayList<>();
	ArrayList<String> incomeExpectedOptions = new ArrayList<>();
	for(WebElement opt : availableOptions) {
		incomeActualOptions.add(opt.getText());}
	incomeExpectedOptions.add("2018 Dollars");
	incomeExpectedOptions.add("% of Poverty");
	assertEquals(incomeActualOptions , incomeExpectedOptions);
	expected = "% of Poverty";
	select2.selectByVisibleText(expected);
	actual = select2.getFirstSelectedOption().getText();
	assertEquals(expected, actual);
	expected = "% of Federal Poverty Level";
	actual = calculator.householdIncomeText.getText();
	assertEquals(expected, actual);
	}

	//@Ignore 
	@Test(priority = 3)
	public void state_changing_zip_functionality_789 () throws InterruptedException {
	HealthInsuranceMarketplaceCalculatorPage calculator = new HealthInsuranceMarketplaceCalculatorPage();
	driver.get(ConfigurationReader.getProperty("CalculatorUrl"));
	actual = driver.getTitle();
	assertEquals(actual, expectedCalculatorPageTitle);
	expected = "Enter Information About Your Household";
	actual = calculator.enterInformationAboutYourHouseholdField.getText();
	assertEquals(actual, expected);
	Actions act = new Actions(Driver.getDriver());
	act.moveToElement(calculator.notes).build().perform();
	expected = "Select a State";
	actual = calculator.selectAStateField.getText();
	assertEquals(actual, expected);
	Select select3 = new Select(calculator.selectAStateSelector);
	actual = select3.getFirstSelectedOption().getText();
	expected = "US Average";
	assertEquals(actual, expected);
	if(calculator.popUpCoockie.isDisplayed()) {
		calculator.popUpCoockie.click();}
	List<WebElement> allStates = select3.getOptions();
	allStates.remove(0);
	ArrayList<String> sortedStates = new ArrayList<>();
	ArrayList<String> actualStates = new ArrayList<>();
	for(WebElement state : allStates) {
		sortedStates.add(state.getText());
		actualStates.add(state.getText());
	}
	java.util.Collections.sort(sortedStates);
	assertEquals(actualStates, sortedStates);
	select3.selectByVisibleText("Colorado");
	expected = "Enter your zip code";
	actual = calculator.enterYourZipField.getText();
	assertEquals(actual, expected);
	calculator.enterZipInput.sendKeys("20855");
	actual = select3.getFirstSelectedOption().getText();
	expected = "Maryland";
	assertEquals(actual, expected);
	
	}
	
	
	
}	
	


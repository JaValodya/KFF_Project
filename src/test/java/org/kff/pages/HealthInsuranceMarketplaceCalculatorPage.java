package org.kff.pages;

import org.kff.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HealthInsuranceMarketplaceCalculatorPage {

	public HealthInsuranceMarketplaceCalculatorPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//div[@id='state-wrapper']//span[@class='inline-tip']")
	public WebElement stateTooltip;

	@FindBy(xpath = "//div[@class='input-wrapper']//span[@data-tooltip='Enter your estimated yearly household income. Include the income(s) of yourself, your spouse, and any dependents who contribute to the household. See the FAQ section on income for more information.']")
	public WebElement houseHoldTooltip;

	@FindBy(xpath = "//div[@class='input-wrapper']//span[@data-tooltip='Select “No” if your employer requires you to spend more than 9.66% of your household income on your own insurance premium, or if the health insurance your employer offers does not meet the health care law’s minimum value standards.']")
	public WebElement coverageTooltip;

	@FindBy(xpath = "//div[@class='input-wrapper']//span[@data-tooltip='This includes you, your spouse, and any children that you consider dependents on your taxes.']")
	public WebElement pplNumberTooltip;

	@FindBy(xpath = "//div[@class='input-wrapper']//span[@data-tooltip='See the FAQ question on Medicare if you are age 65+']")
	public WebElement adultNumberTooltip;

	@FindBy(xpath = "//h4[.='Enter Information About Your Household']")
	public WebElement householdText;
	
	@FindBy(xpath = "//h5[.='notes']")
	public WebElement notesText;

	@FindBy(xpath = "//dd[@style='display: block;']")
	public WebElement notesAccordion;
	
	@FindBy(css="#subsidy-calculator-new > div:nth-child(7) > div > dl > dt > a.plus-btn.active")
	public WebElement minusSign;
	
	@FindBy(xpath = "//h5[.='Frequently Asked Questions']")
	public WebElement FAQText;
	
	@FindBy(css = "#subsidy-calculator-new > div:nth-child(8) > div > dl > dd")
	public WebElement FAQAccordion;
	
	@FindBy(xpath = "//input[@name='income']")
	public WebElement incomeField;
}

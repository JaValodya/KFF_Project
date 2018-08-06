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
	
	// taken from Kosta's page
	
	@FindBy(xpath = "//div[@id='state-wrapper']//span[@class='inline-tip']")
	public WebElement stateExplanation;

	@FindBy(xpath = "//*[@id=\"scroll-form\"]/h4")
	public WebElement enterInformationAboutYourHouseholdField;
	
	@FindBy(xpath = "//*[@id=\"subsidy-calculator-new\"]/div[6]/div/dl/dt/a[1]/h5")
	public WebElement notes;
	
	@FindBy(xpath = "//*[@id=\"zip-prompt\"]")
	public WebElement selectAStateField;
	
	@FindBy(xpath = "//*[@id=\"state-dd\"]")
	public WebElement selectAStateSelector;
	
	@FindBy(xpath = "//*[@id=\"subsidy-form\"]/div[2]/div[1]/div[3]/div/input")
	public WebElement householdIncomeInputField;
	
	@FindBy(xpath = "//*[@id=\"subsidy-form\"]/div[2]/div[1]/div[2]/p")
	public WebElement enterIncomAsText;
		
	@FindBy(xpath = "//*[@id=\"income-prompt\"]")
	public WebElement householdIncomeText;

	@FindBy(xpath = "//*[@id=\"subsidy-form\"]/div[2]/div[1]/div[2]/div/select")
	public WebElement enterIncomAsSelectBox;
	
	@FindBy(xpath = "//*[@id=\"income-prompt\"]")
	public WebElement enterYearlyHouseholdField;
	
	@FindBy(xpath = "//*[@id=\"subsidy-form\"]/div[2]/div[1]/div[4]/p")
	public WebElement isCoverageAvailableField;
	
	@FindBy(xpath = "//*[@id=\"subsidy-form\"]/div[2]/div[1]/div[5]/p")
	public WebElement numberOfPeopleInFamilyField;
	
	@FindBy(xpath = "//*[@id=\"subsidy-form\"]/div[2]/div[3]/div[1]/p")
	public WebElement numberOfAdultsField;
	
	@FindBy(xpath = "//*[@id=\"subsidy-form\"]/div[2]/div[3]/div[3]/p")
	public WebElement numberOfChildrenField;
	
	@FindBy(xpath = "//*[@id=\"hs-eu-confirmation-button\"]")
	public WebElement popUpCoockie;
	
	@FindBy(xpath = "//*[@id=\"zip-wrapper\"]/p")
	public WebElement enterYourZipField;
	
	@FindBy(xpath = "//*[@id=\"zip-wrapper\"]/div/input")
	public WebElement enterZipInput;
	
	
}

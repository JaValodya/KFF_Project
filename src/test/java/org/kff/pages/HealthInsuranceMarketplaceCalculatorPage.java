package org.kff.pages;

import org.kff.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HealthInsuranceMarketplaceCalculatorPage {
	
	
			
	public HealthInsuranceMarketplaceCalculatorPage(){
		PageFactory.initElements(Driver.getDriver(), this);
	}	
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
		

		
		
		
//		@FindBy(xpath = "")
//		public WebElement ;
		
	}	

// hi kamil this is my changes



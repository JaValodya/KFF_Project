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
		
	}	

// hi kamil this is my changes



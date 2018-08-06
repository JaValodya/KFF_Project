package org.kff.pages;

import org.kff.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CalculatorPage {
	public CalculatorPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy(css="(//h4)[2]")
	public WebElement enterInfoTxt;
	// 
	
	@FindBy(xpath="//p[@id='zip-prompt']")
	public WebElement selectStateTxt;

	/// ACTUAL: DO I need to use getFirstSelectedOption().getAttributes("value")
	@FindBy(xpath="//select[@id='state-dd']")
	public WebElement dropdown1;
	public Select selectStateMenu() {
		return new Select(dropdown1);
	}
	// expected: US Average
	
	@FindBy(css="(//div//div[@class='form-item clearfix']//p)[1]")
	public WebElement enterIncomeTxt;
			
	@FindBy(xpath="//select[@name='income-type']")
	public WebElement dropdown2;
	public Select enterIncomeMenu() {
		return new Select(dropdown2);
	}
	// expected: 2018 Dollars
	
	@FindBy(xpath="(//p[@class='prompt-with-tip'])[1]")
	public WebElement enterAnnualIncomeTxt;
	
	@FindBy(xpath="//input[@name='income']")
	public WebElement emptyIncome;
	
	
	@FindBy(css="(//p[@class='prompt-with-tip'])[2]")
	public WebElement isCoverageAvailableTxt;
	
	@FindBy(xpath="//select[@name='employer-coverage']")
	public WebElement dropdown3;
	public Select isCoverageAvailableMenu() {
		return new Select(dropdown3);
	}
	// Expected: No  --> getAttribute("value") might give you 0 instead of No
	
	@FindBy(css="(//p[@class='prompt-with-tip'])[3]")
	public WebElement numberOfPeopleTxt;
	
	@FindBy(xpath="//select[@name='people']")
	public WebElement dropdown4;
	
	// Expected: 1
	public Select numberOfPeopleMenu() {
		return new Select(dropdown4);
	}
	
	@FindBy(xpath="(//p[@class='prompt-with-tip'])[4]")
	public WebElement numberOfAdultsTxt;

	@FindBy(xpath="//select[@name='adult-count']")
	public WebElement dropdown5;
	public Select numberOfAdultsMenu() {
		return new Select(dropdown5);
	}
	// Expected: No Adults
	
	// OR is this xpath!??
	@FindBy(css="//div[@class='form-item form-item-children clearfix']/p")
	public WebElement numberOfChildrenTxt;
	
	@FindBy(xpath="//select[@name='child-count']")
	public WebElement dropdown6;
	public Select numberOfChildrenMenu() {
		return new Select(dropdown6);
	}
	// Expected: No Children

	@FindBy(xpath="//p//input[@type='reset']")
	public WebElement clear;
	
	@FindBy(xpath="//p//input[@type='submit']")
	public WebElement submit;
	
	@FindBy(xpath="//p[@class='form-message']")
	public WebElement invaidIncomeMessage;

	
	
	
}

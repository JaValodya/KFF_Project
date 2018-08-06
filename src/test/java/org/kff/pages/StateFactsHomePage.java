package org.kff.pages;

import org.kff.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StateFactsHomePage {
 
	public StateFactsHomePage() {
		  PageFactory.initElements(Driver.getDriver(), this);
	}
	 @FindBy(xpath="(//title)[1]")
	 public WebElement StatePageTitle;
	 @FindBy(xpath="//h2[@class='search-global']")
	 public WebElement SearchStateText;
	 @FindBy(xpath="//h1")
	 public WebElement ChooseCategory;
	 @FindBy(xpath="//h3[@class='kicker']")
	 public WebElement NEWUPDATEDSText;
	 @FindBy(xpath="//p[@class='byline']")
	 public WebElement NewsDate;
	 
	 
	 
	 
	 
	 @FindBy(xpath="//*[@id=\"state-health-wrapper\"]/div[3]/div[3]/div[1]/h3/a")
	 public WebElement Section_1115;
	 
	 
	
	 @FindBy(xpath="//a[@href='https://www.kff.org/state-category/demographics-and-the-economy/']")
	 public WebElement Category_1;
	 @FindBy(xpath="//a[@href='https://www.kff.org/state-category/health-costs-budgets/']")
	 public WebElement Category_2;
	 @FindBy(xpath="//a[@href='https://www.kff.org/state-category/health-coverage-uninsured/']")
	 public WebElement Category_3;
	 @FindBy(xpath="//a[@href='https://www.kff.org/state-category/health-insurance-managed-care/']")
	 public WebElement Category_4;
	 @FindBy(xpath="//a[@href='https://www.kff.org/state-category/health-reform/']")
	 public WebElement Category_5;
	 @FindBy(xpath="//a[@href='https://www.kff.org/state-category/health-status/']")
	 public WebElement Category_6;
	 @FindBy(xpath="//a[@href='https://www.kff.org/state-category/hivaids/']")
	 public WebElement Category_7;
	 @FindBy(xpath="//a[@href='https://www.kff.org/state-category/medicaid-chip/']")
	 public WebElement Category_8;
	 @FindBy(xpath="//a[@href='https://www.kff.org/state-category/medicare/']")
	 public WebElement Category_9;
	 @FindBy(xpath="//a[@href='https://www.kff.org/state-category/minority-health/']")
	 public WebElement Category_10;
	 @FindBy(xpath="//a[@href='https://www.kff.org/state-category/providers-service-use/']")
	 public WebElement Category_11;
	 @FindBy(xpath="//a[@href='https://www.kff.org/state-category/womens-health/']")
	 public WebElement Category_12;
	@FindBy(className="geo-picker")
	public WebElement selectStateButton;
	@FindBy(xpath="//option[@value='AL']")
	public WebElement SelectAlAbama;
	
	@FindBy(xpath="//a[@href]")
	 public WebElement links;
	
	 
	 

}

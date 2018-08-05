package org.kff.pages;

import org.kff.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StateFacts_AlaBamaPage {
	public StateFacts_AlaBamaPage() {
		  PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	
	
	 @FindBy(xpath="//a[@href='https://www.kff.org/state-category/demographics-and-the-economy/?state=al']")
	 public WebElement AlaBamaCategory_1;
	 @FindBy(xpath="//a[@href='https://www.kff.org/state-category/health-costs-budgets/?state=al']")
	 public WebElement AlaBamaCategory_2;
	 @FindBy(xpath="//a[@href='https://www.kff.org/state-category/health-coverage-uninsured/?state=al']")
	 public WebElement AlaBamaCategory_3;
	 @FindBy(xpath="//a[@href='https://www.kff.org/state-category/health-insurance-managed-care/?state=al']")
	 public WebElement AlaBamaCategory_4;
	 @FindBy(xpath="//a[@href='https://www.kff.org/state-category/health-reform/?state=al']")
	 public WebElement AlaBamaCategory_5;
	 @FindBy(xpath="//a[@href='https://www.kff.org/state-category/health-status/?state=al']")
	 public WebElement AlaBamaCategory_6;
	 @FindBy(xpath="//a[@href='https://www.kff.org/state-category/hivaids/?state=al']")
	 public WebElement AlaBamaCategory_7;
	 @FindBy(xpath="//a[@href='https://www.kff.org/state-category/medicaid-chip/?state=al']")
	 public WebElement AlaBamaCategory_8;
	 @FindBy(xpath="//a[@href='https://www.kff.org/state-category/medicare/?state=al']")
	 public WebElement AlaBamaCategory_9;
	 @FindBy(xpath="//a[@href='https://www.kff.org/state-category/minority-health/?state=al']")
	 public WebElement AlaBamaCategory_10;
	 @FindBy(xpath="//a[@href='https://www.kff.org/state-category/providers-service-use/?state=al']")
	 public WebElement AlaBamaCategory_11;
	 @FindBy(xpath="//a[@href='https://www.kff.org/state-category/womens-health/?state=al']")
	 public WebElement AlaBamaCategory_12;

}
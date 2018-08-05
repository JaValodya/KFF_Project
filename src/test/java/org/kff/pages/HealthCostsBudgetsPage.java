package org.kff.pages;

import org.kff.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HealthCostsBudgetsPage {

	public HealthCostsBudgetsPage() {
		  PageFactory.initElements(Driver.getDriver(), this);
	}
	 @FindBy(xpath="//a[@href='https://www.kff.org/other/state-indicator/total-residents/']")
	 public WebElement HealthCare_Expenditures_botton;
	 @FindBy(xpath="//span[@title='Alabama']")
	 public WebElement Alabama;
	 @FindBy(xpath="(//span[@id='agText'])[1]")
	 public WebElement Location;
	 @FindBy(xpath="//span[@title='Wyoming']")
	 public WebElement Wyoming;

}

package org.kff.pages;

import org.kff.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demographic_EconomyPage {

	public Demographic_EconomyPage() {
		  PageFactory.initElements(Driver.getDriver(), this);
	}
	 @FindBy(xpath="//a[@href=\"https://www.kff.org/other/state-indicator/total-residents/\"]")
	 public WebElement numberOfResident;
	 @FindBy(xpath="//a[@href='https://www.kff.org/other/state-indicator/total-residents/']")
	 public WebElement numberOfResidentsLink;
	 
	 @FindBy(id="hs-eu-confirmation-button")
		public WebElement AcceptCokisBotton ;
	 
	 @FindBy(xpath="//span[@title='Alabama']")
	 public WebElement Alabama;
	 @FindBy(xpath="//span[@title='4,834,100']")
	 public WebElement NumberOfResident;
	 @FindBy(xpath="//a[@href]")
	 public WebElement links;
}
	 


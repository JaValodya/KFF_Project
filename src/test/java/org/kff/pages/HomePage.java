package org.kff.pages;

import org.kff.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//*[text()='menu']")
	public WebElement menuButton;
	
	@FindBy(xpath = "//li[@id='menu-item-185321']/a")
	public WebElement PrivateInsurance;
	
	@FindBy (xpath = "//*[@id=\'hs-eu-confirmation-button\']")
	public WebElement cookiesAcceptBunnon;
	
	

}

package org.kff.pages;

import org.kff.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//a[@class='menu']")
	public WebElement menuButton;
	
	@FindBy(linkText = "Private Insurance")
	public WebElement PrivateIsuranceLink;
	
	@FindBy(linkText="2018 Health Insurance Marketplace Calculator")
	public WebElement Calculator;
	

}

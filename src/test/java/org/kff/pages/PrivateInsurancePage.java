package org.kff.pages;

import org.kff.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrivateInsurancePage {

	public PrivateInsurancePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy (xpath = "//*[@id=\"content\"]/div[1]/div[11]/section[2]/a/img")
	public WebElement Calculator;
}

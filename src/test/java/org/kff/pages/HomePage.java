package org.kff.pages;

import org.kff.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath="//a[@class='menu']")
	public WebElement menuButton;
	@FindBy(xpath=("//a[@href='#'])[2]"))
    public WebElement tpicButton;
	@FindBy(xpath= "(//a[@href='/statedata'])[1]")
	public WebElement MenuStatebutton;
	@FindBy(id="hs-eu-confirmation-button")
	public WebElement AcceptCokisBotton ;
	@FindBy(xpath="//*[@id=\"menu-item-254102\"]/a")
	public WebElement stateButtonclick ;
	
	
	


}

package org.kff.pages;

import org.kff.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class PrivateInsurancePage {

	public PrivateInsurancePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
}

package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage {

	
	@FindBy(id="logoutLink")
   private	WebElement Logoutbutton;

	public WebElement getLogoutbutton() {
		return Logoutbutton;
	}

	
	

	}



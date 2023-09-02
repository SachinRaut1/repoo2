package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	
		public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginbutton() {
		return Loginbutton;
	}

		@FindBy(id="username")
		WebElement user;
		
		@FindBy(name="pwd")
		WebElement pass;
		
		@FindBy(xpath="//div[text()='Login ']")
		WebElement Loginbutton;

	}



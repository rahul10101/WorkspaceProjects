package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import utils.ui.Interact;

public class LoginFaceBookPageObjects extends Interact {

	private static final Logger logger = LogManager.getLogger(LoginFaceBookPageObjects.class);
	Scenario scn;

	private By username = By.xpath("//input[@id='email']");
	private By password = By.xpath("//input[@id='pass']");
	private By loginButton = By.xpath("//button[@name='login']");
	private By invalidLoginmsg = By.xpath("//div[text()=\"The password that you've entered is incorrect. \"]");
	
	public LoginFaceBookPageObjects(WebDriver driver, Scenario s) {
		setDriver(driver);
		this.scn = s;
	}

	public void enterUserName(String text) {

		setElement(username, text);
		logger.info("Value Entered in username Text Box: " + text);
	}

	public void enterPassword(String text) {

		setElement(password, text);
		logger.info("Value Entered in password Text Box: " + text);
	}

	public void clickLoginButton() {
		clickElement(loginButton);
		logger.info("Clicked on Login Button");
	}
	
	public void inValidlogindetails() {
		String invalidmsgText = getText(invalidLoginmsg);
		if(invalidmsgText.equals("The password that you've entered is incorrect.")) {
		logger.info("Invalid user Details");
		}
	}
	
}
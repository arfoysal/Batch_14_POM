package pages;

import org.openqa.selenium.By;

public class DarazLoginPage extends BasePage {
	public String LOGINPAGE_URL = "https://member.daraz.com.bd/user/login";
	public By EMAIL_PHONE_INPUT_FIELD = By.xpath("//input[@placeholder='Please enter your Phone Number or Email']");
	public By PASSWORD_INPUT_FIELD = By.xpath("//input[@placeholder='Please enter your password']");
	public By FORGOT_PASSWORD_FIELD = By.xpath("//a[normalize-space()='Forgot Password?']");
	public By LOGIN_BUTTON= By.xpath("//button[normalize-space()='LOGIN']");
	public By ERROR_MESSAGE= By.xpath("//div[@class='next-feedback-content']");
	public String ERROR_MESSAGE_TEXT = "Please enter a valid phone number.";
	public String ERROR_MESSAGE_PASSWORD_TEXT = "Incorrect username or password.";
	
	public void doLogin(String username, String password) {
		writeTextOnElement(EMAIL_PHONE_INPUT_FIELD, username);
		writeTextOnElement(PASSWORD_INPUT_FIELD, password);
		clickOnelement(LOGIN_BUTTON);
	}
	
	public String getErrorMessage() {
		return getElemntText(ERROR_MESSAGE);
	}

}

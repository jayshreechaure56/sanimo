package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user_name")
	private WebElement usernameTF;

	@FindBy(id = "password")
	private WebElement passwordTF;

	@FindBy(xpath = "//button[@type='submit'])")
	private WebElement signinButton;

	@FindBy(xpath = "//span[text()='Sanimo Polymers']")
	private WebElement sanimoPolymers;

	@FindBy(xpath = "//span[text()='Sanimo Testing']")
	private WebElement sanimoTesting;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsernameTF() {
		return usernameTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getSigninButton() {
		return signinButton;
	}

	public WebElement getSanimoPolymers() {
		return sanimoPolymers;
	}

	public WebElement getSanimoTesting() {
		return sanimoTesting;
	}

	// Business logic/ library
	public void toLoginToNinzaCRM(String Uname, String pswd) {
		usernameTF.sendKeys(Uname);
		passwordTF.sendKeys(pswd);
		signinButton.click();
	}

}

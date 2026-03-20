package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user_name")
	private WebElement usernameTF;

	@FindBy(id = "password")
	private WebElement passwordTF;

	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement signinButton;

	@FindBy(xpath = "//span[text()='Sanimo Polymers']")
	private WebElement sanimoPolymers;

	@FindBy(xpath = "//span[text()='Sanimo Testing']")
	private WebElement sanimoTesting;
	
	@FindBy(xpath = "//span[text()='Raw Material v2']")
	private WebElement rawMaterial;
	
	@FindBy(xpath = "//span[text()='Dyeing']")
	private WebElement dyeing;
	
	public WebElement getDyeing() {
		return dyeing;
	}


	@FindBy(xpath = "//span[text()='Sale Order']")
	private WebElement salesOrder;

	public WebElement getSalesOrder() {
		return salesOrder;
	}

	public WebElement getRawMaterial() {
		return rawMaterial;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLogout() {
		return logout;
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
	
	@FindBy(xpath = "(//*[name()='svg' and @stroke=\"currentColor\" ])[14]")
    private WebElement logout;

	// Business logic/ library
	public void toLoginToSanimo(String Uname, String pswd) {
		usernameTF.sendKeys(Uname);
		passwordTF.sendKeys(pswd);
		getSigninButton().click();
	}
	
	public void toLogOutToSanimo() {
		getLogout().click();
	}
	
	
	

}

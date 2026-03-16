package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GRN_Page {

	WebDriver driver;

	public GRN_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	
	//*[name()='svg' and @data-icon="menu-fold"]
	@FindBy(xpath = "//*[name()='svg' and @data-icon=\"menu-fold\"]")
	private WebElement menu_fold;

	@FindBy(xpath = "//span[text()='Raw Material v2']")
	private WebElement rawMaterial;
	
	@FindBy(xpath = "//span[text()='GRN']")
	private WebElement Grnbtn;
	
	@FindBy(xpath = "//button[text()='Add']")
	private WebElement AddGRN;
	
	@FindBy(xpath = "//span[text()='Raw Material v2']")
	private WebElement rawMaterial1;
	
	@FindBy(xpath = "//span[text()='Raw Material v2']")
	private WebElement rawMaterial2;

}

package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	
	@FindBy(xpath = "//div[@class=\"border border-secondary css-7b1t0c-control\"]")
	private WebElement transport;
	
	public WebElement values(String value) {
        return driver.findElement(
            By.xpath("//div[text()= "+value +"]")
        );

        
	}
	
	@FindBy(xpath = "//div[@class=\\\" css-19bb58m\\\"]/input[@id=\\\"react-select-4-input\\\"]")
	private WebElement supplierName;
	
	
	@FindBy(xpath = "//div[@class=\\\" css-19bb58m\\\"]/input[@id=\\\"react-select-6-input\\\"]")
	private WebElement lot;
	
	@FindBy(xpath = "//div[@class=\\\" css-19bb58m\\\"]/input[@id=\\\"react-select-5-input\\\"]")
	private WebElement returnable;
	
	@FindBy(xpath = "//div[@class=\\\" css-19bb58m\\\"]/input[@id=\\\"react-select-8-input\\\"]")
	private WebElement process;
	
	@FindBy(xpath = "//div[@class=\\\" css-19bb58m\\\"]/input[@id=\\\"react-select-10-input\\\"]")
	private WebElement UOM;
	
	@FindBy(xpath = "//div[@class=\\\" css-19bb58m\\\"]/input[@id=\\\"react-select-11-input\\\"]")
	private WebElement typeOfPacking;

	@FindBy(xpath = "//div[@class=\\\" css-19bb58m\\\"]/input[@id=\\\"react-select-12-input\\\"]")
	private WebElement grade;
	
	@FindBy(xpath = "//div[@class=\\\" css-19bb58m\\\"]/input[@id=\\\"react-select-13-input\\\"]")
	private WebElement qlty;
	
	
	@FindBy(xpath = "//div[@class=\\\" css-19bb58m\\\"]/input[@id=\\\"react-select-14-input\\\"]")
	private WebElement package1;
	
	@FindBy(xpath = "//input[@placeholder=\\\"Rate\\\"]")
	private WebElement rate;
	
	@FindBy(xpath = "//input[@name='total_cartons']")
	private WebElement cartons;
	
	@FindBy(xpath = "//input[@name=\\\"total_cheese\\\"]")
	private WebElement cheese;
	
	@FindBy(xpath = "//input[@name='total_net_weight']")
	private WebElement totalNetwt;
	
	@FindBy(xpath = "//button[text()='Add Shade Entry']")
	private WebElement addShade;
	
	@FindBy(xpath = "//input[@name=\"shade_entry[0].no_of_cartons\"]")
	private WebElement NoOfCartons;
	
	@FindBy(xpath = "//input[@name=\\\"shade_entry[0].no_of_cheese\\\"]")
	private WebElement NoOfCheese;
	
	@FindBy(xpath = "//input[@name=\\\"shade_entry[0].gross_weight\\\"]")
	private WebElement grosswt;
	
	@FindBy(xpath = "//input[@name=\\\"shade_entry[0].tare_weight\\\"]")
	private WebElement tarewt;
	
	@FindBy(xpath = "//input[@name=\\\"shade_entry[0].net_weight\\\"]")
	private WebElement netwt;
	
	@FindBy(xpath = "//button[@type=\\\"submit\\\"]")
	private WebElement grnSubmit;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getMenu_fold() {
		return menu_fold;
	}

	public WebElement getRawMaterial() {
		return rawMaterial;
	}

	public WebElement getGrnbtn() {
		return Grnbtn;
	}

	public WebElement getAddGRN() {
		return AddGRN;
	}

	public WebElement getTransport() {
		return transport;
	}

	public WebElement getSupplierName() {
		return supplierName;
	}

	public WebElement getLot() {
		return lot;
	}

	public WebElement getReturnable() {
		return returnable;
	}

	public WebElement getProcess() {
		return process;
	}

	public WebElement getUOM() {
		return UOM;
	}

	public WebElement getTypeOfPacking() {
		return typeOfPacking;
	}

	public WebElement getGrade() {
		return grade;
	}

	public WebElement getQlty() {
		return qlty;
	}

	public WebElement getPackage1() {
		return package1;
	}

	public WebElement getRate() {
		return rate;
	}

	public WebElement getCartons() {
		return cartons;
	}

	public WebElement getCheese() {
		return cheese;
	}

	public WebElement getTotalNetwt() {
		return totalNetwt;
	}

	public WebElement getAddShade() {
		return addShade;
	}

	public WebElement getNoOfCartons() {
		return NoOfCartons;
	}

	public WebElement getNoOfCheese() {
		return NoOfCheese;
	}

	public WebElement getGrosswt() {
		return grosswt;
	}

	public WebElement getTarewt() {
		return tarewt;
	}

	public WebElement getNetwt() {
		return netwt;
	}

	public WebElement getGrnSubmit() {
		return grnSubmit;
	}
	
	

	
	
	

}

package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesOrder_Page {

	WebDriver driver;

	public SalesOrder_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement values(String value) {
		return driver.findElement(

				By.xpath("//div[text()= '" + value + "']")

		);
	}

	@FindBy(xpath = "//input[@type='date' and @placeholder='Enter Order Date']")
	private WebElement order_date;

	@FindBy(xpath = "//input[@type='date' and @placeholder='Enter Estimate Delivery Date']")
	private WebElement estimate_date;

	@FindBy(xpath = "//button[text()='Add']")
	private WebElement AddSalesOrder;

	@FindBy(xpath = "(//div[@class=' css-f4x6o7'])[1]")
	private WebElement mainCategory;

	@FindBy(xpath = "(//div[@class=' css-f4x6o7'])[2]")
	private WebElement orderCategory;

	@FindBy(xpath = "(//div[@class=' css-f4x6o7'])[3]")
	private WebElement partyName;

	
	@FindBy(xpath = "(//div[@class=' css-f4x6o7'])[6]")
	private WebElement qlty;

	@FindBy(xpath = "//input[@id='react-select-16-input']")
	private WebElement grade;

	@FindBy(xpath = "//input[@id='react-select-17-input']")
	private WebElement process;

	@FindBy(xpath = "//input[@placeholder='Enter Order By']")
	private WebElement orderBY;

	@FindBy(xpath = "//input[@placeholder='Rate']")
	private WebElement rate;

	@FindBy(xpath = "//input[@id='react-select-18-input']")
	private WebElement shade;

	@FindBy(xpath = "//input[@placeholder='Net Weight']")
	private WebElement orderQlty;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getOrder_date() {
		return order_date;
	}

	public WebElement getEstimate_date() {
		return estimate_date;
	}

	public WebElement getAddSalesOrder() {
		return AddSalesOrder;
	}

	public WebElement getMainCategory() {
		return mainCategory;
	}

	public WebElement getOrderCategory() {
		return orderCategory;
	}

	public WebElement getPartyName() {
		return partyName;
	}

	public WebElement getQlty() {
		return qlty;
	}

	public WebElement getGrade() {
		return grade;
	}

	public WebElement getProcess() {
		return process;
	}

	public WebElement getOrderBY() {
		return orderBY;
	}

	public WebElement getRate() {
		return rate;
	}

	public WebElement getShade() {
		return shade;
	}

	public WebElement getOrderQlty() {
		return orderQlty;
	}

	public WebElement getSubmit() {
		return submit;
	}
	

}

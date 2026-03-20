package Sanimo.Sanimo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseClassUtility.BaseClass;
import genericUtility.ExcelFileUtility;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import objectRepo.HomePage;
import objectRepo.SalesOrder_Page;

public class SalesOrder extends BaseClass {

	@Test
	public void createSalesOrderTest() throws EncryptedDocumentException, IOException, InterruptedException {

		JavaUtility jutil = new JavaUtility();
		WebDriverUtility wutil = new WebDriverUtility();
		ExcelFileUtility eutil = new ExcelFileUtility();
		SalesOrder_Page sp = new SalesOrder_Page(driver);
		HomePage hp = new HomePage(driver);

		hp.getSanimoPolymers().click();
		hp.getSanimoTesting().click();
		hp.getDyeing().click();
		hp.getSalesOrder().click();
		sp.getAddSalesOrder().click();

		String order_date = eutil.toReadDataFromExcel("saleorder", 1, 0);
		String estimate_date = eutil.toReadDataFromExcel("saleorder", 1, 1);
		String main_category = eutil.toReadDataFromExcel("saleorder", 1, 2);
		String ordercategory = eutil.toReadDataFromExcel("saleorder", 1, 3);
		String party = eutil.toReadDataFromExcel("saleorder", 1, 4);
		String qlty = eutil.toReadDataFromExcel("saleorder", 1, 5);
		String grade = eutil.toReadDataFromExcel("saleorder", 1, 6);
		String process = eutil.toReadDataFromExcel("saleorder", 1, 7);
		String order = eutil.toReadDataFromExcel("saleorder", 1, 8);
		String rate = eutil.toReadDataFromExcel("saleorder", 1, 9);
		String shade = eutil.toReadDataFromExcel("saleorder", 1, 10);
		String orderQty = eutil.toReadDataFromExcel("saleorder", 1, 11);

		sp.getOrder_date().click();
		sp.getOrder_date().sendKeys(order_date);

		sp.getEstimate_date().click();
		sp.getEstimate_date().sendKeys(estimate_date);
		
		sp.getMainCategory().click();
		sp.values(main_category).click();
		
				sp.values(main_category).click();

		sp.getOrderCategory().click();
		sp.values(ordercategory).click();

		sp.getPartyName().click();
		sp.values(party).click();
		sp.getQlty().click();
		sp.values(qlty).click();
		sp.getGrade().click();
		sp.values(grade).click();
		sp.getProcess().click();
		sp.values(process).click();

		sp.getOrderBY().click();
		sp.getOrderBY().sendKeys(order);
		sp.getRate().click();
		sp.getRate().sendKeys(rate);

		sp.getAddSalesOrder().click();

		sp.getShade().click();
		sp.values(shade).click();

		sp.getOrderQlty().click();
		sp.getOrderQlty().sendKeys(orderQty);

		Thread.sleep(30000);

	}
}

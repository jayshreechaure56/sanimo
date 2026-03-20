package Sanimo.Sanimo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import baseClassUtility.BaseClass;
import genericUtility.ExcelFileUtility;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import objectRepo.GRN_Page;
import objectRepo.HomePage;

public class GRN extends BaseClass {

	@Test(groups = { "SmokeTestCase", "RegressionTestCase" })
	public void createGrnTest() throws EncryptedDocumentException, IOException {

		JavaUtility jutil = new JavaUtility();
		WebDriverUtility wutil = new WebDriverUtility();
		ExcelFileUtility eutil = new ExcelFileUtility();
		GRN_Page gp = new GRN_Page(driver);
		HomePage hp = new HomePage(driver);

		hp.getSanimoPolymers().click();
		hp.getSanimoTesting().click();
		hp.getRawMaterial().click();
		gp.getGrnbtn().click();
		gp.getAddGRN().click();

		String supplier_name = eutil.toReadDataFromExcel("GRN", 1, 0);
		String returnable = eutil.toReadDataFromExcel("GRN", 1, 1);
		String lot_no = eutil.toReadDataFromExcel("GRN", 1, 2);
		String process = eutil.toReadDataFromExcel("GRN", 1, 3);
		String shade_no = eutil.toReadDataFromExcel("GRN", 1, 4);
		String uom = eutil.toReadDataFromExcel("GRN", 1, 5);
		String typepackage = eutil.toReadDataFromExcel("GRN", 1, 6);
		String grade = eutil.toReadDataFromExcel("GRN", 1, 7);
		String qlty = eutil.toReadDataFromExcel("GRN", 1, 8);
		String package1 = eutil.toReadDataFromExcel("GRN", 1, 9);
		String godown = eutil.toReadDataFromExcel("GRN", 1, 10);
		String rate = eutil.toReadDataFromExcel("GRN", 1, 11);
		String carton = eutil.toReadDataFromExcel("GRN", 1, 12);
		String cheese = eutil.toReadDataFromExcel("GRN", 1, 13);
		String netwtT = eutil.toReadDataFromExcel("GRN", 1, 14);
		String Ncarton = eutil.toReadDataFromExcel("GRN", 1, 15);
		String Ncheese = eutil.toReadDataFromExcel("GRN", 1, 16);
		String gross = eutil.toReadDataFromExcel("GRN", 1, 17);
		String tare = eutil.toReadDataFromExcel("GRN", 1, 18);
		String netwt = eutil.toReadDataFromExcel("GRN", 1, 19);
		// Enter mandatory Details

		gp.getSupplierName().click();
		gp.values(supplier_name).click();

		gp.getReturnable().click();
		gp.values(returnable).click();

		gp.getLot().click();
		gp.values(lot_no).click();

		gp.getProcess().click();
		gp.values(process).click();

		gp.getPackage1().click();
		gp.values(package1).click();

		gp.getUOM().click();
		gp.values(uom).click();

		gp.getTypeOfPacking().click();
		gp.values(typepackage).click();

		gp.getGodown().click();
		gp.getGodown().sendKeys(godown);
		gp.getGodown().click();

		gp.getGrade().click();
		gp.values(grade).click();

		gp.getQlty().click();
		gp.values(qlty).click();

		// gp.getShadeCross().click();
		gp.getShade().sendKeys(shade_no);
		gp.getShade().click();

		gp.getRate().sendKeys(rate);
		gp.getCartons().sendKeys(carton);
		gp.getCheese().sendKeys(cheese);
		gp.getTotalNetwt().sendKeys(netwt);
		gp.getAddShade().click();
		gp.getNoOfCartons().sendKeys(carton);
		gp.getNoOfCheese().sendKeys(cheese);
		gp.getNetwt().sendKeys(netwt);
		gp.getGrosswt().sendKeys(gross);
		gp.getTarewt().sendKeys(tare);

		gp.getShade().clear();
		gp.getShade().click();
		gp.getShade().sendKeys(shade_no);
		gp.values(shade_no).click();

		wutil.toScrollWindow(driver, gp.getGrnSubmit());
		gp.getGrnSubmit().click();
		gp.getConfirm().click();
		
		//random number for grn cheese

	}

}

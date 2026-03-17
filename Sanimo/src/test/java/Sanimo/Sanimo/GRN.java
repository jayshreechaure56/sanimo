package Sanimo.Sanimo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import baseClassUtility.BaseClass;
import genericUtility.ExcelFileUtility;
import genericUtility.JavaUtility;
import objectRepo.GRN_Page;
import objectRepo.HomePage;

public class GRN extends BaseClass {

	@Test(groups = { "SmokeTestCase", "RegressionTestCase" })
	public void createGrnTest() throws EncryptedDocumentException, IOException {

		JavaUtility jutil = new JavaUtility();
		ExcelFileUtility eutil = new ExcelFileUtility();
		GRN_Page gp = new GRN_Page(driver);
		HomePage hp = new HomePage(driver);

		hp.getSanimoPolymers().click();
		hp.getSanimoTesting().click();
		gp.getRawMaterial().click();
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
		/*
		 * gp.getReturnable().sendKeys(returnable); gp.getLot().sendKeys(lot_no);
		 */
	}

}

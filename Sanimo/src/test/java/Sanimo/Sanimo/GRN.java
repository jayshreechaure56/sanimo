package Sanimo.Sanimo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import baseClassUtility.BaseClass;
import genericUtility.ExcelFileUtility;
import genericUtility.JavaUtility;
import objectRepo.GRN_Page;

public class GRN extends BaseClass{
	
	@Test(groups = {"SmokeTestCase","RegressionTestCase"})
	public void createCampTest() throws EncryptedDocumentException, IOException {

		JavaUtility jutil = new JavaUtility();
		ExcelFileUtility eutil = new ExcelFileUtility();
		GRN_Page gp = new GRN_Page(driver);
		
		
	}

}


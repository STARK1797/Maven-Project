package UtilPackage;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import BasePackage.BaseClass;

public class UtilityClass extends BaseClass {

	//ScreenShot
	//Excel Sheet
	// .Properties
	
	public static void captureScreenshot(WebDriver driver) throws IOException {
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\ABHIJIT\\Desktop\\Image.jpg");
		FileHandler.copy(file, dest);
	}
	
	public static String fetchData(int rows, int col) throws EncryptedDocumentException, IOException {
		File file = new File("C:\\Users\\ABHIJIT\\Desktop\\FetchAllDataFromExcel.xlsx");
		Workbook excel = WorkbookFactory.create(file); //Open Excel File
		Sheet sheet = excel.getSheet("Sheet1"); //Select Sheet from Excel File
		
		for(int i=0; i<=sheet.getLastRowNum();i++) {
			Row row = sheet.getRow(i);
			
			for(int j=0; j<row.getLastCellNum(); j++) {
				Cell cell = row.getCell(j);
				System.out.print(cell+" | ");
			}
			System.out.println();
		}
		
		return "data";
	}
	
}

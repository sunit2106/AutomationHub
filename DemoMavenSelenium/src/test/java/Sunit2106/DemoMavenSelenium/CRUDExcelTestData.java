package Sunit2106.DemoMavenSelenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CRUDExcelTestData {
	
	 String TestDataPath = "src/test/resources/TestData.xlsx";


public  String ReadTestData(String Scenario,String dataName) throws IOException {

		FileInputStream file = new FileInputStream(TestDataPath);

		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet(Scenario);
		int lastRow=sheet.getLastRowNum();
		for(int i=0;i<=lastRow;i++)
		{
			if(sheet.getRow(i).getCell(0).getStringCellValue().equals(dataName))
			 return sheet.getRow(i).getCell(1).getStringCellValue();
			else
				return null;
		}
		
		
		return null;

}
public  void UpdateTestData() throws IOException {

	FileInputStream file = new FileInputStream(TestDataPath);

	XSSFWorkbook workbook = new XSSFWorkbook(file);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	

}

}

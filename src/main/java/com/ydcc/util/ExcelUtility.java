package com.ydcc.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class ExcelUtility {
	public Object[][] readDataFromExcelAndLoadIntoArray(String fileName) throws IOException {
		Object[][] obj;
		FileInputStream file = new FileInputStream(fileName); // read file
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("GdExcelSheet");
		int noOfRow = sheet.getLastRowNum();

		obj = new Object[noOfRow][sheet.getRow(0).getLastCellNum()-1];
		for (int i = 1; i <= noOfRow; i++) {
			Row row = sheet.getRow(i);
			for (int j = 1; j <row.getLastCellNum(); j++) {
				Cell cell = row.getCell(j);
				switch (cell.getCellType()) {
				case NUMERIC:
					obj[i - 1][j - 1] = cell.getNumericCellValue();
					break;
				case STRING:
				obj[i - 1][j - 1] = cell.getStringCellValue();

				default:
					System.err.println("Invalid Cell Value");
					
				}
				//System.out.println(cell.getNumericCellValue());
			}
			
		}
		return obj;
	}
}

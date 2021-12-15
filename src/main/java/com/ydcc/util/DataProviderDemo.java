package com.ydcc.util;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviderDemo {
	@DataProvider(name = "Number Data")
	public Object[][] numberData() throws IOException {
		ExcelUtility excel = new ExcelUtility();
		Object obj[][] = excel.readDataFromExcelAndLoadIntoArray("C:/Daisy/Excel/GdExcelSheeet.xlsx");
		return obj;
	}
}

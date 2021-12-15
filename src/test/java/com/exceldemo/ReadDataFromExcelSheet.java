package com.exceldemo;

import org.testng.annotations.Test;

import com.ydcc.util.DataProviderDemo;

public class ReadDataFromExcelSheet {
	@Test(dataProvider = "Number Data", dataProviderClass= DataProviderDemo.class)
	public void readDataFromExcel(double i, double j) {
		double result = i+j;
		System.out.println(result);

	}
}

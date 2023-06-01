package com.wipro.utillity;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class RegisterDataProvider {

	public static FileInputStream fis;

	public static XSSFWorkbook workbook1;

	public static XSSFSheet sheet1;

	// data provider initializing to excel size

	@DataProvider(name = "registerData")
	public static Object[][] data() throws Exception {

		Object[][] data = null;

		fis = new FileInputStream("/Users/SA20463943/Desktop/CapStone Project/tutorialsNinja/testdata/sheet2.xlsx");

		workbook1 = new XSSFWorkbook(fis);

		sheet1 = workbook1.getSheet("Sheet2");

		int rowCount = sheet1.getLastRowNum();

		int coloumnCount = sheet1.getRow(0).getLastCellNum();

		data = new Object[rowCount][coloumnCount];

		// for data provider
		int r = 0;
		int c = 0;

		for (int i = 0; i < rowCount; i++) {
			Row row = sheet1.getRow(i + 1);

			for (int j = 0; j < coloumnCount; j++) {
				org.apache.poi.ss.usermodel.Cell cell = row.getCell(j);

				// to give dataProvider data in generic string format
				DataFormatter formatter = new DataFormatter();

				data[r][c++] = formatter.formatCellValue(cell);

			}

		}
		return data;
	}
}

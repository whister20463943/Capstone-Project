package com.wipro.utillity;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTestData {

	@SuppressWarnings("unused")
	private static final String PROPERTY_FILE_PATH = "";

	public static String getProperty(String fileLocation, String propertyname) throws IOException {
		String propertyValue;
		FileInputStream fis = new FileInputStream("");
		Properties properties = new Properties();
		properties.load(fis);
		propertyValue = properties.getProperty(propertyname);
		return propertyValue;

	}

	@SuppressWarnings("resource")
	public static String getExcelData(int row, int col, String sheetname, String field) throws IOException {

		String fileLoc = "";
		File fl = new File(fileLoc);
		FileInputStream fis = new FileInputStream(fl);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("sheet1");
		String cell = sheet.getRow(row).getCell(col).getStringCellValue();
		return cell;

	}

}

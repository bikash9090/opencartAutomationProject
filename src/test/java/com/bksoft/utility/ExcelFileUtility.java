package com.bksoft.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileUtility {

	private XSSFWorkbook workbook;
	private XSSFSheet sheet;
	private String path = System.getProperty("user.dir")+"\\src\\test\\resources\\UserDetails.xlsx";

	ExcelFileUtility() {
		try {
			FileInputStream fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			System.out.println("File not found exception occured!");
		} catch (IOException e) {
			System.out.println("IO exception occured!");
		}
	}
	
	public void readExcelFile(String sheetName){
		sheet = workbook.getSheet(sheetName);
		
		int lastRow = sheet.getLastRowNum();
		int lastCol = sheet.getRow(lastRow).getLastCellNum();
		
		for(int i=0;i<=lastRow;i++) {
			for(int j=0;j<lastCol;j++) {
				System.out.print(sheet.getRow(i).getCell(j)+" ");
			}
			System.out.println();
		}
	}

}

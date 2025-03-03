package com.bksoft.utility;

public class Main {

	public static void main(String[] args) {
		ReadPropertiesFile rpf = new ReadPropertiesFile();
		System.out.println(rpf.getUrl());
		
		
		ExcelFileUtility excel = new ExcelFileUtility();
		
		excel.readExcelFile("LoginCredentials");
		
		

	}

}

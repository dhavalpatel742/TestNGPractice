package com.util;

import java.util.ArrayList;


//import com.util.Xls_Reader;

public class ExcelDataProvider {
	
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getData() {
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
	
		try {
			reader = new Xls_Reader("C:\\Selenium_Workspace\\TestNGPractice\\src\\com\\util\\SignUp.xlsx");
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		String sheetname = "SignUp";
		
		for (int rowNum = 2; rowNum<=reader.getRowCount(sheetname);rowNum++ ) {
			
			String firstname = reader.getCellData(sheetname, "firstname", rowNum);
			String lastname = reader.getCellData(sheetname, "lastname", rowNum);
			String email = reader.getCellData(sheetname, "email", rowNum);
			String password = reader.getCellData(sheetname, "password", rowNum);
			
			Object ob[] = {firstname,lastname,email,password};
			myData.add(ob);	
		}
		
		return myData;
			
		
	}	
	

}

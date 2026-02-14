package com.vittech.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ExcelUtility {
static XSSFWorkbook workbook;
static XSSFSheet sheet;

public void loadExel(String path,String sheetname)
	{
       try
       {
    
         FileInputStream fins=new FileInputStream(path);
	     workbook = new XSSFWorkbook(fins);
	     sheet=workbook.getSheet(sheetname);
       }
       catch(Exception e)
       {
         e.printStackTrace();	
       }
    
     }

public static String getCellData(int row,int col)
	 {
      return sheet.getRow(row).getCell(col).getStringCellValue();
     }

public static void closeWorkbook() 
     {
	        try {
	              workbook.close();
	            } 
	        catch (Exception e) 
	            {
	            e.printStackTrace();
	            }
        }     
}

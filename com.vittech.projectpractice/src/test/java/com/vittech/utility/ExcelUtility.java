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
	public static void main(String[] args)
	{
    try
    {
    Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	Page page=browser.newPage();
	page.navigate("https://freelance-learn-automation.vercel.app/login");
    File fs =new File("C:/Users/91777/git/playwright_project_practice/com.vittech.projectpractice/target/Testdata.xlsx");
    FileInputStream fins=new FileInputStream(fs);
	XSSFWorkbook workbook = new XSSFWorkbook(fins);
	XSSFSheet sheet=workbook.getSheet("login");
	String username=sheet.getRow(0).getCell(0).getStringCellValue();
	String password=sheet.getRow(1).getCell(1).getStringCellValue();
	
	page.locator("//input[@id='email1']").fill(username);
	page.locator("//input[@id='password1']").fill(password);
	page.locator("//button[@type='submit']").click();
			
    
	
    }
    catch(Exception e)
    {
    e.printStackTrace();	
    }
}
}
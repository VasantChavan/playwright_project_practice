package com.vittech.utility;

import java.nio.file.Paths;

import com.microsoft.playwright.Page;

public class CommonUtility {
	
	private Page page;

	   public CommonUtility(Page page)
	   {
		this.page=page;
	    }

		public byte[] getScreenShots(String path)
		{
			
			return page.screenshot(new Page.ScreenshotOptions()
					.setPath(Paths.get(path)).setFullPage(true));

		}
		
		public void handleAlert()
		{
			 page.onceDialog(dialog->dialog.accept());
		}
		
		
		public void handleFrame(String id)
		{
			page.frameLocator(id);
		}

}

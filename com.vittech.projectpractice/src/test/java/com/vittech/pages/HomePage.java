package com.vittech.pages;

import com.microsoft.playwright.Page;

public class HomePage {
	 private Page page;

	    public HomePage (Page page) {
	        this.page = page;
	    }

	    // Locators
	    private String youtubeLink = "a[href*='youtube']";
	    private String twitterLink = "a[href*='twitter'], a[href*='x.com']";
	    private String linkedinLink = "a[href*='linkedin']";
	    private String facebookLink =  "a[href*='facebook']";
	    private String redditLink ="a[href*='reddit']";
	    // Actions
	    
	    public void navigateToLoginPage() {
	        page.navigate("https://freelance-learn-automation.vercel.app/login");
	    }

	    public Page clickYouTubeLink() {
	        return page.waitForPopup(() -> {
	            page.locator(youtubeLink).first().click();
	        });
	    }

	    public Page clickTwitterLink() {
	        return page.waitForPopup(() -> {
	            page.locator(twitterLink).first().click();
	        });
	    }

	    public Page clickLinkedInLink() {
	        return page.waitForPopup(() -> {
	            page.locator(linkedinLink).first().click();
	        });
	    }
	        
	    public Page clickFacebookLink() {
	            return page.waitForPopup(() -> {
	                page.locator(facebookLink).first().click();
	            });
	    }
	      public Page clickredditLink() {
	            return page.waitForPopup(() -> {
	               page.locator(redditLink).first().click();
	                });


	}

}

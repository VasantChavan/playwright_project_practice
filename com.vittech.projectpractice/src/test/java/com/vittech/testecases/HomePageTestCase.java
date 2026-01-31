package com.vittech.testecases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.vittech.pages.HomePage;
import com.vittech.testbase.TestBase;


public class HomePageTestCase extends TestBase{
	
	HomePage Hm;

    @Test
    public void verifyYouTubeLinkTest() {

        Hm = new HomePage(page);
        Hm.navigateToLoginPage();

        Page youtubePage =Hm.clickYouTubeLink();
        youtubePage.waitForLoadState();

        String actualURL = youtubePage.url();
        Assert.assertTrue(actualURL.contains("youtube.com"),
                "YouTube page is NOT opened");

        youtubePage.close();
    }
    
    
    @Test(priority = 2)
    public void verifyTwitterLinkTest() {
        Hm = new HomePage(page);
        Hm.navigateToLoginPage();

        Page twitterPage = Hm.clickTwitterLink();
        twitterPage.waitForLoadState();

        String actualURL = twitterPage.url();
        Assert.assertTrue(actualURL.contains("twitter.com") || actualURL.contains("x.com"),
                "Twitter/X page is NOT opened");

        twitterPage.close();
    }

    @Test(priority = 3)
    public void verifyLinkedInLinkTest() {
        Hm = new HomePage(page);
        Hm.navigateToLoginPage();

        Page linkedInPage = Hm.clickLinkedInLink();
        linkedInPage.waitForLoadState();

        String actualURL = linkedInPage.url();
        Assert.assertTrue(actualURL.contains("linkedin.com"),
                "LinkedIn page is NOT opened");

        linkedInPage.close();
    }

    @Test(priority = 4)
    public void verifyFacebookLinkTest() {
        Hm = new HomePage(page);
        Hm.navigateToLoginPage();

        Page facebookPage = Hm.clickFacebookLink();
        facebookPage.waitForLoadState();

        String actualURL = facebookPage.url();
        Assert.assertTrue(actualURL.contains("facebook.com"),
                "Facebook page is NOT opened");

        facebookPage.close();
    }

    @Test(priority = 5)
    public void verifyRedditLinkTest() {
        Hm = new HomePage(page);
        Hm.navigateToLoginPage();

        Page redditPage = Hm.clickredditLink();
        redditPage.waitForLoadState();

        String actualURL = redditPage.url();
        Assert.assertTrue(actualURL.contains("reddit.com"),
                "Reddit page is NOT opened");

        redditPage.close();
    }


}

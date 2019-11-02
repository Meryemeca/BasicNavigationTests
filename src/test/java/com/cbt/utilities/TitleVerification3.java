package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {

    public static void main(String[] args) {
        List<String> urls = Arrays.asList("https://luluandgeorgia.com", "https://wayfair.com/",
                "https://walmart.com", "https://westelm.com/");
        List<String> browser = Arrays.asList("chrome", "firefox","safari","chrome");



        for (int i = 0; i < urls.size();i++){
            WebDriver driver = BrowserFactory.getDriver(browser.get(i));
            driver.get(urls.get(i));
            String currentUrl = driver.getCurrentUrl().toLowerCase();
            String currentTitle = driver.getTitle().replaceAll(" ","").toLowerCase();
            if(currentUrl.contains(currentTitle)){
                System.out.println("Test PASSED");
            }
            else{
                System.out.println("Test FAILED");
                System.out.println("Current url: " + currentUrl);
                System.out.println("Current Title: " + currentTitle);

            }

            driver.quit();
        }


    }
}

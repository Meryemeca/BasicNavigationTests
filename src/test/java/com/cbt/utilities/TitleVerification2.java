package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {
    public static void main(String[] args) {


        List<String> urls = Arrays.asList("https://luluandgeorgia.com", "https://wayfair.com/",
                "https://walmart.com", "https://westelm.com/");

        WebDriver driver = BrowserFactory.getDriver("chrome");

        for (int i = 0; i < urls.size();i++){
            driver.get(urls.get(i));
            String currentUrl = driver.getCurrentUrl().toLowerCase();
            String currentTitle = driver.getTitle().replaceAll(" ","").toLowerCase();

            if(currentUrl.contains(currentTitle)){
                System.out.println("Test PASSED");
                System.out.println("  ");
            }
            else{
                System.out.println("Test FAILED");
                System.out.println("Current url: " + currentUrl);
                System.out.println("Current Title: " + currentTitle);

            }
        }
driver.quit();
    }
}
package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {


    public static void main(String[] args) {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(urls.get(0));
        String title0 = driver.getTitle();
        String url0 = driver.getCurrentUrl();
        driver.get(urls.get(1));
        String title1 = driver.getTitle();
        String url1 = driver.getCurrentUrl();
        driver.get(urls.get(2));
        String title2 = driver.getTitle();
        String url2 = driver.getCurrentUrl();

        if(title0.equalsIgnoreCase(title1) && title0.equalsIgnoreCase(title2) ){

            System.out.println("They have same title");
        }
        else
            System.out.println("they do not have same title");
        if(url0.startsWith("http://practice.cybertekschool.com") &&url1.startsWith("http://practice.cybertekschool.com")&&url2.startsWith("http://practice.cybertekschool.com"))
            System.out.println("They all start with url0.startsWith http://practice.cybertekschool.com");
            driver.close();

        }
    }


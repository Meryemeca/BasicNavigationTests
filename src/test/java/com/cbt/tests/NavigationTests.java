package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;


public class NavigationTests {



        public static void main(String[] args) {
            testCase("safari");

            testCase("chrome");

            testCase("firefox");

        }
public static void testCase(String browser){
            //create a webdriver object, to work with a browser
            WebDriver driver = BrowserFactory.getDriver(browser);
            //to maximize browser window
            driver.manage().window().maximize();
            driver.get("http://google.com");
            //save the title in a String variable
            String expectedTitle1 = driver.getTitle();
            //navigate to another page
            driver.navigate().to("http://etsy.com");
            String expectedTitle2 =driver.getTitle();
            //navigate back to previous page
            driver.navigate().back();
            StringUtility.verifyEquals(expectedTitle1,driver.getTitle());
            driver.navigate().forward();
            StringUtility.verifyEquals(expectedTitle2,driver.getTitle());

            driver.close();




        }



        }



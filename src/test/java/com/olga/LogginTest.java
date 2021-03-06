package com.olga;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by User on 12.04.2018.
 */
public class LogginTest extends TestBasis {
    @Test
    public void loggin() {
        driver.get("http://localhost/litecart/admin/");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();

        if (!driver.getCurrentUrl().equals("http://localhost/litecart/admin/")) {
            AssertionError assertError = new AssertionError();
            System.out.println("Test is failed: " + assertError.getMessage());
            System.out.println("Page title is " + driver.getCurrentUrl());
            Assert.fail();
        }
    }
}
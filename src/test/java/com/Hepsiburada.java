package com;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hepsiburada {

    @Test
    public void TestHepsiBurada() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10000);

        driver.get("http://www.hepsiburada.com");

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".insider-opt-in-disallow-button")));

        driver.findElement(By.cssSelector(".insider-opt-in-disallow-button")).click();

        driver.findElement(By.id("myAccount")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("login")));

        driver.findElement(By.id("login")).click();

        driver.findElement(By.id("email")).sendKeys("foreksodev@gmail.com");

        driver.findElement(By.id("password")).sendKeys("foreks909090");

        driver.findElement(By.cssSelector(".btn-login-submit")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("productSearch")));

        driver.findElement(By.id("productSearch")).sendKeys("İphone 7");

        driver.findElement(By.id("buttonProductSearch")).click();

        driver.findElement(By.cssSelector(".product-image")).click();

        driver.findElements(By.id("productSearch")).clear();

        driver.quit();
    }
}

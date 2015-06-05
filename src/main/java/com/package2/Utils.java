package com.package2;

import com.Package1.BasePage;
import org.openqa.selenium.By;

/**
 * Created by laxmikanthj on 28/05/2015.
 */
public class Utils extends BasePage{
    public static void click(By by)
    {
        driver.findElement(by).isDisplayed();
        driver.findElement(by).click();
    }

    public static void entertext(By element,String text)
    {
      driver.findElement(element).clear();
        driver.findElement(element).sendKeys(text);

    }
}

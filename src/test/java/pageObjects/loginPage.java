package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {

    private static  WebElement element = null;

    public static WebElement textbox_search(WebDriver driver){

        element = driver.findElement(By.id("moduleTab_Accounts"));
        return element;

    }

    public static WebElement account_search(WebDriver driver){

        element = driver.findElement(By.id("name_advanced"));
        return element;
    }
}

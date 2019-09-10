package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FindingCoordinates {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://54.169.182.163/standardedition/index.php?module=Home&action=index");

        //        lOGIN
        WebElement userName = (WebElement) driver.findElement(By.id("user_name"));
        WebElement pwd = (WebElement) driver.findElement(By.id("user_password"));
        WebElement loginButton = (WebElement) driver.findElement(By.xpath("/html/body/div/div[2]/form[1]/input"));
        driver.manage().window().maximize();

        userName.sendKeys("admin");
        pwd.sendKeys("SyM!@pE5#");
        loginButton.click();

        System.out.println("Hi");


//        Point p = driver.findElement(By.xpath("")).getLocation();
//        System.out.println(p.x);
//        System.out.println(p.y);
    }

}

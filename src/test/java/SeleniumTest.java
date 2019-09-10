import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://13.250.251.212/SLAV1");
        driver.manage().window().maximize();

//        lOGIN
        WebElement userName = (WebElement) driver.findElement(By.id("user_name"));
        WebElement pwd = (WebElement) driver.findElement(By.id("user_password"));
        WebElement loginButton = (WebElement) driver.findElement(By.xpath("/html/body/div/div[2]/form[1]/input"));

        userName.sendKeys("admin");
        pwd.sendKeys("SyM!@pE5#");
        loginButton.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.quit();



    }
}

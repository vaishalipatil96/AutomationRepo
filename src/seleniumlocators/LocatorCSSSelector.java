package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class LocatorCSSSelector {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.cssSelector("input[id=login1]")).sendKeys("vaishalipatil9637@gmail.com");

        Thread.sleep(3000);
        driver.close();
    }
}
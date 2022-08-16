package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class LocatorXpath {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.xpath("//u[text()='create a new account']")).click();
        Thread.sleep(3000);
        driver.close();
    }
}
package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;

public class FileElementAndFileElements {

    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver","C:/Users/Dell/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.id("login1")).sendKeys("vaishalipatil9637@gmail.com");
        System.out.println(driver.getTitle());                                               //website tittle
        System.out.println(driver.getPageSource());
        Thread.sleep(5000);
        driver.close();

        }

    }







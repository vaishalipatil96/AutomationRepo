package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.io.IOException;
import java.util.Collections;

public class LocatorPartialLinkText {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://mail.rediff.com/cgi-bin/login.cgi");

        driver.findElement(By.partialLinkText("Create")).click();      //partial link text
        Thread.sleep(3000);
        //driver.close();

     //  List<WebElement> element = driver.findElement(By.tagName("div"));
       // for (WebElement o : element) {
        //    System.out.println(o);
        }

    }
//}
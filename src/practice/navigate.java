package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class navigate {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Dell/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver test1=new ChromeDriver();
        test1.navigate().to("http://demo.boomauto.co.in/index.php/contact/");

        test1.findElement(By.partialLinkText("About")).click();
        Thread.sleep(4000);

        test1.navigate().back();
        Thread.sleep(4000);

        test1.navigate().forward();
        Thread.sleep(4000);

        test1.navigate().refresh();
        Thread.sleep(4000);

        test1.close();
    }
}

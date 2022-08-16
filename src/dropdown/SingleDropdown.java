package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class SingleDropdown {
    public static void main(String[] args) throws InterruptedException, IOException  {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");

        WebElement singleDropdown =driver.findElement(By.name("country"));
       // driver.findElement(By.name("country")).click();

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",singleDropdown);

        Select select=new Select(singleDropdown);

        select.selectByIndex(6);
        Thread.sleep(4000);

        select.selectByValue("BH");
         Thread.sleep(4000);

         select.selectByVisibleText("Canada");
         Thread.sleep(4000);

        driver.close();


    }
}

package actionandactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class ActionsMethod {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Dell/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");

        WebElement elementA = driver.findElement(By.xpath("//li[text()='A']"));
        WebElement elementL = driver.findElement(By.xpath("//li[text()='L']"));

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",elementA);
        Thread.sleep(5000);

        Actions actions = new Actions(driver);
        actions.clickAndHold(elementA).moveToElement(elementL).build().perform();
        Thread.sleep(5000);

        actions.release().build().perform();
        Thread.sleep(5000);
        driver.close();


    }
}

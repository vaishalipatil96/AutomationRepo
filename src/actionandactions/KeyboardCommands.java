package actionandactions;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class KeyboardCommands {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/index.htm");

        WebElement searchId = driver.findElement(By.id("search-strings"));

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",searchId);
        Thread.sleep(5000);

        Actions actions = new Actions(driver);
        actions.moveToElement(searchId).click().
                keyDown(Keys.SHIFT).sendKeys("program").keyUp(Keys.SHIFT).build().perform();
        Thread.sleep(5000);
        driver.close();



    }
}

package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class IFrameSelenium {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();

        int count = driver.findElements(By.tagName("iframe")).size();
        System.out.println(driver.findElement(By.id("fixedban")).getText());
        //driver.switchTo().frame(5);
        Thread.sleep(5000);


        System.out.println(count);
        driver.quit();




    }
}

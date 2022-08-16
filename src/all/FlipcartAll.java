package all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class FlipcartAll {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://affiliate.flipkart.com/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.id("inputEmail")).sendKeys("vaishalipatil9637@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.id("inputPassword")).sendKeys("123456");
        Thread.sleep(3000);
        driver.findElement(By.id("submitLogin")).click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Forgot password")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("forgotPasswordInputEmail")).sendKeys("vaishalipatil9637@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.name("submit")).click();
        Thread.sleep(3000);

        WebElement element = driver.findElement(By.xpath("//a[@class=\"sb-insights sblink\"]"));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

        driver.close();

    }
}

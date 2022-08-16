package uploadingfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

public class SeleniumUploadFile {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement uploadFile = driver.findElement(By.id("file-upload"));

        uploadFile.sendKeys("C:\\Users\\Public\\screenshort1.png");
        driver.findElement(By.id("file-submit")).click();

        Thread.sleep(30000);
        driver.close();

    }
}

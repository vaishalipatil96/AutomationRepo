package datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;

import java.time.Duration;

public class DatePickerPractical {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.id("src")).sendKeys("Chandigarh");     //source
        driver.findElement(By.id("dest")).sendKeys("Shimla");        //destination
        Thread.sleep(3000);

        String year = "2022";
        String month = "August";
        String Date = "5";

        driver.findElement(By.xpath("//input[@id='onward_cal']")).click();








            driver.findElement(By.id("search_btn")).click();
            Thread.sleep(3000);
            driver.close();


        }
    }



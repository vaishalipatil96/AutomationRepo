package cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Set;

public class DeleteCookies {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/");
        driver.manage().window().maximize();

        Cookie cookie = new Cookie("vaishali", "patil");    //add cookies
        driver.manage().addCookie(cookie);


         driver.manage().deleteCookieNamed("vaishali");     // delete cookies name


        Set<Cookie> cookies = driver.manage().getCookies();      //get cookies
        for (Cookie c : cookies) {
            System.out.println(c);
        }

        driver.quit();
    }
}

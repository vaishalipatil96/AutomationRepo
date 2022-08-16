package cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Set;

public class DeleteAllCookies {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/");
        driver.manage().window().maximize();


        Cookie cookie = new Cookie("vaishali", "patil");    //add cookies
        driver.manage().addCookie(cookie);

        //System.out.println(driver.manage().getCookieNamed("vaishali"));     //get cookies

         driver.manage().deleteAllCookies();                  //delete all cookies

        Set<Cookie> cookies1 = driver.manage().getCookies();      //get cookies
        for (Cookie c : cookies1){
            System.out.println(c);
        }

      driver.quit();
        }

}


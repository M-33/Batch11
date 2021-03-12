package day02;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class VerifyTitleAndUrl {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\M.L\\Documents\\chromedriver_win32 (1)\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        String actualResult = driver.getTitle();

        String expectedResult= "google";


        if(actualResult.equals(expectedResult)) {
            System.out.println("Page Title testi PASS");

        }else{
            System.out.println("Page Title testi FAILED");
            System.out.println("Actual Page Title : " + actualResult);
        }

        driver.navigate().to("https://www.youtube.com/");

        String actualUrl = driver.getCurrentUrl();

        String expectedUrl = "https://www.youtube.com/";

        if(actualUrl.equals(expectedUrl)){
            System.out.println("Url testi Pass");

        }else
            System.out.println("Url tetsi Failed");
        System.out.println("Actual Url : " + actualUrl);



    }
}

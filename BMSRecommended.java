package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
//Selenium Imports
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
///

public class BMSRecommended {
    ChromeDriver driver;

    public BMSRecommended() {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest() {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    public void bmslink() throws InterruptedException {
            //Navigate to URL  "https://in.bookmyshow.com/explore/home/chennai"
            driver.get("https://in.bookmyshow.com/explore/home/chennai");
            // Locate the Recommended Movies list Using Locator "XPath" //*[@id=\"super-container\"]/div[2]/div[3]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/div
            List<WebElement> movieReCommendedList = driver.findElements(By.xpath("//*[@id=\"super-container\"]/div[2]/div[3]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/div"));
            Thread.sleep(1000);
            int size = movieReCommendedList.size();
            int count = 0;
            // Locate each and every movie by using dynamic xpath for loop Using Locator "XPath" "//div[@class='sc-lnhrs7-4 bmyqGC']/div[" + count + "]" + "/a"
            for (int i = 0; i < size; i++) {
                count++;
                Thread.sleep(5000);
                WebElement movieReCommended = driver.findElement(By.xpath("//div[@class='sc-lnhrs7-4 bmyqGC']/div[" + count + "]" + "/a"));
                Thread.sleep(5000);
                // Print the movie name of each and every movie by using getText()  "//div[@class='sc-lnhrs7-4 bmyqGC']/div[" + count + "]" + "/a"
            
                System.out.println(movieReCommended.getText());
                movieReCommended.click();
                Thread.sleep(1000);
                // Print the URL of each and everyMovie by using getCurrentUrl()  
                System.out.println(driver.getCurrentUrl());
                driver.navigate().back();
            }
            


    }

}
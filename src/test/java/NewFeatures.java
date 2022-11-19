
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.*;
import java.time.Duration;
import java.util.List;

public class NewFeatures {
    static  WebDriver driver;

   @Test
   public void chromeTest(){
   driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("www.google.com");
        }

    @Test
    public void edgeTest(){
        driver=new EdgeDriver();
        driver.get("https://www.google.com");

    }

    @Test
    public void firefoxTest(){
        driver=new FirefoxDriver();
        driver.get("https://www.google.com");

    }

    @AfterMethod
    public void teardown(){
      // driver.quit();

    }


}

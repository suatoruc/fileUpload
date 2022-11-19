
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class NewFeatures {
    static  WebDriver driver;

   @Test
   public void chromeTest(){
        driver=new ChromeDriver();
        driver.get("https://www.google.com");
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
      driver.quit();

    }


}

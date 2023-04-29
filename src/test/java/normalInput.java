import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class normalInput {

    static WebDriver driver;

    @Test
    public void chromeTest() throws AWTException, InterruptedException {
        driver=new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/upload");

        Actions action=new Actions(driver);

        Robot robot=new Robot();
        WebElement ut= driver.findElement(By.xpath("//input[@id='file-upload']"));
//       JavascriptExecutor js=(JavascriptExecutor) driver;
//       js.executeScript("arguments[0].click",ut);

        Thread.sleep(3000);
        action.moveToElement(ut).pause(2000).sendKeys("/Users/suat/documents/HotelCollection.postman_collection.json").perform();

        ut.sendKeys("/Users/suat/documents/HotelCollection.postman_collection.json");


    }

}

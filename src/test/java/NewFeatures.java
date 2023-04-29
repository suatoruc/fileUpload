
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.security.Key;


public class NewFeatures {
    static  WebDriver driver;

   @Test
   public void chromeTest() throws AWTException, InterruptedException {
        driver=new ChromeDriver();

       driver.get("https://www.grammarly.com/plagiarism-checker");

       Actions action=new Actions(driver);

       Robot robot=new Robot();
       WebElement ut= driver.findElement(By.xpath("//span[normalize-space()='Upload a file']"));
//       JavascriptExecutor js=(JavascriptExecutor) driver;
//       js.executeScript("arguments[0].click",ut);
       action.moveToElement(ut).pause(2000).perform();
       ut.click();
       robot.setAutoDelay(2000);
       StringSelection stringSelection=new StringSelection("/Users/suat/documents/HotelCollection.postman_collection.json");
       Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);

       robot.setAutoDelay(2000);
       robot.keyPress(KeyEvent.VK_CONTROL);
       robot.keyPress(KeyEvent.VK_V);

       robot.keyRelease(KeyEvent.VK_CONTROL);
       robot.keyRelease(KeyEvent.VK_V);

       robot.setAutoDelay(2000);
       robot.keyPress(KeyEvent.VK_ENTER);
       robot.keyRelease(KeyEvent.VK_ENTER);

     robot.setAutoDelay(5000);



        }





}

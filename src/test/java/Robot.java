
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;



public class Robot {
    static  WebDriver driver;

   @Test
   public void chromeTest() throws AWTException, InterruptedException {
        driver=new EdgeDriver();
       driver.get("https://www.grammarly.com/plagiarism-checker");
       Actions action=new Actions(driver);
       java.awt.Robot robot=new java.awt.Robot();

       WebElement ut= driver.findElement(By.xpath("//span[normalize-space()='Upload a file']"));
       action.moveToElement(ut).pause(2000).perform();
       ut.click();

       robot.setAutoDelay(2000);
       StringSelection stringSelection=new StringSelection("C:\\Users\\Suat\\IdeaProjects\\fileUpload\\src\\test\\data\\sample.pdf");
       Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);

       robot.setAutoDelay(1000);
       robot.keyPress(KeyEvent.VK_CONTROL);
       robot.keyPress(KeyEvent.VK_V);

       robot.keyRelease(KeyEvent.VK_CONTROL);
       robot.keyRelease(KeyEvent.VK_V);

       robot.setAutoDelay(1000);
       robot.keyPress(KeyEvent.VK_ENTER);
       robot.keyRelease(KeyEvent.VK_ENTER);

     robot.setAutoDelay(1000);



        }





}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;

public class NormalInput {

    static WebDriver driver;

    @Test
    public void NormalInput() throws AWTException, InterruptedException {
        driver=new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        Actions action=new Actions(driver);

        WebElement ut= driver.findElement(By.xpath("//input[@id='file-upload']"));
        action.moveToElement(ut).pause(2000).perform();
        ut.sendKeys("C:\\Users\\Suat\\IdeaProjects\\fileUpload\\src\\test\\data\\sample.pdf");


    }

}

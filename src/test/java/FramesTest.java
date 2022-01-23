import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTest extends BaseTest {
    @Test
    public void framesTest() {
        driver.get("http://the-internet.herokuapp.com/frames");

        WebElement checkIFrame = driver.findElement(By.xpath("//a[text()='iFrame']"));
        checkIFrame.click();

        WebDriver frame = driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));

        String textFrame = frame.findElement(By.xpath("//p[text()='Your content goes here.']")).getText();
        assertEquals(textFrame, "Your content goes here.", "Текст не совпадает");

    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class DynamicControlsTest extends BaseTest {
    @Test
    public void dynamicControlsTest() {
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");

        WebElement checkButton = driver.findElement(By.xpath("//*[@type='button']"));
        checkButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("message"))));

        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        int numberOfElements = driver.findElements(By.id("checkbox")).size();

        assertEquals(numberOfElements, 0, "Элемент присутствует на странице");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        WebElement findInput = driver.findElement(By.xpath("//form[@id='input-example']//child::input"));
        assertFalse(findInput.isEnabled(), "Инпут - disabled ");

        WebElement enableButton = driver.findElement(By.xpath("//form[@id='input-example']//child::button"));
        enableButton.click();

        WebDriverWait waitTwo = new WebDriverWait(driver, 15);
        waitTwo.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("message"))));

        assertTrue(findInput.isEnabled(), "Инпут - enabled ");

    }
}

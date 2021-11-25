import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class InputsTest extends BaseTest {
    @Test
    public void inputs() {
        driver.get("http://the-internet.herokuapp.com/inputs");
        WebElement inputsNumbers = driver.findElement(By.tagName("input"));
        inputsNumbers.sendKeys(Keys.ARROW_UP);
        assertEquals(inputsNumbers.getAttribute("value"), "1", " Error in ARROW_UP");
        inputsNumbers.clear();

        inputsNumbers.sendKeys(Keys.ARROW_DOWN);
        assertEquals(inputsNumbers.getAttribute("value"), "-1", " Error in ARROW_DOWN");
        inputsNumbers.clear();

        inputsNumbers.sendKeys("123");
        assertEquals(inputsNumbers.getAttribute("value"), "123", " Error in input");
        inputsNumbers.clear();

        inputsNumbers.sendKeys("acb");
        assertEquals(inputsNumbers.getAttribute("text"), "acb", " Error in input");
        inputsNumbers.clear();


    }
}

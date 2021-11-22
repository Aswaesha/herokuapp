import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputsTest extends BaseTest {
    @Test
    public void inputs() {
        driver.get("http://the-internet.herokuapp.com/inputs");
        WebElement inputsNumbers = driver.findElement(By.tagName("input"));
        inputsNumbers.sendKeys(Keys.ARROW_UP);
        inputsNumbers.clear();

        inputsNumbers.sendKeys(Keys.ARROW_DOWN);
        inputsNumbers.clear();
    }
}

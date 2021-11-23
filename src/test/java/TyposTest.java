import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TyposTest extends BaseTest {
    @Test
    public void typos() {
        driver.get("http://the-internet.herokuapp.com/typos");
        List<WebElement> typo = driver.findElements(By.tagName("p"));

        Assert.assertEquals(typo.get(0).getText(), "This example demonstrates a typo being introduced. It does it randomly on each page load.", "Error on the first 'p'");
        Assert.assertEquals(typo.get(1).getText(), "Sometimes you'll see a typo, other times you won't.", "Error on the second 'p'");
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class checkBoxesTest extends BaseTest {
    @Test
    public void checkBoxes() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");

        List<WebElement> checkAllBoxes = driver.findElements(By.cssSelector("[type=checkbox]"));
        Assert.assertFalse(checkAllBoxes.get(0).isSelected());

        checkAllBoxes.get(0).click();
        Assert.assertTrue(checkAllBoxes.get(0).isSelected());

        Assert.assertTrue(checkAllBoxes.get(1).isSelected());

        checkAllBoxes.get(1).click();
        Assert.assertFalse(checkAllBoxes.get(1).isSelected());
    }


}

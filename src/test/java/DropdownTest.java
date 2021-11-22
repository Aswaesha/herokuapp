import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTest {
    @Test
    public void dropdown() {
        driver.get("http://the-internet.herokuapp.com/dropdown");
        WebElement dropdownList = driver.findElement(By.id("dropdown"));
        dropdownList.click();

        WebElement dropdownListOne = driver.findElement(By.cssSelector("[value = '1']"));
        dropdownListOne.click();
        Assert.assertTrue(dropdownListOne.isSelected());

        WebElement dropdownListTwo = driver.findElement(By.cssSelector("[value = '2']"));
        dropdownListTwo.click();
        Assert.assertTrue(dropdownListTwo.isSelected());

    }
}
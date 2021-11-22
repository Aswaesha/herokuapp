import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TyposTest extends BaseTest{
    @Test
    public  void typos() {
        driver.get("http://the-internet.herokuapp.com/typos");
        WebElement typo = driver.findElement(By.tagName("p"));




    }
}

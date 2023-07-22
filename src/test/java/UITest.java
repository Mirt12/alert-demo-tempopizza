

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UITest {
    @Test
    public void testAlert(){
        PageObjectUI po = new PageObjectUI();
        po.getUrl().clickSubmitBtn();
        WebDriverWait wait = new WebDriverWait(DriverSingleton.getDriver(), Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        Assertions.assertEquals("Заполните форму",  alert.getText());
        alert.accept();
        DriverSingleton.quit();
    }
}


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UITest {
    @Test
    public void alertTest() {
        PageObjectUI po = new PageObjectUI();
        po.getUrl().clickSubmitBtn();
        WebDriverWait wait = new WebDriverWait(DriverSingleton.getDriver(), Duration.ofSeconds(7));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        Assertions.assertEquals("Заполните форму", alert.getText());
        alert.accept();
        DriverSingleton.quit();
    }
}

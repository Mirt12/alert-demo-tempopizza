import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectUI {

    private WebDriver driver;
    private String submitButtonLocatorByName = "astroauth_submit";
    private String url = "https://www.pizzatempo.by";

    public PageObjectUI() {
        this.driver = DriverSingleton.getDriver();
    }

    public PageObjectUI getUrl() {
        driver.get(url);
        return this;
    }

    public PageObjectUI clickSubmitBtn() {
        WebElement submitButton = driver.findElement(By.name(submitButtonLocatorByName));
        submitButton.click();
        return this;
    }
}

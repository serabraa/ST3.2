import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;

public class BasePage {
    Duration ofSeconds = Duration.ofSeconds(0);
    protected WebDriver driver;
    protected WebDriverWait wait;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,ofSeconds );
        PageFactory.initElements(driver, this);
    }
//    protected void waitForVisibility(WebElement element) {
//        wait.until(ExpectedConditions.visibilityOf(element));
//    }
    // Add common methods that can be used across different pages
}

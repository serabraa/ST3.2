import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        WebElement usernameInput = driver.findElement(By.xpath("//input[@id='js-field-login']"));
        usernameInput.click();
        WebElement passwordInput = driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/label[1]/input[1]"));
        passwordInput.click();
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Մուտք')]"));

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}

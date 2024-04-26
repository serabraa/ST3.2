import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public LoginPage navigateToLoginPage() {
        WebElement loginButton = driver.findElement(By.cssSelector("#menu-item-9800"));
        loginButton.click();
        return new LoginPage(driver);
    }

//    public ArticlePage selectFeaturedArticle() {
//        WebElement articleLink = driver.findElement(By.xpath("//div[@id='featured-article']/a"));
//        articleLink.click();
//        return new ArticlePage(driver);
//    }
//
//    public SearchResultsPage performSearch(String query) {
//        WebElement searchBox = driver.findElement(By.xpath("//input[@id='searchBox']"));
//        WebElement searchButton = driver.findElement(By.xpath("//button[@id='searchButton']"));
//        searchBox.sendKeys(query);
//        searchButton.click();
//        return new SearchResultsPage(driver);
//    }
}

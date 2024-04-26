import org.testng.Assert;
import org.testng.annotations.Test;

public class SiteTests extends BaseTest {
    @Test
    public void testLoginAndNavigateToProfile() {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToLoginPage();
    }

//    @Test
//    public void testNavigateToArticleFromHome() {
//        driver.get("https://www.time.am");
//        HomePage homePage = new HomePage(driver);
//        ArticlePage articlePage = homePage.selectFeaturedArticle();
//        Assert.assertTrue(articlePage.isArticleDisplayed());
//    }
//
//    @Test
//    public void testSearchFromHomePage() {
//        driver.get("https://www.time.am");
//        HomePage homePage = new HomePage(driver);
//        SearchResultsPage searchResultsPage = homePage.performSearch("technology");
//        Assert.assertTrue(searchResultsPage.isSearchResultsDisplayed());
//    }

    // Additional tests would follow a similar pattern
}

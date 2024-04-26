//import org.testng.ITestListener;
//import org.testng.ITestResult;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.WebDriver;
//import java.io.File;
//import org.apache.commons.io.FileUtils;
//
//public class ScreenshotTaker implements ITestListener {
//
//    @Override
//    public void onTestFailure(ITestResult result) {
//        Object testClass = result.getInstance();
//        WebDriver driver = ((BaseTest) testClass).driver;
//        if (driver instanceof TakesScreenshot) {
//            TakesScreenshot screenshotTaker = (TakesScreenshot) driver;
//            File screenshot = screenshotTaker.getScreenshotAs(OutputType.FILE);
//            try {
//                FileUtils.copyFile(screenshot, new File("screenshots/" + result.getName() + ".png"));
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}

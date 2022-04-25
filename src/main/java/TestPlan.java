import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Match case check for a particular value from the drop-down list")
    public static void matchCaseRun() throws Exception {
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.matchCaseDropDown();
    }

    @Test(testName = "Non-match case check for a particular value from the drop-down list")
    public static void nonMatchCaseRun() throws Exception {
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.nonMatchCaseDropDown();
    }

    @Test(testName = "'Clear filters' button functional check")
    public static void clearFiltersRun() throws Exception {
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.clearFilters();
    }

    @Test(testName = "Emails validity check")
    public static void emailsValidityRun() throws Exception {
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.emailsValidityCheck();
    }

    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}

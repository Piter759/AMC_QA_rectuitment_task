import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class WebForm extends PageObject {

    public WebForm(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div/div/table/tbody/tr[1]/td[2]")
    private WebElement tabRow1;

    @FindBy(xpath = "/html/body/div/div/table/tbody/tr[2]/td[2]")
    private WebElement tabRow2;

    @FindBy(id = "match-case")
    private WebElement checkBox;

    @FindBy(id = "search-input")
    private WebElement textBox;

    @FindBy(id = "clear-button")
    private WebElement clearTextButton;

    public void matchCaseDropDown() {
        this.checkBox.click();
        Select dropDown = new Select(driver.findElement(By.id("search-column")));
        dropDown.selectByVisibleText("Name");
        this.textBox.sendKeys("B");
        Assert.assertEquals(tabRow1.getText(), "Bondir");
    }

    public void nonMatchCaseDropDown() {
        Select dropDown = new Select(driver.findElement(By.id("search-column")));
        dropDown.selectByVisibleText("Name");
        this.textBox.sendKeys("B");
        Assert.assertEquals(tabRow1.getText(), "Alabaster");
        Assert.assertEquals((tabRow2.getText()), "Bondir");
    }

    public void clearFilters() {
        String isTextBoxEmpty;
        Select dropDown = new Select(driver.findElement(By.id("search-column")));
        dropDown.selectByVisibleText("Email");
        this.textBox.sendKeys("@");
        this.clearTextButton.click();
        isTextBoxEmpty = this.textBox.getText();
        Assert.assertEquals(isTextBoxEmpty, "");
    }

}

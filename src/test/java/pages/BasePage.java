package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BasePage {
    public BasePage()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//a[.='Pricing']")
    public WebElement pricingLink;

    @FindBy (xpath = "//button[.='Try For Free']")
    public WebElement tryForFreeButton;
}
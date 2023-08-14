package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutodeskCampaignsProdsmart {
    public AutodeskCampaignsProdsmart()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//span[.='Stay']")
    public WebElement stayButton;

    @FindBy (xpath = "//button[.='Accept']")
    public WebElement acceptCookies;

    @FindBy (id = "Email")
    public WebElement emailTextBox;

    @FindBy (xpath = "//button[.='Continue']")
    public WebElement continueButton;

    @FindBy (id = "FirstName")
    public WebElement firstNameTextBox;

    @FindBy (id = "LastName")
    public WebElement lastNameTextBox;

    @FindBy (id = "Company")
    public WebElement companyNameTextBox;

    @FindBy(id = "Country")
    public WebElement dropdownButton;
    @FindBy(id = "PostalCode")
    public WebElement zipCodeTextBox;

    @FindBy(id = "Phone")
    public WebElement phoneNumberBox;

    @FindBy(id = "privacycb")
    public WebElement privacyCheckbox;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;
}
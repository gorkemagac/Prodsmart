package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import pages.AutodeskCampaignsProdsmart;
import pages.BasePage;
import pages.MainPage;
import utilities.Driver;

public class TestSteps {
    BasePage basePage = new BasePage();
    MainPage requestAFreeTrial = new MainPage();
    AutodeskCampaignsProdsmart autodeskCampaignsProdsmart = new AutodeskCampaignsProdsmart();

    @When("clicks Request A Free Trial button")
    public void clicks_request_a_free_trial_button() {
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", requestAFreeTrial.requestAFreeTrialButton);
        js.executeScript("window.scrollBy(0,-250)");
        requestAFreeTrial.requestAFreeTrialButton.click();
    }
    @And("enters email address and clicks continue button")
    public void enters_email_address_and_clicks_continue_button() {
        autodeskCampaignsProdsmart.stayButton.click();
        autodeskCampaignsProdsmart.acceptCookies.click();
        autodeskCampaignsProdsmart.emailTextBox.sendKeys("gorkem_agac@hotmail.com");
        autodeskCampaignsProdsmart.continueButton.click();
    }
    @And("enters First Name, Last Name, Company and clicks continue")
    public void enters_first_name_last_name_company_and_clicks_continue() {
        autodeskCampaignsProdsmart.firstNameTextBox.sendKeys("Gorkem");
        autodeskCampaignsProdsmart.lastNameTextBox.sendKeys("Agac");
        autodeskCampaignsProdsmart.companyNameTextBox.sendKeys("AA");
        autodeskCampaignsProdsmart.continueButton.click();
    }
    @And("enters country, zip code, work phone, ticks terms of use")
    public void enters_country_zip_code_work_phone_ticks_terms_of_use() {
       autodeskCampaignsProdsmart.dropdownButton.click();
        autodeskCampaignsProdsmart.dropdownButton.sendKeys("Portugal" + Keys.ARROW_DOWN + Keys.ENTER);
        autodeskCampaignsProdsmart.zipCodeTextBox.sendKeys("1900-100");
        autodeskCampaignsProdsmart.phoneNumberBox.sendKeys("951951951");
        autodeskCampaignsProdsmart.privacyCheckbox.click();
    }
    @Then("submit button is enabled")
    public void submit_button_is_enabled() {
      boolean submitButton=autodeskCampaignsProdsmart.submitButton.isEnabled();
        Assert.assertTrue(submitButton);
    }
    @When("user clicks Pricing button")
    public void user_clicks_pricing_button() {
        requestAFreeTrial.pricingLink.click();
    }
    @Then("sees clickable Try for Free button")
    public void sees_clickable_try_for_free_button() {
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", requestAFreeTrial.tryForFreeButton);
      boolean tryForFreeButton = requestAFreeTrial.tryForFreeButton.isEnabled();
        Assert.assertTrue(tryForFreeButton);
    }
}
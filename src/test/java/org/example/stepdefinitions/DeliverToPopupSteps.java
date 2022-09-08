package org.example.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageobject.modules.DeliverToPopupModule;
import org.testng.Assert;
import java.util.List;

import static org.example.stepdefinitions.BaseSteps.PAGES_STORAGE;

public class DeliverToPopupSteps {
    public List<String> countriesList;

    @When("User change the Delivery Code to {string} in {string}")
    public void userChangeTheDeliveryCodeToInDeliverPopupModule(String code, String pageName) {
        PAGES_STORAGE.put("Home Page", ((DeliverToPopupModule) PAGES_STORAGE.get(pageName)).insertIndex(code));
    }

    @When("User open the list of countries in {string}")
    public void userOpenTheListOfCountries(String pageName) {
        countriesList = ((DeliverToPopupModule) PAGES_STORAGE.get(pageName)).getListOfCountries();
    }

    @Then("User see {string} in the list of countries")
    public void userSeeInTheListOfCountries(String selectedCountry) {
        boolean isCountryExist = countriesList.stream()
                .anyMatch(country -> country.equals(selectedCountry));
        Assert.assertTrue(isCountryExist, "Selected country does not exist");
    }

    @When("User choose {string} from the list of countries in {string}")
    public void userChooseFromTheListOfCountries(String selectedCountry, String pageName) {
        PAGES_STORAGE.put("Home Page", ((DeliverToPopupModule) PAGES_STORAGE.get(pageName)).selectCountry(selectedCountry));
    }
}

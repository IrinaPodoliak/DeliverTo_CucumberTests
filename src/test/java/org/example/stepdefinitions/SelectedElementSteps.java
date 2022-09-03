package org.example.stepdefinitions;

import io.cucumber.java.en.Then;
import org.example.pageobject.modules.DeliverToPopupModule;
import org.example.pageobject.pages.SelectedElementPage;
import org.testng.Assert;

import static org.example.stepdefinitions.BaseSteps.PAGES_STORAGE;

public class SelectedElementSteps {
    @Then("User see {string} in {string} shipping details")
    public void userSeeInShippingDetails(String selectedCountry, String pageName) {
        String shippingToText = ((SelectedElementPage)PAGES_STORAGE.get(pageName)).getShippingDetailsText();
        Assert.assertTrue(shippingToText.contains(selectedCountry), "Delivery destination is not chosen");
    }
}

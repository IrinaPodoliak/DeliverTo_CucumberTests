package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pageobject.modules.DeliverToPopupModule;
import org.example.pageobject.pages.HomePage;
import org.example.pageobject.pages.SelectedCategoryPage;
import org.testng.Assert;

import static org.example.stepdefinitions.BaseSteps.PAGES_STORAGE;

public class HomePageSteps {
    @Given("User open {string}")
    public void userOpen(String pageName) {
         DeliverToPopupModule deliverToModule = new HomePage().open()
                .openDeliverToPopupModule();
         PAGES_STORAGE.put(pageName, deliverToModule);
    }

    @Then("User see the info Deliver to {string}")
    public void userSeeTheInfoDeliverTo(String deliverToText) {
        deliverToText = new HomePage().getDeliverToText();
        Assert.assertTrue(deliverToText.contains("Montgomery"), "Delivery destination should change");
    }

    @And("User open any {string}")
    public void userOpenAny(String pageName) {
        SelectedCategoryPage selectedCategory = ((HomePage)PAGES_STORAGE.get("Home Page")).openSelectedCategoryPage();
        PAGES_STORAGE.put(pageName, selectedCategory);
    }
}

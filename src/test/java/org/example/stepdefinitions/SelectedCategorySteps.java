package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import org.example.pageobject.modules.DeliverToPopupModule;
import org.example.pageobject.pages.SelectedCategoryPage;
import org.example.pageobject.pages.SelectedElementPage;

import static org.example.stepdefinitions.BaseSteps.PAGES_STORAGE;

public class SelectedCategorySteps {
    @And("User choose any item and open {string}")
    public void userChooseAnyItemAndOpen(String pageName) {
        SelectedElementPage selectedElement = ((SelectedCategoryPage)PAGES_STORAGE.get("Selected Category Page")).openSelectedElementPage();
        PAGES_STORAGE.put(pageName, selectedElement);
    }
}

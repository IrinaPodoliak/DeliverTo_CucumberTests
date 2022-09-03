package org.example.pageobject.pages;

import com.codeborne.selenide.SelenideElement;
import org.example.pageobject.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SelectedCategoryPage extends BasePage {
    private SelenideElement selectedElement = $(By.xpath("//img[@data-image-source-density = \"1\"]"));

    public SelectedElementPage openSelectedElementPage() {
        selectedElement.click();
        return new SelectedElementPage();
    }
}

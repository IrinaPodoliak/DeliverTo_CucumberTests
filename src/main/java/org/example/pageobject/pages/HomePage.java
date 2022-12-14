package org.example.pageobject.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.example.pageobject.BasePage;
import org.example.pageobject.modules.DeliverToPopupModule;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class HomePage extends BasePage {
    private SelenideElement deliverToButton = $(By.id("glow-ingress-line2"));
    private SelenideElement selectedCategoryButton = $(By.xpath("//a[@aria-label = \"Toys & Games\"]"));

    public HomePage open() {
        Selenide.open("https://amazon.com/");
        return this;
    }

    public DeliverToPopupModule openDeliverToPopupModule() {
        deliverToButton.click();
        return new DeliverToPopupModule();
    }

    public String getDeliverToText() {
        return deliverToButton.shouldBe(visible).text();
    }

    public SelectedCategoryPage openSelectedCategoryPage() {
        Selenide.sleep(3000);
        selectedCategoryButton.click();
        return new SelectedCategoryPage();
    }
}
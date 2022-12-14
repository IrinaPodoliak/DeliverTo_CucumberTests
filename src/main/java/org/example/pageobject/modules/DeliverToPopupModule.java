package org.example.pageobject.modules;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.example.pageobject.BasePage;
import org.example.pageobject.pages.HomePage;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DeliverToPopupModule extends BasePage {
    private SelenideElement popupInput = $(By.id("GLUXZipUpdateInput"));
    private SelenideElement popupApplyButton = $(By.xpath("//*[@id=\"GLUXZipUpdate\"]/span/input"));
    private SelenideElement popupContinueButton = $(By.xpath("//*[@id=\"a-popover-1\"]/div/div[2]/span"));
    private SelenideElement doneButton = $(By.name("glowDoneButton"));
    private SelenideElement popupListOfCountriesDropdown = $(By.xpath("//*[@id=\"GLUXSpecifyLocationDiv\"]/div[4]"));
    private ElementsCollection listOfCountries = $$(By.className("a-dropdown-link"));

    public List<String> getListOfCountries() {
        this.popupListOfCountriesDropdown.should(exist).shouldBe(interactable).hover().click();
        Selenide.sleep(3000);
        return listOfCountries.texts();
    }

    public HomePage insertIndex(String index) {
        this.popupInput.shouldBe(visible).click();
        this.popupInput.val(index);
        this.popupApplyButton.hover().click();
        this.popupContinueButton.shouldBe(visible, Duration.ofSeconds(10)).click();
        Selenide.refresh();
        return new HomePage();
    }

    public HomePage selectCountry(String country) {
        this.popupListOfCountriesDropdown.should(exist).shouldBe(interactable).hover().click();
        this.listOfCountries.findBy(Condition.text(country)).shouldBe(visible).click();
        this.doneButton.should(exist, Duration.ofSeconds(10)).shouldBe(visible).click();
        return new HomePage();
    }
}
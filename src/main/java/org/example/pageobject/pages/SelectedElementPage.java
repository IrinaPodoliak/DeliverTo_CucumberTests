package org.example.pageobject.pages;

import com.codeborne.selenide.SelenideElement;
import org.example.pageobject.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SelectedElementPage extends BasePage {
    private SelenideElement shippingDetails = $(By.xpath("//*[@id=\"contextualIngressPtLabel_deliveryShortLine\"]/span[2]"));

    public String getShippingDetailsText() {
        return shippingDetails.text();
    }
}

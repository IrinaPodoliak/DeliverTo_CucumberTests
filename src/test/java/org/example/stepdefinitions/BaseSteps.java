package org.example.stepdefinitions;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;
import org.example.pageobject.BasePage;

import java.util.HashMap;
import java.util.Map;

public class BaseSteps {
    public static final Map<String, BasePage> PAGES_STORAGE = new HashMap<>();

    @After
    public void afterScenario() {
            Selenide.clearBrowserCookies();
            PAGES_STORAGE.clear();
    }
}

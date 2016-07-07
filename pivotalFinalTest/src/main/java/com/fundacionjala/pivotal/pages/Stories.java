package com.fundacionjala.pivotal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Stories extends BasePage {
    @FindBy(id = "story_name_c696")
    private WebElement storyNameTextArea;

    @FindBy()
    private WebElement saveStoryButton;
}

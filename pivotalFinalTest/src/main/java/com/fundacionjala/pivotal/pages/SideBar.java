package com.fundacionjala.pivotal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Charito on 7/7/2016.
 */
public class SideBar extends BasePage {

    @FindBy(css = "button.add_story")
    private WebElement addStoryButton;

    public Stories clickOnAddStoryButton(){
        addStoryButton.click();
        return new Stories();
    }
}

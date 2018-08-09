package com.appium.page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by bharat
 */
public class ViewSitePageObject {

    @FindBy(xpath = "//*[@id='masthead']/button/span") public WebElement CLICK_SHOW;
}

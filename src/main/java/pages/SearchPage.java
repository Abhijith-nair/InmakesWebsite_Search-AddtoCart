package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;
    private By addToCartButton = By.id("btn_cart_39");

    public SearchPage(WebDriver driver) {
        this.driver = BaseTest.getDriver();
    }

    public void addCourseToCart() {
        driver.findElement(addToCartButton).click();
    }
}

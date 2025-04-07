package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By searchBox = By.xpath("//input[@type='search']"); 
    private By searchButton = By.xpath("//button[@type='submit']"); 

    public HomePage() {
        this.driver = BaseTest.getDriver();
    }

    public void searchForCourse(String courseName) {
        driver.findElement(searchBox).sendKeys(courseName);
        driver.findElement(searchButton).click();
    }
}

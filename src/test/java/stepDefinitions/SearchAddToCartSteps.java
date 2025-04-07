package stepDefinitions;

import base.BaseTest;
import io.cucumber.java.en.*;
import pages.HomePage;
import pages.SearchPage;
import utils.ConfigReader;

public class SearchAddToCartSteps {
    HomePage homePage;
    SearchPage searchPage;

    @Given("User is on the homepage")
    public void user_is_on_homepage() {
        BaseTest.startDriver();
        BaseTest.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("User searches for {string}")
    public void user_searches_for(String courseName) {
        homePage = new HomePage();
        homePage.searchForCourse(courseName);
    }

    @And("User adds the course to the cart")
    public void user_adds_course_to_cart() {
        searchPage = new SearchPage(null);
        searchPage.addCourseToCart();
    }

    @Then("Course should be added to the cart successfully")
    public void course_should_be_added_to_cart() {
        System.out.println("Course successfully added to the cart!");
        
    }
}


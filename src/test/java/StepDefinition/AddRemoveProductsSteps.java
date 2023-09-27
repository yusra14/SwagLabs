package StepDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.ProductsPage;

public class AddRemoveProductsSteps {

    private WebDriver driver;
    private ProductsPage productsPage;

    private LoginPage loginPage;

    private AddRemoveProductsSteps(WebDriver driver){
        this.driver=driver;

    }

    @Before
    public void setUp() {
        loginPage = new LoginPage(driver);
    }
    @Given("I am on Products Page")
    public void ProductsPage(){
        loginPage.login("standard_user", "secret_sauce");
    }

    @When("I click add to cart")
    public void user_add_product_to_cart(int index) {
        productsPage.AddProductToCart(index);
    }

    @Then("Cart count increments to {string}")
    public void product_Count_In_Cart_onAdd_Is(String count) {
        Assert.assertEquals(productsPage.getCountofProductsinCart(), count);
    }

    @When("I click remove from Cart")
    public void user_remove_product_from_cart(int index){
        productsPage.removeProductFromCart(index);
    }

    @Then("Cart count decrements to {string}")
    public void product_Count_In_Cart_onRemove_Is(String count) {
        Assert.assertEquals(productsPage.getCountofProductsinCart(), count);
    }

}

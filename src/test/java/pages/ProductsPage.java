package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ProductsPage {

    private WebDriver driver;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement btn_AddToCart;

    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement btn_RemoveFromCart;

    @FindBy(id = "shopping_cart_container")
    private WebElement btn_ShoppingCart;

    @FindBy(id = "shopping_cart_container>a>span") //div[id='shopping_cart_container']>a>span
    private WebElement CountOnShoppingCart;
    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    @Test
    public void AddProductToCart(int productIndex){
        driver.findElements((By) btn_AddToCart).get(productIndex-1).click();
    }

    @Test
    public void removeProductFromCart(int index) {
        driver.findElements((By) btn_RemoveFromCart).get(index - 1).click();
    }

    @Test
    public String getCountofProductsinCart() {
        return driver.findElement((By) CountOnShoppingCart).getText();
    }

}

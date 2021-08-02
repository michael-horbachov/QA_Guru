import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.Is.is;

public class DemowebshopTests {

    @Test
    void addToCartTest() {
        Response response = given()
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .body("product_attribute_72_5_18=53&product_attribute_72_6_19=54&" +
                              "product_attribute_72_3_20=57&addtocart_72.EnteredQuantity=1")
                .when()
                .post("http://demowebshop.tricentis.com/addproducttocart/details/72/1")
                .then()
                .statusCode(200)
                .body("success", is(true))
                .body("message", is("The product has been added to your <a href=\"/cart\">shopping cart</a>"))
                .body("updatetopcartsectionhtml", is("(1)"))
                .extract().response();

        System.out.println("Shopping cart items: " + response.path("updatetopcartsectionhtml"));
    }

    @Test
    void addToCartWithCookieTest() {
        Response response = given()
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .body("product_attribute_72_5_18=53&product_attribute_72_6_19=54&" +
                              "product_attribute_72_3_20=57&addtocart_72.EnteredQuantity=1")
                .cookie("Nop.customer=abb7e563-9fbe-4555-81ba-c1f6bb2ec461;")
                .when()
                .post("http://demowebshop.tricentis.com/addproducttocart/details/72/1")
                .then()
                .statusCode(200)
                .body("success", is(true))
                .body("message", is("The product has been added to your <a href=\"/cart\">shopping cart</a>"))
                .extract().response();

        System.out.println("Shopping cart items: " + response.path("updatetopcartsectionhtml"));
    }
}
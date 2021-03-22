package projects.spring.merchantfeed.controller;

import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
//import static io.restassured.module.mockmvc.matcher.RestAssuredMockMvcMatchers.*;

@SpringBootTest
public class TransactionComponentTest {

    @Autowired
    TransactionController transactionController;


    @LocalServerPort
    private int port;


    @Test
    public void testApplicationEndToEnd() {
        given().standaloneSetup(transactionController)
                .when()
                .get(String.format("http://localhost:%s/transactions/1234567", port))
                .then()
                .statusCode(Matchers.is(200));
    }

    @Test
    public void testMore() {
//        RestAssured.baseURI = "http://localhost";
//        RestAssured.port = port;
        RestAssured.reset();
        given().standaloneSetup(transactionController)
                .when()
                .get("/transactions/123")
                .then()
                .statusCode(Matchers.is(200));
    }

}

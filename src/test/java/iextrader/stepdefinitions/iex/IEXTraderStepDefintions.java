package iextrader.stepdefinitions.iex;


import io.cucumber.java.en.Given;
import io.restassured.RestAssured;

public class IEXTraderStepDefintions {

    @Given("^I am an active trader on IEX$")
    public void i_am_an_active_trader() {
        RestAssured.baseURI = "https://api.iextrading.com/1.0";
    }
}

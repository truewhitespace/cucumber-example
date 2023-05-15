package gov.dhs.uscis.functionaltests.functional;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class Features {
    private Response resultingResponse;

    @Given("a clean slate")
    public void aCleanSlate() {
        resultingResponse = null;
    }

    @When("get api {string} is called")
    public void getApiIsCalled(String endpoint) {
        resultingResponse = when().get(endpoint);

    }

    @Then("the server returns {int} status with body: {string}")
    public void theServerReturnsRequest(int statusCode, String expectedBody) {
        resultingResponse.then().statusCode(statusCode).body(equalTo(expectedBody));
    }
}

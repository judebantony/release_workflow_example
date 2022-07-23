/**
 * 
 */
package com.jba.release.bdd.stepdefs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.extern.slf4j.Slf4j;

/**
 * @author judebarnabasantony
 *
 */
@Slf4j
@CucumberContextConfiguration
public class CucumberStepDef {

	private static Response response;

	@Given("user wants to call health check api")
	public void want_call_health_check_api() {
	}

	@When("^user call health check api with the url \"([^\\\"]*)\"$")
	public void call_health_check_api(String url) {
		RequestSpecification request = RestAssured.given();
		response = request.get(url);
	}

    @Then("user should get a response with status code {string}")
    public void user_should_get_a_response_with_status_code(String statusCode) {
		log.info("Response {}", response.getStatusCode());
		assertEquals(Integer.parseInt(statusCode), response.getStatusCode());
	}

    @And("user should get a response with status {string}")
    public void user_should_get_a_response_with_status(String s) {
        log.info("Response {}", s);
    }

    
    

	
}

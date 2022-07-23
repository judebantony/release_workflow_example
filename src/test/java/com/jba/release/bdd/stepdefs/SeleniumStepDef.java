/**
 * 
 */
package com.jba.release.bdd.stepdefs;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;

/**
 * @author judebarnabasantony
 *
 */
@Slf4j
public class SeleniumStepDef {

	private static final String HTTPS = "https://";

	private static final String LAMDA_TEST = "LamdaTest";

	private static final String HUB_CLOUD_LAMADATEST_COM_WD_HUB = "@hub.lambdatest.com/wd/hub";

	private static final String COLLUMN = ":";
	
	public static final String LAMADATEST_AUTOMATE_USERNAME = System.getenv("LT_EMAIL");
	public static final String LAMADATEST_AUTOMATE_ACCESS_KEY = System.getenv("LT_ACCESS_KEY");

	public static final String LAMADATEST_URL = HTTPS + LAMADATEST_AUTOMATE_USERNAME + COLLUMN + LAMADATEST_AUTOMATE_ACCESS_KEY
			+ HUB_CLOUD_LAMADATEST_COM_WD_HUB;


	private static final String SWAGGER_URL = "www.google.com";

    @Then("user goes to google search using {string}")
    public void user_goes_to_google_search_using(String tool) {
        log.info("Response {}", tool);
		DesiredCapabilities caps = new DesiredCapabilities();
		if (LAMDA_TEST.equalsIgnoreCase(tool)) {
			caps.setCapability("platform", "Windows 10");
			caps.setCapability("browserName", "Chrome");
			caps.setCapability("version", "92.0"); 
			caps.setCapability("resolution", "1024x768");
			caps.setCapability("build", "First Test");
			caps.setCapability("name", "Sample Test");
			caps.setCapability("network", true); 
			caps.setCapability("visual", true); 
			caps.setCapability("video", true); 
			caps.setCapability("console", true); 
			try {
				WebDriver driver = new RemoteWebDriver(
						new URL(LAMADATEST_URL),
						caps);
				driver.get(SWAGGER_URL);
				log.info("Testing lamdatest = {}" , driver.getTitle());
				driver.quit();
			} catch (Exception e) {
				log.error("{}",e);
			}
		} 

    }

	@Then("user should see google search")
    public void user_should_see_google_search() {
        // Write code here that turns the phrase above into concrete actions
    }

 
    @Given("user wants to check google search")
    public void user_wants_to_check_google_search() {
        // Write code here that turns the phrase above into concrete actions
    }




}

package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayStepDefinition {
	

@Given("I am on ebayHomepage")
public void i_am_on_ebayHomepage() {
    
	System.out.println("homepage");
	System.out.println("New change for git");
	
}

@When("I get title of the page")
public void i_get_title_of_the_page() {
	System.out.println("title page");
	System.out.println("New change coming from Nimesha");
}

@Then("I valiadate the page title")
public void i_valiadate_the_page_title() {
	System.out.println("Validation");
}

}

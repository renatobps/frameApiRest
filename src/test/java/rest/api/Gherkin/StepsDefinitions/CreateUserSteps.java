package rest.api.Gherkin.StepsDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;
import org.junit.Assert;
import rest.api.Models.TestModel;
import rest.api.RestAssured.RESTMethods;

public class CreateUserSteps {
    TestModel modelT = new TestModel();

    public CreateUserSteps() throws Exception {
    }

    @Given("^that i execute endpoint for create user with userName \"([^\"]*)\", user \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void that_i_execute_endpoint_for_create_user_with_userName_user_and_password(String userName, String user, String password) throws Throwable {
        modelT.createUser();
    }

    @When("^When I get the request return$")
    public void when_I_get_the_request_return() throws Throwable {
        Assert.assertEquals(RESTMethods.key("results.data"), Matchers.empty());
    }

    @When("^statusCode \"([^\"]*)\"$")
    public void statuscode(String statusCode) throws Throwable {
        Assert.assertEquals(statusCode, RESTMethods.getResponseCode());
    }

    @Then("^the username should be \"([^\"]*)\"$")
    public void the_username_should_be(String username) throws Throwable {
        Assert.assertEquals(username, RESTMethods.key("results.data.name"));
    }
}

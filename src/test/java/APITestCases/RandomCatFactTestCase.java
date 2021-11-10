package APITestCases;

import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import io.restassured.response.Response;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RandomCatFactTestCase {

    @Description("Given I'm on the cat-fact.herokuapp.com/facts home page,When I Get Response Random Cat Fact, Then The Text Should Not Be Empty")
    @Test(description = "Check The Text Response is not Empty")
    public void RandomCatFactCheckThatTheResponseTextIsNotEmpty() {
        RestActions apiObject = DriverFactory.getAPIDriver("https://cat-fact.herokuapp.com/");
        Response facts_Body = apiObject.buildNewRequest("facts/", RestActions.RequestType.GET).performRequest();
        Assert.assertFalse(RestActions.getResponseJSONValue(facts_Body, "text[1]").isEmpty(),"The Text Is Empty");
            }
}



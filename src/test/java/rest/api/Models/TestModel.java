package rest.api.Models;

import io.restassured.response.Response;
import org.json.JSONObject;
import rest.api.RestAssured.RESTMethods;
import utils.Utils;
import static rest.api.utils.Urls.URL_TESTE_API;
import static rest.api.RestAssured.UtilsREST.readJsonSimpleDemo;
import static rest.api.utils.Utils.setProperties;

public class TestModel {
    Response response;
    JSONObject obj = readJsonSimpleDemo("src/test/resources/json/test.json");

    public TestModel() throws Exception {
    }

    public void createUser(){
        TestModelMap.initHeader();
        response = RESTMethods.executePost(URL_TESTE_API+"/user/creat",obj.toString(), TestModelMap.getHeader(), TestModelMap.getParams());
        System.out.println();
        if(RESTMethods.getResponseCode() == 200) {
            setProperties("uid", response.jsonPath().get("data.collection.uid"));
        }
    }
    public Response getResponse(){
        return response;
    }


}

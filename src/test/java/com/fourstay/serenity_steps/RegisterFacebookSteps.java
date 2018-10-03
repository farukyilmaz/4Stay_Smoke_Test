package com.fourstay.serenity_steps;

import com.fourstay.utilities.APIConstants;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class RegisterFacebookSteps extends ScenarioSteps {
    private String firstName;
    private String lastName;
    private String name ;
    private boolean installed =true;
    private String permissions = "publish_actions,user_posts";
    private String access_token = "1916071525090151|z0CTIxcQ4oAtt0yOH6liP7WXMoc";
    private String email;
    private String password;


    @Step
    public void getNameFromUINamesAPI(){
       Response responseName=
                given().accept(ContentType.JSON)
                        .and().params("amount",1)

                        .when().get(APIConstants.UINAMESURL)
               ;
        JsonPath json = responseName.jsonPath();
        firstName = json.getString("name");
        lastName = json.getString("surname");
        name = firstName+" "+lastName;
        assertEquals(responseName.statusCode(),200);
        assertTrue(name!=null);


    }
    @Step
    public void checkIfNameIsAvailableFromFacebook(){
        System.out.println(name);
        Map map = new HashMap();
        map.put("name", name);
        map.put("installed", "true");
        map.put("permissions", permissions);
        map.put("access_token", access_token);
        Response postResponse =
                given().accept(ContentType.JSON)
                        .and().contentType(ContentType.JSON)
                        .and().params(map)

                        .when().post(APIConstants.GRAPHAPIURL)
                ;
        assertEquals(200, postResponse.statusCode());
        JsonPath jsonPath = postResponse.jsonPath();
        email = jsonPath.getString("email");
        password = jsonPath.getString("password");



    }


}

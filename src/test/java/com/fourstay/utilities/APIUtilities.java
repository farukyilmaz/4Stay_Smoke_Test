package com.fourstay.utilities;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class APIUtilities {
    static Logger log = Logger.getLogger(APIUtilities.class.getName());


    public static Map getRandomFirstAndLastNameAndPhoneNumber() {
        Response responseName =
                given().accept(ContentType.JSON)
                        .and().params("amount", 1, "region", "United States")

                        .when().get(APIConstants.UINAMESURL);
        log.info(responseName.body().asString());
        return responseName.body().as(Map.class);
    }

    public static String[] getFacebookEmailAndPassword(String firstName, String lastName) {
        boolean installed = true;
        String permissions = "publish_actions,user_posts";
        String access_token = "1916071525090151|z0CTIxcQ4oAtt0yOH6liP7WXMoc";
        Map map = new HashMap();
        map.put("name", firstName + " " + lastName);
        map.put("installed", "true");
        map.put("permissions", permissions);
        map.put("access_token", access_token);
        Response postResponse =
                given().accept(ContentType.JSON)
                        .and().contentType(ContentType.JSON)
                        .and().params(map)

                        .when().post(APIConstants.GRAPHAPIURL);
        log.info(postResponse.body().asString());
        assertEquals(200, postResponse.statusCode());
        JsonPath jsonPath = postResponse.jsonPath();
        String[] facebookLogin = new String[2];
        facebookLogin[0] = jsonPath.getString("email");
        facebookLogin[1] = jsonPath.getString("password");
        return facebookLogin;
    }


    public static String[] getGoogleEmailAndPassword(String fName, String lName) {
        return null;
    }

    public static void main(String[] args) {
//        deleteExistingEmailAddresses();
        getNewEmailAddress();
        getAllAvailableMailboxes().prettyPrint();

    }

    public static String getNewEmailAddress() {
        RestAssured.baseURI = APIConstants.MAIL_SLURP_URI;
        Response response = RestAssured.given().accept(ContentType.JSON).
                and().params("apiKey", APIConstants.MAIL_SLURP_KEY).
                when().post();
        log.info(response.asString());
        response.then().statusCode(200);
        String email = response.jsonPath().getString("payload.address");
        log.info("Email:\t" + email);
        return email;
    }

    private static JsonPath getAllAvailableMailboxes() {
        RestAssured.baseURI = APIConstants.MAIL_SLURP_URI;

        Response response = RestAssured.given().accept(ContentType.JSON).
                and().params("apiKey", APIConstants.MAIL_SLURP_KEY).
                when().get();
        log.info(response.asString());
        response.then().statusCode(200);

        return response.jsonPath();
    }

    public static void deleteExistingEmailAddresses() {
        JsonPath allEmails = getAllAvailableMailboxes();
        Integer size = Integer.valueOf(allEmails.getString("payload.size()"));
        for (int i = 0; i < size; i++) {
            String uuid = allEmails.getString(String.format("payload[%d].id", i));
            RestAssured.baseURI = APIConstants.MAIL_SLURP_URI;
            RestAssured.basePath = "/" + uuid;
            Response response =
                    given().accept(ContentType.JSON).
                            and().params("apiKey", APIConstants.MAIL_SLURP_KEY).
                            when().delete();
            log.info(response.asString());
            response.then().statusCode(200);
        }
    }

    public static String getNewPhoneNumber() {
        return null;
    }
}

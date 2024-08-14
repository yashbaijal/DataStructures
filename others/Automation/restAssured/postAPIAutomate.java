package restAssuredPractice;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class postAPIAutomate {

    RequestSpecification requestSpecification;

    @Test
    public void createBooking()
    {
        Map<String,Object> payload=new HashMap<>();
        payload.put("firstname","jim");
        payload.put("lastname","Brown");
        payload.put("totalprice",111);
        payload.put("depositpaid",true);
        payload.put("additionalneeds","Breakfast");

        Map<String,String> bookingdates=new HashMap<>();
        bookingdates.put("checkin","2018-01-01");
        bookingdates.put("checkout","2018-01-01");
        payload.put("bookingdates",bookingdates);
        RequestSpecBuilder requestSpecBuilder=new RequestSpecBuilder();
        requestSpecBuilder.setBaseUri("https://restful-booker.herokuapp.com/").setBasePath("/booking").addHeader("Content-Type","application/json");
        requestSpecification=requestSpecBuilder.build();
        requestSpecification.body(payload);
        Response res = RestAssured.given().spec(requestSpecification).when().post();
        System.out.println(res.prettyPrint());
        JsonPath jp=new JsonPath(res.asString());

        System.out.println("id : "+jp.get("bookingid"));
    }

}

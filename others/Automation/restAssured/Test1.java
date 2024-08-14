package restAssured;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class Test1 {

    RequestSpecification requestSpecification;

    @BeforeClass
    public void setup()
    {
        RequestSpecBuilder requestSpecBuilder=new RequestSpecBuilder();
        requestSpecBuilder.setBaseUri("https://reqres.in/").setBasePath("/api/users").addQueryParam("page",2);
        requestSpecification=requestSpecBuilder.build();
    }

    @Test
    public void getResponse()
    {
        Response res= RestAssured.given().spec(requestSpecification).when().get();
        JsonPath jp=new JsonPath(res.asString());
        List<Map<String,Object>> responseList=jp.getList("data");
        for(Map<String,Object> map:responseList)
        {
            String key=map.get("id")+"**"+map.get("email");
            System.out.println(key);
        }
    }

    @Test
    public void getResponse2()
    {
        requestSpecification.baseUri("https://bookcart.azurewebsites.net/").basePath("api/Book");
        Response res= RestAssured.given().spec(requestSpecification).when().get();
        JsonPath jp=new JsonPath(res.asString());
        List<String> responseList=jp.getList("findAll{it.category=='Fiction' & it.price > 300}.title");
        for(String s:responseList)
        {
            System.out.println(s);
        }
    }
}


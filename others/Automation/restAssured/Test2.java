package restAssured;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.response.Response;

import java.util.List;
import java.util.Map;

public class Test2 {


    RequestSpecification requestSpecification;

    @BeforeClass
    public void setup()
    {
        RequestSpecBuilder requestSpecBuilder=new RequestSpecBuilder();
        requestSpecBuilder.setBaseUri("https://jsonplaceholder.typicode.com/").setBasePath("/users");
        requestSpecification=requestSpecBuilder.build();
    }

    @Test
    public void getResponse()
    {
        //requestSpecification.baseUri("https://jsonplaceholder.typicode.com/").basePath("/users");
        Response res= RestAssured.given().spec(requestSpecification).when().get();
        JsonPath jp=new JsonPath(res.asString());
        List<Map<String,Object>> responseList=jp.getList("$");
        for(Map<String,Object> map:responseList)
        {
            String id=map.get("name").toString();
            Map<String,String> address= (Map<String, String>) map.get("address");
            String city="";
            for (String key:address.keySet())
            {
                 city=address.get("city");
            }
            Map<String,String> company= (Map<String, String>) map.get("company");
            String name;
            for(String key:company.keySet())
            {
                 name=company.get("name");
                System.out.println(id+"##"+city+"##"+name);
            }
        }

    }

}

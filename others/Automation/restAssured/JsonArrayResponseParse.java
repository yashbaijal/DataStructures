package restAssuredPractice;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JsonArrayResponseParse {

    RequestSpecification requestSpecification;
    @BeforeClass
    public void setup()
    {
        RequestSpecBuilder requestSpecBuilder=new RequestSpecBuilder();
        requestSpecBuilder.setBaseUri("https://run.mocky.io/").setBasePath("v3/e2c54122-c313-4cac-9c66-9427f153e89b");
        requestSpecification=requestSpecBuilder.build();
    }

    @Test
    public void getResponse()
    {
        Response res= RestAssured.given().spec(requestSpecification).when().get();
        JsonPath jp =new JsonPath(res.asString());
        List<Map<String,Object>> employeeMap=jp.getList("employees");
        /*for(Map<String,Object> map:employeeMap)
        {
            String name=(String) map.get("name");
            Map<String,String> empContact= (Map<String, String>) map.get("contact");
            String empMail=empContact.get("email");
            List<String> roles=(List<String>) map.get("roles");
            System.out.println("Employee "+name+" with email-> "+empMail+" roles are "+roles);
        }*/

        /*for(Map<String,Object> map:employeeMap)
        {
            String name=(String) map.get("name");
            List<Map<String,Object>> employeeProjects= (List<Map<String, Object>>) map.get("projects");
            for(Map<String,Object> project:employeeProjects)
            {
                String projectName= (String)project.get("name");
                Map<String, Object> projectDetails= (Map<String, Object>) project.get("details");
                int budget= (int) projectDetails.get("budget");
                String deadline=(String)projectDetails.get("deadline");
                System.out.println("Employee "+name + "Having "+projectName+" project "+" whose deadline is "+deadline+" and budget alloted is : "+budget);
            }
        }*/

        System.out.println(jp.getString("locations"));
    }


}

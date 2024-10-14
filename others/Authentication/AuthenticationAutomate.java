Basic :
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BasicAuthExample {

    public static void main(String[] args) {
        Response response = RestAssured
                .given()
                    .baseUri("https://api.example.com")
                    .auth()
                    .preemptive() // Ensure preemptive authorization
                    .basic("username", "password") // Basic authentication
                .when()
                    .get("/protected/resource")
                .then()
                    .statusCode(200) // Assert the status code
                    .extract()
                    .response();

        System.out.println("Response: " + response.asString());
    }
}
----------------------------------------------------
Oauth:
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BearerTokenExample {

    public static void main(String[] args) {
        String accessToken = "your_access_token"; // Obtain your access token

        Response response = RestAssured
                .given()
                    .baseUri("https://api.example.com")
                    .auth()
                    .oauth2(accessToken) // Bearer token authorization
                .when()
                    .get("/protected/resource")
                .then()
                    .statusCode(200)
                    .extract()
                    .response();

        System.out.println("Response: " + response.asString());
    }
}
------------------------------------------------------------

API Key:
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiKeyExample {

    public static void main(String[] args) {
        Response response = RestAssured
                .given()
                    .baseUri("https://api.example.com")
                    .header("x-api-key", "your_api_key") // Set API key in the header
                .when()
                    .get("/protected/resource")
                .then()
                    .statusCode(200)
                    .extract()
                    .response();

        System.out.println("Response: " + response.asString());
    }
}
-------------------------------------------------------------
  Digest AUthentication:
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DigestAuthExample {

    public static void main(String[] args) {
        Response response = RestAssured
                .given()
                    .baseUri("https://api.example.com")
                    .auth()
                    .digest("username", "password") // Digest authentication
                .when()
                    .get("/protected/resource")
                .then()
                    .statusCode(200)
                    .extract()
                    .response();

        System.out.println("Response: " + response.asString());
    }
}

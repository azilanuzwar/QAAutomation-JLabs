package cobaqaautomation.cobamay2022;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CobaAPITest {
	
	String token = "";
	
	@Test (priority = 1)
	public void loginAPI () {
		
		RestAssured.baseURI = "https://api-staging-builder.engineer.ai";
		String payload = "{\"email\":\"testlabs@gmail.com\",\"password\":\"builder123\"}";
		
		Response responseLogin = RestAssured.given().contentType("application/json").body(payload).when()
					.post("users/sign_in");
		
		token = responseLogin.jsonPath().get("user.authtoken");
		System.out.println(token);
	}

	@Test (priority = 2)
	public void dashboardAPI() {
		RestAssured.baseURI = "https://api-staging-builder.engineer.ai";
		//karna disini GET, maka:
		Response responseDashboard = RestAssured.given().contentType("application/json").header("authtoken", token)
				.param("status", "completed").when().get("/build_cards");
		
		assertEquals(responseDashboard.statusCode(), 200);
		
	}
	
	@Test (priority = 3)
	public void configAPI() {
		RestAssured.baseURI = "https://api-staging-builder.engineer.ai";
		//karna disini GET, maka:
		Response responseDashboard = RestAssured.given().contentType("application/json")
				.param("status", "completed").when().get("/configurations");
		
		assertEquals(responseDashboard.statusCode(), 200);
	}
	
}	


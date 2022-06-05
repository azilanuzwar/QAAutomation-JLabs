package cobaqaautomation.cobamay2022;

import org.testng.annotations.BeforeMethod;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given; //dipanggil manual

public class CobaBaseAPITest {
	
	RequestSpecification commonJsonSpec = new RequestSpecBuilder().setBaseUri("https://api-staging-builder.engineer.ai")
			.setContentType(ContentType.JSON).build().log().all();

	RequestSpecification loginJsonSpec;
	String token;
	
	@BeforeMethod
	public void login() {
		String payload = "{\"email\":\"testlabs@gmail.com\",\"password\":\"builder123\"}";
		
		Response responseLogin = given().spec(commonJsonSpec).body(payload).when().post("/users/sign_in");
		
		token = responseLogin.getBody().jsonPath().get("user.authtoken");
		System.out.println(token);
		
		loginJsonSpec = new RequestSpecBuilder().setBaseUri("https://api-staging-builder.engineer.ai").setContentType(ContentType.JSON).addHeader("authtoken", token).build().log().all();
	}
}

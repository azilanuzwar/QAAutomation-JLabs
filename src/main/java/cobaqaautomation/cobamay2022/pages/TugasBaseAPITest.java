package cobaqaautomation.cobamay2022.pages;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given; //dipanggil manual
import static org.testng.Assert.assertEquals;


public class TugasBaseAPITest {
	
	RequestSpecification commonJsonSpec = new RequestSpecBuilder().setBaseUri("https://kolakproject.herokuapp.com")
			.setContentType(ContentType.JSON).build().log().all();

	RequestSpecification registerJsonSpec;
	String status;
	
//	@BeforeMethod
//	public void register() {
//		String payload = "{\"username\":\"makanbersama2\",\"email\":\"email.baru2@gmail.com\"}";
//		
//		Response responseRegister = given().spec(registerJsonSpec).body(payload).when().post("/register");
//		
//		status = responseRegister.getBody().jsonPath().get("Status");
//		System.out.println("Status");
//		String expectedStatus = "Created";
//		
//		assertEquals(responseRegister, expectedStatus, "Username or Email has been taken");
//	}
	
}

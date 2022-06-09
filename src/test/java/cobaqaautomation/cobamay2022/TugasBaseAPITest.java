package cobaqaautomation.cobamay2022;

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
	
}

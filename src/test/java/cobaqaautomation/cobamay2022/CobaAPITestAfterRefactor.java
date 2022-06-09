package cobaqaautomation.cobamay2022;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given; //dipanggil manual
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CobaAPITestAfterRefactor extends CobaBaseAPITest{
		
	@Test
	public void dashboardAPI() {
		Response responseDashboard = given().spec(loginJsonSpec).param("status", "completed").when().get("/build_cards");
		System.out.println(responseDashboard.statusCode());
		assertEquals(responseDashboard.statusCode(), 200);
	}
	
	@Test
	public void configAPI() {
		Response responseConfig = given().spec(commonJsonSpec).when().get("/configurations");
		
		assertEquals(responseConfig.statusCode(), 200);
	}
	
	@Test
	public void userAPI () {
		Response responseDashboard = given().spec(loginJsonSpec).param("status", "completed")
				.when().get("/build_cards");
		
		assertEquals(responseDashboard.statusCode(), 200);
	}
	
	@Test
	public void fakerTest() {
		Faker faker = new Faker ();
		System.out.println(faker.name().fullName());
		
	}
}



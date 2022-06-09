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

public class TugasAPITestAfterRefactor extends TugasBaseAPITest{
		
	@Test
	public void registAPI() {
		String payload = this.fakerTest();
		Response responseRegister = given().spec(commonJsonSpec).body(payload).when().post("/register");
		System.out.println(responseRegister.statusCode());
		assertEquals(responseRegister.statusCode(), 201, "Username or Email has been taken");
	}
	
	@Test
	public String fakerTest() {
		Faker faker = new Faker ();
		String username = faker.name().username();
		String email = username + "@gmail.com";
		String password = faker.lorem().fixedString(5);
		
		return "{\"username\":\"" + username + "\",\"email\":\"" + email + "\",\"password\":\"" + password + "\"}";
	}
}



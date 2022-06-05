package cobaqaautomation.cobamay2022;

import org.testng.annotations.Test;

import cobaqaautomation.cobamay2022.utils.CobaGraphQLRequestBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.testng.Assert.assertEquals;
import org.json.JSONObject;
import org.testng.annotations.Test;

//import qaautomation.cobamay2022.utils.CobaGraphQLRequestBuilder;

public class CobaGraphQLTest {

	@Test
	public void checkCEO() {
		CobaGraphQLRequestBuilder gql = new CobaGraphQLRequestBuilder ();
		String query = "{\r\n" +" company {\r\n" + " ceo\r\n" + "cto\r\n" + "}\r\n" + "}\r\n" + "";
		gql.setQuery(query); 
		
		String jsonStringQuery = gql.getJSONString();
		
		Response responseCeo = given().contentType(ContentType.JSON).body(jsonStringQuery).when()
					.post("https://api.spacex.land/graphql/"); 
		
		//System.out.println(responseCeo.jsonPath().get("data.company.ceo"));
	
		String expectedCeo = "Elon Musk";
		String expectedCto = "Elon Musk";
		String ceoName = responseCeo.jsonPath().getString(("data.company.ceo"));
		String ctoName = responseCeo.jsonPath().getString(("data.company.cto"));
		
		assertEquals (expectedCeo, ceoName);
		assertEquals (expectedCto, ctoName);
	}


	@Test
	public void getLaunchesWithVariables () {
		CobaGraphQLRequestBuilder gql = new CobaGraphQLRequestBuilder();
		JSONObject variables = new JSONObject();
		variables.put("limit", 6);
		
		String query = "query getLaunches($limit: Int!) {\r\n"
				+ "  launchesPast(limit: $limit) {\r\n"
				+ "    mission_id\r\n"
				+ "    mission_name\r\n"
				+ "  }\r\n"
				+ "}";
		
		gql.setQuery(query);
		gql.setVariables(variables.toString());
		String jsonStringQuery = gql.getJSONString();
		Response responseLaunches = given().contentType(ContentType.JSON).body(jsonStringQuery).when()
				.post("https://api.spacex.land/graphql/");
		String missionName = responseLaunches.jsonPath().get("data.launchesPast[1].mission_name");
		
		System.out.println(missionName);
		//System.out.println(jsonStringQuery);
		//System.out.println(responseLaunches.getBody().prettyPrint());
	}
}


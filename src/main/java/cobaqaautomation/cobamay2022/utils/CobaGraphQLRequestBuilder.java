package cobaqaautomation.cobamay2022.utils;

public class CobaGraphQLRequestBuilder {

	public org.json.JSONObject json;
	
	public CobaGraphQLRequestBuilder() {
		json = new org.json.JSONObject();
	}
	
	public void setQuery (String query) {
		json.put("query", query);
	}
	
	public void setVariables (String variables) {
		json.put("variables", variables);
	}
	
	public String getJSONString() {
		return json.toString();
	}
	
}

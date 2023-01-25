package DemoRequests;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Update_Data {

	
	/*
	 * Update the data with valid ID
	 */
	
	@Test
	public void updateDataForValidID() {
		
        JSONObject request = new JSONObject();
		
		request.put("name", "morpheus");
		request.put("job", "zion resident");
		
		//System.out.println(request.toJSONString());
		
		given().
		   header("Content-Type", "application/json").
		   body(request.toJSONString()).
		when().
		   put("https://reqres.in/api/users/2").
		then().
		   statusCode(200);
		
	}
	
	/*
	 * Update the Data with Invalid ID
	 */
	
	@Test
	public void updateDataForInValidID() {
		
        JSONObject request = new JSONObject();
		
		request.put("name", "morpheus");
		request.put("job", "zion resident");
		
		//System.out.println(request.toJSONString());
		
		given().
		   header("Content-Type", "application/json").
		   body(request.toJSONString()).
		when().
		   put("https://reqres.in/api/users/-3").
		then().
		   statusCode(200);
		
	}
	
	/*
	 * Update the Data with ID=0
	 */
	
	@Test
	public void updateDataForID_0() {
		
        JSONObject request = new JSONObject();
		
		request.put("name", "morpheus");
		request.put("job", "zion resident");
		
		//System.out.println(request.toJSONString());
		
		given().
		   header("Content-Type", "application/json").
		   body(request.toJSONString()).
		when().
		   put("https://reqres.in/api/users/0").
		then().
		   statusCode(200);
		
	}
	
	
}

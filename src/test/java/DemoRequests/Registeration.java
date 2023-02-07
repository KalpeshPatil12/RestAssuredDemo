package DemoRequests;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Registeration {
	
	/*
	 * Register the user with valid Email and Password
	 */
	
	@Test
	public void registerWithValidEmailAndPassword() {
		
        JSONObject request = new JSONObject();
		
		request.put("email", "eve.holt@reqres.in");
		request.put("password", "cityslicka");
		
		//System.out.println(request.toJSONString());
		
		given().
		   header("Content-Type", "application/json").
		   body(request.toJSONString()).
		when().
		   post("https://reqres.in/api/login").
		then().
		   statusCode(200);
		 //  log().all();
		
	}
	
	/*
	 * Register the user with valid Email and invalid Password
	 */
	
	@Test
	public void registerWithValidEmailAndInvalidPassword() {
		
        JSONObject request = new JSONObject();
		
		request.put("email", "eve.holt@reqres.in");
		request.put("password", "ABC");
		
		//System.out.println(request.toJSONString());
		
		given().
		   header("Content-Type", "application/json").
		   body(request.toJSONString()).
		when().
		   post("https://reqres.in/api/login").
		then().
		   statusCode(200);
		 //  log().all();
		
	}
	
	/*
	 * Register the user with invalid Email and Password
	 */
	
	@Test
	public void registerWithInvalidEmailAndValidPassword() {
		
        JSONObject request = new JSONObject();
		
		request.put("email", "ABC@reqres.in");
		request.put("password", "cityslicka");
		
		given().
		   header("Content-Type", "application/json").
		   body(request.toJSONString()).
		when().
		   post("https://reqres.in/api/login").
		then().
		   statusCode(400);
		 //  log().all();
		
	}
	
	/*
	 * Register the user with empty Email and Password
	 */
	
	@Test
	public void registerWithNotEnteringEmailAndPassword() {
		
        JSONObject request = new JSONObject();
		
		request.put("email", "");
		request.put("password", "");
		
		
		given().
		   header("Content-Type", "application/json").
		   body(request.toJSONString()).
		when().
		   post("https://reqres.in/api/login").
		then().
		   statusCode(400);
		 //  log().all();
	}
	
	/*
	 * Register the user with only entering Email
	 */
	
	@Test
	public void registerWithOnlyENteringEmail() {
		
        JSONObject request = new JSONObject();
		
		request.put("email", "eve.holt@reqres.in");
		request.put("password", "");
		
		given().
		   header("Content-Type", "application/json").
		   body(request.toJSONString()).
		when().
		   post("https://reqres.in/api/login").
		then().
		   statusCode(400);
		 //  log().all();
		
	}
	
	/*
	 * Register the user with only entering Password
	 */
	
	@Test
	public void registerWithOnlyEnteringPassword() {
		
        JSONObject request = new JSONObject();
		
		request.put("email", "");
		request.put("password", "cityslicka");
		
		given().
		   header("Content-Type", "application/json").
		   body(request.toJSONString()).
		when().
		   post("https://reqres.in/api/login").
		then().
		   statusCode(400);
		 //  log().all();
		
	}
	
	

}

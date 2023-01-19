package DemoRequests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Create_User {
	
	/*
	 * Create New user with valid data
	 */
	
	@Test
	public void createNewUserWithValidData() {
		
		JSONObject request = new JSONObject();
		
		request.put("name", "Ram");
		request.put("job", "Design");
		
		given().
		   header("Content-Type", "application/json").
		   body(request.toJSONString()).
		when().
		   post("https://reqres.in/api/users").
		then().
		   statusCode(201);
		
	}
	
	/*
	 * Create New user with Null Data
	 */
	
	@Test
	public void createNullData() {
		
        JSONObject request = new JSONObject();
		
	//	request.put("name", "");
	//	request.put("job", "");
		
		given().
		   header("Content-Type", "application/json").
		   body(request.toJSONString()).
		when().
		   post("https://reqres.in/api/users").
		then().
		   statusCode(201);
		
	}
	
	/*
	 * Create New user with the Random Data
	 */
	
	@Test
	public void createRandomData() {
		
		JSONObject request = new JSONObject();
		
			request.put("name", "");
			request.put("job", "");
			request.put("jfjjf", "jfjkf");
			request.put("fdkodo", "jekddldl");
			request.put("jfjkdkd", "jhjkooe");
			request.put("jeoeoe", "jueoeoe");
			request.put("oioeeke", "iwooww");
			
			given().
			   header("Content-Type", "application/json").
			   body(request.toJSONString()).
			when().
			   post("https://reqres.in/api/users").
			then().
			   statusCode(201);
		
	}

}

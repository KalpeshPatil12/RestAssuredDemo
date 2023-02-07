package DemoRequests;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.restassured.http.ContentType;


public class Login {
	
	/*
	 * Login the user with valid email and password
	 */
	
	@Test
	public void loginWithValidEmailAndPassword() {
		
        JSONObject request = new JSONObject();
		
		request.put("email", "eve.holt@reqres.in");
		request.put("password", "cityslicka");
		
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
	 * Login the user with valid email and invalid password
	 */
	
	@Test
	public void loginWithValidEmailAndInvalidPassword() {
		
        JSONObject request = new JSONObject();
		
		request.put("email", "eve.holt@reqres.in");
		request.put("password", "ABC");
		
		given().
		   header("Content-Type", "application/json").
		   contentType(ContentType.JSON).
		   accept(ContentType.JSON).
		   body(request.toJSONString()).
		when().
		   post("https://reqres.in/api/login").
		then().
		   statusCode(200);
		
	}
	
	/*
	 * Login the user with invalid email and valid password
	 */
	
	@Test
	public void loginWithInvalidEmailAndValidPassword() {
		
        JSONObject request = new JSONObject();
		
		request.put("email", "ABC@reqres.in");
		request.put("password", "cityslicka");
		
		System.out.println(request.toJSONString());
		
		given().
		   header("Content-Type", "application/json").
		   contentType(ContentType.JSON).
		   accept(ContentType.JSON).
		   body(request.toJSONString()).
		when().
		   post("https://reqres.in/api/login").
		then().
		   statusCode(400);
		
	}
	
	/*
	 * Login the user with missing Email and Password
	 */
	
	@Test
	public void missingEmailAndPassword() {
		
        JSONObject request = new JSONObject();
		
		request.put("email", "");
		request.put("password", "");
		
		System.out.println(request.toJSONString());
		
		given().
		   header("Content-Type", "application/json").
		   contentType(ContentType.JSON).
		   accept(ContentType.JSON).
		   body(request.toJSONString()).
		when().
		   post("https://reqres.in/api/login").
		then().
		   statusCode(400);
		
	}
	
	/*
	 * Login the user with only entering Email
	 */
	
	@Test
	public void onlyEnteringEmail() {
		
        JSONObject request = new JSONObject();
		
		request.put("email", "eve.holt@reqres.in");
//		request.put("password", "");
		
		System.out.println(request.toJSONString());
		
		given().
		   header("Content-Type", "application/json").
		   contentType(ContentType.JSON).
		   accept(ContentType.JSON).
		   body(request.toJSONString()).
		when().
		   post("https://reqres.in/api/login").
		then().
		   statusCode(400);
		
	}
	
	/*
	 * Login the user with only entering Password
	 */
	
	@Test
	public void onlyEnteringPassword() {
		
        JSONObject request = new JSONObject();
		
//		request.put("email", "eve.holt@reqres.in");
		request.put("password", "cityslicka");
		
		System.out.println(request.toJSONString());
		
		given().
		   header("Content-Type", "application/json").
		   contentType(ContentType.JSON).
		   accept(ContentType.JSON).
		   body(request.toJSONString()).
		when().
		   post("https://reqres.in/api/login").
		then().
		   statusCode(400);
		
	}
	
	
}

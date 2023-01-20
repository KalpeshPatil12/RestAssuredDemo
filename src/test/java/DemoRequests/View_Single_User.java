package DemoRequests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class View_Single_User {
	
	/*
	 * See the user for particular id
	 */
	
	@Test
	public void seeUserForParticularID() {
		
		given().
		   header("Content-Type", "application/json").
		when().
		   get("https://reqres.in/api/users/2").
		then().
		   statusCode(200).log().all();
	}
	
	/*
	 * See the user for invalid id
	 */
	
	@Test
	public void seeUserForInvalidID() {
		
		given().
		   header("Content-Type", "application/json").
		when().
		   get("https://reqres.in/api/users/300").
		then().
		   statusCode(404).log().all();
	}
	
	/*
	 * See the user for id=0
	 */
	
	@Test
	public void seeUserForID_0() {
		
		given().
		   header("Content-Type", "application/json").
		when().
		   get("https://reqres.in/api/users/0").
		then().
		   statusCode(404).log().all();
	}
	
	/*
	 * See the user for id=-1
	 */
	
	@Test
	public void seeUserForIDNegative() {
		
		given().
		   header("Content-Type", "application/json").
		when().
		   get("https://reqres.in/api/users/-1").
		then().
		   statusCode(404).log().all();
	}
	
	
}

package DemoRequests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class List_Unknown_User {
	
	/*
	 * See the List of Unknown User
	 */
	
	@Test
	public void listOfUnknownUser() {
		
		given().
		   header("Content-Type", "application/json").
		when().
		   get("https://reqres.in/api/unknown").
		then().
		   statusCode(200).log().all();
	}
	
	/*
	 * See the List of Unknown User with Invalid endpoint
	 */
	
	@Test
	public void listOfUnknownUserInvalidEndpoint() {
		
		given().
		   header("Content-Type", "application/json").
		when().
		   get("https://reqres.in/api/ABCD").
		then().
		   statusCode(200).log().all();
	}
	
	/*
	 * See the Data of Particular ID for Unknown User
	 */
	
	@Test
	public void seeTheDataOfParticularIDForUnknownUser() {
		
		given().
		   header("Content-Type", "application/json").
		when().
		   get("https://reqres.in/api/unknown/2").
		then().
		   statusCode(200).log().all();
	}
	
	/*
	 * See the Data of Invalid ID of Unknown User
	 */
	
	@Test
	public void seeTheDataOfInvalidIDOfUnknownUser() {
		
		given().
		   header("Content-Type", "application/json").
		when().
		   get("https://reqres.in/api/unknown/-3").
		then().
		   statusCode(404).log().all();
	}
	
	/*
	 * See the Data of Unknown User for ID=0
	 */
	
	@Test
	public void seeTheDataOfUnknownUserForID_0() {
		
		given().
		   header("Content-Type", "application/json").
		when().
		   get("https://reqres.in/api/unknown/0").
		then().
		   statusCode(404).log().all();
	}
	
	
	
	
		
}

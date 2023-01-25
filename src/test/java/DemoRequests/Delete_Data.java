package DemoRequests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Delete_Data {

	
	/*
	 * Delete data for valid ID
	 */
	
	@Test
	public void deleteDataForValidID() {
		
		given().
		   header("Content-Type", "application/json").
		when().
		   delete("https://reqres.in/api/users/2").
		then().
		   statusCode(204);
	}
	
	/*
	 * Delete data for Invalid ID
	 */
	
	@Test
	public void deleteDataForInvalidID() {
		
		given().
		   header("Content-Type", "application/json").
		when().
		   delete("https://reqres.in/api/users/-10").
		then().
		   statusCode(204);
	}
	
	/*
	 * Delete data for ID=0
	 */
	
	@Test
	public void deleteDataForID_0() {
		
		given().
		   header("Content-Type", "application/json").
		when().
		   delete("https://reqres.in/api/users/0").
		then().
		   statusCode(204);
	}
	
}

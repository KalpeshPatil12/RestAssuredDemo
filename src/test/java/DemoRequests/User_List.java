package DemoRequests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class User_List {
	
	/*
	 * See the List of user for particular page
	 */

	@Test
	public void listOfUser() {
		
		given().
		   header("Content-Type", "application/json").
		when().
		   get("https://reqres.in/api/users?page=2").
		then().
		   statusCode(200).log().all();
	}
	
	/*
	 * See the List of user for invalid page
	 */
	
	@Test
	public void listOfUser_ForInvalidPage() {
		
		given().
		   header("Content-Type", "application/json").
		when().
		   get("https://reqres.in/api/users?page=300").
		then().
		   statusCode(200).log().all();
		
	}
	
	/*
	 * See the List of user for page no 0(zero)
	 */
	
	@Test
	public void listOfUser_ForPage_0() {
		
		given().
		   header("Content-Type", "application/json").
		when().
		   get("https://reqres.in/api/users?page=0").
		then().
		   statusCode(200).log().all();
		
	}
	
	/*
	 * See the List of user for page no -2(Negative)
	 */
	
	@Test
	public void listOfUser_ForNegativePage() {
		
		given().
		   header("Content-Type", "application/json").
		when().
		   get("https://reqres.in/api/users?page=-2").
		then().
		   statusCode(200).log().all();
		
	}
	
	
	
	
	
}

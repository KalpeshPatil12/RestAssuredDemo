package DemoRequests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class DelayResponse {
	
	/*
	 * Delay Response for particular second
	 */
	
	@Test
	public void delayResponseForSecound() {
		
		given().
		   header("Content-Type", "application/json").
		when().get("https://reqres.in/api/users?delay=3").
		then().
		   statusCode(200);
		
	}
	
	/*
	Delay Response for negative value
	*/
	
	@Test
	public void delayResponseForNegativeValue() {
		
		given().
		   header("Content-Type", "application/json").
		when().get("https://reqres.in/api/users?delay=-40").
		then().
		   statusCode(200);
	}

}

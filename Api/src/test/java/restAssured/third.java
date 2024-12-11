package restAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class third
{

	@Test
	public void get()
	{
      
			RestAssured.given().baseUri("https://restful-booker.herokuapp.com").
			body("").contentType("application/json").when().get("/booking/5523").then().statusCode(200).log().all();
	}
}

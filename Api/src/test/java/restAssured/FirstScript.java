package restAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class FirstScript
{
	@Test
	public void get()
	{
      
			RestAssured.given().baseUri("https://restful-booker.herokuapp.com").
			body("").contentType("application/json").when().get("/booking").then().statusCode(200).log().all();
			
			
//			RestAssured.given().baseUri("https://restful-booker.herokuapp.com").
//	        body("{\r\n"
//	        		+ "    \"username\" : \"admin\",\r\n"
//	        		+ "    \"password\" : \"password123\"\r\n"
//	        		+ "}").contentType("application/json").when().post("/auth").then().statusCode(200).log().all();
//			
			
	}
}

package restAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Seconds 
{
	@Test
	public void getBooking()
	{
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com").body("{\r\n"
				+ "    \"firstname\" : \"Jim\",\r\n"
				+ "    \"lastname\" : \"Brown\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}").
		contentType("application/json").when().post("/booking").then().statusCode(200).log().all();
	}

}

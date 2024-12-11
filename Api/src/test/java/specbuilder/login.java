package specbuilder;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class login 
{
	@org.testng.annotations.Test
	public void login()
	{
		//Request
		SpecBuilder01 spec=new SpecBuilder01();
		RequestSpecification request=spec.request01
				("https://www.shoppersstack.com/shopping","{\r\n"
				+ "  \"email\": \"Dhiraj1999@gmail.com\",\r\n"
				+ "  \"password\": \"Dhiraj@1234\",\r\n"
				+ "  \"role\": \"SHOPPER\"\r\n"
				+ "}" , "application/json");
		
		
		// Response 
		ResponseSpecification response =spec.response01
				(200, "message", "OK","HTTP/1.1 200 " , "application/json", 20000l);
		
		Response res=RestAssured.given().spec(request).
		when().post("/users/login").then().spec(response).extract().response();
		
		System.out.println(res.asPrettyString());
	}

}

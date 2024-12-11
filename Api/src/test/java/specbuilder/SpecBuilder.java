package specbuilder;

import org.apache.http.client.methods.RequestBuilder;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecBuilder 
{
	@BeforeMethod
	public RequestSpecification request()
	{
		RequestSpecBuilder req=new RequestSpecBuilder();
		RequestSpecification reqs=req.setBaseUri("https://www.shoppersstack.com/shopping").setBody("{\r\n"
				+ "  \"city\": \"banglore\",\r\n"
				+ "  \"country\": \"India\",\r\n"
				+ "  \"email\": \"Dhiraj1999@gmail.com\",\r\n"
				+ "  \"firstName\": \"Kumar\",\r\n"
				+ "  \"gender\": \"MALE\",\r\n"
				+ "  \"lastName\": \"Dhiraj\",\r\n"
				+ "  \"password\": \"Dhiraj@1234\",\r\n"
				+ "  \"phone\": 9182261874,\r\n"
				+ "  \"state\": \"Karnakata\",\r\n"
				+ "  \"zoneId\": \"ALPHA\"\r\n"
				+ "}").setContentType("application/json").build();
				return reqs;
		
	}
	@AfterMethod
	public ResponseSpecification response()
	{
		ResponseSpecBuilder spec=new ResponseSpecBuilder();
		ResponseSpecification res=spec.expectStatusCode(201).expectBody("message",Matchers.equalTo("Created"))
				.expectStatusLine("HTTP/1.1 201 ").expectContentType("application/json").
				expectResponseTime(Matchers.lessThanOrEqualTo(9000l)).build();
				 
		return res;
	}

}

package specbuilder;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class CreateShopper 
{
	@org.testng.annotations.Test
	public void create()
	{
		SpecBuilder spec=new SpecBuilder();
		RequestSpecification request=spec.request();
		ResponseSpecification response =spec.response();
		
		Response res=RestAssured.given().spec(request).
		when().post("/shoppers").then().spec(response).extract().response();
		
		System.out.println(res.asPrettyString());
	}

}

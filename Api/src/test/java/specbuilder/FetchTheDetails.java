package specbuilder;

import org.junit.Test;

import groovy.lang.Buildable;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class FetchTheDetails 
{
	@org.testng.annotations.Test
	public void get()
	{
		Specbuilder02 spec=new Specbuilder02();
		RequestSpecification request=spec.request03("https://www.shoppersstack.com/shopping", "application/json", null );
				
		
		
		// Response 
		ResponseSpecification response =spec.response04(200, "", null, null, null, 0);
				
		Response res=RestAssured.given().spec(request).
		when().post("/users/login").then().spec(response).extract().response();
		
		System.out.println(res.asPrettyString());
	}

}

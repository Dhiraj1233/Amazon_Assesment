package specbuilder;

import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RunnerClassPojo 
{
	@Test
	public void create() throws JsonProcessingException
	{
		CreateShopperPojo crp=new CreateShopperPojo();
		crp.setCity("Banglore");
		crp.setCountry("India");
		crp.setEmail("dheera567@gmail.com");
		crp.setFirstName("Dhiraj");
		crp.setGender("MALE");
		crp.setLastName("Kumar");
		crp.setPassword("Sks1252");
		crp.setPhone("9128746345");
		crp.setState("Karnakata");
		crp.setZoneId("ALPHA");


		ObjectMapper op=new ObjectMapper();
		String js = op.writerWithDefaultPrettyPrinter().writeValueAsString(crp);
		
		Response result = RestAssured.given().baseUri("https://www.shoppersstack.com/shopping").body(js).
		contentType("application/json").when().post("/shoppers").then().statusCode(201).extract().response();
		System.out.println(result.asPrettyString());

	}

}

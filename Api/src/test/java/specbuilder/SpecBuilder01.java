package specbuilder;

import org.hamcrest.Matchers;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecBuilder01

{
	@BeforeMethod
	public RequestSpecification request01(String url,String body,String content)
	{	
		RequestSpecBuilder req=new RequestSpecBuilder();
		RequestSpecification reqs=req.setBaseUri(url).setBody(body).setContentType(content).build();
		return reqs;
		
	}

	@AfterMethod
	public ResponseSpecification response01(int code ,String key,String value,String line ,String content, long time)
	{
		ResponseSpecBuilder res=new ResponseSpecBuilder();	
		ResponseSpecification resp =res.expectStatusCode(code).expectBody(key,Matchers.equalTo(value))
				.expectStatusLine(line).expectContentType(content)
				.expectResponseTime(Matchers.lessThanOrEqualTo(time)).build();
		return resp;
	}

	
}

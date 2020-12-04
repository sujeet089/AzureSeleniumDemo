package GetRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData {
	@Test
	//Get API call for retrieve Data with status code as 200
	public void TestResponse()
	{
	Response res =	RestAssured.get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=c8ae3f00e77202278b89e353c8b73670");
	int statuscodes = res.getStatusCode();
	System.out.println("**************Status Code is "+statuscodes);
	Assert.assertEquals(200, statuscodes);
	}
    
	@Test
	//Get API call for retrieve Data with total time taken
	public void TestBody()
	{
	Response res =	RestAssured.get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=c8ae3f00e77202278b89e353c8b73670");
	String data  = res.asString();
	System.out.println("**************Data is "+data);
	System.out.println("**************Response Time is "+res.getTime());
	}
	
}

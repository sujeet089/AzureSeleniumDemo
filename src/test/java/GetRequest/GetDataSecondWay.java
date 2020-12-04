package GetRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GetDataSecondWay {
	
	@Test
	//Get API call for retrieve Data with status code as 200 with another way
		public void TestResponsecodes()
	{
		int statuscode=get("http://restcountries.eu/rest/v1/name/norway").getStatusCode();
	
	System.out.println("**************Status Code is "+statuscode);
	Assert.assertEquals(203, statuscode);
	}
    
	@Test
	//Get API call for retrieve Data with time taken with another way
	public void TestBody()
	{
	String data =get("http://restcountries.eu/rest/v1/name/norway").asString();
	long time =get("http://restcountries.eu/rest/v1/name/norway").getTime();
	System.out.println("**************Data is "+data);
	System.out.println("**************Data is "+time);
	}
	
}

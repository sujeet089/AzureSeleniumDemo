package GetRequest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutData {

	
	@Test
	//PUTAPI call for update Data with status code as 200
	public void Test1()
	{
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type","application/json");
		JSONObject json = new JSONObject();
		json.put("name", "morpheus");
		json.put("job", "zion resident");
		request.body(json.toString());
		Response res = request.put("https://reqres.in/api/users/2");
		int code = res.getStatusCode();
		System.out.println("***********Status code is ****"+code);
		Assert.assertEquals(code, 200);
	}

}

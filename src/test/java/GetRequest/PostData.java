package GetRequest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostData {

	@Test
	//POST API call for create Data with status code as 201
	public void Test1()
	{
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type","application/json");
		JSONObject json = new JSONObject();
		json.put("name", "morpheus");
		json.put("job", "leader");
		request.body(json.toString());
		Response res = request.post("https://reqres.in/api/users");
		int code = res.getStatusCode();
		System.out.println("***********Status code is ****"+code);
		Assert.assertEquals(code, 201);
	}
}
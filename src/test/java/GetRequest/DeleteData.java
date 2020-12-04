package GetRequest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteData {

	@Test
	//Delete Request called
	public void Test1()
	{
		RequestSpecification request = RestAssured.given();
		Response res = request.delete("https://reqres.in/api/users/12");
		int code = res.getStatusCode();
		System.out.println("***********Status code is ****"+code);
		Assert.assertEquals(code, 204);
	}
}

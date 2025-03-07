package tests;



import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class TestsExamples {
	
	
	@Test(enabled = false)
	public void test_1() {
		
		Response response = get("https://reqres.in/api/users?page=2");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getBody().asPrettyString());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		
		int statusCode = response.getStatusCode();
		
		Assert.assertEquals(statusCode, 200);
		
	}
	
	@Test(enabled = false)
	public void test_2() {
		baseURI = "https://reqres.in/api";
		given()
			.get("/users?page=2")
		.then()
			.statusCode(200)
		.log().all();
		
		
	}
	@Test
	public void testPost() {

		
		JSONObject request = new JSONObject();
		request.put("name", "Akshay");
		request.put("job", "SW");
		
		
		System.out.println(request);
		
		
		baseURI = "https://reqres.in/api";
		given()
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.post("/users")
		.then()
		.statusCode(201)
		.log().all();
		
	}
	

}

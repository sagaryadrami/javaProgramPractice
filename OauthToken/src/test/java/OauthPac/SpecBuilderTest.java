package OauthPac;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

import POJO.AddPlace;
import POJO.location;

public class SpecBuilderTest {

	public static void main(String[] args) {
		RestAssured.baseURI="https://rahulshettyacademy.com";

//implementing serialization by passing the value in pojo class with setters methods
		
		AddPlace p = new AddPlace();
		p.setAccuracy(50);
		p.setAddress("29, side layout, cohen 09");
		p.setLanguage("French-IN");
		p.setPhone_number("(+91) 983 893 3937");
		p.setWebsite("http://google.com");
		p.setName("Frontline house");
		
		//here type is expecting list as argument because type is a array
		
		List<String> mylist = new ArrayList<String>();
		mylist.add("shoe park");
		mylist.add("shop");
		p.setTypes(mylist);
		
//location as class so we do in this manner
//by creating the class 
		location l = new location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		
		p.setLocation(l);
		
		//BELOW WRITTEN CODE IS REQUEST SPEC BUILDER
	RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
			.addQueryParam("key","qaclick123")
	.setContentType(ContentType.JSON).build();
		
		
//		Response res = given().log().all().queryParam("key","qaclick123").body(p).when().post("/maps/api/place/add/json")
//		.then().assertThat().statusCode(200).extract().response();
	
	//building the response specification
	ResponseSpecification resspec = new ResponseSpecBuilder().expectStatusCode(200)
			.expectContentType(ContentType.JSON).build();
	
	
	
	
//code present above will transform after applying request spec
	
	RequestSpecification res = given().spec(req)
			.body(p);
			
			Response response=when().post("/maps/api/place/add/json")
			.then().spec(resspec).extract().response();
			

			
		
		String responseString = response.asString();
		System.out.println(responseString);
		
	}
}

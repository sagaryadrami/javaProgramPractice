package files;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class StaicJson {
	
	@Test
	public void addBook() throws IOException {
		RestAssured.baseURI="http://216.10.245.166";
		Response resp = given().log().all().header("Content-Type","application/json")
		.body(GenerateStringFromResource("C:\\Users\\Sagar yadrami\\static json file\\Addbookdetails.json"))
		.when().post("/Library/Addbook.php").then().assertThat().statusCode(200).extract().response();
		 JsonPath jsonResponse = ReUsableMethods.rawToJson2(resp);
	        System.out.println(jsonResponse.getString("ID"));
	    }	


//deleteBOok



public static String GenerateStringFromResource(String path) throws IOException {



 return new String(Files.readAllBytes(Paths.get(path)));

}

}

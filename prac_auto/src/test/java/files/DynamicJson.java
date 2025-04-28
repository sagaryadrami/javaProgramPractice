package files;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class DynamicJson {
	
	@Test(dataProvider="BookData")
	public void addBook(String isbn, String aisle) {
		RestAssured.baseURI="http://216.10.245.166";
		String response = given().log().all().header("Content-Type","application/json").body(payload.addBook(isbn,aisle))
		.when().post("/Library/Addbook.php").then().assertThat().statusCode(200)
		.extract().response().asString();
		JsonPath js = ReUsableMethods.rawToJson(response);
		String id = js.get("ID");
		System.out.println(id);     
	
	}
	
	/*@Test()
	public void deleteBook() {
		String aisel="834921";
		RestAssured.baseURI="http://216.10.245.166";
		String response1 = given().header("Content-Type","application/json").body(payload.DeleteBook("aisel"))
		.when().delete("/Library/Deletebook.php").then().assertThat().statusCode(200)
		.extract().response().asString();
		JsonPath js1 = ReUsableMethods.rawToJson(response1);
		String I = js1.get("ID");
		System.out.println(I);
		
	}*/
	
	@DataProvider(name="BookData")
	public Object[][] getData() {
	return new	Object[][] {  {"skd","032939"},{"ospd","03848"},{"jodn","6383"}  };
	}

}

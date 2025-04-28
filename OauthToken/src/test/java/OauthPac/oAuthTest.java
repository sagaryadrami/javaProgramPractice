package OauthPac;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;

import POJO.GetCourse;
import POJO.api;
import POJO.webAutomation;
import io.restassured.path.json.JsonPath;

public class oAuthTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating array of course title for comparing with actual result
      String[] courseTitles= {"Selenium Webdriver Java","Cypress","Protractor"};
		
		//Below written code will get the token with the client credentials
		String response=given().formParams("client_id","692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		.formParams("client_secret","erZOWM9g3UtwNRj340YYaK_W")
		.formParams("grant_type","client_credentials")
		.formParams("scope","trust")
		.when().log().all()
		.post("https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token").asString();
		
		System.out.println(response);
		
		JsonPath js = new JsonPath(response);
		String accessToken = js.getString("access_token");
		
		//Below written code will use token from the above code to get the response
		GetCourse gc = given().queryParam("access_token", accessToken)
		.when().log().all()
		.get("https://rahulshettyacademy.com/oauthapi/getCourseDetails")
		.as(GetCourse.class);
         
		
	System.out.println(gc.getLinkedIn());
	System.out.println(gc.getInstructor());
	System.out.println(gc.getExperties());
	
	
	
	//don't use index because it might change instead use the loop to search name and get the price
	
	System.out.println(gc.getCourses().getApi().get(1).getCourseTitle());
	
	List<api> apiCourse = gc.getCourses().getApi();
	
	for(int i =0;i<apiCourse.size();i++) {
		if(apiCourse.get(i).getCourseTitle().equalsIgnoreCase("SoapUI Webservices testing")) {
			System.out.println(apiCourse.get(i).getPrice());
		}
	}
	
	
	//get the course title of the webautomation
	List<webAutomation> coursename = gc.getCourses().getWebAutomation();
	for(int i=0;i<coursename.size();i++) {
	System.out.println(coursename.get(i).getCourseTitle());
		}
	
 //comparison of actual course title with the expected course title 
  
	ArrayList<String> a = new ArrayList<String>();
//above we created arraylist instead of array because it's dynamic(means size is not fixed it may increase or decrease)
  
	
	 List<webAutomation> w = gc.getCourses().getWebAutomation();
	 for(int j=0;j<w.size();j++) {
	a.add(w.get(j).getCourseTitle());
	 }
	
//for validation purpose we need to compare 
//it is hard to compare array and array list
List<String> expectedList = Arrays.asList(courseTitles);

//here a is actual results and expected list is what to expect/

Assert.assertTrue(a.equals(expectedList));
	}
	
	
	}



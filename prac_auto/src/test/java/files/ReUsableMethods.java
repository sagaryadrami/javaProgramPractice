package files;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ReUsableMethods {

	public static JsonPath rawToJson(String response)
	{
		JsonPath js1 =new JsonPath(response);
		return js1;
	}

	   public static JsonPath rawToJson2(String resp) {
	        JsonPath js2 = new JsonPath(resp);
	        return js2;
	    }

	    public static JsonPath rawToJson2(Response respo) {
	        JsonPath js3 = new JsonPath(respo.asString());
	        return js3;
	    }

}

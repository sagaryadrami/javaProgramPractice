package files;

public class payload {
	
	public static String CoursePrice() {
        return "{\r\n" + 
                "  \"dashboard\": {\r\n" + 
                "    \"purchaseAmount\": 1820,\r\n" + 
                "    \"website\": \"rahulshettyacademy.com\"\r\n" + 
                "  },\r\n" + 
                "  \"courses\": [\r\n" + 
                "    {\r\n" + 
                "      \"title\": \"Selenium Python\",\r\n" + 
                "      \"price\": 50,\r\n" + 
                "      \"copies\": 6\r\n" + 
                "    },\r\n" + 
                "    {\r\n" + 
                "      \"title\": \"Cypress\",\r\n" + 
                "      \"price\": 40,\r\n" + 
                "      \"copies\": 4\r\n" + 
                "    },\r\n" + 
                "    {\r\n" + 
                "      \"title\": \"RPA\",\r\n" + 
                "      \"price\": 45,\r\n" + 
                "      \"copies\": 10\r\n" + 
                "    }\r\n" + 
                "  ]\r\n" + 
                "}\r\n" + 
                "";
    }
	
	public static String addBook(String isbn, String aisle) {
	String	payload="{\r\n"
		+ "\r\n"
		+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
		+ "\"isbn\":\""+isbn+"\",\r\n"
		+ "\"aisle\":\""+aisle+"\",\r\n"
		+ "\"author\":\"John foe\"\r\n"
		+ "}\r\n"
		+ " \r\n"
		+ "";
	return payload;
	}

	public static String DeleteBook(String aisel) {
		String	payload="{\r\n"
				+ "\r\n"
				+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
				+ "\"isbn\":\"asdf\",\r\n"
				+ "\"aisle\":\""+aisel+"\",\r\n"
				+ "\"author\":\"John foe\"\r\n"
				+ "}\r\n"
				+ " \r\n"
				+ "";
			return payload;
		
	}

}

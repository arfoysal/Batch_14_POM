package utilities;

import org.testng.annotations.DataProvider;

public class DataSet {
	
	
	@DataProvider(name = "invalidCredentials")
	public static Object dataset() {
		Object[][] objects = {{"0111111111", "password", "Please enter a valid phone number"},
							  {"01724444444", "password", "Incorrect username or password."}
		};
		return objects;
	}

}

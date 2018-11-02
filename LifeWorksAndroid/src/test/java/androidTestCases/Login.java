package androidTestCases;
import java.net.MalformedURLException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.mobile.LifeWorksAndroid.*;


public class Login {
	
	@Test
	public void Test() throws MalformedURLException {
		AppTest.Android_LaunchApp();
	}
	
	@AfterTest
	public void TearDown() {
		AppTest.CloseApp();
	}
}

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Login {

	
	@BeforeTest
	
	public void BrowserInvocation() {
		ChromeDriver driver=new ChromeDriver();
	      driver.get("http:\\google.com");      
}
	
}

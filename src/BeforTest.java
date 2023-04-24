import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class BeforTest {
	WebDriver driver;
	SoftAssert MyAssertion = new SoftAssert();


	@BeforeTest
	public void BeforTest() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");  
		 driver = new ChromeDriver(options);
		driver.get("https://magento.softwaretestingboard.com/");
	}

}

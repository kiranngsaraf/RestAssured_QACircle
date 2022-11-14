package amazon.commonBaseTest;

import org.testng.annotations.BeforeClass;

public class baseTest {

	@BeforeClass
	public void launchApp()
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	BufferedReader r = new BufferedReader(new FileReader("enviornmentDetails.properties"));
	}

}

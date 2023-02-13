package bddselenium.steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SamplesSteps {

	private static WebDriver driver;       
    public final static int TIMEOUT = 10;
    
    @Before
	public void setup() {
    	 WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
         driver.manage().window().maximize();
	}
	
	@Given("I launch website using {string}")
	public void i_launch_website_using(String url) {
	   driver.get(url);
	}
	
	@Given("I accept cookies")
	public void i_accept_cookies() {
	    
	}
	@When("I search for {string}")
	public void i_search_for(String string) {
	   
	}
	
	@After
    public void teardown() {
  
        driver.quit();
    }	
		
}

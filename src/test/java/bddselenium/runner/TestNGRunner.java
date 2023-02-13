package bddselenium.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		tags = "@tag1", 
		features = {"src/test/resources/features"}, 
		glue = {"bddselenium.steps"},
	    plugin = {}
	)
public class TestNGRunner extends AbstractTestNGCucumberTests{

}


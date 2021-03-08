package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features="classpath:ui",
		glue="stepdefs",
		tags="",
		plugin = {"pretty",
				"html:target/html/",
				"json:target/json/file.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		},
		//strict=false,
		dryRun=false
		

		)
public class RunTestUI {

	//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}


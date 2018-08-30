package com.RunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = "Features",
		
		glue ={"com.StepDefinitions"},
		
		monochrome = true,
		
		plugin= {"html:Tc.html","json:tc.json"},
		
		tags = {"@tab3"}
		
	)


public class RunnerClass {

}

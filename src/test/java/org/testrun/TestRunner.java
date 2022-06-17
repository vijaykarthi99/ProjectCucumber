package org.testrun;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.step.CustomizedJVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\JavaClassProjectsEclipse\\ProjectCucumber\\src\\test\\resources\\Fb.feature", 
glue = "org.step", 
monochrome = true,
dryRun= false, 
snippets=SnippetType.CAMELCASE,


		plugin = {"pretty","json:D:\\JavaClassProjectsEclipse\\ProjectCucumber\\target\\outputjson.json"})
public class TestRunner {

	@AfterClass
	public static void tc1() {
		CustomizedJVMReport.reporingJVM("D:\\JavaClassProjectsEclipse\\ProjectCucumber\\target\\outputjson.json");

	}

}

package org.testrun1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\BlazeDemoCon.feature", glue="org.step1")
public class TestRunner1 {

}

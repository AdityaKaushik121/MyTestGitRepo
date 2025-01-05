package Runners;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\resources\\FeatureFiles",glue= {"StepDefs"},
tags="@PFGoogle",
//plugin={"pretty", "html:target\\ReportFolder\\reports.html"})
plugin={"pretty", "json:target\\ReportFolder\\reports.json"})
public class Runner1 {

}

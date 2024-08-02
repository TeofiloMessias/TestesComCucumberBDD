package br.tmf.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/",
		glue = {"br.tmf.steps", "br.tmf.config"},
		//tags = {"@funcionais","@unitários", "not @ignore"},
		plugin= {"pretty", "html:target/report-html", "json:target/report.jason"},		
		monochrome = false,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,// true
		strict = false // true
		)

public class RunnerTest {		
}

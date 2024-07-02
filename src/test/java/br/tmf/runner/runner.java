package br.tmf.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/login.feature",
		glue = "br.tmf.steps",
		plugin= {"pretty", "html:target/report-html", "json:target/report.jason"},
		tags = {},
	//	tags = {"~@ignore,@atraso_na_entrega"},
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false // true
		)

public class runner {
	

}
package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = { "src\\test\\resources" }, glue = {
		"com.stepdefinition" }, dryRun = false, monochrome = true, strict = true, snippets = SnippetType.CAMELCASE)

public class UbuyTestRunner {

}

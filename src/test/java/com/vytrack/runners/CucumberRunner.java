package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/vytrack/step_definitions", //glue --> always has to start path with com/
        features = "src/test/resources/features",  // path to the directory of feature file
        dryRun = false, // if you want to run the test -> to make sure that every test step has a code implementation.
                        // dry run = true --> if you want to implement ready methods from console
        strict = true   // If no, cucumber will throw step definition snippets into console.
                        //option , so it will not execute the test , it will just check the code implementation, otherwise ide will kick snippet
)
public class CucumberRunner {

}
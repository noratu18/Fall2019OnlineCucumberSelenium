package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/vytrack/step_definitions", //glue --> always has to start path with com/
        features = "src/test/resources/features/activities",  // path to the directory of feature file
        dryRun = false,
        strict = false,
        tags = "A",
        plugin = {
                "html:target/default-report",
                "json:target/cucumber2.json"

        }

)

public class ActivitiesTestRunner {

}

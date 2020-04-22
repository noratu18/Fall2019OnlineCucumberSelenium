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
        strict = false,   // If no, cucumber will throw step definition snippets into console.
                        //option , so it will not execute the test , it will just check the code implementation, otherwise ide will kick snippet

        tags = "@create_car_DDT",
        plugin = {
                "html:target/default-report",
                "json:target/cucumber1.json"  // this line will generate json report
                                            //json coming from javaScript, very popular in developers
                                            //used in API, contains report like failed, passed html report
                                            //property-value doesn'r store any methods, only properties

        }


//#command+shift+f  --> to search deep where tags (like activities) is used

)
public class CucumberRunner {

}

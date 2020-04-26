package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/vytrack/step_definitions", //glue --> always has to start path with com/
        features = "@target/rerun.txt",  // path to rerun the target file
        plugin = {
                "html:target/default-report",// this report will generate separate report
                "json:target/cucumber1.json",  // this line will generate json report
                                           //json coming from javaScript, very popular in developers
                //used in API, contains report like failed, passed html report
                //property-value doesn'r store any methods, only properties


        }


//#command+shift+f  --> to search deep where tags (like activities) is used

)
public class Failedrunner {


}

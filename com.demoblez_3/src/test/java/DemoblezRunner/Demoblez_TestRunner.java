package DemoblezRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/demosources/java/DemoFeature" },
            plugin = {"json:target/cucumber.json" },
            glue = "DemoblezStepDep", tags = { "@demoblazeCarte" })

public class Demoblez_TestRunner extends AbstractTestNGCucumberTests {

}

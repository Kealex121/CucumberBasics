package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

//it has the path of feature directory
@CucumberOptions(
        features ="src/test/resources/features/",

        //in glue provide the name of the where steps definition is available
        glue ="steps",

        //it stops actual execution when set to true and scans all steps for new steps
        //also it provides the missing step definition
        //to start the execution set the value of dry run to false
        dryRun = false,

        //to choose specific scenarios to run, give them the same tag name like @sprint1 so only they will be run.
        //add "or" and tags with either tag will be run but not the entire list of scenarios
        //add "and" means that scenarios need both tags to be run, otherwise it will not be executed
        tags = "@excel",
        plugin = {"pretty"}
)

public class TestRunners {


}

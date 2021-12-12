package reto.autom.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features= "src/test/resources/features/reto.feature",
        tags="@stories",
        glue="reto.autom.stepdefinitions",
        snippets=SnippetType.CAMELCASE)

public class RunnerTags {
}


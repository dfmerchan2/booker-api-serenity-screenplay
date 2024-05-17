package co.com.booker.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/PostCreateBooking.feature",
    plugin = {"pretty", "summary"},
    glue = "co.com.booker.stepdefinitions",
    snippets = CucumberOptions.SnippetType.CAMELCASE)
public class CreateBookingRunner {}

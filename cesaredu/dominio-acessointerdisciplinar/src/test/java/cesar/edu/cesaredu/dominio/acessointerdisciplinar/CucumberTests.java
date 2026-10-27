package cesar.edu.cesaredu.dominio.acessointerdisciplinar;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectDirectories;
import org.junit.platform.suite.api.Suite;

import io.cucumber.junit.platform.engine.Constants;

@Suite(failIfNoTests = false)
@IncludeEngines("cucumber")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME, value = "cesar.edu.cesaredu.dominio.acessointerdisciplinar")
@SelectDirectories("src/test/resources")
public class CucumberTests {
}

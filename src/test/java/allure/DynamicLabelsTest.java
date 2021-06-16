package allure;

import io.qameta.allure.Allure;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DynamicLabelsTest {

    @Test
    @DisplayName("Test for verification of Issue creation (dynamic)")
    public void testIssueCreate() {
        Allure.feature("Issues");
        Allure.label("owner", "eroshenkoam");
        Allure.story("Issues Creation");
        Allure.label("severity", SeverityLevel.BLOCKER.toString());
        Allure.link("Github", "https://github.com");
    }

}
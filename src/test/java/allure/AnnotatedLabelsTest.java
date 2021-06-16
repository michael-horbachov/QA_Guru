package allure;

import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Issues")
@Owner("eroshenkoam")
public class AnnotatedLabelsTest {

    @Test
    @Story("Issues Creation")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "Github", url = "https://github.com")
    @DisplayName("Test for verification of Issue creation")
    public void testIssueCreate() {

    }

    @Test
    @Story("Issues Deletion")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "Github", url = "https://github.com")
    @DisplayName("Test for verification of Issue deletion from author's name")
    public void testIssueDelete() {

    }

    @Test
    @Story("Issues Deletion")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "Github", url = "https://github.com")
    @DisplayName("Test for verification of Issue deletion from repository owner")
    public void testIssueDeleteFromRepositoryOwner() {

    }

}
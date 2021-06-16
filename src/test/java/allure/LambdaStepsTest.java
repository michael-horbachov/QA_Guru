package allure;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Allure;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class LambdaStepsTest {

    private static final String BASE_URL = "https://github.com";
    private static final String REPOSITORY = "eroshenkoam/allure-example";
    private static final int ISSUE_NUMBER = 68;

    @Test
    public void testIssueSearch() {
//        Allure.parameter("url", BASE_URL);
//        Allure.parameter("repository", REPOSITORY);
//        Allure.parameter("issue_number", ISSUE_NUMBER);

        step("Open the Main page", (s) -> {
            s.parameter("url", BASE_URL);
            open(BASE_URL);
        });
        step("Search the repository " + REPOSITORY, (s) -> {
            s.parameter("repository", REPOSITORY);
            $(".header-search-input").click();
            $(".header-search-input").sendKeys(REPOSITORY);
            $(".header-search-input").submit();
        });
        step("Navigate into the repository " + REPOSITORY, (s) -> {
            s.parameter("repository", REPOSITORY);
            $(By.linkText("eroshenkoam/allure-example")).click();
        });
        step("Open the Issues tab in repository", () -> {
            $(withText("Issues")).click();
        });
        step("Verify Issue with number " + ISSUE_NUMBER + " exists", (s) -> {
            s.parameter("number", ISSUE_NUMBER);
            $(withText("#" + ISSUE_NUMBER)).should(Condition.exist);
        });
    }

}
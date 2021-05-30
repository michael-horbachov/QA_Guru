package github;

import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class FindSelenideTest {

    @Test
    void shouldFindSelenideOnGitHub() {
        open("https://github.com");
        $("[name=q").setValue("Selenide").pressEnter();
        var firstRepositoryFound = $$("ul.repo-list li").first().$("a");
        firstRepositoryFound.click();
        $("h1").shouldHave(text("selenide / selenide"));
    }

}
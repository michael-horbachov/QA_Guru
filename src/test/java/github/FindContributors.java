package github;

import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class FindContributors {

    @Test
    void firstContributorShouldBeSolntsev() {

        open("https://github.com/selenide/selenide");
        $(".BorderGrid").$(byText("Contributors"))
                        .closest("div").$("li").hover();
        $$(".Popover-message").findBy(visible)
                              .shouldHave(text("Andrei Solntsev"));
    }

}
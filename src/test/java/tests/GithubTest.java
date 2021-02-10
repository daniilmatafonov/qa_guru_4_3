package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class GithubTest extends BaseTest {

    @Test
    public void selenideShouldHaveListAssertions() {
        open("selenide/selenide");
        $("span[data-content='Wiki']").should(visible).click();
        $("div#wiki-pages-box").should(visible).$$("ul li").last().shouldHave(exactText("SoftAssertions")).click();
        $("div#wiki-body").should(visible).$$("ol[start='3'] li").first().shouldHave(text("Using JUnit5 extend test class:"));
    }

}

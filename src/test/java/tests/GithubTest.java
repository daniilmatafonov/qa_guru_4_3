package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;
import static helpers.ConfigurationHelper.BASE_URL;

public class GithubTest extends BaseTest {

    @BeforeAll
    public static void setUp() {
        baseUrl = BASE_URL;
        startMaximized = true;
    }

    @Test
    public void selenideShouldHaveListAssertions() {
        open("selenide/selenide");
        $("span[data-content='Wiki']").should(visible).click();
        $("div#wiki-pages-box").should(visible).$$("ul li").last().shouldHave(exactText("SoftAssertions")).click();
        $("div#wiki-body").should(visible).$$("ol[start='3'] li").first().shouldHave(text("Using JUnit5 extend test class:"));
    }

}

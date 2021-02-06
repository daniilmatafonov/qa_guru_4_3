package tests;

import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.startMaximized;
import static helpers.ConfigurationHelper.BASE_URL;

public class BaseTest {

    @BeforeAll
    public static void init (){
        baseUrl = BASE_URL;
        startMaximized = true;
    }
}

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FindSoftAssertions {
    @Test
    void exampleAvailableJUnit5Test() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-body").find(byText("Soft assertions")).click();

        // Проверка наличия примера кода для JUnit5
        $$(".markdown-heading").findBy(text("JUnit5")).sibling(0).$("pre")
                .shouldHave(text("@ExtendWith({SoftAssertsExtension.class})\n" +
                        "class Tests {\n" +
                        "  @Test\n" +
                        "  void test() {\n" +
                        "    Configuration.assertionMode = SOFT;\n" +
                        "    open(\"page.html\");\n" +
                        "\n" +
                        "    $(\"#first\").should(visible).click();\n" +
                        "    $(\"#second\").should(visible).click();\n" +
                        "  }\n" +
                        "}"));
    }
}

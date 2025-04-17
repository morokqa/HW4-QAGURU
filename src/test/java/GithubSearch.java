import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class GithubSearch {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://github.com/";
    }
    @Test
    void findSoftAssertions() {
        //Откройте страницу Selenide в Github
        Selenide.open("selenide/selenide");

        //Перейдите в раздел Wiki проекта

        
        //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        //Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
    }
}

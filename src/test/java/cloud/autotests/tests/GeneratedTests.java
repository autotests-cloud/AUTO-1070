package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("eksmo")
    void generatedTest() {
        step("open https://eksmo.ru/", () -> {
            step("// todo: just add selenium action");
        });

        step("step проверить поиск по слову Олег Рой", () -> {
            step("// todo: just add selenium action");
        });

        step("step проверить выбор города", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://eksmo.ru/'", () ->
            open("https://eksmo.ru/"));

        step("Page title should have text 'Книжный интернет-магазин Эксмо | Книги онлайн с доставкой на официальном сайте издательства Эксмо'", () -> {
            String expectedTitle = "Книжный интернет-магазин Эксмо | Книги онлайн с доставкой на официальном сайте издательства Эксмо";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://eksmo.ru/'", () ->
            open("https://eksmo.ru/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}
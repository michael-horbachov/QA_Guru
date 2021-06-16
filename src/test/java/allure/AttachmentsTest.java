package allure;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.screenshot;

public class AttachmentsTest {

    private WebSteps steps = new WebSteps();

    @Test
    public void testAttachmentAnnotation() {
        steps.openMainPage();
        steps.makeScreenshot();
    }

    @Test
    public void testAttachmentDynamic() {
        open("https://github.com/");
        makeScreenshot();
    }

    private void makeScreenshot() {
        InputStream stream = new ByteArrayInputStream(screenshot(OutputType.BYTES));
        Allure.attachment("Screenshot", stream);
    }

}
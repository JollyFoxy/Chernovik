import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testSteps.Forms;
import testSteps.TextBox;

import static com.codeborne.selenide.Selenide.open;

public class MainTest {

    private static String url ="https://demoqa.com/";

    TextBox textBox = new TextBox();
    Forms forms = new Forms();

    @BeforeAll
    static void beforeConfig() {
        //Configuration.timeout = 3000;
        Configuration.browserSize = "1620x1080";
    }
    @BeforeEach
    public void before() {
        open(url);
    }
    @Test
    public void testTextBox(){
        textBox.inputMyName();
        //textBox.checkInfo();
    }
    @Test
    public void testForms(){
        forms.inputForms();
    }
}

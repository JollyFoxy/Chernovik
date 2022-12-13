import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;
import testSteps.CheckBox;
import testSteps.Forms;
import testSteps.Registration;
import testSteps.TextBox;


import static com.codeborne.selenide.Selenide.open;

public class MainTest {

    private static String url ="https://demoqa.com/";
    TextBox textBox = new TextBox();
    Forms forms = new Forms();
    Registration registration =new Registration();
    CheckBox checkBox= new CheckBox();

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
        textBox.checkInfo();
    }
    @Test
    public void testForms(){
        forms.inputForms();
        forms.inputFirstNameAndLastName("Павел","Мизирев");
        forms.inputEmail("pavel@mail.com");
        forms.inputGender("Male");
        forms.inputNumber("88005553535");
        forms.inputDateOfBirth();
        forms.inputSubjects("???");
        forms.inputHobbies("Music");
        forms.inputAddress("Пушкина 23");
        forms.submit();
    }
    @Test
    public void testRegistration(){
        registration.skroleBody();
        registration.inputBookStoreApplication();
        registration.newUser();
        registration.createUser("Павел","Мизирев","JellyFox","Qq-123456!");
        registration.recaptcha();
        registration.registerNewUser();
    }
    @Test
    public void testCheckBox(){

    }
}

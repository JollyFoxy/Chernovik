import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;
import org.testng.annotations.BeforeMethod;
import testSteps.*;


import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class MainTest {

    private static String baseUrl ="https://demoqa.com/";
    TextBox textBox = new TextBox();
    Forms forms = new Forms();
    Registration registration =new Registration();
    CheckBox checkBox= new CheckBox();
    AutoComplete autoComplete= new AutoComplete();

    @BeforeAll
    static void beforeConfig() {
        Configuration.timeout = 3000;
        Configuration.browserSize = "1620x1080";
    }
    @BeforeEach
    public void before() {
        open(baseUrl);
    }
    @Test
    public void testTextBox(){
        textBox.inputTextBox();
        textBox.inputFullName("Павел");
        textBox.inputEmail("pavel@mial.com");
        textBox.inputCurrentAddress("Пушкина 23");
        textBox.inputPermanentAddress("Советская 43");
        textBox.submit();
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
        forms.avatrUpload("C:\\Users\\инет\\IdeaProjects\\Chernovik");
        forms.inputAddress("Пушкина 23");
        forms.submit();
        forms.closeWidow();
//        sleep(1000000);
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
        checkBox.inputCheckBox();
        checkBox.openAll();
        checkBox.elementSelection();
        checkBox.closeHome();
    }
}

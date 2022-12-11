package testSteps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Forms {

    private SelenideElement forms = $(By.xpath("//div[@class='card-body']//h5[.='Forms']"));
    private SelenideElement registrationForm = $(By.xpath("//div[@class='element-group']//li[@id='item-0']//span[.='Practice Form']"));
    private SelenideElement firstName = $(By.xpath("//input[@id='firstName']"));
    private SelenideElement lastName = $(By.xpath("//input[@id='lastName']"));
    private SelenideElement userEmail = $(By.xpath("//input[@id='userEmail']"));
    private SelenideElement genderMale = $(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']//input "));
    private SelenideElement userNumber = $(By.xpath("//input[@id='userNumber']"));
    private SelenideElement dateOfBirth = $(By.xpath("//input[@id='dateOfBirthInput']"));
    private SelenideElement monthSelect = $(By.xpath("//select[@class='react-datepicker__month-select']"));
    private SelenideElement november = $(By.xpath("//option[@value='10']"));
    private SelenideElement yearSelect = $(By.xpath("//select[@class='react-datepicker__year-select']"));
    private SelenideElement year2002 = $(By.xpath("//option[@value='2002']"));
    private SelenideElement date_18_11_2002 = $(By.xpath("//div[@aria-label='Choose Monday, November 18th, 2002']"));
    private SelenideElement subjects = $(By.xpath("//input[@id='subjectsInput']"));
    private SelenideElement hobbiesMusic = $(By.xpath("//input[@id='hobbies-checkbox-3']"));

    @Step
    public void inputForms (){
        forms.should(Condition.visible).click();
        registrationForm.should(Condition.visible).click();
        firstName.val("Павел");
        lastName.val("Мизирев");
        userEmail.val("pavel@mail.com");
        genderMale.click();
        userNumber.val("88005553535");
        dateOfBirth.click();
        monthSelect.click();
        november.click();
        yearSelect.click();
        year2002.click();
        date_18_11_2002.click();
        subjects.val("???");

    }
}

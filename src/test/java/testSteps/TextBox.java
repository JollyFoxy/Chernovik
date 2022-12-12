package testSteps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TextBox {

    private SelenideElement element = $(By.xpath("//div[@class='card-body']//h5[.='Elements']"));
    private SelenideElement textBox = $(By.xpath("//div[@class='element-group']//li[@id='item-0']"));
    private SelenideElement fulName = $(By.xpath("//input[@id='userName']"));
    private SelenideElement eMail = $(By.xpath("//input[@id='userEmail']"));
    private SelenideElement currentAddress = $(By.xpath("//textarea[@id='currentAddress']"));
    private SelenideElement permanentAddress = $(By.xpath("//textarea[@id='permanentAddress']"));
    private SelenideElement btnSubmit = $(By.xpath("//button[@id='submit']"));
    private SelenideElement checkName = $(By.xpath("//p[@id='name']"));
    private SelenideElement checkEmail = $(By.xpath("//p[@id='email']"));
    private SelenideElement checkCurrentAddress = $(By.xpath("//p[@id='currentAddress']"));
    private SelenideElement checkPermanentAddress = $(By.xpath("//p[@id='permanentAddress']"));

    @Step
    public void inputMyName() {
        element.should(Condition.visible).click();
        textBox.should(Condition.visible).click();
        fulName.should(Condition.visible).val("Павел");
        eMail.should(Condition.visible).val("pavel@mial.com");
        currentAddress.should(Condition.visible).val("Пушкина 23");
        permanentAddress.should(Condition.visible).val("Советская 43");
        btnSubmit.should(Condition.visible).click();

    }
    @Step
    public void checkInfo(){
        Assertions.assertEquals(checkName.should(Condition.visible).getText(), "Name:Павел");
        Assertions.assertEquals(checkEmail.should(Condition.visible).getText(), "Email:pavel@mial.com");
        Assertions.assertEquals(checkCurrentAddress.should(Condition.visible).getText(), "Current Address :Пушкина 23");
        Assertions.assertEquals(checkPermanentAddress.should(Condition.visible).getText(), "Permananet Address :Советская 43");
    }
}

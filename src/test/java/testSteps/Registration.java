package testSteps;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;


public class Registration {
    private SelenideElement body = $(By.xpath("//div[@class='body-height']"));
    private SelenideElement bookStoreApplication =$(By.xpath("//div[@class='card-body']//h5[.='Book Store Application']"));
    private SelenideElement login = $(By.xpath("//div[@class='element-group']//li[@id='item-0']//span[.='Login']"));
    private SelenideElement btnNewUser = $(By.xpath("//button[@id='newUser']"));
    private SelenideElement firstName = $(By.xpath("//input[@id='firstname']"));
    private SelenideElement lastName = $(By.xpath("//input[@id='lastname']"));
    private SelenideElement userName = $(By.xpath("//input[@id='userName']"));
    private SelenideElement password = $(By.xpath("//input[@id='password']"));
    private SelenideElement captcha = $(By.xpath("//span[@aria-labelledby='recaptcha-anchor-label']"));
    private SelenideElement register = $(By.xpath("//button[@id='register']"));


    @Step("Прокрутка страницы")
    public void skroleBody(){
        body.scrollIntoView(false);
    }
    @Step("Вход в пункт \"Login\"")
    public void inputBookStoreApplication (){
        bookStoreApplication.click();
        login.click();
    }
    @Step("Нажимание кнопки \"New User\"")
    public void newUser(){
        btnNewUser.click();
    }
    @Step("Создание нового пользователя")
    public void createUser(String first_name, String last_name,String user_name, String pass){
        firstName.val(first_name);
        lastName.val(last_name);
        userName.val(user_name);
        password.val(pass);
    }

    @Step("Проверка на робота")
    public void recaptcha(){
        captcha.click();//не получилось
        // время для ручного прохождения recaptcha
        sleep(10000);//не придумал ничего умнее
    }
    @Step("нажатие кнопки \"Register\"")
    public void registerNewUser (){
        register.click();
    }
}

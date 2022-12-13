package testSteps;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckBox {
    private SelenideElement element = $(By.xpath("//div[@class='card-body']//h5[.='Elements']"));
    private SelenideElement checkBox = $(By.xpath("//div[@class='element-group']//li[@id='item-1']"));
    private SelenideElement btnPlus = $(By.xpath("//button[@class='rct-option rct-option-expand-all']"));
    private SelenideElement wordFile = $(By.xpath("//label[@for='tree-node-wordFile']"));
    private SelenideElement packageOffice = $(By.xpath("//label[@for='tree-node-office']"));
    private SelenideElement arrow = $(By.xpath("//button[@class='rct-collapse rct-collapse-btn']"));

    @Step("Переход в \"Elements/Check Box\"")
    public void inputCheckBox(){
        element.click();
        checkBox.click();
    }
    @Step("Раскрытие всего дерева \"Home\"")
    public void openAll(){
        btnPlus.click();
    }
    @Step("Выбор элементов")
    public void elementSelection (){
        packageOffice.click();
        wordFile.click();
    }
    @Step("Закрытие дерева \"Home\"")
    public void closeHome (){
        arrow.click();
    }
}

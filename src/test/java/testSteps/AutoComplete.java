package testSteps;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AutoComplete {
    private SelenideElement widgets = $(By.xpath("//div[@class='card-body']//h5[.='Widgets']"));
    private SelenideElement autoComplete = $(By.xpath("//div[@class='element-list collapse show']//li[@id='item-1']//span[.='Auto Complete']"));
    private SelenideElement multipleColor = $(By.xpath("//div[@class='auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3']"));

    @Step
    public void color(){
        widgets.click();
        autoComplete.click();
        multipleColor.click();
        multipleColor.val("Black");
    }
}

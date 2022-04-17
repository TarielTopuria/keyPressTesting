package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    WebDriver driver;
    private final By findLabel = By.id("target");
    private final By returnedAnswer = By.id("result");

    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void keyPress(Keys key){
        driver.findElement(findLabel).sendKeys(key);
    }

    public void textInput(String text){
        driver.findElement(findLabel).sendKeys(text);
    }

    public String getResult(){
        return driver.findElement(returnedAnswer).getText();
    }

}

package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public KeyPressesPage clickKeyPresses(){
        clickLink();
        return new KeyPressesPage(driver);
    }

    private void clickLink(){
        driver.findElement(By.linkText("Key Presses")).click();
    }
}

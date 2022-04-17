package keyPressTesting;

import base.BaseTests;
import org.junit.Test;
import org.openqa.selenium.Keys;
import pages.KeyPressesPage;
import static org.junit.Assert.assertEquals;

public class KeyPressTesting extends BaseTests {
    @Test
    public void testBackspace(){
        KeyPressesPage keyInsert = homePage.clickKeyPresses();
        keyInsert.keyPress(Keys.BACK_SPACE);
        assertEquals(keyInsert.getResult(), "You entered: BACK_SPACE");
    }

    @Test
    public void testArrowUp(){
        KeyPressesPage keyInsert = homePage.clickKeyPresses();
        keyInsert.keyPress(Keys.ARROW_UP);
        assertEquals(keyInsert.getResult(), "You entered: UP");
    }

    @Test
    public void testText(){
        KeyPressesPage keyInsert = homePage.clickKeyPresses();
        keyInsert.textInput("S");
        assertEquals(keyInsert.getResult(), "You entered: S");
    }
}

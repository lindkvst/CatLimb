package util;

import main.Cat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatFlapValidatorTest {

    @Test
    void checkID() {
        assertThrows(CatFlapException.class, () -> new CatFlapValidator(new Cat (" ")));
    }
}
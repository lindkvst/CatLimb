import main.Cat;
import org.junit.jupiter.api.Test;
import util.CatFlapException;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    CatTest() throws CatFlapException {
    }

    @Test
    void chipIDIsEmpty(){
        assertThrows(CatFlapException.class, () -> new Cat(" "));
    }

}
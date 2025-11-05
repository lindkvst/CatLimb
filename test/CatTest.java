import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    CatTest() throws Exception {
    }


    @Test
    void chipIDIsEmpty(){
        assertThrows(Exception.class, () -> new Cat(" "));
    }

}
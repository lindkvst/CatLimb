package States;

import main.Cat;
import main.CatFlap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InOnlyTest {
    Cat cat;
    Cat cat2;
    Cat cat3;
    InOnly inOnly;

    {
        try {
            cat = new Cat("Bob");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    {
        try{
            cat2 = new Cat("Alice");
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    {
        try{
            cat3 = new Cat("Lucifer");
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    CatFlap catFlap = new CatFlap();


    @Test
    void enter() {
        inOnly = new InOnly(catFlap);
        catFlap.addCat(cat);
        assertTrue(inOnly.enter(cat));
        assertFalse(inOnly.enter(cat2));
        assertFalse(inOnly.enter(cat3));
    }

    @Test
    void exit() {
        inOnly = new InOnly(catFlap);
        catFlap.addCat(cat);
        assertFalse(inOnly.exit(cat));
        assertFalse(inOnly.exit(cat2));
        assertFalse(inOnly.exit(cat3));
    }
}
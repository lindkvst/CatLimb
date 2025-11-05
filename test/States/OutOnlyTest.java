package States;

import main.Cat;
import main.CatFlap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OutOnlyTest {
    Cat cat;
    Cat cat2;
    Cat cat3;
    OutOnly outOnly;

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
        outOnly = new OutOnly(catFlap);
        catFlap.addCat(cat);
        assertFalse(outOnly.enter(cat));
        assertFalse(outOnly.enter(cat2));
        assertFalse(outOnly.enter(cat3));
    }

    @Test
    void exit() {
        outOnly = new OutOnly(catFlap);
        catFlap.addCat(cat);
        assertTrue(outOnly.exit(cat));
        assertFalse(outOnly.exit(cat2));
        assertFalse(outOnly.exit(cat3));
    }
}
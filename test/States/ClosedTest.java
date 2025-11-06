package States;

import main.Cat;
import main.CatFlap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClosedTest {
    Cat cat;
    Cat cat2;
    Cat cat3;
    Closed closed;

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
        closed = new Closed(catFlap);
        catFlap.addCat(cat);
        assertFalse(closed.exit(cat));
        assertFalse(closed.exit(cat2));
        assertFalse(closed.exit(cat3));
    }

    @Test
    void exit() {
        closed = new Closed(catFlap);
        catFlap.addCat(cat);
        assertFalse(closed.exit(cat));
        assertFalse(closed.exit(cat2));
        assertFalse(closed.exit(cat3));
    }
}
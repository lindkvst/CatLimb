package main;

import States.*;
import org.junit.jupiter.api.Test;
import util.CatFlapException;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CatFlapTest {
    @Test
    void testNewCatFlapStateEqualsClosed() {
        CatFlap catFlap = new CatFlap();
        String state = catFlap.getState();
            assertTrue(state.equalsIgnoreCase("closed"));
    }

   @Test
   void testCatFlapTooBigCatList() {
       ArrayList<Cat> catListTooBig = new ArrayList<>();
       catListTooBig.add(new Cat("Cat1"));
       catListTooBig.add(new Cat("Cat2"));
       catListTooBig.add(new Cat("Cat3"));
       catListTooBig.add(new Cat("Cat4"));
       catListTooBig.add(new Cat("Cat5"));
       catListTooBig.add(new Cat("Cat6"));

       assertThrows(CatFlapException.class, () -> new CatFlap(catListTooBig));

   }

    @Test
    void testCatFlapListOk() {
        ArrayList<Cat> catListOk = new ArrayList<>();
        catListOk.add(new Cat("Cat1"));
        catListOk.add(new Cat("Cat2"));
        catListOk.add(new Cat("Cat3"));
        catListOk.add(new Cat("Cat4"));
        catListOk.add(new Cat("Cat5"));

        assertDoesNotThrow(() -> new CatFlap(catListOk));

    }

    @Test
    void testAddCatMax() {
        CatFlap catFlap = new CatFlap();

        catFlap.addCat(new Cat("Cat1"));
        catFlap.addCat(new Cat("Cat2"));
        catFlap.addCat(new Cat("Cat3"));
        catFlap.addCat(new Cat("Cat4"));
        catFlap.addCat(new Cat("Cat5"));

        assertThrows(CatFlapException.class, () -> catFlap.addCat(new Cat("Cat6")));

    }

    @Test
    void testClearRegisteredCats() {

        CatFlap catFlap = new CatFlap();

        catFlap.addCat(new Cat("Cat1"));
        catFlap.addCat(new Cat("Cat2"));
        catFlap.addCat(new Cat("Cat3"));
        catFlap.addCat(new Cat("Cat4"));
        catFlap.addCat(new Cat("Cat5"));

        assertTrue(catFlap.getCatList().size() == 5);

        catFlap.clearRegisteredCats();

        assertTrue(catFlap.getCatList().size() == 0);

    }

    @Test
    void testSetStateOutOnly() {
        CatFlap catFlap = new CatFlap();
        catFlap.setState(new OutOnly(catFlap));

        assertTrue(catFlap.getState().equalsIgnoreCase("OutOnly"));
    }

    @Test
    void testSetStateInOnly() {
        CatFlap catFlap = new CatFlap();
        catFlap.setState(new InOnly(catFlap));

        assertTrue(catFlap.getState().equalsIgnoreCase("InOnly"));
    }

    @Test
    void testSetStateOpen() {
        CatFlap catFlap = new CatFlap();
        catFlap.setState(new Open(catFlap));

        assertTrue(catFlap.getState().equalsIgnoreCase("Open"));
    }

    @Test
    void testSetStateOpenAndThenClosed() {
        CatFlap catFlap = new CatFlap();
        catFlap.setState(new Open(catFlap));

        assertTrue(catFlap.getState().equalsIgnoreCase("Open"));

        catFlap.setState(new Closed(catFlap));

        assertTrue(catFlap.getState().equalsIgnoreCase("Closed"));
    }

    @Test
    void setStateString(){
        CatFlap catFlap = new CatFlap();
        assertTrue(catFlap.getState().equalsIgnoreCase("Closed"));
        catFlap.setState("inonly");
        assertTrue(catFlap.getState().equalsIgnoreCase("InOnly"));
        catFlap.setState("OuTOnLY");
        assertTrue(catFlap.getState().equalsIgnoreCase("OutOnly"));
        catFlap.setState("OPEN");
        assertTrue(catFlap.getState().equalsIgnoreCase("Open"));
        assertFalse(catFlap.getState().equalsIgnoreCase("Closed"));

    }

}
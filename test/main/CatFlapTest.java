package main;

import org.junit.jupiter.api.Test;
import util.CatFlapException;
import util.CatFlapValidator;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CatFlapTest {

    @Test
    void testAddCatMax() {


        //ArrayList<Cat> catList = new ArrayList<>();
        CatFlap catFlap = new CatFlap();

        catFlap.addCat(new Cat("Cat1"));
        catFlap.addCat(new Cat("Cat2"));
        catFlap.addCat(new Cat("Cat3"));
        catFlap.addCat(new Cat("Cat4"));
        catFlap.addCat(new Cat("Cat5"));

        assertThrows(CatFlapException.class, () -> catFlap.addCat(new Cat("Cat6")));



    }
}
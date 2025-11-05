package main;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CatFlapTest {

    @org.junit.jupiter.api.Test
    void testAddCatMax() {


        //ArrayList<Cat> catList = new ArrayList<>();
        CatFlap catFlap = new CatFlap();

        catFlap.addCat(new Cat("Cat1"));
        catFlap.addCat(new Cat("Cat2"));
        catFlap.addCat(new Cat("Cat3"));
        catFlap.addCat(new Cat("Cat4"));
        catFlap.addCat(new Cat("Cat5"));



    }
}
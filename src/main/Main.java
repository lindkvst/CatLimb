package main;

import States.Closed;

public class Main {
    static void main() {
        runCatFlap();

    }

    static void runCatFlap() {

        Cat cat;
        Cat cat2;
        Cat cat3;
        Cat cat4;
        {
            try {
                cat = new Cat("Bob");
                cat2 = new Cat("Alice");
                cat3 = new Cat("Lucifer");
                cat4 = new Cat("Dumbo");

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        CatFlap catFlap = new CatFlap();
        catFlap.addCat(cat);
        catFlap.addCat(cat2);
        catFlap.addCat(cat3);
        catFlap.catEntry(cat);
        catFlap.catExit(cat2);
        catFlap.setState("open");
        catFlap.catEntry(cat);
        catFlap.catExit(cat2);
        catFlap.catEntry(cat3);
        catFlap.setState("inonly");
        catFlap.catEntry(cat);
        catFlap.catExit(cat2);
        catFlap.catEntry(cat3);
        catFlap.catEntry(cat4);
    }
}

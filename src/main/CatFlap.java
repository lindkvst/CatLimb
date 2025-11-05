package main;

import java.util.ArrayList;
import States.*;
import util.*;

public class CatFlap {
    private ArrayList<Cat> catList;
    private State state;
    private int catsAllowed;

    public CatFlap() {
        state = new Closed(this);
        this.catsAllowed = 5;
    }

    public CatFlap(ArrayList<Cat> catList) throws CatFlapException {
        if (catList.size() >= 5) {
            throw new CatFlapException("Systemfejl: Du kan ikke tilføje mere end " + catsAllowed + " katte");
        } else {
            this.catList = catList;
            state = new Closed(this);
            catsAllowed = 5;
        }
    }



    public void addCat(Cat c) throws CatFlapException {
        if (catList.size() == catsAllowed) {
            throw new CatFlapException("Systemfejl: Du kan ikke tilføje mere end " + catsAllowed + " katte");
        } else if (CatCheck.catCheck(this, c)) {
            throw new CatFlapException("Systemfejl: katten findes allede");
        } else {
            catList.add(c);
        }
    }

    public void clearRegisteredCats() {
        catList.removeAll(catList);
    }


    public ArrayList<Cat> getCatList() {
        return catList;
    }

    public String getMode() {
        String mode = "Test";
        //state.getClass();
        //System.out.println("Lemmens tilstand er " + state.getClass());
        return mode;

    }

    public void setState(State state) {
        //Ændrer state
    }

}

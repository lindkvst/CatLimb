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
        this.catList = new ArrayList<>();
    }

    public CatFlap(ArrayList<Cat> catList) throws CatFlapException {
        int maxCats = 5;
        if (catList.size() > maxCats) {
            throw new CatFlapException("Systemfejl: Du kan ikke tilføje mere end " + maxCats + " katte");
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

    public String getState() {
        String state = this.state.getClass().getSimpleName();
       // System.out.println("Lemmens tilstand er " + state);
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

}

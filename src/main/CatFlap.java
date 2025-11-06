package main;

import java.util.ArrayList;
import java.util.List;

import States.*;
import util.*;

public class CatFlap {
    private ArrayList<Cat> catList;
    private State state;
    private int catsAllowed;

    public CatFlap(){
        this.catList = new ArrayList<>();
        this.state = new Closed(this);
        this.catsAllowed = 5;
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
        CatFlapValidator.validateCat(c, catList, catsAllowed);
        catList.add(c);

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

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

    public CatFlap(ArrayList<Cat> catList) {
            this.catList = new ArrayList<>();
            this.state = new Closed(this);
            this.catsAllowed = 5;

            for(Cat c : catList){
                addCat(c);

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
        //state.getClass();
        System.out.println("Lemmens tilstand er " + state);
        return state;

    }

    public void setState(State state) {
        //Ændrer state
    }

}

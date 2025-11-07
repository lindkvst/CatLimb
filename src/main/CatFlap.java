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

    /**
     * overloaded setState using String input
     * @param newState String like: [Closed, InOnly, OutOnly, Open]
     */
    public void setState(String newState){
        newState = newState.toLowerCase();
        switch(newState){
            case "closed":
                this.state = new Closed(this);
                break;
            case "inonly":
                this.state = new InOnly(this);
                break;
            case "outonly":
                this.state = new OutOnly(this);
                break;
            case "open":
                this.state = new Open(this);
                break;
            default:
                throw new IllegalArgumentException("state is still " + this.state.getClass().getSimpleName());
        }
    }

    public void catEntry(Cat cat){
        if(state.enter(cat)){
            System.out.println(cat + " is allowed to enter!");
        }
        else{
            System.out.println(cat + "is not allowed to enter!");
        }
    }
    public void catExit(Cat cat){
        if(state.exit(cat)){
            System.out.println(cat + " is allowed to exit!");
        }
        else{
            System.out.println(cat + " is not allowed to exit!");
        }
    }

}

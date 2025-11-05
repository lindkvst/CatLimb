package main;

import java.util.ArrayList;

public class CatFlap {
    private ArrayList<Cat> catList;
    private State state;
    private int catsAllowed;


    public CatFlap(ArrayList<Cat> catList, int catsAllowed) {
        this.catList = catList;
        state = new Closed(this);
        this.catsAllowed = catsAllowed;
    }

    public void addCat(Cat cat) throws CatFlapException {
        if (catList.size() == catsAllowed) {
            throw new CatFlapException("Systemfejl: Du kan ikke tilføje mere end " + catsAllowed + " katte");
        } else {
            catList.add(cat);
        }
    }

    public void clearRegisteredCats() {
        catList.removeAll(catList);
    }

    public Cat getCat(Cat catName) {
        for (Cat c : catList) {
            if (c.equals(catName)) {
                return c;
                break;
            }
        }
    }

    public ArrayList<Cat> getCatList() {
        return catList;
    }

    public String getMode() {
        //state.getClass();
        System.out.println("Lemmens tilstand er " + state.getClass());
    }

    public void setState(State state) {
        //Ændrer state
    }

}

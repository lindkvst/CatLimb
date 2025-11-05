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

    public void addCat(Cat cat) {
        //something
    }

    public void clearRegisteredCats() {
        //something
    }

    public Cat getCat(String catName) {
        for (Cat c : catList) {

        }
    }

    public String getMode() {
        //state.getClass();
        System.out.println("Lemmens til");
    }

    public void setState() {

    }

}

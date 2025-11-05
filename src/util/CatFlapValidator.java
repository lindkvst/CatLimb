package util;

import main.Cat;

import java.util.List;

public class CatFlapValidator {

    public static void validateCat(Cat cat, List<Cat> catList, int catsAllowed) {
        validateChipID(cat.getChipID());
        validateCatLimit(catList, catsAllowed);
    }


    private static void validateCatLimit(List<Cat> catlist, int catsAllowed) {
        if(catlist.size() >= catsAllowed)
            throw new CatFlapException("No more than 5 cats allowed");
    }

    private static void validateChipID(String chipID) {
        if(chipID == null || chipID.isBlank())
            throw new CatFlapException("Chip id must not be empty!");
    }


}

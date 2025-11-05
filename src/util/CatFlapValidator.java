package util;

import main.Cat;

public class CatFlapValidator {
    private final Cat cat;

    public CatFlapValidator(Cat cat) {
        this.cat = cat;
    }

    public static Throwable checkID(Cat cat) throws CatFlapException{
        if(cat.getChipID().isBlank()){
            throw new CatFlapException ("Chip id must not be blank");
        }
        return null;
    }


}

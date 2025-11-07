package main;

import util.CatFlapException;
import util.CatFlapValidator;

public class Cat {
    private String chipID;

    public Cat (String chipID) throws CatFlapException {
        if(chipID.isBlank())
            throw new CatFlapException("ChipID must not be empty");
        this.chipID = chipID;

    }

    public String getChipID() {
        return chipID;
    }

    @Override
    public String toString(){return this.chipID;}

}

package States;

import main.Cat;
import main.CatFlap;

public class CatCheck {
    static boolean catCheck(CatFlap catFlap, Cat cat){
        if(cat.getChipID().equalsIgnoreCase("Lucifer")){
            return false;
        }
        for(Cat current: catFlap.getCatList()){
            if(current.equals(cat)){
                return true;
            }
        }
        return false;
    }
}

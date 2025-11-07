package States;

import main.Cat;
import main.CatFlap;

/**
 * CatCheck is used for checking whether a specific cat is registered, when general access is allowed <br>
 * Has methods: <br>
 * {@link #catCheck(CatFlap, Cat)}
 */
public class CatCheck {
    /**
     * catCheck is the main logic checking if a cat is registered
     * @param catFlap object of type {@link CatFlap} containing list of registered cats to check against
     * @param cat The {@link Cat} to check
     * @return true if the cat exists, false if it does not or is named Lucifer
     */
    public static boolean catCheck(CatFlap catFlap, Cat cat){
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

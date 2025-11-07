package States;

import main.Cat;
import main.CatFlap;

/**
 * OutOnly is the state used when registered cats are only allowed to exit<br>
 * Implements the {@link State} interface and overloads its methods. <br>
 * Has Methods:<br>
 * {@link #enter(Cat)} for entering<br>
 * {@link #exit(Cat)} for exiting<br>
 * {@link #OutOnly(CatFlap)} constructor<br>
 * Has Attributes:<br>
 * {@link #catFlap}<br>
 */
public class OutOnly implements State{
    /**
     * catFlap of type {@link CatFlap} containing registry of cats
     */
    private final CatFlap catFlap;
    /**
     * constructor
     * @param flap of type {@link CatFlap} containing registry of cats
     */
    public OutOnly(CatFlap flap){this.catFlap = flap;}
    /**
     * enter always denies entry regardless of registry
     * @param cat The entering cat of type {@link Cat}
     * @return always false
     */
    @Override
    public boolean enter(Cat cat){
        return false;
    }
    /**
     * exit allows entry for registered cats using {@link CatCheck}
     * @param cat The entering cat of type {@link Cat}
     * @return true if cat is registered, otherwise false
     */
    @Override
    public boolean exit(Cat cat){
        return CatCheck.catCheck(this.catFlap, cat);
    }
}

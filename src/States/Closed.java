package States;

import main.Cat;
import main.CatFlap;

/**
 * Closed is the state used when entry and exit is not allowed regardless of registry<br>
 * Implements the {@link State} interface and overloads its methods. <br>
 * Has Methods:<br>
 * {@link #enter(Cat)} for entering<br>
 * {@link #exit(Cat)} for exiting<br>
 * {@link #Closed(CatFlap)} constructor<br>
 * Has Attributes:<br>
 * {@link #catFlap}<br>
 */
public class Closed implements State{
    /**
     * catFlap of type {@link CatFlap} containing registry of cats
     */
    private final CatFlap catFlap;

    /**
     * constructor
     * @param flap of type {@link CatFlap} containing registry of cats
     */
    public Closed(CatFlap flap){this.catFlap = flap;}

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
     * exit always denies entry regardless of registry
     * @param cat The exiting cat of type {@link Cat}
     * @return always false
     */
    @Override
    public boolean exit(Cat cat){
        return false;
    }
}

package States;

import main.*;

/**
 * State is an interface used for dictating the logic of {@link CatFlap} <br>
 * Has methods: <br>
 * {@link #enter(Cat)} for letting cats enter<br>
 * {@link #exit(Cat)} for letting cats exit
 */
public interface State {
    /**
     * enter is the method dictating the logic for entering {@link Cat}s
     * @param cat The entering cat of type {@link Cat}
     * @return boolean for whether the cat is allowed entry
     */
    public boolean enter(Cat cat);

    /**
     * exit is the method dictating the logic for exiting {@link Cat}s
     * @param cat The exiting cat of type {@link Cat}
     * @return boolean for whether the cat is allowed to exit
     */
    public boolean exit(Cat cat);

}

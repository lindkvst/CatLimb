package States;

import main.Cat;
import main.CatFlap;

public class Closed implements State{
    private final CatFlap catFlap;
    public Closed(CatFlap flap){this.catFlap = flap;}

    @Override
    public boolean enter(Cat cat){
        return false;
    }

    @Override
    public boolean exit(Cat cat){
        return false;
    }
}

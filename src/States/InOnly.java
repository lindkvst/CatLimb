package States;

import main.Cat;
import main.CatFlap;

public class InOnly implements State{
    private final CatFlap catFlap;
    public InOnly(CatFlap flap){this.catFlap = flap;}

    @Override
    public boolean enter(Cat cat){
        return CatCheck.catCheck(this.catFlap, cat);
    }

    @Override
    public boolean exit(Cat cat){
        return false;
    }
}
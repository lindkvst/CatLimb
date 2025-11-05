package States;

import main.Cat;
import main.CatFlap;

public class OutOnly implements State{
    private final CatFlap catFlap;
    public OutOnly(CatFlap flap){this.catFlap = flap;}

    @Override
    public boolean enter(Cat cat){
        return false;
    }

    @Override
    public boolean exit(Cat cat){
        return CatCheck.catCheck(this.catFlap, cat);
    }
}

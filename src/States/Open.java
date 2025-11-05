package States;

import main.Cat;
import main.CatFlap;

public class Open implements State{
    private final CatFlap catFlap;
    public Open(CatFlap flap){this.catFlap = flap;}

    @Override
    public boolean enter(Cat cat){
        return CatCheck.catCheck(this.catFlap, cat);
    }
    @Override
    public boolean exit(Cat cat){
        return CatCheck.catCheck(this.catFlap, cat);
    }
}

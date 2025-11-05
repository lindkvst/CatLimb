package States;

import main.Cat;

public interface State {

    public boolean enter(Cat cat);
    public boolean exit(Cat cat);

}

package main;


public class Cat {
    private String chipID;

    public Cat (String chipID) {
            this.chipID = chipID;

    }

    public String getChipID() {
        return chipID;
    }

    @Override
    public String toString(){return this.chipID;}

}

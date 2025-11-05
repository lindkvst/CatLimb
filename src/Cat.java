public class Cat {
    private String chipID;

    public Cat (String chipID) throws Exception{
        if(chipID.isBlank())
            throw new Exception("Cat name must not be blank!");

        this.chipID = chipID;
    }

    public String getChipID() {
        return chipID;
    }
}

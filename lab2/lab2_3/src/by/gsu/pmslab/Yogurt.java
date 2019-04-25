package by.gsu.pmslab;

abstract public class Yogurt implements DairyProduct {

    private String nameManufacture;
    private String shelf_life;
    private String amount_of_protein;
    private String fatness;
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getShelf_life() {
        return shelf_life;
    }

    @Override
    public String getAmount_of_protein() {
        return amount_of_protein;
    }

    @Override
    public String getFatness() {
        return fatness;
    }

    public Yogurt(){
    }

    @Override
    public String Manufacturer(){
        return "0";
    }
}
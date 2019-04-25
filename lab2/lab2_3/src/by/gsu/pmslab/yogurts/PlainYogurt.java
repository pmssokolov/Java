package by.gsu.pmslab.yogurts;

import by.gsu.pmslab.Yogurt;

public class PlainYogurt extends Yogurt {
    private String flavor_additive;
    private int volume;
    private String termination;
    private String shelf_life;
    private String amount_of_protein;
    private String fatness;
    private String name;

    public PlainYogurt(String shelf_life, String amount_of_protein, String fatness, String name,
                          String flavor_additive, int volume, String termination){
        this.shelf_life = shelf_life;
        this.amount_of_protein = amount_of_protein;
        this.fatness = fatness;
        this.name = name;
        this.flavor_additive = flavor_additive;
        this.volume = volume;
        this.termination = termination;
    }

    public PlainYogurt(String shelf_life, String amount_of_protein, String name,
                          String flavor_additive, int volume, String termination){
        this.shelf_life = shelf_life;
        this.amount_of_protein = amount_of_protein;
        this.flavor_additive = flavor_additive;
        this.name = name;
        this.volume = volume;
        this.termination = termination;
    }

    public String getFlavor_additive() {
        return flavor_additive;
    }

    public int getVolume() {
        return volume;
    }

    public String getTermination() {
        return termination;
    }

    public String toString(){
        return "Yogurt:            "+getName()+"\nShelf life:        "+getShelf_life()+"\nAmount of protein: "+getAmount_of_protein()+"\nFatness:           "
                +getFatness()+"\nFlavor additive:   "+flavor_additive+"\nVolume:            "+volume+"\nTermination:       "+termination;
    }

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

    @Override
    public String Manufacturer(){
        String nameManufacture = "";

        if (getName().equals("BrestLitovsk")){
            nameManufacture = "Brest";
        }
        else if (getName().equals("Savushkin product")){
            nameManufacture = "Minsk";
        }
        else if (getName().equals("Prostokvashino")){
            nameManufacture = "Gomel";
        }
        else System.out.println("error");
        return nameManufacture;
    }
}

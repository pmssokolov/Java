package by.gsu.pmslab;

public class Yogurt implements DairyProduct {

    private String flavor_additive;
    private int volume;
    private String termination;
    private String str;
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

    public Yogurt(String shelf_life, String amount_of_protein, String fatness, String name,
                  String flavor_additive, int volume, String termination){
        this.shelf_life = shelf_life;
        this.amount_of_protein = amount_of_protein;
        this.fatness = fatness;
        this.name = name;
        this.flavor_additive = flavor_additive;
        this.volume = volume;
        this.termination = termination;
    }

    public Yogurt(String shelf_life, String amount_of_protein, String name,
                  String flavor_additive, int volume, String termination){
        this.shelf_life = shelf_life;
        this.amount_of_protein = amount_of_protein;
        this.flavor_additive = flavor_additive;
        this.volume = volume;
        this.termination = termination;
    }

    public Yogurt (Yogurt ob){
        shelf_life = ob.shelf_life;
        amount_of_protein = ob.amount_of_protein;
        fatness = ob.fatness;
        flavor_additive = ob.flavor_additive;
        volume = ob.volume;
        termination = ob.termination;
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

    @Override
    public String Manufacturer(){
        str = "";
        if (getName().equals("BrestLitovsk")){
            str = "Brest";
        }
        else if (getName().equals("Savushkin product")){
            str = "Minsk";
        }
        else if (getName().equals("Prostokvashino")){
            str = "Gomel";
        }
        else System.out.println("error");
        return str;
    }


    public String toString(){
        return "Yogurt:            "+getName()+"\nShelf life:        "+getShelf_life()+"\nAmount of protein: "+getAmount_of_protein()+"\nFatness:           "
                +getFatness()+"\nFlavor additive:   "+flavor_additive+"\nVolume:            "+volume+"\nTermination:       "+termination;
    }
}
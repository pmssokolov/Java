package by.gsu.pmslab;

public class Curd implements DairyProduct {

    private int mass;
    private String grain;
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

    public Curd(){
    }

    public Curd (String shelf_life, String amount_of_protein, String fatness,String name, int mass, String grain){
        this.shelf_life = shelf_life;
        this.amount_of_protein = amount_of_protein;
        this.fatness = fatness;
        this.name =name;
        this.mass = mass;
        this.grain = grain;
    }

    public Curd (String shelf_life, String amount_of_protein,String name, String fatness, int mass){
        this.shelf_life = shelf_life;
        this.amount_of_protein = amount_of_protein;
        this.name =name;
        this.fatness = fatness;
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }

    public String getGrain() {
        return grain;
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

    public String toString(){
        return "Curd:              "+getName()+"\nShelf life:        "+getShelf_life()+"\nAmount of protein: "+getAmount_of_protein()+"\nFatness:           "
                +getFatness()+"\nMassa:             "+mass+"\nGrain:             "+grain;
    }
}


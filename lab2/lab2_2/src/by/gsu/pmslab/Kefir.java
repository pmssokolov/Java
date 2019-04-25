package by.gsu.pmslab;

public class Kefir implements DairyProduct {

    private int volume;
    private int bifidobacteriums;
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

    public Kefir(){
    }

    public Kefir (String shelf_life, String amount_of_protein, String fatness, String name, int volume, int bifidobacteriums){
        this.shelf_life = shelf_life;
        this.amount_of_protein = amount_of_protein;
        this.fatness = fatness;
        this.name =name;
        this.volume = volume;
        this.bifidobacteriums = bifidobacteriums;
    }

    public Kefir (String shelf_life, String amount_of_protein, String fatness, String name, int volume){
        this.shelf_life = shelf_life;
        this.amount_of_protein = amount_of_protein;
        this.name =name;
        this.fatness = fatness;
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public int getBifidobacteriums() {
        return bifidobacteriums;
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
        return "Kefir:             "+getName()+"\nShelf life:        "+getShelf_life()+"\nAmount of protein: "+getAmount_of_protein()+"\nFatness:           "
                +getFatness()+"\nVolume:            "+volume+"\nBifidobacteriums:  "+bifidobacteriums;
    }
}


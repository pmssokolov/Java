package by.gsu.pmslab;

public class Yogurt extends DairyProduct {

    private String flavor_additive;
    private int volume;
    private String termination;
    private String str;

    public Yogurt(){
        super();
    }

    public Yogurt(String shelf_life, String amount_of_protein, String fatness, String name,
                  String flavor_additive, int volume, String termination){
        super(shelf_life, amount_of_protein, fatness, name);

        this.flavor_additive = flavor_additive;
        this.volume = volume;
        this.termination = termination;
    }

    public Yogurt(String shelf_life, String amount_of_protein, String name,
                  String flavor_additive, int volume, String termination){
        super(shelf_life, amount_of_protein, name);

        this.flavor_additive = flavor_additive;
        this.volume = volume;
        this.termination = termination;
    }

    public Yogurt (Yogurt ob){
        super(ob);
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

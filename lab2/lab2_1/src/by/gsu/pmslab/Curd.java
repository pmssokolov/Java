package by.gsu.pmslab;

public class Curd extends DairyProduct {

    private int mass;
    private String grain;
    private String str;

    public Curd(){
        super();
    }

    public Curd (String shelf_life, String amount_of_protein, String fatness,String name, int mass, String grain){
        super(shelf_life , amount_of_protein , fatness, name);

        this.mass = mass;
        this.grain = grain;
    }

    public Curd (String shelf_life, String amount_of_protein,String name, String fatness, int mass){
        super(shelf_life , amount_of_protein , fatness, name);

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
        return "Curd:              "+getName()+"\nShelf life:        "+getShelf_life()+"\nAmount of protein: "+getAmount_of_protein()+"\nFatness:           "
                +getFatness()+"\nMassa:             "+mass+"\nGrain:             "+grain;
    }
}

package by.gsu.pmslab;

public class Kefir extends DairyProduct {

    private int volume;
    private int bifidobacteriums;
    private String str;

    public Kefir(){
        super();
    }

    public Kefir (String shelf_life, String amount_of_protein, String fatness, String name, int volume, int bifidobacteriums){
        super(shelf_life , amount_of_protein , fatness, name);

        this.volume = volume;
        this.bifidobacteriums = bifidobacteriums;
    }

    public Kefir (String shelf_life, String amount_of_protein, String fatness, String name, int volume){
        super(shelf_life , amount_of_protein , fatness, name);

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
        return "Kefir:             "+getName()+"\nShelf life:        "+getShelf_life()+"\nAmount of protein: "+getAmount_of_protein()+"\nFatness:           "
                +getFatness()+"\nVolume:            "+volume+"\nBifidobacteriums:  "+bifidobacteriums;
    }
}

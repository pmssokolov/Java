package by.gsu.pmslab;

public class DairyProduct {

    private String shelf_life;
    private String amount_of_protein;
    private String fatness;
    private String name;

    public DairyProduct(){
    }

    public DairyProduct(String shelf_life, String amount_of_protein, String fatness, String name){
        this.shelf_life = shelf_life;
        this.amount_of_protein = amount_of_protein;
        this.fatness = fatness;
        this.name = name;
    }

    public DairyProduct(String shelf_life, String amount_of_protein, String name){
        this.shelf_life = shelf_life;
        this.amount_of_protein = amount_of_protein;
        this.name = name;
    }

    public DairyProduct (DairyProduct ob){
        shelf_life = ob.shelf_life;
        amount_of_protein = ob.amount_of_protein;
        fatness = ob.fatness;
        name = ob.name;
    }

    public String getName(){
        return name;
    }

    public String getShelf_life() {
        return shelf_life;
    }

    public String getAmount_of_protein() {
        return amount_of_protein;
    }

    public String getFatness() {
        return fatness;
    }

    public String Manufacturer(){
        System.out.print("This method need redefine");
        return "";
    }


}

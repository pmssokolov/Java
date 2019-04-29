package by.gsu.pmslab;


import java.util.Scanner;

public class CommodityPurchase {

    private String commodity_name;
    private int price;
    private int number_purchased;

    CommodityPurchase(){}

    public CommodityPurchase(CommodityPurchase ob){
        commodity_name = ob.commodity_name;
        price = ob.price;
    }

    public CommodityPurchase(String commodity_name, int price, int number_purchased) {
        this.commodity_name = commodity_name;
        this.price = price;
        this.number_purchased = number_purchased;
    }

    public CommodityPurchase(Scanner sc){
        this(sc.next(), sc.nextInt(), sc.nextInt());
    }

    public String getCommodity_name() {
        return commodity_name;
    }

    public void setCommodity_name(String commodity_name) {
        this.commodity_name = commodity_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber_purchased() {
        return number_purchased;
    }

    public void setNumber_purchased(int number_purchased) {
        this.number_purchased = number_purchased;
    }

    public double getCost(){
        return price * number_purchased;
    }

    public String toString(){
        return commodity_name + ";" + Converter.convert(price,100,2) + ";" + number_purchased + ";" + Converter.convert(getCost(),100,2);
    }

    public boolean equals(CommodityPurchase ob){
        boolean flag;
        if (ob.commodity_name.equals(commodity_name) && ob.price == price)
            flag = true;
        else
            flag = false;
        return flag;
    }

}

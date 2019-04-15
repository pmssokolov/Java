package by.gsu.pmslab;

import java.util.Scanner;

public class DiscountPurchase extends CommodityPurchase {

    private int discount;

    public DiscountPurchase(){
        super();
    }

    public DiscountPurchase(DiscountPurchase ob){
        super(ob);
    }

    public DiscountPurchase(String commodity_name, int price, int number_purchased, int discount) {
        super(commodity_name, price, number_purchased);
        this.discount = discount;
    }

   public DiscountPurchase(Scanner sc){
        super(sc.next(), sc.nextInt(), sc.nextInt());
        this.discount = sc.nextInt();
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getCost(){
        return (getPrice() - discount) * getNumber_purchased();
    }

    public String toString(){
        return super.toString() +";" + Converter.convert(discount,100,2);
    }
}

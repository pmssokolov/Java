package by.gsu.pmslab;

import java.util.Scanner;

public class PercentPurchase extends CommodityPurchase {

    private double percent;
    private final int NUMBER_PRODUCT = 8;
    private double result;

    public PercentPurchase(){
        super();
    }

    public PercentPurchase(PercentPurchase ob){
        super(ob);
    }

    public PercentPurchase(String commodity_name, int price, int number_purchased, double percent) {
        super(commodity_name, price, number_purchased);
        this.percent = percent;
    }

    public PercentPurchase(Scanner sc){
        super(sc.next(), sc.nextInt(), sc.nextInt());
        this.percent = sc.nextDouble();
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }


    public double getCost(){
        if (getNumber_purchased() >= NUMBER_PRODUCT)
            result = Math.round((getPrice() * NUMBER_PRODUCT * (1 - percent/100)) * 100)/100;
        else
            result = getPrice() * getNumber_purchased();
        return result;
    }

    public String toString(){
        return super.toString() + ";" + percent + ";" + NUMBER_PRODUCT;
    }
}

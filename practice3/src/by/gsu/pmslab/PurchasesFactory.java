package by.gsu.pmslab;

import java.util.Scanner;
import java.lang.String;

public class PurchasesFactory {

    private enum PurchasesKinds{
        GENERAL_PURCHASE,DISCOUNT_PURCHASE,PERCENT_PURCHASE
    }
    public CommodityPurchase getClassFromFactory(Scanner sc) {

        String id = sc.next();


        PurchasesKinds kind = PurchasesKinds.valueOf(id);

        switch (kind) {

            case GENERAL_PURCHASE:
                return new CommodityPurchase(sc);
            case DISCOUNT_PURCHASE:
                return new DiscountPurchase(sc);
            case PERCENT_PURCHASE:
                return new PercentPurchase(sc);
                default:
                    throw new IllegalArgumentException("Error!");
        }
    }
}

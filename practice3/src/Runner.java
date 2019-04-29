import by.gsu.pmslab.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        PurchasesFactory factory = new PurchasesFactory();
        Scanner sc = null;

        try{
            sc = new Scanner(new FileReader("src/in.txt"));
            CommodityPurchase [] purchases = new CommodityPurchase[6];
            double maxCost = 0;
            int index_i = 0;
            int index_j = 0;
            for(int i = 0; i < purchases.length; i++) {
                purchases[i] = factory.getClassFromFactory(sc);
                System.out.println(purchases[i]);
                CommodityPurchase ob = new CommodityPurchase(purchases[i]);
                if (purchases[i].getCost() > maxCost)
                    maxCost = purchases[i].getCost();

                for (int j = 0; j <= i; j++)
                    if( i != j && ob.equals(purchases[j]) == true) {
                        index_i = i;
                        index_j = j;
                        //System.out.println(index_j +" = "+ index_i);
                    }
            }

            System.out.println("Max cost = " + Converter.convert(maxCost,100,2));

        } catch (FileNotFoundException e){
            System.err.println("File not founded");
        }finally{
            if(sc != null)
                sc.close();
        }
    }

}

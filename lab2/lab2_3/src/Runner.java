import by.gsu.pmslab.*;
import by.gsu.pmslab.yogurts.DrinkingYogurt;
import by.gsu.pmslab.yogurts.PlainYogurt;

public class Runner {
    public static void main(String[] args) throws java.io.IOException  {
        DairyProduct[] products = {
                new DrinkingYogurt("11.01.2019", "13%","12%",
                        "BrestLitovsk", "yes", 200,"0 - 5*"),
                new PlainYogurt("11.01.2019", "32%","defatted",
                        "Savushkin product", "yes", 200,"0 - 6*"),
                new Curd("11.02.2019","40%", "7%",
                        "Savushkin product",200,"non-granular"),
                new Kefir("23.03.2019","3%","7%","Prostokvashino",900,1350)
        };
        ListProduct ob = new ListProduct();
       ob.printInfo(products);
    }

}

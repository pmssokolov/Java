package by.gsu.pmslab;


public class ListProduct  {

    DairyProduct[] product;
    private char choice, ignore;

    public void Products(DairyProduct[] ob) throws java.io.IOException {

        product = ob;

            for (; ; ) {

                do {
                    System.out.println("\nProduct show");
                    System.out.println("\tChoice \n1-Yogurt\n2-Curd\n3-Kefir\nq-Exit");

                    choice = (char) System.in.read();

                    do {
                        ignore = (char) System.in.read();
                    } while (ignore != '\n');
                } while (choice < '1' | choice > '3' & choice != 'q');

                if (choice == 'q') break;

                System.out.println("\n");

                switch (choice) {
                    case '1':
                        for (DairyProduct i : ob) {
                            if (i.getClass() == Yogurt.class) {
                                System.out.println(i);
                                System.out.println("Manufacturer:      "+i.Manufacturer());
                                System.out.println();
                            }
                        }
                        break;
                    case '2':
                        for (DairyProduct i : ob) {
                            if (i.getClass() == Curd.class) {
                                System.out.println(i);
                                System.out.println("Manufacturer:      "+i.Manufacturer());
                                System.out.println();
                            }
                        }
                        break;
                    case '3':
                        for (DairyProduct i : ob) {
                            if (i.getClass() == Kefir.class) {
                                System.out.println(i);
                                System.out.println("Manufacturer:      "+i.Manufacturer());
                                System.out.println();
                            }
                        }
                        break;
                    default:
                        System.out.println("Error");
                }
            }

    }

}

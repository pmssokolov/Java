import by.gsu.pmslab.BusinessTrip;
import by.gsu.pmslab.Converter;

public class Runner {
    public static void main(String[] args) {
        BusinessTrip [] businessTrips = {
                new BusinessTrip("Sokolov Evgeniy", 2450 , 7),
                new BusinessTrip("Leonov Daneel", 2592, 9),
                new BusinessTrip(null,0,0),
                new BusinessTrip("Glushak Egor",7451,21),
                new BusinessTrip("Vlaznuk Ivan",2415,7),
                new BusinessTrip("Kurkai Alexandr", 5660,17),
                new BusinessTrip()
        };

        for(BusinessTrip item : businessTrips){
            item.show();
            System.out.println();
        }

        businessTrips[6].setTransport(1000);

        System.out.println("Duration = "+ (businessTrips[0].getDays()+businessTrips[1].getDays()));
        System.out.println();

        for (BusinessTrip item : businessTrips) {
            System.out.println(item);
            System.out.println();
        }

        int total_sum = 0;
        for(BusinessTrip item : businessTrips){
            total_sum += item.getTotal();
        }
        System.out.println("Total expenses = "+Converter.convert(total_sum,100,2));

        BusinessTrip max_total = businessTrips[0];
        for(BusinessTrip item : businessTrips){
            if(item.getTotal() > max_total.getTotal())
                max_total = item;
        }
        System.out.println("Account with the max total = " + max_total.getAccount());



    }
}

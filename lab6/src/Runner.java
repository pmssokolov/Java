import by.gsu.pmslab.Bus;

import java.io.*;
import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Bus> buses = new ArrayList<>(0);
        ArrayList<Bus> busesOfRoute = new ArrayList<>();
        ArrayList<Bus> busesOfMore = new ArrayList<>();
        ArrayList<Bus> busesMileage = new ArrayList<>();
        final int BUSES_COUNT = 10;
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("buses.txt"))) {

            for (int i = 0; i < BUSES_COUNT; i++){
                oos.writeObject(new Bus(1,"Wetrov V.V.", "2342 AI-3", "25a", 2008, 12000));
                oos.writeObject(new Bus(2,"Smirnov A.G.", "1777 EB-7","25",2000, 123467));
                oos.writeObject(new Bus(3,"Domenik A.A.","6609 AI-3","11",2003,199902));
                oos.writeObject(new Bus(4,"Leonov D.V.","3208 YU-4","6",2018,1230));
                oos.writeObject(new Bus(5,"Sokolov E.S.","1956 OO-3","21",2006,87066));
                oos.writeObject(new Bus(6,"Petrov V.U.", "2552 AI-6", "25b", 2006, 12999));
                oos.writeObject(new Bus(7,"Smirnova A.T.", "8477 EB-1","33",1999, 153467));
                oos.writeObject(new Bus(8,"Moxorev A.A.","0000 OO-7","1",2019,2300));
                oos.writeObject(new Bus(9,"Vlaznuk I.V.","3285 YU-2","7a",2017,9927));
                oos.writeObject(new Bus(10,"Sokolov S.S.","1957 OO-1","2",2002,187066));
            }

            System.out.println("File has been written to file");
            System.out.println("--------------------------");

        } catch (IOException exc){
            System.err.println("I/O error");
            exc.printStackTrace();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("buses.txt"))){

            for (int i = 0; i < BUSES_COUNT; i++){
                buses.add(new Bus());
                buses.set(i,((Bus) ois.readObject()));
            }

            System.out.println("File has been read from file");
            System.out.println("--------------------------");

        } catch (IOException | ClassNotFoundException exc) {
            System.err.println("I/O error");
            exc.printStackTrace();
        }

        Collections.sort(buses);

        for (Bus item : buses){
            System.out.println(item);
        }

        System.out.println("Enter number of route: ");
        String numberOfRoute = sc.next();
        for (Bus item : buses){
            if (item.getRouteNumber().equals(numberOfRoute))
                busesOfRoute.add(item);
        }
        System.out.println("Enter  operation period: ");
        int operationPeriod = sc.nextInt();
        for (Bus item :  buses){
            if ((2019 - item.getYearStart()) <= operationPeriod)
                busesOfMore.add(item);
        }
        System.out.println("Enter mileage: ");
        int mileage = sc.nextInt();
        for (Bus item : buses){
            if (item.getMileage() > mileage)
                busesMileage.add(item);
        }

        sc.close();


        try (FileWriter info = new FileWriter("info.txt")){
            info.write("Start info:\n");
            for (Bus item : buses){
                info.write(item.toString().concat("\n"));
            }

            info.write("\n");

            info.write("Buses of route:\n");
            for (Bus item : busesOfRoute){
                info.write(item.toString().concat("\n"));
            }

            info.write("\n");

            info.write("Buses of operation period:\n");
            for (Bus item : busesOfMore){
                info.write(item.toString().concat("\n"));
            }

            info.write("\n");

            info.write("Buses of mileage:\n");
            for (Bus item : busesMileage){
                info.write(item.toString().concat("\n"));
            }

            System.out.println("--------------------------");
            System.out.println("File has been written to .txt file");
            System.out.println("--------------------------");


        } catch (IOException exc) {
            System.err.println("I/O error");
            exc.printStackTrace();
        }

    }
}

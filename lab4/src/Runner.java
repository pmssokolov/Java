import by.gsu.pmslab.Person;
import java.io.*;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        final int NUMBER_OF_PERSONS = 5;
        Person [] persons = new Person[NUMBER_OF_PERSONS];

        Scanner sc = new Scanner(System.in);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persons.txt"))){

            for (int i = 0; i < NUMBER_OF_PERSONS; i++){
                System.out.println("Write info about new person: ");
                System.out.println("---------------------");
                Person person = new Person();
                System.out.println("Last name: ");
                person.setLast_name(sc.next());
                System.out.println("Age: ");
                person.setAge(sc.nextInt());
                System.out.println("Sex: ");
                person.setSex(sc.next());
                System.out.println("---------------------");
                oos.writeObject(person);
                System.out.println("Info has been written");
                System.out.println("---------------------");


            }
            sc.close();


        } catch (Exception exc){
            exc.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persons.txt"))){
            for (int i = 0; i < NUMBER_OF_PERSONS; i++){
                persons[i] = (Person) ois.readObject();
            }

        } catch (Exception exc) {
            exc.printStackTrace();
        }

        for (Person item : persons){
            System.out.println(item.toString());
        }

        float avg_age = 0;
        for (Person item : persons){
            avg_age += item.getAge();
        }
        System.out.println("\nAverage age: " + avg_age/persons.length);
        int man_count = 0;
        for (Person item : persons){
            if(item.getSex().equals("man")){
                man_count++;
            }
        }
        System.out.println("\nNumber of men: " + man_count);
    }
}

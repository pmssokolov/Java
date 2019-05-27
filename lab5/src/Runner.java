import by.gsu.pmslab.Person;
import exceptions.AgeException;
import exceptions.LastNameException;
import exceptions.SexException;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        final int NUMBER_OF_PERSONS = 2;
        Person [] persons = new Person[NUMBER_OF_PERSONS];

        Scanner sc = new Scanner(System.in);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persons.txt"))){

            for (int i = 0; i < NUMBER_OF_PERSONS; i++){
                Person person = new Person();
                try {
                    System.out.println("Write info about new person: ");
                    System.out.println("---------------------");
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
                } catch (InputMismatchException exc) {
                    System.err.println("Wrong type of info person's info");
                    exc.printStackTrace();
                }
                try {
                    if (person.getAge() < 0 || person.getAge() > 120)
                        throw new AgeException();

                    if (person.getLast_name().charAt(0) < 65 || person.getLast_name().charAt(0) > 90)
                        throw new LastNameException();

                    if (!person.getSex().equals("man") && !person.getSex().equals("wooman"))
                        throw new SexException();
                } catch (AgeException exc) {
                    System.err.println("Incorrect age");
                    exc.printStackTrace();
                }
                catch (LastNameException exc) {
                    System.err.println("Incorrect Last name");
                    exc.printStackTrace();
                }
                catch (SexException exc) {
                    System.err.println("Incorrect sex");
                    exc.printStackTrace();
                }
            }
            sc.close();


        } catch (IOException exc){
            System.err.println("I/O error output");
            exc.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persons.txt"))){
            for (int i = 0; i < NUMBER_OF_PERSONS; i++){
                persons[i] = (Person) ois.readObject();
            }

        } catch (IOException | ClassNotFoundException exc){
            System.err.println("I/O error input");
            exc.printStackTrace();
        }

        for (Person item : persons){
            System.out.println(item.toString());
        }

        float avg_age = 0;
        for (Person item : persons){
            if (item.getAge() > 0 && item.getAge() <= 120)
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

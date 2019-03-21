import by.gsu.pmslab.Person;
import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Person [] persons = {
                new Person("Sokolov",21,"man"),
                new Person("Leonov",20,"man"),
                new Person("Vlaznuk",19,"man"),
                new Person("Nevzorova",19,"wooman"),
                new Person("Glushak",20,"man"),
                new Person("Noris",39,"wooman"),
                new Person("Kurkai",20,"man"),
                new Person("Arakeliyn",22,"man"),
                new Person("Bondarenko",19,"man"),
                new Person("Bondarenko",18,"wooman")
        };

        System.out.println("\tInit arry");
        for (Person item : persons){
            System.out.println(item);
        }
        //Сортировка массива в порядке возрастания(число)
        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2){
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println("\tSort by age:");
        for (Person item : persons){
            System.out.println(item);
        }
        //Сортирока по алфавиту
        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLast_name().compareTo(o2.getLast_name());
            }
        });
        System.out.println("\tSort by last name:");
        for (Person item : persons){
            System.out.println(item);
        }

        float avg_age = 0;
        for (Person item : persons){
            avg_age += item.getAge();
        }
        System.out.println("\nAverage age: "+avg_age/persons.length);
        int man_count = 0;
        for (Person item : persons){
            if(item.getSex() == "man"){
                man_count++;
            }
        }
        System.out.println("\nNumber of men: "+man_count);

        }
}

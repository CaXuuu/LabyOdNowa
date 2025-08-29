import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

Person person = new Person();
Person person2 = new Person();
List<Person> persons = new ArrayList<Person>();
persons.add(person);
persons.add(person2);
persons.stream()
        .forEach(System.out::println);
System.out.println(persons);


    }
}
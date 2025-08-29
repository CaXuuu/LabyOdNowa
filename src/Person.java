import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Person {
    private String name;
    private String surname;
    private LocalDate birthDate;
    private Set<Person> children;

    public Person(String name, String surname, LocalDate birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.children =  new HashSet<>();
    }



    public boolean adopt(Person child ){
return this.children.add(child);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", children=" + children +
                '}';
    }
    public Person getYoungestChild(){
        if(children.isEmpty()) return null;
        Person youngest = (Person) children.toArray()[0];
        for(Person child : children){
            if(youngest.birthDate.compareTo(child.birthDate) < 0) youngest = child;
        }
        return youngest;
    }
}

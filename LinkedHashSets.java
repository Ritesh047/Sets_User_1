import java.util.LinkedHashSet;
import java.util.Iterator;
  // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop
  class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}


public class LinkedHashSets {
    public static void main(String[] args) {
        
        LinkedHashSet<Person> p1 = new LinkedHashSet<>();
        p1.add(new Person("Ritesh", 22));
        p1.add(new Person("Niranjan", 19));

        System.out.println(p1);

        Iterator<Person> i = p1.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
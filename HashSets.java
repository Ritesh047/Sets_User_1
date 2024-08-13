import java.util.HashSet;
import java.util.Iterator;
// Prepare Hashset object here and add person class objects in them iterate it by using for each
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
        public String getname(){
            return this.name;
        }
        public int getage(){
            return this.age;

        }
        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }
        public class HashSets {
            public static void main(String[] args) {
                HashSet<Person> personSet = new HashSet<>();

                personSet.add(new Person("Ritesh", 22));
                personSet.add(new Person("Gopal", 23));
    // for loop
                for (Person person : personSet) {
                    System.out.println(person);
                }
            }
}}

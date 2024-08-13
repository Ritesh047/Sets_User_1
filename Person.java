import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private double salary;
    private String desg;

    public Person(String name, int age, double salary, String desg) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.desg = desg;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getDesg() {
        return desg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDesg(String desg) {
        this.desg = desg;
    }

    // toString method
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", desg='" + desg + '\'' +
                '}';
    }

    // Override equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Double.compare(person.salary, salary) == 0 &&
                Objects.equals(name, person.name) &&
                Objects.equals(desg, person.desg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary, desg);
    }

    
    public static void main(String[] args) {
        // Create Person objects
        Person p1 = new Person("Ritesh", 22, 60000, "Developer");
        Person p2 = new Person("Balu", 25, 55000, "Designer");

        System.out.println(p1);
        System.out.println(p2);

        Person p3 = new Person("Ritesh", 22, 60000, "Developer");
        System.out.println("p1 equals p3: " + p1.equals(p3)); 

        p2.setDesg("Senior Designer");
        System.out.println("Updated p2: " + p2);
    }
}

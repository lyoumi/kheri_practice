import java.util.Random;

public class Customer {

    private static Random RANDOM = new Random();

    public Customer(String name, int salary) {
        this.id = String.valueOf(RANDOM.nextInt(1000));
        this.name = name;
        this.salary = salary;
    }

    private String id;
    private String name;
    private int salary;

    public int getSalary() {
        return salary;
    }

    public int hashCode() {
        return 73;
    }

    public String toString() {
        return "[Customer: " + name + "; salary: " + salary + "]";
    }
}

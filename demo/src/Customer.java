public class Customer {

    public Customer(String name, int salary) {
        this.id = "42";
        this.name = name;
        this.salary = salary;
    }

    private String id;
    private String name;
    private int salary;

    public int getSalary() {
        return salary;
    }

    public String toString() {
        return "[Customer: " + name + "; salary: " + salary + "]";
    }
}

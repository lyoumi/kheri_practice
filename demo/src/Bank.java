public class Bank {

    public Bank(String id, String name, Long minSalary) {
        this.id = id;
        this.name = name;
        this.minSalary = minSalary;
    }

    private String id;
    private String name;
    private Long minSalary;

    public String getName() {
        return name;
    }

    public Long getMinSalary() {
        return minSalary;
    }
}

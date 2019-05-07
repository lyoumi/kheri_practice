import java.util.Scanner;

public class BankDepartment {

    public static void main(String[] args) {
        Bank bank = new Bank("1", "Braavos bank");
        System.out.println(bank.name);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter your name");
        String name = scanner.nextLine();
        System.out.println("Please, enter your salary");
        int salary = scanner.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);

        Customer customer = new Customer(name, salary);
        System.out.println(customer);

        if (customer.getSalary() < 3200) {
            System.out.println("Get out from here`");
        }
    }
}

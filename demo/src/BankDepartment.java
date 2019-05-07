import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class BankDepartment {

    public static void main(String[] args) {
        Bank bank = new Bank("1", "Braavos bank", 300l);
        System.out.println(bank.getName());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter count of customers... ");
        int count = scanner.nextInt();
        Set<Customer> customers = new HashSet<>();

        for (int i = 0; i < count; i++) {
            System.out.println("Please, enter your name");
            String name = scanner.next();
            System.out.println("Please, enter your salary");
            int salary = scanner.nextInt();

            System.out.println("Name: " + name);
            System.out.println("Salary: " + salary);

            customers.add(new Customer(name, salary));
        }

        System.out.println("--------------------");

        for (Customer customer : customers) {
            System.out.println(customer);
        }

        for (Customer customer : customers) {
            if (customer.getSalary() < bank.getMinSalary()) {
                customers.remove(customer);
            }
        }

        System.out.println("--------------------");

        for (Customer customer : customers) {
            System.out.println(customer);
        }

    }
}

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Benjamin","Hernandez","Ben1");
        Customer customer2 = new Customer("Marcos","Lemus","Marc1");
        Customer customer3 = new Customer("Natalia","Lemus","Nat1");


        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        printCustomers(customers);

    }

    public static void printCustomers(ArrayList<Customer> customers){

        for(Customer c: customers) {
            System.out.println(c);
        }

    }


}
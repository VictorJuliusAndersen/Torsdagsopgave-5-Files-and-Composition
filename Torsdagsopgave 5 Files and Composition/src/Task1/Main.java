package Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Customer v = new Customer("Victor","Andersen","Victor.1128");
        Customer s = new Customer("Sofus", "Larsen", "SofusLA");
        Customer f = new Customer("Flemming", "Flash","Flemmingo");

        
        ArrayList<Customer>customers = new ArrayList<>();

        customers.add(v);
        customers.add(s);
        customers.add(f);

       printCustomers(customers);

    }
    public static void printCustomers(ArrayList customers){
        for(Object i : customers){
            System.out.println(i);
        }
    }

}
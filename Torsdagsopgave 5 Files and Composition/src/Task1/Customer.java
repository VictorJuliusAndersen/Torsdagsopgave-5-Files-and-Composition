package Task1;

public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter;

    public Customer(String firstName, String lastName, String username){
        this.firstName = firstName;
        this.username = username;
        this.lastName = lastName;
        this.id = counter;
        counter++;
    }

    public String toString(){
        return " Name: " + this.firstName + " " + this.lastName + " Username: " + this.username;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void setCounter(int counter) {
        Customer.counter = counter;
    }
}

public class Customer {

    private String name;
    private double creditBalance;
    private String email;

    public String getName() {
        return name;
    }

    public double getCreditBalance() {
        return creditBalance;
    }

    public String getEmail() {
        return email;
    }

    public Customer() {
        this("ABC","example@email.com");
    }

    public Customer(String name, double creditBalance, String email) {
        this.name = name;
        this.creditBalance = creditBalance;
        this.email = email;
    }

    public Customer(String name, String email) {
        this(name,50, email);
        this.name = name;
        this.email = email;
    }
}

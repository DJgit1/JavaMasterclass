public class Main {

    public static void main(String[] args) {

        Customer customer1 = new Customer("DJ",1000,"Dj@email.com");
        System.out.println("Name : " + customer1.getName());
        System.out.println("Credit Balance : " + customer1.getCreditBalance());
        System.out.println("Email Address :" + customer1.getEmail());

        Customer customer2 = new Customer();
        System.out.println("Name : " + customer2.getName());
        System.out.println("Credit Balance : " + customer2.getCreditBalance());
        System.out.println("Email Address :" + customer2.getEmail());

        Customer customer3 = new Customer("AJ","Aj@email.com");
        System.out.println("Name : " + customer3.getName());
        System.out.println("Credit Balance : " + customer3.getCreditBalance());
        System.out.println("Email Address :" + customer3.getEmail());
    } 
}

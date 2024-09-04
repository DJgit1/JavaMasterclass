import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int counter = 1;
       do{
           System.out.println("Enter number #" + counter) ;
           String nextNumber = scanner.nextLine();
           try {
//               int number = Integer.parseInt(nextNumber);
               double number = Double.parseDouble(nextNumber);
               counter++;
               sum += number;
           }catch (NumberFormatException nfe){
               System.out.println("Invalid number");
           }

       }while(counter<=5);

        System.out.println("Sum of 5 integers is " + sum);

    }
}

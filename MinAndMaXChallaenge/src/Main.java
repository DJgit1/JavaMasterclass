import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double minNumber = Double.MAX_VALUE;
        double maxNumber = Double.MIN_VALUE;
        boolean isDouble = false;

        do {
            System.out.println("Enter a number or any character to quit :");
            String number = scanner.nextLine();
            try {
                double entry = Double.parseDouble(number);
                isDouble = true;
                if (entry < minNumber) {
                    minNumber = entry;
                }
                if (entry > maxNumber) {
                    maxNumber = entry;
                }
            } catch (NumberFormatException e) {
                System.out.println("Maximum number is " + maxNumber + " & Minimum number is " + minNumber);
                isDouble = false;
            }
        } while(isDouble) ;
    }
}
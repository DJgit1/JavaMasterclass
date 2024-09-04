public class Main {

    public static void main(String[] args) {

        int number = 584;
        System.out.println("Sum of digits of " + number + " is " + sumDigits(number));

        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));
    }

    public static int sumDigits(int number){

        if (number<0){
            return -1;
        }

        if (number<=9){
            return number;
        }

        int sumOfDigits = 0;

        while(number!=0){
           sumOfDigits += number%10;
           number /= 10;
        }
        return sumOfDigits;
    }
}

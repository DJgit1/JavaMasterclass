public class Main {

    public static void main(String[] args) {

        int numberOfEvenNumbers = 0 ;
        int numberOfOddNumbers = 0;
        int number = 5;

        while (number<=20){

            if (isEvenNumber(number)){
                System.out.println(number);
                numberOfEvenNumbers++;
                if (numberOfEvenNumbers==5){
                    System.out.println("Number of Even Numbers = " + numberOfEvenNumbers);
                    System.out.println("Number of Odd Numbers = " + numberOfOddNumbers);
                    break;
                }
            }

            if (!isEvenNumber(number)){
                numberOfOddNumbers++;
            }

            number++;
        }
    }

    public static boolean isEvenNumber(int number){
        return (number%2==0)?true:false;
    }
}

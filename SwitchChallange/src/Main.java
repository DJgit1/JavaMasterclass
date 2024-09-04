public class Main {

    public static void main(String[] args) {


        char inputLetter = 'B';

         inputLetter = 'C';
        inputLetter = 'F';


        switch (inputLetter){
            case 'A' :
                System.out.println( inputLetter + " = Able");
                break;
            case 'B' :
                System.out.println( inputLetter + " = Baker");
                break;
            case 'C' :
                System.out.println( inputLetter + " = Charlie");
                break;
            case 'D' :
                System.out.println( inputLetter + " = Dog");
                break;
            case 'E' :
                System.out.println( inputLetter + " = Easy");
                break;
            default:
                System.out.println(inputLetter + ". This letter is not found.");
        }


    }
}

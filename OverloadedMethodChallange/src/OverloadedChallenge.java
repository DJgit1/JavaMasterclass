public class OverloadedChallenge {

    public static void main(String[] args) {

        System.out.println("Length in centimeters is " + convertToCentimeters(45));
        System.out.println("Length in centimeters is " + convertToCentimeters(9,5));

    }

    public static double convertToCentimeters (int inches){

        return inches * 2.54;
    }

    public static double convertToCentimeters (int inches, int feet){

        return convertToCentimeters((feet * 12 + inches));
    }
}

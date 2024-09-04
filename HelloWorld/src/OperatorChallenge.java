public class OperatorChallenge {
    public static void main(String[] args) {
        double one = 20.00;
        double two = 80.00;
        double three = one + two * 100.00;
        double four = three%40.00;
        boolean isDivisible = false;
        if (four==0.00){
            isDivisible = true;
        }

        System.out.println(isDivisible);

        if (!isDivisible){
            System.out.println("Got some remainder = " + four);
        }
    }
}

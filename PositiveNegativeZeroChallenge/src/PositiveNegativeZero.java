public class PositiveNegativeZero {

    public static void main(String[] args) {
        checkNumber(9);
    }

    public static void checkNumber(int parameter){
        if (parameter>0){
            System.out.println("positive");
        } else if (parameter<0) {
            System.out.println("negative");
        } else if (parameter==0) {
            System.out.println("zero");
        }
    }
}

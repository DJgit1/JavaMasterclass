public class Hello {
    public static void main (String[] args){
        System.out.println("Hello, Dhananjay");
        boolean isAlien = false;
        if (isAlien==false)
            System.out.println("It is not an alien!");


        int topScore = 100;
        if (topScore<100){
            System.out.println("You got the highest score!");
        }

        int secondTopScore = 60;
        if (topScore>secondTopScore && topScore<100){
            System.out.println("Greater than second top score and less than 100");
        }

        int newValue = 50;
        if (newValue==50){
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if (isCar=true){
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false:true;

        if (isDomestic){
            System.out.println("This car is domestic to our country");
        }String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

        System.out.println(s);
    }
}
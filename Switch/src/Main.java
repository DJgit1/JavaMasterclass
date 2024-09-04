public class Main {

    public static void main(String[] args) {

//        int value = 1;
//        if (value==1){
//            System.out.println("Value was 1");
//        } else if (value==2) {
//            System.out.println("Value was 2");
//        }else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 1;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }

        String month ="April";
        System.out.println(month +" is in the " + getQuarter(month) + " quarter");
    }

    public static String getQuarter(String month){
        return switch (month) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> "bad";
        };
    }
}

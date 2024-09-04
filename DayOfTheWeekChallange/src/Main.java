public class Main {

    public static void main(String[] args) {

        System.out.println(printDayOfWeek(0));
        System.out.println(printDayOfWeek(1));
        System.out.println(printDayOfWeek(2));
        System.out.println(printDayOfWeek(3));
        System.out.println(printDayOfWeek(4));
        System.out.println(printDayOfWeek(5));
        System.out.println(printDayOfWeek(6));
        System.out.println(printDayOfWeek(7));

        System.out.println(printWeekDay(1));
        System.out.println(printWeekDay(2));
        System.out.println(printWeekDay(3));
        System.out.println(printWeekDay(4));
        System.out.println(printWeekDay(5));
        System.out.println(printWeekDay(6));
        System.out.println(printWeekDay(7));



    }

    public static String printDayOfWeek(int day){

        return switch (day){
            case 0 -> "Day " + day + " of the week -> Sunday";
            case 1 -> "Day " + day + " of the week -> Monday";
            case 2 -> "Day " + day + " of the week -> Tuesday";
            case 3 -> "Day " + day + " of the week -> Wednesday";
            case 4 -> "Day " + day + " of the week -> Thursday";
            case 5 -> "Day " + day + " of the week -> Friday";
            case 6 -> "Day " + day + " of the week -> Saturday";
            default -> "Day " + day + " of the week -> Invalid Day";
        };
    }

    public static String printWeekDay(int day){

        String weekday = "";
        if (day==0){
            weekday = "Day " + day + " of the week -> Sunday";
        } else if (day==1) {
            weekday = "Day " + day + " of the week -> Monday";
        }else if (day==2) {
            weekday = "Day " + day + " of the week -> Tuesday";
        }else if (day==3) {
            weekday = "Day " + day + " of the week -> Wednesday";
        }else if (day==4) {
            weekday = "Day " + day + " of the week -> Thursday";
        }else if (day==5) {
            weekday = "Day " + day + " of the week -> Friday";
        }else if (day==6) {
            weekday = "Day " + day + " of the week -> Saturday";
        }else if (day==7) {
            weekday = "Day " + day + " of the week -> Invalid Day";
        }

        return weekday;
    }
}

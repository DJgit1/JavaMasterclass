public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(50,true);
        System.out.println("initial pages count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.pagesToBePrinted(5);
        System.out.printf("Current job pages: %d, Printer Total: %d %n", pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.pagesToBePrinted(5);
        System.out.printf("Current job pages: %d, Printer Total: %d %n", pagesPrinted, printer.getPagesPrinted());

    }

}

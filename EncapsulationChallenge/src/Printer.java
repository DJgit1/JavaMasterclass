public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        this.tonerLevel = tonerLevel;
        this.isDuplex = isDuplex;
    }

    public int addToner(int tonerAmount){
         tonerLevel = tonerLevel + tonerAmount;
         if (tonerLevel < 0 || tonerLevel > 100){
             return -1;
         }
         return tonerLevel;
    }

    public int pagesToBePrinted ( int pagesToPrint){
//        if (isDuplex){
//            System.out.println("It's a duplex printer");
//            pagesToPrint = pagesToPrint/2;
//        }
        pagesToPrint = (isDuplex) ? (pagesToPrint/2) + (pagesToPrint%2):pagesToPrint;
        pagesPrinted = pagesPrinted + pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}

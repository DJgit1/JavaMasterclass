public class Car{

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){

        System.out.println("Car -> startEngine");
    }

    public void drive(){

        System.out.println("Car -> Driving, type is " + getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine(){

        System.out.println("Car -> runEngine");
    }
}

class GasPoweredCar extends Car{

    private double avgKmPerLitre;
    private int cylinders = 6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> ALl %d cylinders are fired up, Ready!%n",cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n",avgKmPerLitre);
    }
}

class ElectricCar extends Car{

    private double avgKmPerCharge;
    private int batterySize = 6;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int cylinders) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> switch %d kWh battery on, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage under the average: %.2f %n", avgKmPerCharge);
    }
}

class HybridCar extends Car{

    private double avgKmPerLitre;
    private int cylinders = 6;

    private int batterySize;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLitre, int cylinders,int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> ALl %d cylinders are fired up, Ready!%n",cylinders);
        System.out.printf("Hybrid -> switch %d kWh battery on, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage below average: %.2f %n",avgKmPerLitre);
    }
}

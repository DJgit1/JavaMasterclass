public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("Maserati");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setColor("Black");
        car.setConvertible(true);
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("targa");
        targa.setDoors(2);
        targa.setColor("red");
        targa.setConvertible(false);

        targa.describeCar();
    }
}

public class Fish extends Animal{

    private int gills;
    private int fins;

    public Fish(String type, String size, double weight, int gills, int fins) {
        super(type, "size", weight);
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscles(){
        System.out.println("Muscles moving");
    }

    private void moveBackfin(){
        System.out.println("Move backfin");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if (speed=="fast"){
            moveBackfin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}

public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer tim = new EnhancedPlayer("Tim",200,"Sword");
        System.out.println("Initial health is = " + tim.healthRemaining());

        EnhancedPlayer dj = new EnhancedPlayer("DJ");
        System.out.println("Initial health is = " + dj.healthRemaining());

        tim.loseHealth(50);
        dj.loseHealth(45);

        System.out.println("Tim: " + tim.healthRemaining());
        System.out.println("DJ: " + dj.healthRemaining());

        tim.restoreHealth(25);
        dj.restoreHealth(35);

        System.out.println("Tim: " + tim.healthRemaining());
        System.out.println("DJ: " + dj.healthRemaining());

    }
}

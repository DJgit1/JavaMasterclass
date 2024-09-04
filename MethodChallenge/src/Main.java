public class Main {

    public static void main(String[] args) {

        displayHighScorePosition("DJ",calculateHighsScorePosition(1500));

        displayHighScorePosition("AJ",calculateHighsScorePosition(1000));

        displayHighScorePosition("BJ",calculateHighsScorePosition(500));

        displayHighScorePosition("CJ",calculateHighsScorePosition(100));

        displayHighScorePosition("EJ",calculateHighsScorePosition(25));
    }

    public static void displayHighScorePosition (String playerName, int playerPosition){
        System.out.println( playerName + " managed to get into position " + playerPosition + " on the high score list");
    }

    public static int calculateHighsScorePosition (int playerScore ){

        int position = 4;
        if (playerScore >= 1000){
           position =1;                                                         // return 1;
        } else if (500 <= playerScore) {                            //playerScore < 1000
            position =2;                                                            //return 2;
        } else if (100<=playerScore) {                              //playerScore<500
            position =3;                                                                //return 3;
        }                                                          //else {}
            return position;
    }
}

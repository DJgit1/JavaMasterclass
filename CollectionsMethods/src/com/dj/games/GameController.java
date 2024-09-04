package com.dj.games;

import com.dj.games.poker.PokerGame;

public class GameController {

    public static void main(String[] args) {

        PokerGame fiveCardDraw = new PokerGame(8,5);
        fiveCardDraw.startPlay();
    }
}

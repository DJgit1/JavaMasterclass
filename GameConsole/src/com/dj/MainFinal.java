package com.dj;

import com.dj.game.Game;
import com.dj.game.GameConsole;
import com.dj.game.Player;
import com.dj.pirate.PirateGame;

class SpecialGameConsole<T extends Game<? extends Player>>
extends GameConsole<Game<? extends  Player>> {
    public SpecialGameConsole(Game<? extends Player> game) {
        super(game);
    }
}
public class MainFinal {

    public static void main(String[] args) {

        SpecialGameConsole<PirateGame> game = new SpecialGameConsole<>(new PirateGame("Pirate Game"));
    }
}

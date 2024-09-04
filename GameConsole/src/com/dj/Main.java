package com.dj;

import com.dj.game.GameConsole;
import com.dj.pirate.PirateGame;

public class Main {

    public static void main(String[] args) {

//        var console = new GameConsole<>(new ShooterGame("The Shootout Game"));
//
//        int playerIndex = console.addPlayer();
//        console.playGame(playerIndex);

//        Weapon weapon = Weapon.getWeaponByChar('P');
//        System.out.println("weapon = " + weapon + ", hitPoints = " + weapon.getHitPoints() + ", minLevel = " + weapon.getMinLevel());
//
//        var list = Weapon.getWeaponsByLevel(1);
//        list.forEach(System.out::println);
//
//        Pirate dj = new Pirate("DJ");
//        System.out.println(dj);
//
//        PirateGame.getTowns(0).forEach(t -> System.out.println(t.information()));
//        System.out.println("------------------------------------------");
//        PirateGame.getTowns(1).forEach(t -> System.out.println(t.information()));



        var console = new GameConsole<>(new PirateGame("The Pirate Game"));
        int playerIndex = console.addPlayer();
        console.playGame(playerIndex);


    }
}

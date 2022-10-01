package com.chaitanya;

public class Main {
    public static void main(String[] args) {
        Player1 player1 = new Player1("SuperMan", "sword", 50);
        System.out.println("Welcome " + player1.getName());
        System.out.println("Choice of weapon is " + player1.getWeapon());
        System.out.println(player1.getName() + "'s health is " + player1.getHealth());

        player1.damagedByGunOne();
        player1.damagedByGunTwo();
        Player2 player2 = new Player2("WonderWoman", "Ring", 500, true);

        player2.damagedByGunOne();
        player2.damagedByGunTwo();
    }
}

package com.chaitanya;

public class Player1 {
    private String name;
    private String weapon;
    private int health;

    public Player1(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        this.health = health;
    }

    public void damagedByGunOne() {
        this.health -= 30;
        if (this.health <= 0) {
            this.health = 0;
        }
        System.out.println("Got hit by gun 1, Health is reduced by 30. New health is " + this.health);
        if (this.health <= 0) {
            System.out.println(getName() + " is Dead!");
        }
    }

    public void damagedByGunTwo() {
        this.health -= 50;
        if (this.health <= 0) {
            this.health = 0;
        }
        System.out.println("Got hit by gun 1, Health is reduced by 50. New health is " + this.health);
        if (this.health <= 0) {
            System.out.println("Player One Died!");
        }
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}

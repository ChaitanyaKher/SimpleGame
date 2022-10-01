package com.chaitanya;

public class Player2 extends Player1 {
    private boolean armour;

    public Player2(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
        this.armour = armour;
    }

    @Override
    public void damagedByGunOne() {
        if (armour) {
            this.setHealth(getHealth() - 20);
            if (getHealth() <= 0) {
                this.setHealth(0);
            }
            System.out.println("Armour is on. Got hit by gun 1.Health is reduced by 20. New health is " + getHealth());
        }
        if (!armour) {
            this.setHealth(getHealth() - 30);
            if (getHealth() <= 0) {
                this.setHealth(0);
            }
            System.out.println("Armour is on. Got hit by gun 1.Health is reduced by 30. New health is " + getHealth());
        }
    }

    @Override
    public void damagedByGunTwo() {
        if (armour) {
            this.setHealth(getHealth() - 40);
            if (getHealth() <= 0) {
                this.setHealth(0);
            }
            System.out.println("Armour is on. Got hit by gun 1.Health is reduced by 40. New health is " + getHealth());
        }
        if (!armour) {
            this.setHealth(getHealth() - 50);
            if (getHealth() <= 0) {
                this.setHealth(0);
            }
            System.out.println("Armour is on. Got hit by gun 1.Health is reduced by 50. New health is " + getHealth());
        }
    }
}

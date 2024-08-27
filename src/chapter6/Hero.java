package chapter6;

import java.util.Random;

public class Hero {

    private String name;
    private double hp;
    private double minimumDamage = 0;
    private double maximumDamage = 10;
    private double criticalDamage = 2;

    public Hero(String name, double hp){
        this.name = name;
        this.hp = hp;
    }

    public String getHeroName() {
        return name;
    }

    public double getHeroHp() {
        return hp;
    }

    public void setHeroHp(double hp) {
        this.hp = hp;
    }

    public double criticalHit() {
        return maximumDamage * criticalDamage;
    }

    public double calculateAttack() {
        Random random = new Random();
        return random.nextDouble(minimumDamage, maximumDamage);
    }

    public double calculateDamage(double damage) {
        return hp - damage;
    }
}

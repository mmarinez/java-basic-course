package chapter6;

import java.util.Random;

public class DemonKing {

    private String name = "Demon King";
    private double hp = 100;
    private double minimumDamage = 0;
    private double maximumDamage = 20;

    public double calculateAttack() {
        Random random = new Random();
        return random.nextDouble(minimumDamage, maximumDamage);
    }

    public double calculateDamage(double damage) {
        return hp - damage;
    }

    public double getDemonKingHp() {
        return hp;
    }

    public void setDemonKingHp(double hp) {
        this.hp = hp;
    }

    public String getDemonKingName() {
        return name;
    }
}

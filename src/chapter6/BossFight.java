package chapter6;

import java.util.Random;
import java.util.Scanner;

public class BossFight {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        var bossFight = new BossFight();
        var heroStats = bossFight.getHeroStats();

        System.out.println();

        var demonKing = new DemonKing();
        double demonKingHp = demonKing.getDemonKingHp();
        String demonKingName = demonKing.getDemonKingName();

        System.out.println("That will do for now. Prepare for your next attack!");

        bossFight.showBattleStatus(heroStats, demonKingName, demonKingHp);

        double heroBaseAttack = heroStats.calculateAttack();
        double heroCriticalHit = heroStats.criticalHit();
        double demonKingAttack = demonKing.calculateAttack();
        double heroHp = heroStats.getHeroHp();

        while (heroHp > 0 && demonKingHp > 0) {

            double heroAttackDamage = bossFight.heroTurn(heroBaseAttack, heroCriticalHit);

            System.out.format("Hero Attack: %.2f\n", heroAttackDamage);
            System.out.format("Demon King Attack: %.2f\n", demonKingAttack);

            demonKingHp -= heroAttackDamage;
            heroStats.setHeroHp(heroHp - demonKingAttack);
            heroHp = heroStats.getHeroHp();

            bossFight.showBattleStatus(heroStats, demonKingName, demonKingHp);

            if (demonKingHp < 0) {
                System.out.println("Hero have won! the world is safe!");
                System.out.println("Thanks for playing my game!");
            } else if (heroHp < 0) {
                System.out.println("The hero have fallen. An age of darkness has begun...");
                System.out.println("GAME OVER");
            }
        }
        bossFight.scanner.close();
    }

    public void showBattleStatus(Hero heroStats, String demonKingName, double demonKingHp) {
        System.out.format("%s\n", heroStats.getHeroName());
        System.out.format("HP: %.2f\n", heroStats.getHeroHp());

        System.out.println();

        System.out.format("%s\n", demonKingName);
        System.out.format("HP: %.2f\n", demonKingHp);
    }

    public double executeAttack(double heroBaseAttack, double criticalHit, char command){
        if (command == 'a') {
            Random random = new Random();
            int criticalChance = random.nextInt(0, 2);

            if (criticalChance == 0) {
                return heroBaseAttack;
            } else {
                System.out.println("CRITICAL HIT!");
                return criticalHit;
            }
        } else {
            return 0;
        }
    }

    public double heroTurn(double heroAttack, double criticalHit){

        char command;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Attack(a) Defend(d)");
        command = scanner.next().charAt(0);

        return executeAttack(heroAttack, criticalHit, command);
    }

    public Hero getHeroStats(){
        System.out.println("The fate of this world will be decided in this final battle against the Demon King.");
        System.out.println("Brave hero! Open your eyes and recall your name.");
        String heroName = scanner.next();

        System.out.println();

        System.out.println("You've been fighting the Demon King, but he took a good hit on you. How much health do you have left?");
        double heroHp = scanner.nextDouble();

        return new Hero(heroName, heroHp);
    }
}

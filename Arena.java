package arena;

import java.util.Random;

public class Arena {
    private Player playerA;
    private Player playerB;
    private Dice dice;

    public Arena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.dice = new Dice();
    }

    public void startBattle() {
        System.out.println("Battle begins between " + playerA.getName() + " and " + playerB.getName());
        
        while (playerA.isAlive() && playerB.isAlive()) {
            if (playerA.getHealth() <= playerB.getHealth()) {
                performAttack(playerA, playerB);
                if (playerB.isAlive()) {
                    performAttack(playerB, playerA);
                }
            } else {
                performAttack(playerB, playerA);
                if (playerA.isAlive()) {
                    performAttack(playerA, playerB);
                }
            }
        }

        if (playerA.isAlive()) {
            System.out.println(playerA.getName() + " wins!");
        } else {
            System.out.println(playerB.getName() + " wins!");
        }
    }

    private void performAttack(Player attacker, Player defender) {
        int attackRoll = dice.roll();
        int defendRoll = dice.roll();

        int attackDamage = attacker.getAttack() * attackRoll;
        int defendStrength = defender.getStrength() * defendRoll;

        int damage = Math.max(0, attackDamage - defendStrength);

        defender.reduceHealth(damage);

        System.out.println(attacker.getName() + " attacks " + defender.getName() + " with damage " + damage);
        System.out.println(defender.getName() + " health is now " + defender.getHealth());
    }
}

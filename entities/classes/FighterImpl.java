package entities.classes;

import entities.interfaces.Fighter;

public class FighterImpl extends BaseMachine implements Fighter {
//    •	The FighterImpl is a type of machine that has 200 initial health points upon initialization
    private boolean aggressiveMode;
    private static final double ATTACK_POINTS_MODIFIER = 50.0;
    private static final double DEFENCE_POINTS_MODIFIER = 25.0;


    public FighterImpl(String name, double attackPoints, double defensePoints) {
        super(name, attackPoints, defensePoints, 200);
        this.setAggressiveMode();
    }

    private void setAggressiveMode() {
        this.aggressiveMode = !this.aggressiveMode;
    }

    @Override
    public boolean getAggressiveMode() {
        return this.aggressiveMode;
    }

    @Override
    public void toggleAggressiveMode() {
        this.setAggressiveMode();

        if (this.aggressiveMode) {     //on
            super.setAttackPoints(super.getAttackPoints() + ATTACK_POINTS_MODIFIER);
            super.setDefensePoints(super.getDefensePoints() - DEFENCE_POINTS_MODIFIER);

        } else {                       //off
            super.setAttackPoints(super.getAttackPoints() - ATTACK_POINTS_MODIFIER);
            super.setDefensePoints(super.getDefensePoints() + DEFENCE_POINTS_MODIFIER);

        }

    }
}

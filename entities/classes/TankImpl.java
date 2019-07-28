package entities.classes;

import entities.interfaces.Tank;

public class TankImpl extends BaseMachine implements Tank {

    //    •	The TankImpl is a type of machine that has 100 initial health points upon initialization
    private boolean defenseMode;
    private static final double ATTACK_POINTS_MODIFIER = 40.0;
    private static final double DEFENCE_POINTS_MODIFIER = 30.0;


    public TankImpl(String name, double attackPoints, double defensePoints) {
        super(name, attackPoints, defensePoints, 100);
        this.setDefenseMode();

    }

    private void setDefenseMode() {
        this.defenseMode = !this.defenseMode;
    }


    @Override
    public boolean getDefenseMode() {
        return this.defenseMode;
    }

    @Override
    public void toggleDefenseMode() {
        this.setDefenseMode();

        if (this.defenseMode) {        //on
            super.setAttackPoints(super.getAttackPoints() - ATTACK_POINTS_MODIFIER);
            super.setDefensePoints(super.getDefensePoints() + DEFENCE_POINTS_MODIFIER);
        } else {                       //off
            super.setAttackPoints(super.getAttackPoints() + ATTACK_POINTS_MODIFIER);
            super.setDefensePoints(super.getDefensePoints() - DEFENCE_POINTS_MODIFIER);
        }

    }


}

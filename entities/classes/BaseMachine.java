package entities.classes;

import core.Validator;
import entities.interfaces.Machine;
import entities.interfaces.Pilot;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseMachine implements Machine {
    private String name;
    private Pilot pilot;
    private double attackPoints;
    private double defensePoints;
    private double healthPoints;
    private List<String> targets;

    protected BaseMachine(String name, double attackPoints, double defensePoints, double healthPoints) {
        this.setName(name);
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.healthPoints = healthPoints;
        this.targets = new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        if (!Validator.validateStringName(name)) {
            throw new IllegalArgumentException(
                    "Machine name cannot be null or empty."
            );
        } else
            this.name = name;
    }

    @Override
    public Pilot getPilot() {
        return this.pilot;
    }

    @Override
    public void setPilot(Pilot pilot) {
        if (pilot == null) {
            throw new IllegalArgumentException(
                    "Pilot cannot be null."
            );
        } else
            this.pilot = pilot;
    }

    @Override
    public double getHealthPoints() {
        return this.healthPoints;
    }

    @Override
    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    @Override
    public double getAttackPoints() {
        return this.attackPoints;
    }

    @Override
    public double getDefensePoints() {
        return this.defensePoints;
    }

    @Override
    public List<String> getTargets() {
        return this.targets;
    }

    @Override
    public void attack(String target) {
        if (!Validator.validateStringName(target)) {
            throw new IllegalArgumentException(
                    "Attack target cannot be null or empty string."
            );
        } else
            this.targets.add(target);
    }


    protected void setDefensePoints(double value) {
        this.defensePoints = value;
    }

    protected void setAttackPoints(double value) {
        this.attackPoints = value;
    }
}

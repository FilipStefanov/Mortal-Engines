package entities.classes;

import core.Validator;
import entities.interfaces.Machine;
import entities.interfaces.Pilot;

import java.util.ArrayList;
import java.util.List;

public class PilotImpl implements Pilot {
    private String name;
    private List<Machine> machines;

    public PilotImpl(String name) {
        this.name = name;
        this.machines = new ArrayList<>();
    }

    public void setName(String name) {
        if (!Validator.validateStringName(name)) {
            throw new IllegalArgumentException(
                    " Pilot name cannot be null or empty string."
            );
        } else
            this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void addMachine(Machine machine) {

        if (machine == null) {
            throw new NullPointerException(
                    "Null machine cannot be added to the pilot."
            );

        } else
            this.machines.add(machine);

    }

    @Override
    public List<Machine> getMachines() {
        return this.machines;
    }

    @Override
    public String report() {
        // TODO: 28.7.2019 г.
        return null;
    }
}

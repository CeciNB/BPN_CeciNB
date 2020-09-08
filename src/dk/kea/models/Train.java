package dk.kea.models;

import dk.kea.util.Name;
import dk.kea.util.State;

public class Train extends State {

    private double time;

    public Train(int number, double time) {
        super(number);
        initials = Name.TRN;
        this.time = time;
    }

}


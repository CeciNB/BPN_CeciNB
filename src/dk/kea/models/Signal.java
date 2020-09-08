package dk.kea.models;

import dk.kea.util.Name;
import dk.kea.util.State;

public class Signal extends State {

    public Signal(int number) {
        super(number);
        initials = Name.SIG;
    }

}

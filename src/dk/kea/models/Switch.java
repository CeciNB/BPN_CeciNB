package dk.kea.models;

import dk.kea.util.Name;
import dk.kea.util.State;

public class Switch extends State {

    public Switch(int number) {
        super(number);
        initials = Name.SWT;
    }

}

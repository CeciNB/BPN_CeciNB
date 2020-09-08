package dk.kea.models;

import dk.kea.util.Name;
import dk.kea.util.State;

public class Track extends State {

    public Track(int number) {
        super(number);
        initials = Name.TRK;
    }


}

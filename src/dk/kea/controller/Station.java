package dk.kea.controller;

import dk.kea.models.*;
import dk.kea.util.State;

import java.util.ArrayList;
import java.util.List;

public class Station {
    List<State> trains;
    List<State> tracks;
    List<State> signals;
    List<State> switches;
    Route eastToWest;
    Route westToEast;

    public Station(int trains, int tracks, int signals, int switches) {
        this.trains = new ArrayList<>();
        this.tracks = new ArrayList<>();
        this.signals = new ArrayList<>();
        this.switches = new ArrayList<>();
        for (int i = 0; i < trains; i++){
            this.trains.add(i,new Train(i,3.6));
        }
        for (int i = 0; i < tracks; i++){
            this.tracks.add(i,new Track(i));
        }
        for (int i = 0; i < signals; i++){
            this.trains.add(i,new Signal(i));
        }
        for (int i = 0; i < switches; i++){
            this.trains.add(i,new Switch(i));
        }
    }

}

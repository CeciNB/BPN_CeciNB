package dk.kea.util;

public abstract class State implements Comparable<State>{

    protected boolean state;
    protected Name initials;
    protected int number;

    public State(int number) {
        this.number = number;
        state = false;
    }

    @Override
    public int compareTo(State o) {
        if (this.number != o.number){
            return this.number - o.number;
        }
        else if (this.initials != initials){
            return -1;
        }
        return 0;
    }

}

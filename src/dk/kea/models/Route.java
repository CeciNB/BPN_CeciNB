package dk.kea.models;
import java.util.ArrayList;
import java.util.List;

public class Route implements Comparable<Route>{
    private List<Boolean> route;
    private String direction;

    public Route(String direction, boolean trk1, boolean sig1, boolean swt1, boolean trk2, boolean sig2, boolean swt2, boolean trk3) {
        this.direction = direction;
        this.route = new ArrayList<Boolean>();
        route.add(0,trk1);
        route.add(1,sig1);
        route.add(2,swt1);
        route.add(3,trk2);
        route.add(4,sig2);
        route.add(5,swt2);
        route.add(6,trk3);
    }


    @Override
    public int compareTo(Route o) {
        if (this.route.size() == o.route.size()){
            if (this.direction.equals(o.direction)){
                if(this.route.equals(o.route)){
                    return 0;
                }
            }
        }
        return -1;
    }
}

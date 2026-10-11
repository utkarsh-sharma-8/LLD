package lld.Elevator_System;

import java.util.List;

public class Building {
    public int totalFloors;
    public List<Elevator> elevators;
    public Building(int totalFloors, List<Elevator> elevators){
        this.elevators=elevators;
        this.totalFloors=totalFloors;
    }
}

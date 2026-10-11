package lld.Elevator_System;

import java.util.List;

public interface ElevatorSelectionStrategy {
    Elevator selectElevator(List<Elevator> elevators, ElevatorRequest request);
}

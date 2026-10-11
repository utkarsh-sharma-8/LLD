package lld.Elevator_System;

import java.util.List;

public class NearestElevatorStrategy
        implements ElevatorSelectionStrategy {

    @Override
    public Elevator selectElevator(
            List<Elevator> elevators,
            ElevatorRequest request) {

        Elevator bestElevator = null;

        int minDistance = Integer.MAX_VALUE;

        for (Elevator elevator : elevators) {

            if (elevator.isFull()) {
                continue;
            }

            if (elevator.getState() != request.getDirection()
                    && elevator.getState() != State.IDLE) {
                continue;
            }

            int distance =
                    Math.abs(
                        elevator.getCurrentFloor()
                        - request.getRequestedFloor()
                    );

            if (distance < minDistance) {
                minDistance = distance;
                bestElevator = elevator;
            }
        }

        return bestElevator;
    }
}
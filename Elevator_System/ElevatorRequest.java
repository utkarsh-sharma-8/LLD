package lld.Elevator_System;

public class ElevatorRequest {
    private int requestedFloor;
    private State direction;

    public ElevatorRequest(int requestedFloor,State direction){
        this.requestedFloor=requestedFloor;
        this.direction=direction;
    }
    public int getRequestedFloor(){
        return requestedFloor;
    }
    public State getDirection(){
        return direction;
    }
}

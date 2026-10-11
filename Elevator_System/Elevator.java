package lld.Elevator_System;

public class Elevator {
    private State currentState;
    private int maxCapacity;
    private int currentUsers;
    private int currentFloor;

    public Elevator(State currentState, int maxCapacity,int currentUsers, int currentFloor){
        this.currentState = currentState;
        this.maxCapacity=maxCapacity;
        this.currentUsers=currentUsers;
        this.currentFloor=currentFloor;
    }

    public State getState(){
        return currentState;
    }

    public int getCurrentFloor(){
        return currentFloor;
    }

    public boolean isFull(){
        if(currentUsers >= maxCapacity){
            return true;
        }
        return false;
    }
}

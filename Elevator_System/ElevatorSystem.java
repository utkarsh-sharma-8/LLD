package lld.Elevator_System;

import java.util.List;

public class ElevatorSystem {
   private List<Elevator> elevators;
   private ElevatorSelectionStrategy selectionStrategy ;
   public ElevatorSystem(
    List<Elevator> elevators,
    ElevatorSelectionStrategy selectionStrategy
   ){
    this.elevators=elevators;
    this.selectionStrategy=selectionStrategy;
   }

   public Elevator requestElevator(ElevatorRequest request){
    return selectionStrategy.selectElevator(elevators, request);
   }
}

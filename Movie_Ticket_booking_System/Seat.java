package Movie_Ticket_booking_System;

import Movie_Ticket_booking_System.Enums.SeatType;

public class Seat {
    private int id;
    private String row;
    private SeatType seatType;

    public Seat(int id, String row, SeatType seatType){
        this.id=id;
        this.row=row;
        this.seatType=seatType;
    }
    public int getId(){
        return this.id;
    }
    public String getRow(){
        return this.row;
    }
    public SeatType getSeatType(){
        return this.seatType;
    }
    
}

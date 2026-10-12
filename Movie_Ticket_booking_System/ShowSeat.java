package Movie_Ticket_booking_System;

import Movie_Ticket_booking_System.Enums.SeatStatus;

public class ShowSeat {
    private Seat seat;
    private double price;
    private SeatStatus status = SeatStatus.AVAILABLE;
    public ShowSeat(Seat seat,double price){
        this.seat = seat;
        this.price=price;
    }
    public Seat getSeat(){
        return seat;
    }
    public double getPrice(){
        return price;
    }
    public SeatStatus showSeatStatus(){
        return status;
    }

    public void lock(){
        if(status != SeatStatus.AVAILABLE){
            throw new IllegalStateException("Seat is Unavailable");
        }
        this.status = SeatStatus.LOCKED;
    }
    public void book(){
        if(status!=SeatStatus.LOCKED){
            throw new IllegalStateException("Seat is Unavialable");
        }
        status = SeatStatus.BOOKED;
    }
    public void release(){
        if(status!=SeatStatus.BOOKED){
            status = SeatStatus.AVAILABLE;
        }
    }
}

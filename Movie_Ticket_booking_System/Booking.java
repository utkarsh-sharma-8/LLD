package Movie_Ticket_booking_System;

import java.util.List;

import Movie_Ticket_booking_System.Enums.BookingStatus;

public class Booking {
    private int id;
    private User user;
    private Show show;
    private List<ShowSeat> seats;
    private double totalAmount;
    private BookingStatus bookingStatus;
    private BookingStatus status;

    public Booking(int id,User user,Show show,List<ShowSeat> seats, double totalAmount){
        this.id=id;
        this.user=user;
        this.show=show;
        this.totalAmount=totalAmount;
        this.status=BookingStatus.PENDING;
    }
    public void confirm(){
        status=BookingStatus.CONFIRMED;
    }
}

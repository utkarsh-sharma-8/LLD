package Movie_Ticket_booking_System;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Screen {
    private int id;
    private List<Seat> seats = new ArrayList<>();
    public Screen(int id){
        this.id=id;
    }
    public void addSeat(Seat seat){
        seats.add(seat);
    }
    public int getCapacity(){
        return seats.size();
    }
    public int getId(){
        return this.id;
    }
    public List<Seat> getSeats(){
        return Collections.unmodifiableList(seats);
    }
}
